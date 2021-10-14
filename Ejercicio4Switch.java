import java.util.Scanner;

public class Ejercicio4Switch {
	 public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);      //Creamos un scanner que tomara los valores de entrada por consola
		 int dia = scan.nextInt();        //Escanea el proximo entero que es ingresado
		 scan.close();                            //Ceeramos el scanner si no lo usamos mas(buena practica)
		 
		 switch (dia) {
		     case 1:
		    	 System.out.println("Domingo");
		    	 break;
		     case 2:
		    	 System.out.println("Lunes");
		    	 break;
		     case 3:
		    	 System.out.println("Martes");
		    	 break;
		     case 4:
		    	 System.out.println("Miercoles");
		    	 break;
		     case 5:
		         System.out.println("Jueves");
		         break;
		     case 6:
		    	 System.out.println("Viernes");
		    	 break;
		     case 7:
		    	 System.out.println("Sabado");
		    	 break;
		 }
    }

}
