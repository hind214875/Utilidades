/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author hinda
 */
public class LeerFicheros {
    //   Cuando leemos fechas en un csv, tenemos que formaterarlas
    //   DateTimeFormatter fecha = DateTimeFormatter.ofPattern("d/MM/yyyy");
    //   LocalDate.parse(fechaX,formatter));
    

    //Metodo generico para leer cualquier archivo csv, recibe el nombre del archivo 
    public static <T> List<T> leerFicheroCsv(String idFichero) {

        // Variables para guardar los datos que se van leyendo
        String[] tokens;
        String linea;
        ArrayList<T> listaAux = new ArrayList<>();

        System.out.println("Leyendo el fichero: " + idFichero);
        try (Scanner datosFichero = new Scanner(new File(idFichero))) {
            // hasNextLine devuelve true mientras haya líneas por leer
            while (datosFichero.hasNextLine()) {
                // Guarda la línea completa en un String
                linea = datosFichero.nextLine();
                linea = linea.replaceAll("\"", "");//para quitar las comillas dobles
                linea = linea.replaceAll(" ", "");//para quitar espacios en blanco
                // Se guarda en el array de String cada elemento de la
                tokens = linea.split(";");
                //implementa lo que tienes que hacer
                //crear objeto 
                /* Curso curso = new Curso();

                curso.setId(tokens[0]);
                curso.setNombreCurso(tokens[1]);
                curso.setInicialesProf(tokens[2]);
                curso.setAsignatura(tokens[3]);
                curso.setAula(tokens[4]);
                curso.setDiaSemana(Integer.parseInt(tokens[5]));
                curso.setHoras(Integer.parseInt(tokens[6]));

                listaAux.add(curso);*/
            }
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
        return listaAux;
    }

    //Metodo generico para leer cualquier json, recibe el nombre del archivo y la clase del objeto, y devuelve una lista de objetos de cualquier tipo
    //Ejemplo de uso: List<Persona> listaPersonas = Lectura.leerJson("./personas.json",Persona.class);
    //---Asegurar de tener correctamente las dependecias--
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310 --> (por si hay fechas)
    public static <T> List<T> leerArchivoJSON1(String nombre, Class<T> clase) {
        List<T> datos = new ArrayList<>();
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas

        try {
            datos.addAll(mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructCollectionType(ArrayList.class, clase)));

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return datos;
    }
    
    //Metodo para leer un archivo JSON contruido por solo un objeto, recibe el nombre del archivo y la clase del objeto,
    //y devuelve un objeto de cualquier tipo
    //Ejemplo de uso: Persona persona = Lectura.leerArchivoJSON2("./persona.json",Persona.class);
    //---Asegurar de tener correctamente las dependecias--
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310 --> (por si hay fechas)
    //JSON: como este --> "" //TODO: cambiar por el url json
    public static <T> T leerArchivoJSON2(String nombre, Class<T> clase) {
        T datos = null;
        ObjectMapper mapeador = new ObjectMapper();
        mapeador.registerModule(new JavaTimeModule()); //para poder manejar fechas

        try {
            datos = mapeador.readValue(new File(nombre),
                    mapeador.getTypeFactory().constructType(clase));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

        return datos;
    }
    


}
