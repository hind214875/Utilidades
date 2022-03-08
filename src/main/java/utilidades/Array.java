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
    }
}
