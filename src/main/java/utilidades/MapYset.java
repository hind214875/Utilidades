/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 *
 * @author hinda
 */
public class MapYset {
    private ArrayList<String> listArrayList=new ArrayList<>();
    private Map<String, String>  lista=new TreeMap<>();// sorted in natural order ascending(new HashMap: not sorted)
    private Set<String> listSet=new HashSet<>();//implements Comparable<object>
    
    /*Set: cannot contain duplicated values
      Set: have 4 constrectores:HashSet();HashSet(Collection<> c);HashSet(int capacityInt);HashSet(int capacity,float loadfactor)
      List:allowed duplicated values
      Map: key unique, repeated values
      Map: tenemos que sobreescribir metodos hascode and equals depende nuestro necisidades si no el HashMap no funciona proparly
     */

    //mostrar from list
     public void mostrarLista() {
        System.out.println("Imprimiendo lista de libros ....");
        listArrayList.forEach(System.out::println);
    }
     
    //mostrar hashMap
    public void mostrar() {
        for (String key : lista.keySet()) {
            System.out.printf("Clave: %s -- Objeto: %s %n", key, lista.get(key));
        }
    }
    
    //mostrar set 
    public void mostrarSet(){
      listSet.forEach(System.out::println);
    }
    
    
}
