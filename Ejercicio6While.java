import java.util.Scanner;
public class Ejercicio6While {
	 public static void main(String[]args) {
		 Scanner scan = new Scanner(System.in);      //Creamos un scanner que tomara los valores de entrada por consola
         int continuar = 1;
         int nro ;
         do{
        	 System.out.println("Por favor ingrese un numero: ");
        	 nro = scan.nextInt();     //Escanea el primer numero ingresado
        	 System.out.println("El numero ingresa es: " + nro);
        	 
        	 System.out.println("Si desea continuar ingrese el numero 1, si no cualquiero otra tecla");
        	 continuar = scan.nextInt();     //Escanea el numero y evalua si se continua o no
        	 
         } while (continuar == 1);
         scan.close();     //Se cierra el escaner si no se usa mas
	 }
}