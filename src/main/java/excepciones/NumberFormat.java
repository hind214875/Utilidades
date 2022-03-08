/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import javax.swing.JOptionPane;

/**
 *
 * @author profesor
 */
public class NumberFormat {

    public static void main(String[] args) {

        int numero1 = 0, numero2 = 0, division = 0;
       
        String numero1Txt = JOptionPane.showInputDialog("Introduce el número 1 (dividendo): ");
        JOptionPane.showMessageDialog(null, numero1Txt);
        try{
            numero1 = Integer.parseInt(numero1Txt);
        } catch(NumberFormatException nfe){
            //Código para tratar el error
            JOptionPane.showMessageDialog(null, "El formato del número introducido no es correcto. Tendrá valor 1");
            numero1 = 1;
        }
        
        JOptionPane.showMessageDialog(null, numero1);
        
        

    }

}
