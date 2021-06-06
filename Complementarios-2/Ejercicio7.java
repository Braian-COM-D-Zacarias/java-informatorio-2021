import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese primer valor");
        int n1 = scan.nextInt();
        System.out.println("Ingrese segundo valor");
        int n2 = scan.nextInt();

        String [] inv = new String[n2-n1];
        int m = 0;
        inv[m] = n1+"";
        inv[n2-n1-1] = (n2-1)+"";

        m = m +1;

        for (int i = n1+1; i < n2; i ++){
            if ( multiplo2(i) == true){
                inv[m] = "Fizz";
            }
            if ( multiplo3(i) == true){
                inv[m] = " Buzz";
            }
            if (multiplo2(i) == true & multiplo3(i) == true){
                inv[m] = "Fizz Buzz";
            }
            if (multiplo2(i) == false & multiplo3(i) == false){
                inv[m] = i+"";
            }
            m = m+1;
        }

        for (int z = 0 ; z < inv.length; z ++){
            System.out.print(inv[z]+" ");
        }
        scan.close();
    }


    public static boolean multiplo2(int numero){
        return (numero % 2 == 0);
    }

    public static boolean multiplo3(int numero){
        return (numero % 3 == 0);
    }
}