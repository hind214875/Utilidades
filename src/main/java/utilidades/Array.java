/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author hinda
 */
public class Array {

    public static void main(String[] args) {
        double[] vector = new double[20];
        double[] vectorCopia;

        Random random = new Random();
        /* fill all the array */
        Arrays.fill(vector, 7.5);
        /* copy a array in other array*/
        vectorCopia = Arrays.copyOf(vector, 20);
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vectorCopia));

        if (Arrays.equals(vector, vectorCopia)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        vector[random.nextInt(20)] = 6.3;
        System.out.println(Arrays.toString(vector));
        System.out.println(Arrays.toString(vectorCopia));

        if (Arrays.equals(vector, vectorCopia)) {
            System.out.println("Los arrays son iguales");
        } else {
            System.out.println("Los arrays no son iguales");
        }

        /**
         * ************************************************************************
         */
        String[] arrayString = {"h", "d", "g", "f", "k"};
        String[] arrayString2 = {"h", "a", "g", "f", "k"};

//        ordenarArray(arrayString);
//        System.out.println(buscarLetraBS(arrayString,"a"));
        System.out.println(esIgualCadena(arrayString, arrayString2));

    }

    private static void ordenarArray(String[] array) { //ORDENAR
        Arrays.sort(array);
    }

    private static int buscarLetraBS(String[] array, String letra) {
        //Tiene que estar ordenado previamente para hacer binarySearch
        int busqueda = Arrays.binarySearch(array, letra);
        return busqueda; // -1 es que no esta la letra

    }

    private static boolean esIgualCadena(String[] cadena1, String[] cadena2) {
        return Arrays.equals(cadena1, cadena2);
    }

    private static void IntialArrayConAleatorios(int[] array) {
        Random rd = new Random();
        //inicial el array con aleatorios
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100 - 10 + 1) + 10; //enteroRango(1, 10);     
        }
        /* OR: fill all the array con aleatorios */
           // Arrays.fill(array,rd.nextInt(100 - 10 + 1) + 10);
    }
    
     public void MostrarResultado(boolean[] array){
         for(int i=0;i<array.length ; i++){
             System.out.println(" NumeroLanzamiento: "+i+"  "+(array[i]? "cara":"cruz")+"\n");
         }
     }
}
