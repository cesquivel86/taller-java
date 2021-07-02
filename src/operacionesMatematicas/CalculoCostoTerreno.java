package operacionesMatematicas;

public class CalculoCostoTerreno {
    public double costoDelTerreno(double base, double altura){
        return 0;
    }

    public double costoDelTerreno(FiguraGeometrica figura){
        return figura.calcularArea()*1000;
    }
}
