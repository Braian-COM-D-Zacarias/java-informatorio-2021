import java.util.Scanner;
public class Ejercicio4 {
	 public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);      //Creamos un scanner que tomara los valores de entrada por consola
		 int dia = scan.nextInt();        //Escanea el proximo entero que es ingresado
		 scan.close();                            //Ceeramos el scanner si no lo usamos mas(buena practica)
		 if (dia == 1) {
			 System.out.println("Domingo");
		 }else if (dia == 2) {
			 System.out.println("Lunes");
		 }else if (dia == 3) {
			 System.out.println("Martes");
		 }else if (dia == 4) {
			 System.out.println("Miercoles");
		 }else if (dia == 5){
			 System.out.println("Jueves");
		 }else if (dia == 6) {
			 System.out.println("Viernes");
		 }else if (dia == 7) {
			 System.out.println("Sabado");
		 }else {
			 System.out.println("Error de ingreso");
		 }
	 }

}