import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        ArrayList<String> alumnos = new ArrayList <String>();
        String [] nombres = {"Braian","Jose","Mariel","Belen","Rosario","Sonia","Carlos","Gisella","Fede","Lucy","Julio","Eze"};
        for(int i=0; i < nombres.length; i++){
            alumnos.add(i,nombres[i]);
        }

        List<String> curso_1 = alumnos.subList(0, 4);
        List<String> curso_2 = alumnos.subList(4, 8);
        List<String> curso_3 = alumnos.subList(8, 12);

        System.out.println(alumnos);
        System.out.println("Curso1: "+curso_1);
        System.out.println("Curso2: "+curso_2);
        System.out.println("Curso3: "+curso_3);
    }
}
