package excepciones;

public class ExcDemo7_UsoFinally {
    public static void genExcepecion(int rec) {
        int t;
        int nums[]=new int[10];

        System.out.println("Recibiendo "+rec);
        try {
            switch (rec){
                case 0:
                    t=10 /rec;
                    break;
                case 1:
                    System.out.println(nums[10]); //Genera un error de indexación
                    break;
                case 2:
                    return; //Retorna desde el blorec try
            }
        }
        catch (ArithmeticException exc){
            //Capturando la excepción
            System.out.println("No se puede dividir por cero!");
            return; //retorna desde catch
        }
        catch (ArrayIndexOutOfBoundsException exc){
            //Capturando la excepción
            System.out.println("Elemento no encontrado");
        }
        finally {
            //esto se ejecuta al salir de los blorecs try/catch
            System.out.println("Saliendo de try.");
        }
    }
}
