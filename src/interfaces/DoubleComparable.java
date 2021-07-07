package interfaces;

public class DoubleComparable implements Comparable{

    Double valor;

    public DoubleComparable(Double valor) {
        this.valor = valor;
    }

    @Override
    public Number getValor() {
        return this.valor;
    }

    @Override
    public boolean esMayorQue(Comparable a) {
        try {
            Double valorNumerico = (Double)a.getValor();
            if (this.valor > valorNumerico) {
                return true;
            }
        }catch(ClassCastException cce){
            System.out.println("Los objetos no son comparables de manera natural");
        }
        return false;
    }

    @Override
    public boolean esMenorQue(Comparable a) {
        try {
            Double valorNumerico = (Double)a.getValor();
            if (this.valor < valorNumerico) {
                return true;
            }
        }catch(ClassCastException cce){
            System.out.println("Los objetos no son comparables de manera natural");
        }
        return false;
    }

    @Override
    public boolean esIgualQue(Comparable a) {
        try {
            Double valorNumerico = (Double)a.getValor();
            if (this.valor == valorNumerico) {
                return true;
            }
        }catch(ClassCastException cce){
            System.out.println("Los objetos no son comparables de manera natural");
        }
        return false;
    }


}
