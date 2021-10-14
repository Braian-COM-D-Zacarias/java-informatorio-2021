import java.util.Scanner;

public class Ejercicio3 {
	 public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);      //Creamos un scanner que tomara los valores de entrada por consola
		 int nota = scan.nextInt();        //Escanea el proximo entero que es ingresado
		 scan.close();                            //Ceeramos el scanner si no lo usamos mas(buena practica)
		 if (nota > 92) {
			 System.out.println("Ecelente");
		 }else if (nota > 84) {
			 System.out.println("Sobresaliente");
		 }else if (nota >74) {
			 System.out.println("Distinguido");
		 }else if (nota >59) {
			 System.out.println("Bueno");
		 } else {
			 System.out.println("Desaprobado");
		 }
	 }

}
