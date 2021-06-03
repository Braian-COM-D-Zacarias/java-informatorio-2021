import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        int x = ingresarNumero();
        System.out.println(factorial(x));
    }

    public static int ingresarNumero(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un numero para factorial: ");
        int x = scan.nextInt();
        scan.close();
        return x;
    }
    public static int factorial(int num){
        if (num == 1){
            return num;
        } else if(num == 0){
            return 1;
        } else {
            return num*factorial(num-1);
        }
    }

}
