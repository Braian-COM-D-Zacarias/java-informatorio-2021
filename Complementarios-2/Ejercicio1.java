public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        String [] ciudades = {"Bariloche", "Villa Carlos Paz", "Mendoza"};

        for (int i = 1; i < ciudades.length+1; i++ ){
            System.out.println("#"+i+" - "+ciudades[i-1]);
        }
    }
}