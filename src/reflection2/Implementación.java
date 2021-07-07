package reflection2;

import java.util.ArrayList;
import java.util.List;

public class Implementación {
    public static void main (String args[]){
        Computadora c1 = new Computadora("01","Alienware", 32);
        Computadora c2 = new Computadora("02","Toshiba", 16);
        Computadora c3 = new Computadora("03","Lenovo", 16);
        List<Producto> computadoras = new ArrayList<Producto>();
        computadoras.add(c1);
        computadoras.add(c2);
        computadoras.add(c3);

        Lampara l1 = new Lampara("L1","Standard","Lámpara para exteriores");
        Lampara l2 = new Lampara("L2","Deluxe","Lámpara para baños");
        Lampara l3 = new Lampara("L3","Premium","Lámpara regular");
        List<Producto> lamparas = new ArrayList<Producto>();

        lamparas.add(l1);
        lamparas.add(l2);
        lamparas.add(l3);

        Implementación.imprimirIdyDescripcionProductos(computadoras);

        Implementación.imprimirIdyDescripcionProductos(lamparas);
    }

    public static void imprimirIdyDescripcionProductos(List<Producto> productos){
        for(Producto p: productos) System.out.println(p.getId() + p.getDescripcion());
    }

}
