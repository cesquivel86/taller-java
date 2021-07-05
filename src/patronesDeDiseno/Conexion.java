package patronesDeDiseno;
// Ejemplo de conexión a base de datos utilizando el patrón de diseño Singleton
public class Conexion {
    private String url;
    private String baseDeDatos;

    private static Conexion mi_conexion=null;

    public static Conexion getConexion(String url,String baseDeDatos){
        if(mi_conexion==null){
            mi_conexion= new Conexion(url,baseDeDatos);
        }
        return mi_conexion;
    }
    private Conexion(String url,String baseDeDatos){
        this.url=url;
        this.baseDeDatos=baseDeDatos;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getBaseDeDatos() {
        return baseDeDatos;
    }

    public void setBaseDeDatos(String baseDeDatos) {
        this.baseDeDatos = baseDeDatos;
    }
}
