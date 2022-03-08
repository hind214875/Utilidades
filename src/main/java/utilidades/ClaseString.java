/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

/**
 *
 * @author hinda
 */
public class ClaseString {

    public static void main(String[] args) {

        String s = "iesmardealboran.com";

        // Tamaño de la cadena
        System.out.println("Tamaño: " + s.length());

        // Obtener el char de una posicion concreta
        System.out.println("char de la posicion 5: " + s.charAt(5));

        // Obtener subcadena desde el caracter i-ésimo hasta el final
        // de la cadena
        String subcadena = s.substring(3);
        System.out.println("Subcadena = " + subcadena);

        // Obtener subcadena desde el caracter i-ésimo hasta el 
        // caracter j-ésimo de la cadena
        subcadena = s.substring(8, 15);
        System.out.println("Subcadena = " + subcadena);

        // Concatenar cadenas. Equivale al operador +
        String s1 = "ies";
        String s2 = "mardealboran.com";
        String nuevo = s1 + s2;
        String nuevo2 = s1.concat(s2);
        System.out.println("Nuevo: " + nuevo);
        System.out.println("Nuevo2: " + nuevo2);

        // Método IndexOf
        // Devuelve el índice dentro de la cadena
        // de la primera aparición de la cadena a buscar
        int indice = nuevo.indexOf("mar");
        System.out.println("Indice: " + indice);

        indice = nuevo.indexOf("ran", 10);
        System.out.println("Indice: " + indice);

        // Métodos equals y equalsIgnoreCase
        System.out.println("Igualdad Java y java: " + "Java".equals("java"));
        System.out.println("Igualdad Java y java: " + "Java".equalsIgnoreCase("java"));

        // Comparación de cadenas (diccionario). Método compareTo()
        // Devuelve cero si las cadenas son iguales, 
        // un negativo si s1 está antes de s2 en el diccionario (menor)
        // o un positivo si s1 está despúes de s2 (mayor)
        int compareTo = s1.compareTo(s1);
        System.out.println("Comparación de s1 y s1: " + compareTo);
        compareTo = s1.compareTo("aes");
        System.out.println("Comparación de s1 y aes: " + compareTo);
        compareTo = "aes".compareTo(s1);
        System.out.println("Comparación de aes y s1: " + compareTo);

        //Conversión mayúsculas y minúsculas
        String mayusculas = s2.toUpperCase();
        System.out.println("s2 en mayus: " + mayusculas);
        System.out.println("String mayusculas en minusc: " + mayusculas.toLowerCase());

        // Quitar espacios delante y detrás
        String espacios = " palabra palabra ";
        System.out.println("Tamaño de espacios: " + espacios.length());
        String sinEspacios = espacios.trim();
        System.out.println("Tamaño de sinEspacios: " + sinEspacios.length());

        // Reemplazo de caracteres
        System.out.println("String original: " + s2);
        String str2 = s2.replace('a', 'x');
        System.out.println("String reemplazado: " + str2);

        // Contenido
        String aBuscar = "dealbox";
        System.out.println("¿Contiene " + s2 + " la subcadena "
                + aBuscar + "? " + s2.contains(aBuscar));

        // Métodos endsWith, startsWith, isEmpty
        String vacio = "";
        // isEmpty es true si length es 0
        System.out.println("El string está vacío? " + vacio.isEmpty());

        String ejemplo = "ejemplo";
        // startsWith devuelve true si el string empieza con la secuencia de 
        // caracteres que se pasa como parámetro
        System.out.println("Empieza ejemplo con ej? " + ejemplo.startsWith("ej"));
        // endsWith devuelve true si el string termina con la secuencia de 
        // caracteres que se pasa como parámetro
        System.out.println("Termina ejemplo con plo? " + ejemplo.endsWith("plo"));

        // Obtener un array de char de la cadena
        // Declaración de una variable array de tipo char
        char[] arrayChar;
        arrayChar = s2.toCharArray();
        // El atributo length existe en todos los arrays y 
        // me indica su tamaño. Equivalente al método length()
        // de los String
        for (int i = 0; i < arrayChar.length; i++) {
            // Para acceder a cada posición del array uso
            // los corchetes
            System.out.println("Posición i = " + i
                    + " contenido = " + arrayChar[i]);
        }

    }
}
