import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {

        String nombre;
        String apellido;
        String edad;
        String direccion;
        String ciudad;

        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre: ");
        nombre = scan.nextLine();
        System.out.println("Apellido: ");
        apellido = scan.nextLine();
        System.out.println("Edad: ");
        edad = scan.nextLine();
        System.out.println("Direccion: ");
        direccion = scan.nextLine();
        System.out.println("Ciudad: ");
        ciudad = scan.nextLine();

        Persona persona = new Persona( nombre,  apellido,  edad,  direccion,  ciudad);

        System.out.println(persona.getCiudad() +"-"+ persona.getDireccion()+"-"+persona.getEdad()+"-"+persona.getNombre()+"-"+persona.getApellido());

        scan.close();
    }

    public class Persona {
        private String nombre;
        private String apellido;
        private String edad;
        private String direccion;
        private String ciudad;

        

        public String getNombre(){
            return this.nombre;
        }

        public String getApellido(){
            return this.apellido;
        }

        public String getEdad(){
            return this.edad;
        }

        public String getDireccion(){
            return this.direccion;
        }

        public String getCiudad(){
            return this.ciudad;
        }
    }

}
