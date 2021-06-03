import java.util.Scanner;

public class Ejercicio6{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Por favor ingrese un numero");
        int x = scan.nextInt();
        System.out.println("Por favor ingrese otro numero");
        int n = scan.nextInt();
        scan.close();
        System.out.println(potencia(x,n));
    }

    public static int potencia(int x, int n){
        int acum = 1;
        for (int i=1; i <= n;i++){
            acum *= x;
        }

        return acum;
    }
}
