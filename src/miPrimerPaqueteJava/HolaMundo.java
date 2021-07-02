package miPrimerPaqueteJava;

import operacionesMatematicas.Calculadora;

public class HolaMundo {
    public static void main(String args[]){
        System.out.println("Holaaaaaaa Mundo");
        Calculadora c1 = new Calculadora();
        System.out.println(c1.sumar(3,5));
    }
}
