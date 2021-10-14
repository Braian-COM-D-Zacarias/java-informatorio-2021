import java.util.HashMap;
import java.util.Scanner;

public class Ejercicio7 {
    
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        System.out.print("Palabra: ");
        String texto = scan.next();
        System.out.println(cambio(texto));
    }

    public static String cambio(String cadena){
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("a", "A");
        map.put("b", "B");
        map.put("c", "C");
        map.put("d", "D");
        map.put("e", "E");
        map.put("f", "F");
        map.put("g", "G");
        map.put("h", "H");
        map.put("i", "I");
        map.put("j", "J");
        map.put("k", "K");
        map.put("l", "L");
        map.put("m", "M");
        map.put("n", "N");
        map.put("ñ", "Ñ");
        map.put("o", "O");
        map.put("p", "P");
        map.put("q", "Q");
        map.put("r", "R");
        map.put("s", "S");
        map.put("t", "T");
        map.put("u", "U");
        map.put("v", "V");
        map.put("w", "W");
        map.put("x", "X");
        map.put("y", "Y");
        map.put("z", "Z");
        String resultado = "";
        for (int i=0; i<cadena.length(); i++){
            //System.out.println(String.valueOf(cadena.charAt(i)));
            resultado += map.get(String.valueOf(cadena.charAt(i)));
        }
        return resultado;
    }
}
