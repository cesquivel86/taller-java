package reflection3;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
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

        Implementación.imprimirIdyDescripcionGeneral(computadoras);
        Implementación.imprimirIdyDescripcionGeneral(lamparas);
    }

    public static void imprimirIdyDescripcionGeneral(List lista){
        for(Object c: lista) {
            String id="Producto Inválido o sin Id";
            String descripcion="Producto Inválido o sin descripción";
            Method[] metodos=c.getClass().getMethods();
            for(Method m: metodos) {
                if (m.getName().equals("getId") ) {
                    try {
                        id=(String) m.invoke(c, null);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }

                if ( m.getName().equals("getDescripcion")) {
                    try {
                        descripcion= (String) m.invoke(c, null);
                    } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println(id+" "+descripcion);
        }
    }


}
