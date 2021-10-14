import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        HashSet<Empleado> empleados = new HashSet<Empleado>();
        Map<String, Integer> map = new HashMap<String, Integer>();

        Empleado e1 = new Empleado();
        e1.apellido = "Zacarias";
        e1.nombre = "Braian";
        e1.dni = "33784927";
        e1.horasTrabajadas = 60;
        e1.valorPorHora = 1200;

        Empleado e2 = new Empleado();
        e2.apellido = "Jack";
        e2.nombre = "Sinclair";
        e2.dni = "40373934";
        e2.horasTrabajadas = 80;
        e2.valorPorHora = 2000;

        empleados.add(e1);
        empleados.add(e2);

        System.out.println("Empleados:" + empleados);

        for (Empleado temp : empleados) {
            int sueldo = temp.horasTrabajadas*temp.valorPorHora;
            map.put(temp.dni,sueldo);
        }

        System.out.println("Dni=Sueldo: "+map);
    }
    
    public static class Empleado {
        public String nombre;
        public String apellido;
        public String dni;
        public int horasTrabajadas;
        public int valorPorHora;
    }
}

