package excepciones;

public class ExcDemo6_Rethrow {
    public static void genExcepcion() {
        //Aquí, num es más largo que denom
        int nums[] = null;
        int denom[] = {2, 0, 4, 4, 0, 8};

        for (int i = 0; i < 10; i++) {
            try {
                System.out.println(nums + " / " +
                        denom + " es " + nums[i] / denom[i]);
                //sucede un error en la escritura del archivo
            }

            catch (ArithmeticException exc){
                //Capturando la excepción
                System.out.println("No se puede dividir por cero!.");
                // cerrar el archivo
            }
            catch (ArrayIndexOutOfBoundsException exc) {
                //Capturando la excepción
                System.out.println("No se encontró ningún elemento.");
                // cerrar el archivo
            }
            catch (Exception e){
                System.out.println("Aquí un error que no conozco pasó pero su mensaje es" +e.getMessage());
            }

        }
    }
}
