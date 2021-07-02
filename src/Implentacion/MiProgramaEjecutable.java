package Implentacion;

import operacionesMatematicas.Calculadora;
import ejemplosProgramacionOrientadaAObjetos.Persona;
import operacionesMatematicas.CalculoCostoTerreno;
import operacionesMatematicas.Cuadrado;
import operacionesMatematicas.Rectangulo;


public class MiProgramaEjecutable {
    public static void main(String args[]){
        int v1=0;
        float v2=0;
        boolean v3=true;
        double v4=4.0;
        String texto = "Hola a todos";

        System.out.println("Holaaaaaaa Mundo");
        Calculadora c1 = new Calculadora();
        System.out.println(c1.sumar(4,7));

        Persona persona2 = new Persona();
        persona2.setNombre("Carlos");
        //persona2.altura=3.2;

        CalculoCostoTerreno costo = new CalculoCostoTerreno();
        Rectangulo r = new Rectangulo(8,20);
        Cuadrado c = new Cuadrado(10);
        costo.costoDelTerreno(r);
        costo.costoDelTerreno(c);

    }
}