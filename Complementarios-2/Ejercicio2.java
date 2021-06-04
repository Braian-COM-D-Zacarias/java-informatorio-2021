import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio2 {
    public static void main(String[] args) throws Exception {
        int [] enteros = {1,3,5,7,9};
        int long_orig = enteros.length;

        int long_nuevo = long_orig+2;
        int [] nueva_lista = new int [long_nuevo];

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese nuevo valor inicial: ");
        int inicio = scan.nextInt();
        System.out.println("Ingrese nuevo valor final: ");
        int fin = scan.nextInt();

        nueva_lista[0] = inicio;

        for (int i = 0; i < enteros.length; i++){
            nueva_lista[i+1] = enteros[i];
        }

        nueva_lista[long_orig+1] = fin;

        System.out.println("Tamaño antes: "+ long_orig);
        System.out.println("Tamaño antes: "+ long_nuevo);
        System.out.println("Array antes:\n"+ Arrays.toString(enteros));
        System.out.println("Array nuevo:\n"+ Arrays.toString(nueva_lista));
        scan.close();
    }
}