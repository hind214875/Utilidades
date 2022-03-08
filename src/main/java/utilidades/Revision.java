/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class Revision {

    //metodos
    /**
     * ****************** Menu **********************
     */
    private static void mostrarMenu() {
        System.out.println("Menú de opciones");
        System.out.println("-------------------------");
        System.out.println("1. sumar");
        System.out.println("2. restar");
        System.out.println("3. multiplicar");
        System.out.println("4. dividir");
        System.out.println("5. Finalizar");
        System.out.println("-------------------------");
    }

    /**
     * ******************** PedirDatos ***********************
     */
    private static int pedirDatos() {
        boolean solicitarDatos = true;
        Scanner sc = new Scanner(System.in);
        int a = 0;
        do {
            solicitarDatos = true;
            try {
                // Bloque de código candidato a lanzar la excepción
                System.out.println("Introduce un numero ");
                a = sc.nextInt();
                solicitarDatos = false;
            } catch (InputMismatchException ime) {
                // Código para tratar el error
                System.out.println("Se ha introducido texto en lugar de números. "
                        + "Vuelva a introducir los datos");
                sc.nextLine();
            }
        } while (solicitarDatos);
        return a;
    }

    /**
     * ****************************** generar numero aleatorio en rango ******************************/
     
    private static int GeneraEnteroAleatorio(int a, int b) {//una metodo para generar un numero Intero en un rango
        Random rd = new Random();
        int numeroAleatorio;
        if (a > b) {
            numeroAleatorio = rd.nextInt(a - b + 1) + b;
        } else {
            numeroAleatorio = rd.nextInt(b - a + 1) + a;//nextInt(max - min + 1) + min;
        }

        return numeroAleatorio;

    }
    /*genera 5 numeros enteros destintos
         for (int i = 0; i<5; i++){ 
          numAleatorio.nextInt())}
    */
    
    /* Numero decimal entre 0.0 y 1.0, el 1.0 nunca sale 
         double d = numAleatorio.nextDouble(); 
         boolean b = numAleatorio.nextBoolean(); 
    */
      
    /* numero entero entre 0 y 9
       int n = numAleatorio.nextInt(10); 
    */
    
    /* Numero entero entre 1 y 20, incluidos 
          int n = numAleatorio.nextInt(20) + 1; 
    */
    
    /**************************** devidir ******************************************/
     private static int dividir(int a, int b) {
        int dividir = 0;
        boolean repitir = true;
        if (b != 0) {
            dividir = a / b;
            return dividir;
        } else {
            System.out.println("no puedes devidir por 0");
        }
        return dividir;

    }

    public static void main(String[] args) {
        /*
        Math.random(); genera numero aleatorio entre 0.0 y 1.0 sale el 1 aqui si queremos int so casting (int)
        generar un numero entre rango (25 - 75)
        Random numeroAleatorio = new Random();//genera numero aleatorio entre 0.0 y 0.99999 el 1 no sale
        int n = numeroAleatorio.nextInt(75 - 25 + 1) + 25;//(meyor-menor+1)+menor
         */
         
        /*
        catch (NumberFormatException nfe) {
                    //Código para tratar el error
                    JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto.");
        */
        String year = String.valueOf(true);
        //clase string:https://javadesdecero.es/clases/string/
        
        
    }
}
