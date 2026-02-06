import java.util.ArrayList;
import java.util.List;

//Clase PasearFichero con el metodo listarEstudiantes
public class PasearFichero {
    /*
    Metodo listarEstudiantes que recibe un ArrayList, en cual
    se parsea y se divide en partes, en este caso, nombres y notas,
    y se añaden a un ArrayList listaEstudiantes los objetos estudiante de
    la clase Estudiante y la devuelve (tambien se imprime para ver como
    recupero los datos y comprobarlos)
    */
    public static ArrayList<Estudiante> listarEstudiantes(ArrayList<String> alumnos) {
        ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
        for (String alumno : alumnos) {
            String[] partes = alumno.split(";");
            Estudiante estudiante = new Estudiante(partes[0],Double.parseDouble(partes[1]));

            listaEstudiantes.add(estudiante);
        }
        System.out.println("Lista parseada");
        return listaEstudiantes;
    }
}
