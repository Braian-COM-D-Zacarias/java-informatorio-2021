import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args){
        int a = ingresarNumero();
        semitriangulo(a);
    }

    public static int ingresarNumero(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        int x = scan.nextInt();
        scan.close();
        return x;
    }

    public static void semitriangulo(int x){
        for (int n=1; n<=x; n++){
            linea(n);
            System.out.println("");
        }
    }

    public static void linea(int x){
        for (int n=1; n<=x; n++){
            System.out.print(n + " ");
        }
    }
}