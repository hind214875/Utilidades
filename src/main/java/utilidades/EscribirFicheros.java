/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utilidades;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.AccessDeniedException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.FileAlreadyExistsException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author hinda
 */
public class EscribirFicheros {
        //Metodo para escribir un cvs con un array de cualquier tipo de objetos
    //---Asegurarse de tener implentado el toString con formato "x;x;...", en otro caso modificar este mismo metodo con los datos pertinentes--
      public static <T> void escrituraFicheroCsv(String idFichero, ArrayList<T> lista) {

        try (BufferedWriter flujo = new BufferedWriter(new FileWriter(idFichero))) {
            //debende que quieres hacer 
            for (T obj : lista) {
                flujo.write(obj.toString());
                flujo.newLine();
            }
            // Metodo fluh() guarda cambios en disco 
            flujo.flush();
            System.out.println("Fichero " + idFichero + " creado correctamente.");

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
      
     //Metodo para escribir un cvs con un objeto cualquiera
    public static <T> void escribirCsv(String nombre, T objeto) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre))) {
            //TODO: modificar segun sea conveniente
            bw.write(objeto.toString());
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    
     //Metodo para escribir un json con un array de cualquier tipo de objetos
    //---Asegurar de tener correctamente las dependecias--
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.core/jackson-core -->
    //<!-- https://mvnrepository.com/artifact/com.fasterxml.jackson.datatype/jackson-datatype-jsr310 --> (por si hay fechas)
    public static <T> void escribirJSON(String nombre, List<T> datos) {
        ObjectMapper mappeador = new ObjectMapper();

        mappeador.registerModule(new JavaTimeModule()); //Formato fechas

        mappeador.configure(SerializationFeature.INDENT_OUTPUT, true);

        try {
            mappeador.writeValue(new File(nombre), datos);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    //crear directorio
    //Ej: si pones una ruta "./ej1/ejercicios" te crea dos carpetas
    //Ej: si has creado anteriormente "./ej1" y pones "./ej1/ejemplo" te crea dentro de ej1 un carpeta llamada ejemplo
    public static void crearDirectorio(String ruta) {
        Path file = Paths.get(ruta);
        try {
            if (!Files.exists(file)) {
                Files.createDirectory(file);
                System.out.println("el directorio se crea correctamente");
            }
        } catch (FileAlreadyExistsException faee) {
            System.out.println("no puede crear porque existe");
        } catch (AccessDeniedException ade) {
            System.out.println("No tienes permisos");
        } catch (IOException e) {
            System.out.println(e.toString());
        }
    }
    
    public static void copiarFicherosEnDirectorio(String rutaOrigen, String rutaDestino) {
        Path origen = Paths.get(rutaOrigen);
        Path destino = Paths.get(rutaDestino);

        try {
            Files.copy(origen, destino);
            System.out.println("archivos copiandos");
        } catch (DirectoryNotEmptyException dne) {
            System.out.println("no puede replace el fichero porque el directorio not empty");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }
    
    
    
  
      
}
