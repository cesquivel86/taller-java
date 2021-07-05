package patronesDeDiseno;

import java.util.Calendar;

public class ImplementacionDeConexion {

    public static void main (String args[]){
        //Conexion c = new Conexion();
        Conexion c = Conexion.getConexion("url","Mi Base de Datos");

        Conexion c2 = Conexion.getConexion("url","miBaseDeDatos");


    }
}
