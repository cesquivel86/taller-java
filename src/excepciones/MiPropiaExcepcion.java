package excepciones;

public class MiPropiaExcepcion extends Exception{
    public MiPropiaExcepcion(){
        super();
    }
    public String getMessage(){
        return "La persona tiene un nombre muy corto";
    }
}
