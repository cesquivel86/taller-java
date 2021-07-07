package reflection4;

import java.lang.reflect.Field;

public class Oracle_DAO implements DAO_Generico{
    @Override
    public void insertar(Object o) {
        Field[] campos = o.getClass().getFields();
        String consultaSQL_Oracle = "";
        String camposTabla="";
        for (int i=0; i<campos.length;i++){
            Field f =campos[i];
            camposTabla+="'"+f.getName()+"'";
            if(i< campos.length-1) {
                camposTabla += ",";
            }
        }
        
        //imprimir consulta fina
        System.out.println(consultaSQL_Oracle);
    }

    @Override
    public void eliminar(Object o) {

    }

    @Override
    public void actualizar(Object o) {

    }

    @Override
    public Object buscarPorId(Object o) {
        return null;
    }
}
