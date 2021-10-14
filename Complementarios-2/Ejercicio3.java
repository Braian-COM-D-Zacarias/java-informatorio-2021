import java.util.Arrays;
import java.util.Random;

public class Ejercicio3 {
    
    public static void main(String[] args){
        int [] baraja = {2,3,4,5,6,7,8,9,10};
        System.out.println("Baraja ordenadas: " + Arrays.toString(baraja));
        System.out.println("Baraja invertidas: " + Arrays.toString(invertir(baraja)));
        System.out.println("Baraja mezcladas: " + Arrays.toString(mezclar(baraja)));
    }
    public static int[] invertir(int[] valores){
        int longitud = valores.length;
        int [] inver = new int[longitud];
        for (int i = longitud; i >0 ; i --) {
            inver[i - 1] = valores[longitud - i];
        }
        return inver;
    }
    public static int[] mezclar(int[] valores) {
        int index, temp;
        int [] array = valores;
        Random random = new Random();
        for (int i = array.length - 1; i > 0; i--) {
            index = random.nextInt(i + 1);
            temp = array[index];
            array[index] = array[i];
            array[i] = temp;
        }
        return array;
    }
}
