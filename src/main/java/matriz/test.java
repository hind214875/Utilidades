/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class test {
    //metodos

    public static void ImprimirPorConsola(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " - ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void rellenarAvionEmpty(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '-';
            }
        }
    }

    public static void cogerPosicionJugador1(char[][] matriz, int fila, int columna) {
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz.length) {
            if (matriz[fila][columna] == '-') {
                matriz[fila][columna] = 'O';
            }
        }
    }

    public static void cogerPosicionJugador2(char[][] matriz, int fila, int columna) {
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz.length) {
            if (matriz[fila][columna] == '-') {
                matriz[fila][columna] = 'X';
            }
        }
    }

    public static int ganador(char[][] matriz) {
        int ganador;
        char simboloO = 'O', simboloX = 'X';

        if ((recorrerFilas(matriz) == simboloO || recorrerColumnas(matriz) == simboloO || recorrerDiagonal(matriz) == simboloO
                || recorrerDiagonalInverse(matriz) == simboloO)) {
            ganador = 1;
        } else if ((recorrerFilas(matriz) == simboloX || recorrerColumnas(matriz) == simboloX || recorrerDiagonal(matriz) == simboloX
                || recorrerDiagonalInverse(matriz) == simboloX)) {
            ganador = 2;
        } else {
            ganador = 0;
        }

        return ganador;
    }

    public static char recorrerFilas(char[][] matriz) {
        boolean coincide = true;
        for (int i = 0; i < matriz.length; i++) {
            //Cogemos el simbolo de la fila
            char simbolo = matriz[i][0];
            //recorro la fila para saber si hay el simbolo en todas la columnas de la fila
            for (int j = 1; j < matriz[i].length; j++) {
                if (simbolo != matriz[i][j]) {
                    coincide = false;
                }
            }

            if (coincide) {
                return simbolo;
            }
        }

        return 'N';
    }

    public static char recorrerColumnas(char[][] matriz) {
        char simbolo;
        boolean coincide;

        for (int j = 0; j < matriz.length; j++) {

            //Reiniciamos la coincidencia
            coincide = true;
            //Cogemos el simbolo de la columna
            simbolo = matriz[0][j];
            for (int i = 1; i < matriz[0].length; i++) {
                //sino coincide ya no habra ganadro en esta fila
                if (simbolo != matriz[i][j]) {
                    coincide = false;
                }
            }

            //Si no se mete en el if, devuelvo el simbolo ganador
            if (coincide) {
                return simbolo;
            }

        }

        //Si no hay ganador
        return 'N';

    }

    public static char recorrerDiagonal(char[][] matriz) {
        boolean coincide = true;
        char simbolo = matriz[0][0];
        for (int i = 1; i < matriz.length; i++) {
            if (simbolo != matriz[i][i]) {
                coincide = false;
            }
        }
        if (coincide) {
            return simbolo;
        }
        return 'N';
    }

    public static char recorrerDiagonalInverse(char[][] matriz) {
        boolean coincide = true;
        char simbolo = matriz[0][2];
        for (int i = 1; i < matriz.length; i++) {
            for (int j = 1; j < matriz[i].length; j--) {
                if (simbolo != matriz[i][i]) {
                    coincide = false;
                }
            }
        }
        if (coincide) {
            return simbolo;
        }
        return 'N';
    }

    public static boolean matrizIsLlena(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] !='-') {
                    return true;
                }
            }
        }
        return false;

    }

    public static void main(String[] args) {
        //crear matriz de [3][3]
        Scanner sc = new Scanner(System.in);
        int filaJugador, columnaJugador;
        char[][] matriz = new char[3][3];

        rellenarAvionEmpty(matriz);
        ImprimirPorConsola(matriz);
        //do {
            //jugador1  
            System.out.println("Jugador1:Que Fila quieres?");
            filaJugador = sc.nextInt();
            System.out.println("Jugador1:Que Columna quieres?");
            columnaJugador = sc.nextInt();

            //rellenar la posicion
            if ((ganador(matriz)) != 1 || (ganador(matriz)) != 2) {
                cogerPosicionJugador1(matriz, filaJugador, columnaJugador);
                ImprimirPorConsola(matriz);
            }

            //jugador2  
            System.out.println("Jugador2:Que Fila quieres?");
            filaJugador = sc.nextInt();

            System.out.println("Jugador2:Que Columna quieres?");
            columnaJugador = sc.nextInt();
            if ((ganador(matriz)) != 1 || (ganador(matriz)) != 2) {
                //rellenar la posicion
                cogerPosicionJugador2(matriz, filaJugador, columnaJugador);
                ImprimirPorConsola(matriz);
            }

        //} while (!matrizIsLlena(matriz));

    }
}
