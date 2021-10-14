import java.util.Scanner;

public class Ejercicio5{
    
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int x = scan.nextInt();
        System.out.println("Por favor ingrese otro numero");
        int n = scan.nextInt();
        scan.close();
        System.out.println(multiplicacion(x,n));
    }

    public static int multiplicacion(int x, int n){
        int acum = 0;
        for (int i=1; i <= n;i++){
            acum += x;
        }
        return acum;
    }
}
