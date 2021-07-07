package interfaces;

public class Implementacion {
    public static void main(String args[]){
        EnteroComparable ec = new EnteroComparable(5);
        DoubleComparable db = new DoubleComparable(15.0);

        System.out.println(ec.esMenorQue(db));
    }

    public boolean hacerAlgo(Comparable c){

        return false;
    }
}