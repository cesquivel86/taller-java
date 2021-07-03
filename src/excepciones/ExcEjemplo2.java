package excepciones;

// Una excepción puede ser generada por un método
// y atrapada por otro
public class ExcEjemplo2 {
    //Generando una exepción
    static void genExcepcion(){
        int nums[]=new int[10];

        System.out.println("Antes de que se genere la excepción.");

        //generar una excepción de índice fuera de límites
        try {
            System.out.println(nums[10]);
        }catch(IndexOutOfBoundsException e){
            System.out.println("Atrapando el error desde aquí");
            throw e;
        }
        System.out.println("Esto no se mostrará.");
    }
}