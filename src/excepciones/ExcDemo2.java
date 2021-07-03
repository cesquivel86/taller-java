package excepciones;

public class ExcDemo2 {
    public static void main(String[] args) {
        try {
            ExcEjemplo2.genExcepcion();
        }catch (ArrayIndexOutOfBoundsException exc){
            //Capturando la excepción
            System.out.println("Índice fuera de los límites!");
        }
        System.out.println("Después de que se genere la excepción.");
    }
}