package excepciones;

import java.util.Random;

public class ExcDemo6_RethrowDemo {
    public static void main(String[] args) {
            //ExcDemo6_Rethrow.genExcepcion();

            Random r = new Random();
            for(int i=0;i<10 ;i++)
                System.out.println(r.nextInt(10));



    }
}
