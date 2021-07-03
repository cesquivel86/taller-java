package excepciones;

public class ExcDemo5_ThrowDemo {
    public static void main(String[] args) {
        try{
            System.out.println("Antes de lanzar excepción.");
            throw new ArithmeticException(); //Lanzar una excepción
        }catch (ArithmeticException exc){
            //Capturando la excepción
            System.out.println("Excepción capturada.");
        }
        System.out.println("Después del bloque try/catch");
    }

    public void RecibirExcepcion(ArithmeticException ae){
        throw ae;
    }
}
