/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package matriz;

import java.util.Random;

/**
 *
 * @author hinda
 */
public class Matriz {
    //metodos

    public static void rellenarMatrix(int[][] matrix) {
        Random rd = new Random();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = rd.nextInt(100) + 1;
            }
        }
    }

    public static void ImprimirPorConsola(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double calcularMedia(int[][] matriz) {
        double media = 0, sum = 0;
        int contador = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                sum += matriz[i][j];
                contador++;
            }
        }
        return media = sum / contador;
    }

    public static void recorrerFila(int fila, int[][] matriz) {
        if (fila >= 0 && fila <= matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[fila][i]);
            }
        }
    }

    public static void recorrerColumna(int columna, int[][] matriz) {
        if (columna >= 0 && columna <= matriz[0].length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][columna]);
            }
        }
    }

    public static void recorrerVecinos(int fila, int columna, int[][] matriz) {
        if (fila >= 0 && fila < matriz.length && columna >= 0 && columna < matriz[0].length) {
            for (int i = fila - 1; i <= fila + 1; i++) {
                if (i >= 0 && i < matriz.length) {
                    for (int j = columna - 1; j <= columna + 1; j++) {
                        if ((j >= 0 && j < matriz[i].length) && (!(fila == i && columna == j))) {
                            //if (!(fila==i&&columna==j)){
                            System.out.println(matriz[i][j]);
                            //}
                        }
                    }
                }

            }
        }
    }

    public static void recorrerDiagonalIzdToDr(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i == j) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }

    public static void recorrerDiagonalDrToIzq(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i + j == matriz.length - 1) {
                    System.out.println(matriz[i][j]);
                }
            }
        }
    }

}
