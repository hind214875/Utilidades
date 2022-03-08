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
    
     public static void recorrerFila(int x, int[][] matriz) {
        if (x >= 0 && x <= matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[x][i]);
            }
        }
    }

    public static void recorrerColumna(int x, int[][] matriz) {
        if (x >= 0 && x <= matriz.length) {
            for (int i = 0; i < matriz.length; i++) {
                System.out.println(matriz[i][x]);
            }
        }
    }
}
