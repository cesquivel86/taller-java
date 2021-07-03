package excepciones;

public class ExcDemo4_TryAnidado {
    public static void main(String[] args) {
        //Aquí, num es más grande que denom
        int[] nums=null;
        int[] denom=null;

        try { //try externo
            for (int i = 0; i < nums.length; i++) {
                try { //try anidado
                    System.out.println(nums + " / " +
                            denom + " es " + nums[i] / denom[i]);
                } catch (ArithmeticException exc) {
                    //Capturando la excepción
                    System.out.println("No se puede dividir por cero!");
                }
            }
        }
        catch (ArrayIndexOutOfBoundsException exc) {
            //Capturando la excepción
            System.out.println("Alguna excepción ocurrió.");
            System.out.println("ERROR: Programa terminado.");
            System.out.println(exc.getMessage());
            exc.printStackTrace();
        }
    }
}
