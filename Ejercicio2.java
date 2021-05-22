import java.util.*;
public class Ejercicio2 {
	
	public static void main(String[]args) {
		//Creamos un scanner que tomara los valores de entrada por consola
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //Escanea el proximo entero que es ingresado
		int b = scan.nextInt();
		int c = scan.nextInt();
		
		System.out.println("El primer numero ingresado es: " + a);
		System.out.println("El primer numero ingresado es: " + b);
		System.out.println("El primer numero ingresado es: " + c);
		scan.close();
	}

}