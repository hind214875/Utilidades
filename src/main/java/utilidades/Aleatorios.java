/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
import java.util.Random;

/**
 *
 * @author hinda
 */
public class Aleatorios {

    //metodos 
    public static int enteroRango(int MIN_VALUE, int MAX_VALUE) {
        Random rd = new Random();
        int numAleatorio = 0;
        if (MIN_VALUE > 0 && MAX_VALUE > 0) {
            numAleatorio = rd.nextInt(MAX_VALUE - MIN_VALUE + 1) + MIN_VALUE;
        }
        return numAleatorio;
    }

    public static int enteroAleatorio() {
        Random rd = new Random();
        return rd.nextInt(Integer.MAX_VALUE - Integer.MIN_VALUE + 1) + Integer.MIN_VALUE;
    }

    public static char letraMinuscula() {
        Random rd = new Random();
        return (char) (rd.nextInt(122 - 97 + 1) + 97);
    }

    public static char letraMayuscula() {
        Random rd = new Random();
        return (char) (rd.nextInt(90 - 65 + 1) + 65);
    }

    //metodo para genera random enum 
    /* public static Colores generateRandomColor() {
            NombreEnum[] values = NombreEnum.values();
            int length = values.length;
            int randIndex = new Random().nextInt(length);
            return values[randIndex];
        }*/
    public static void main(String[] args) {
        // También se pueden generar varios números aleatorios a la vez, usando
        // Streams
        // El siguiente ejemplo guarda en un array de tamaño tam 
        // un conjunto de enteros aleatorios.
        // Los números están entre Integer.MAX_VALUE e Integer.MIN_VALUE
        // random.ints(cantidad_numeros_a_generar) devuelve un IntStream de
        // tamaño cantidad_numeros_a_generar. Con el método toArray() se 
        // guardan en un array de ese tamaño
        Random random = new Random();
        int tam = 10; // 15 enteros aleatorios dentro del rango de los int
        int[] intAleatorios = random.ints(tam).toArray();

        // array.length me da el tamaño del array
        for (int i = 0; i < intAleatorios.length; i++) {
            System.out.print(intAleatorios[i] + " # ");
        }

        System.out.println("\b\b");

        // Se puede limitar el rango, por ejemplo entre -30 y 30
        // Rango real es entre -30 y 29
        intAleatorios = random.ints(tam, -3, 3).toArray();

        for (int i = 0; i < intAleatorios.length; i++) {
            System.out.print(intAleatorios[i] + " # ");
        }

        System.out.println("\b\b");

        // De la misma forma se pueden crear números long, con el método
        // random.longs, y números double, con random.doubles
        // Para generar letras minúsculas
        // Se genera un número entre 0 y 25 (número de letras de a hasta z)
        // y luego se añade la letra incial del rango, en este caso 'a'
        char letraMinus = (char) (random.nextInt(26) + 'a');
        System.out.println("Letra minúscula " + letraMinus);

        // Para generar letras mayúsculas
        // Se genera un número entre 0 y 25 (número de letras de A hasta Z)
        // y luego se añade la letra incial del rango, en este caso 'A'
        char letraMayus = (char) (random.nextInt(26) + 'A');
        System.out.println("Letra mayúscula " + letraMayus);

        // Otra opción es usando un String y el método charAt
        final String LETRAS = "abcdefghijklmnñopqrstuvwxyz";
        int indiceLetraSacar = random.nextInt(LETRAS.length());
        // El método charAt devuelve un char del String que ocupa la posición
        // indice
        char letra = LETRAS.charAt(indiceLetraSacar);
        System.out.println("Letra sacada: " + letra);
        
        //enum aleatorio
   /* public static Premio generarPremioAleatorio() {
        Random rd = new Random();
        Premio[] values = Premio.values();
        int size = values.length;
        return values[rd.nextInt(size)];*/

    }
    
    /* Localdate Aleatorio*/
      public static LocalDate randomLocalDate() {
        Random rd=new Random();
        LocalDate start = LocalDate.now();
        
        long days = ChronoUnit.DAYS.between(start, LocalDate.of(2032, Month.MARCH, 24));
        LocalDate randomDate = start.plusDays(rd.nextInt((int) days + 1));
        return randomDate;
    }
    
     // RandomStringUtils.randomAlphabetic(20).toLowerCase()
    //https://github.com/jfervic933/fechasHorasJava8/blob/master/FechasJava8.java
     // https://freecodegenerators.com/code-converters/json-to-pojo

}

