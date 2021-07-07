package reflection;

import java.util.ArrayList;
import java.util.List;

public class Implementación {
    public static void main (String args[]){
        Computadora c1 = new Computadora("01","Alienware", 32);
        Computadora c2 = new Computadora("02","Toshiba", 16);
        Computadora c3 = new Computadora("03","Lenovo", 16);
        List<Computadora> computadoras = new ArrayList<Computadora>();
        computadoras.add(c1);
        computadoras.add(c2);
        computadoras.add(c3);

        Lampara l1 = new Lampara("L1","Standard","Lámpara para exteriores");
        Lampara l2 = new Lampara("L2","Deluxe","Lámpara para baños");
        Lampara l3 = new Lampara("L3","Premium","Lámpara regular");
        List<Lampara> lamparas = new ArrayList<Lampara>();

        lamparas.add(l1);
        lamparas.add(l2);
        lamparas.add(l3);

        Implementación.imprimirIdyDescripcionComputadoras(computadoras);

        Implementación.imprimirIdyDescripcionLamparas(lamparas);
    }

    public static void imprimirIdyDescripcionLamparas(List<Lampara> lamparas){
        for(Lampara c: lamparas){
            System.out.println(c.getId()+ c.getDescripcion());
        }
    }
    public static void imprimirIdyDescripcionComputadoras(List<Computadora> computadoras){
        for(Computadora c: computadoras){
            System.out.println(c.getId()+ c.getDescripcion());
        }
    }

    /*
    public static void imprimirIdyDescripcion(List productos){
        for(Object c: productos){
            System.out.println(c.getId()+ c.getDescripcion());
        }
    }

     */
}
