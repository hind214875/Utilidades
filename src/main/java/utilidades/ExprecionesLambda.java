/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import java.util.function.BiPredicate;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

/**
 *
 * @author hinda
 */
public class ExprecionesLambda {

    public static void main(String[] args) {

        /*Function<T, R>: una función que toma un sólo argumento y devuelve un tipo de dato distinto*/
        Function<Integer, String> funcion = x -> "Tu número es " + x;
        System.out.println(funcion.apply(4));
        // Imprime: Tu número es 4

        /*Predicate<T>: una función que tiene un sólo parámetro y devuelve exclusivamente un booleano.
        Se utiliza para comprobar si T cumple cierta condición. */
        // Se pasa un objeto Integer y se comprueba cierta condición
        // devolviendo un booleano
        Predicate<Integer> predicado = x -> x > 5;
        System.out.println(predicado.test(10));
        // Imprime: true

        /*Consumer<T>: una función que toma un sólo argumento y no devuelve nada, porque produce un resultado.*/
        Consumer<String> consumidor = nombre -> System.out.println("Tu nombre es " + nombre);
        consumidor.accept("Luke");
        // Imprime: Tu nombre es Luke

        /*Supplier<T>: representa una función que no tiene parámetros pero produce un valor de tipo T.*/
        // () -> Math.random()
        Supplier<Double> proveedor = () -> Math.random();
        System.out.println(proveedor.get());
        // Imprime: aleatorio

        // Función que recibe una persona y un string y evalúa si el nombre // de la persona es igual al que se pasa
        /*Persona juan = new Persona("Juan", "López", "12345678F");
        BiPredicate<Persona, String> biPredicate = (p, nombre) -> nombre.equals(p.getNombre());
        System.out.println(biPredicate.test(juan, "Lucía"));*/
        // Imprime: false
        
        /* Función que recibe dos parámetros y no devuelve nada
        Persona sinNombre = new Persona("", "Apellidos", "3333ff");
        BiConsumer<String, Persona> biConsumer = (nombre, p) -> p.setNombre(nombre);
        biConsumer.accept("Pedro", sinNombre);
        System.out.println(sinNombre);
        // Imprime: Persona{nombre=Pedro, apellidos=Apellidos, nif=3333ff}*/
        
        /*el forEach espera una implementacion de interfaz tipo consumer */
        //mostrar lista utilizando experesion lambda
        //lista.forEach(p->System.out.println(p))

    }
}
