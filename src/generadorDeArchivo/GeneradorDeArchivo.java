package generadorDeArchivo;

import java.io.FileWriter;
import java.io.IOException;

import com.google.gson.Gson;

import modelRecord.DatosConversion;

public class GeneradorDeArchivo {

    public static void guardarJson(String opcion, double resultado) {
        // Crear el objeto DatosConversion
       DatosConversion datos = new DatosConversion(opcion, resultado );
        
        // Convertir el objeto a formato JSON
        Gson gson = new Gson();
        String json = gson.toJson(datos);

        // Guardar el JSON en un archivo
        try (FileWriter escritura = new FileWriter("datos.json", true)) {
            escritura.write(json + System.lineSeparator()); // Agregar nueva línea para cada registro
            System.out.println("Datos guardados exitosamente en datos.json");
        } catch (IOException e) {
            System.out.println("Error al guardar los datos: " + e.getMessage());
        }
    }
}
