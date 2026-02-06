import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

//Clase LeerFichero con el metodo leerEstudiantes
public class LeerFichero {
    /*
    Metodo leerEstudiantes que recibe la ruta de un fichero como cadena
    y luego a traves de un BufferedReader recupera el texto y lo añade
    a un ArrayList que almacena los datos, y luego devuelve el ArrayList
    */
    public static ArrayList<String> leerEstudiantes(String ruta) {
        ArrayList<String> alumnos = new ArrayList();
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                alumnos.add(linea);
            }
            System.out.println("Fichero " + ruta + " leido");

        } catch (IOException e) {
            System.out.println("Ocurrió un error al leer el archivo: " + e.getMessage());
        }
        return alumnos;
    }
}
