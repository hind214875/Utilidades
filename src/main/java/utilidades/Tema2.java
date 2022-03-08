/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author hinda
 */
public class Tema2 {
     public static void main(String[] args) {
          
        //declaracion de variables
        int var1,var2;
        //cuidando con los nombres --->camelCase
        double estaturaPersona;
        //Inicialisacion de variables
        var1=12;
        var2=14;
       
        //declaracion y initialisacion
        float pesoPersona=67.6f;
        long millionesQueMeVaisApagar=23_0000_0000_0000l;
       
        //constantes
        final boolean SIEMPRESI=true; //constante no puedes cambiar su valor luego
        final double SUBLEMNTO=7.20;
       
        //los valores conctretos de un tipo de datos son literales
        long numero1=23; //int -->long(conversion implicita)
        long numero2=(long)23; //conversion explicita(casting)
       
        //if the both variable int then the result int so we force one of them to be double for getting result in double
        double expresion=var1/(double)var2;
       
        //Math ceil,floor,round
        expresion=Math.ceil(3.4);//ceil redondea hacia arriba(techo)
        System.out.println(expresion);
        expresion=Math.floor(4.9);//floor redondea hacia abajo (suelo)
        System.out.println(expresion);
        expresion=Math.round(4.2);
        System.out.println(expresion);
        expresion=Math.round(4.8);
        System.out.println(expresion);
        expresion=Math.round(4.45);//math.round kat9arebna mn 3adad li 9rib be3d fasila
        System.out.println(expresion);
       
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce el peso de la persona: ");
        pesoPersona=teclado.nextFloat();
       
        System.out.println("Introduce la estratura de la persona: ");
        estaturaPersona=teclado.nextDouble();
       
        //con Scanner,despues de leer numeros hay que limpiar la variable
        teclado.nextLine();
        System.out.println("Introduce tu nombre: ");
        String nombre=teclado.nextLine();
       
        //IMC=peso[Kg]/estatura[m2];  
        System.out.println("Peso: "+ pesoPersona +"la estratura: "+ estaturaPersona);
        double indiceMasaCorporal=pesoPersona/Math.pow(estaturaPersona, 2);//math.pow (l eus)
       
        System.out.println(nombre+" Tu IMC es: "+indiceMasaCorporal);
        System.out.printf("%s Tu IMC %.2f",nombre,indiceMasaCorporal);
       
        //lectura de datos con JOpcionPane
        String apellido=JOptionPane.showInputDialog("Introduce tu nombre");
        System.out.println(apellido);
       
        String dinerosTexto=JOptionPane.showInputDialog("Introduce el dinero para sobornar al de programacion");
        double dineros=Double.parseDouble(dinerosTexto);
        System.out.println("El profe va a recibir "+ (SUBLEMNTO+dineros) +" al año");//sin el paranthese sino concatena
       
        JOptionPane.showMessageDialog(null,"El profe va a recibir "+ (SUBLEMNTO+dineros) +" al año");
       
/*        METODOS MATEMATICOS
-----------RAICES CUADRADAS(√a)/ VALOR ABSOLUTO
      double solucion = Math.sqrt(Math.pow((valorX2 - valorX1), 2) + Math.pow((valorY2 - valorY1), 2));
        Con Math.abs (sale un número con valor absoluto, es decir, siempre positvio)
        
------------FORMATEAR LOS DECIMALES
        DecimalFormat df = new DecimalFormat("#.00");
        String resultado = df.format(pasadoAMetros);
        NumberFormat numeroResultado = NumberFormat.getInstance(pasadoAMetros);
        
METODOS PARA FORMATEAR LOS SOUT(CON RPRINTF)
        
----------FORMATEOS POR SOUT
        Como funciona el printf(QUE NO SE ME OLVIDE QUE SE USA)
        
        printf("%._f", a);
        
        El _ es el número de decimales que queremos que salga
        a es la variable que queremos mostrar con el número de decimales que hayamos puesto ne lugar de _
        
        printf("%.2f %.3f",a,b);
        En este caso el 2f afecta al valor a y 3f a b
        Entre %.2f %.3f hay un espacio
        
         */


    }
}
