import java.util.Scanner;

public class Ejercicio5 {
	
	 public static void main(String[]args) {
		 
		 Scanner scan = new Scanner(System.in);      //Creamos un scanner que tomara los valores de entrada por consola
		 int nro = scan.nextInt();        //Escanea el proximo entero que es ingresado
		 scan.close();                            //Ceeramos el scanner si no lo usamos mas(buena practica)
		 
		 for (int i=1; i<=10; i++) {
			 System.out.println(nro + " * " + i + " = " + nro*i);
		 }
	}
}
