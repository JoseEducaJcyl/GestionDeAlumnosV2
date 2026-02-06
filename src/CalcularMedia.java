import java.util.ArrayList;

//Clase CalcularMedia con el metodo mediaEstudiantes
public class CalcularMedia {
    /*
    Metodo mediaEstudiantes que recibe un ArrayList<Estudiante>
    el cual lo recorre y acumula en una varible media que luego
    divide por el tamaño del ArrayList
    */
    public static double mediaEstudiantes(ArrayList<Estudiante> estudiantes) {
        double media = 0;
        for (Estudiante estudiante : estudiantes) {
            media += estudiante.getNota();
        }
        media = media / estudiantes.size();
        return media;
    }
}
