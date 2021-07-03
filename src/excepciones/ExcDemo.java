package excepciones;

public class ExcDemo {
    public static void main(String[] args) {
        int nums[]=new int[10];

        try {
            System.out.println("Antes de que se genere la excepción.");
            //generar una excepción de índice fuera de límites
            System.out.println(nums[10]);
        }catch (ArrayIndexOutOfBoundsException exc){
            //Capturando la excepción
            System.out.println("Índice fuera de los límites!");
        }
        System.out.println("Después de que se genere la excepción.");
    }
}