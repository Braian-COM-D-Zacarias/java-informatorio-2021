
import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] arg){
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor ingrese dos numeros");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int j = a + b;
        int i = a * b;
        int k = a - b;
        double m = a / b;
        
        System.out.println(a + "+" + b + "=" + j );
        System.out.println(a + "*" + b +"=" + i );
        System.out.println(a + "-" + b +"=" + k );
        System.out.println(a + "/" + b +"=" + m );
        scan.close();
    }
}
