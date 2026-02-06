import java.util.ArrayList;

//Clase Main con el metodo main para ejecutar el codigo
public class Main {
    public static void main(String[] args) {
        String ruta = "estudiantes.txt";
        ArrayList<String> alumnos = new ArrayList<>();
        alumnos = LeerFichero.leerEstudiantes(ruta);
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        estudiantes = PasearFichero.listarEstudiantes(alumnos);
        double mediaEstudiantes = CalcularMedia.mediaEstudiantes(estudiantes);
        MostrarResultadoConsola.mostrarResulatdo(mediaEstudiantes);

    }
}