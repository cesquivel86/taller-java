package reflection2;

public class Computadora implements Producto{
    private String id;
    private String descripcion;
    private int ram;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public int getRam() {
        return ram;
    }
    public void setRam(int ram) {
        this.ram = ram;
    }
    public Computadora(String id, String descripcion, int potencia) {
        super();
        this.id = id;
        this.descripcion = descripcion;
        this.ram = potencia;
    }
}
