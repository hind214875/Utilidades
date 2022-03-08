/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author hinda
 */
/*1.la interfaz comparable implements orden natural segun equals el mismo criterio que hay en el equals tiene que ser en ComparTo
  2.public class Libro implements Comparable<Libro>{}
  3.el criterio usando en equals tiene que ser en compareTo
  4.*/
public class ArrayListComp {

    private ArrayList<String> lista;

    //constrectur por defecto, solo instancia la estrectura list sin incluir ningun objeto
    public ArrayListComp(ArrayList<String> lista) {
        this.lista = new ArrayList<>();
    }

    //mostrar la lista
    public void mostrarLista() {
        System.out.println("Imprimiendo lista de  ....");
        lista.forEach(System.out::println);
    }

    //Collections.sort(lista) debe contener objetos que implementan comparable
    public void ordenarISBN() {
        Collections.sort(lista);
    }

    //busqueda binaria
      //binarySearch no funciona si la lista esta desordenada
    public int buscarISBN(String l) {
        return Collections.binarySearch(lista, l);
    }
    //busqueda binaria por nombre
     //lista debe estar ordenada segun el criterio que se pasa a este busqueda
    /* public int buscarBinariaNombre(Libro l){
        return Collections.binarySearch(lista, l,( l1, l2)->l1.getNombre().compareTo(l2.getNombre()));
     }*/

    //ordenar por nombre usando comparator
//    public void ordenarComparatorNombre(){
//        Collections.sort(lista, (Libro l1,Libro l2)->l1.getNombre().compareTo(l2.getNombre()));
//    }
    
    
/*   public void ordenarComparatorNumeroPagina(){
        Collections.sort(lista, (Libro l1,Libro l2)->l1.getNumeroPagenas()-l2.getNumeroPagenas());
    //seconda manera de hacerlo
        Collections.sort(lista, (Libro l1,Libro l2)->Integer.compare(l1.getNumeroPagenas(), l2.getNumeroPagenas()));
    // we can delete the type Libro because as the list is type Libro so the type is knowing 
    //this we call it Inferencia de tipos
   }*/ 
    
 //ordenar por nombre y pagina(ordenar por dos critirios)
  /*   public void ordenarNombrePaginas(){
         //crear objeto typo comparator
         Comparator<Libro> criterioNombre= ( l1, l2)->l1.getNombre().compareTo(l2.getNombre());
         Comparator<Libro> criterioNumeroPaginas= ( l1, l2)->l1.getNumeroPagenas()-l2.getNumeroPagenas(); 
         //comaparar con dos critirios
         Comparator<Libro> critirioNombrePaginas=criterioNombre.thenComparing(criterioNumeroPaginas);
         //ordenar con los dos critirios
         Collections.sort(lista,critirioNombrePaginas);
     }*/
    
 //devuelve una lista con los libros con el mismo precio
    /* public ArrayList<Libro> buscarPorPrecio(double precio) {
        ArrayList<Libro> auxList = new ArrayList<>();

        for (Libro libro : this.lista) {
            if (libro.getPrecio() == precio) {
                auxList.add(libro);
            }
        }

        return auxList;
    }*/
    
    //modificar
   /* public void modificarCancion(Cancion cancionOld, Cancion cancionNew) {
        
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getTitulo().equals(cancionOld.getTitulo()) && lista.get(i).getArtist().equals(cancionOld.getArtist())) {
                lista.get(i).setidioma(cancionNew.getidioma());
                lista.get(i).setTitulo(cancionNew.getTitulo());
                lista.get(i).setArtist(cancionNew.getArtist());
                lista.get(i).setRating(cancionNew.getRating());
            }
            
        }
        
    }*/
    
    //Copiar Arrays
    public static int[] copiarArray(int[] arrayNumeros){ //Entero
        int[] copia= new int[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            copia[i]=arrayNumeros[i];
        }
        return copia;
    }
    
    public static double[] copiarArray(double[] arrayNumeros){ //Double
        double[] copia= new double[arrayNumeros.length];
        for (int i = 0; i < arrayNumeros.length; i++) {
            copia[i]=arrayNumeros[i];
        }
        return copia;
    }

    public static String[] copiarArray(String[] arrayString){ //String
        String[] copia= new String[arrayString.length];
        for (int i = 0; i < arrayString.length; i++) {
            copia[i]=arrayString[i];
        }
        return copia;
    }

    public static Object[] copiarArray(Object[] arrayObjetos){ //Object
        Object[] copia= new Object[arrayObjetos.length];
        for (int i = 0; i < arrayObjetos.length; i++) {
            copia[i]=arrayObjetos[i];
        }
        return copia;
    }
     
}
