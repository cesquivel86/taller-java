package ejemplosProgramacionOrientadaAObjetos;

//modificadores de acceso
public class Persona {
    private String nombre;
    private String apellidos;
    private String sexo;
    //la altura se expresa en metros
    protected double altura;

    //Constructor
    public Persona(String nombre, String apellidos, String sexo){
        this.nombre=nombre;
        this.apellidos=apellidos;
        this.sexo=sexo;
    }
    public Persona(){

    }

    public Persona (String nombre, String apellidos){
        this.nombre=nombre;
        this.apellidos=apellidos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getSex() {
        return sexo;
    }

    public void setSex(String sex) {
        this.sexo = sexo;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setAltura(double altura, String unidades){
        this.altura=altura;
        System.out.println("La altura es "+altura+" "+unidades);
    }
}
