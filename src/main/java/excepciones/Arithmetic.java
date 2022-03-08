/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author profesor
 */
public class Arithmetic {

    public static void main(String[] args) {

        int numero1 = 0, numero2 = 0, division = 0;
        Scanner teclado = new Scanner(System.in);
        boolean seguir = true;
        
        do {
            try {
                System.out.println("Introduce n1: ");
                numero1 = teclado.nextInt();

                System.out.println("Introduce n2: ");
                numero2 = teclado.nextInt();
                
                division = numero1 / numero2;
                
                seguir = false;
                
            } catch (InputMismatchException ime) {
                System.out.println("Cuidado pecador, te has equivocado. "
                        + "Introduce solo números");
                teclado.nextLine();
            } catch (ArithmeticException ae){
                System.out.println("Estás mu tonto, no puedes dividir por cero");
            }
        } while (seguir);

  
        

        System.out.println("Resultado: " + division);

    }

}
