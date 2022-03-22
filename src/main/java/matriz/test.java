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
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("\n");
    }

    public static void rellenarMatrizEmpty(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = '*';
            }
        }
    }

    public static void cogerPosicionJugador1(char[][] matriz, int fila, int columna) {
        if ((fila >= 0 && fila < matriz.length) && (columna >= 0 && columna < matriz.length)) {
            if (matriz[fila][columna] == '*') {
                matriz[fila][columna] = 'O';
            } else if (matriz[fila][columna] == 'O' || matriz[fila][columna] == 'X') {
                System.out.println(" este posicion ocupada");
            }

        }
    }

    public static void cogerPosicionJugador2(char[][] matriz, int fila, int columna) {
        if ((fila >= 0 && fila < matriz.length) && (columna >= 0 && columna < matriz.length)) {
            if (matriz[fila][columna] == '*') {
                matriz[fila][columna] = 'X';
            } else if (matriz[fila][columna] == 'O' || matriz[fila][columna] == 'X') {
                System.out.println(" Este posicion es ocupada");
            }
        }
    }

    public static boolean isMatrizFull(char[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (matriz[i][j] == '*' ) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean hayGanador(char[][] matriz) {
        boolean ganador = true;
        char simboloO = 'O', simboloX = 'X';

        if ((recorrerFilas(matriz) != simboloO && recorrerColumnas(matriz) != simboloO && recorrerDiagonal(matriz)!= simboloO
                && recorrerDiagonalInverse(matriz) != simboloO) && (recorrerFilas(matriz) != simboloX && recorrerColumnas(matriz) != simboloX 
                && recorrerDiagonal(matriz) != simboloX
                && recorrerDiagonalInverse(matriz) != simboloX)) {
            ganador = false;
        }
        return ganador;
    }

    public static String elGanador(char[][] matriz) {
        char simboloO = 'O', simboloX = 'X';
        String ganador = "no hay ganador";
        if ((recorrerFilas(matriz) == simboloO || recorrerColumnas(matriz) == simboloO || recorrerDiagonal(matriz) == simboloO
                || recorrerDiagonalInverse(matriz) == simboloO)) {
            ganador = "Jugador1";
        } else if ((recorrerFilas(matriz) == simboloX || recorrerColumnas(matriz) == simboloX || recorrerDiagonal(matriz) == simboloX
                || recorrerDiagonalInverse(matriz) == simboloX)) {
            ganador = "Jugador2";
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

    public static void main(String[] args) {
        //crear matriz de [3][3]
        Scanner sc = new Scanner(System.in);
        int filaJugador, columnaJugador;
        char[][] matriz = new char[3][3];

        rellenarMatrizEmpty(matriz);
        ImprimirPorConsola(matriz);

        System.out.println("Jugador1: jugar con el 'O' y jugador2 jugar con el 'X' ");

        while (!hayGanador(matriz) && (!isMatrizFull(matriz))) {
            //jugador1  
            System.out.println("Jugador1:Que Fila quieres?");
            filaJugador = sc.nextInt();
            System.out.println("Jugador1:Que Columna quieres?");
            columnaJugador = sc.nextInt();

            //rellenar la posicion  
            cogerPosicionJugador1(matriz, filaJugador, columnaJugador);
            ImprimirPorConsola(matriz);

            //jugador2  
            if (!hayGanador(matriz) && (!isMatrizFull(matriz))) {
                System.out.println("Jugador2:Que Fila quieres?");
                filaJugador = sc.nextInt();
                System.out.println("Jugador2:Que Columna quieres?");
                columnaJugador = sc.nextInt();
                //rellenar la posicion  
                cogerPosicionJugador2(matriz, filaJugador, columnaJugador);
                ImprimirPorConsola(matriz);

            }
            if (hayGanador(matriz)) {
                System.out.println("Ganador es: " + elGanador(matriz));
                break;
            }
            if (isMatrizFull(matriz)) {
                System.out.println("no hay ganador");
            }
           
        }
        
         

    }
}
