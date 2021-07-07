package interfaces;

public class EnteroComparable implements Comparable{
    Integer valor;

    public EnteroComparable(int valor){
        this.valor=valor;
    }

    public Integer getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
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
            if (this.valor == valorNumerico.intValue()) {
                return true;
            }
        }catch(ClassCastException cce){
            System.out.println("Los objetos no son comparables de manera natural");
        }
        return false;
    }
}
