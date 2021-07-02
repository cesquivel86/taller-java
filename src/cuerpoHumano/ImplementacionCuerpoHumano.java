package cuerpoHumano;

public class ImplementacionCuerpoHumano {
    public static void main(String args[]){
        Corazon c = new Corazon();
        Cerebro cer = new Cerebro();
        Brazo bi = new Brazo();
        Brazo bd = new Brazo();
        Pierna pi = new Pierna();
        Pierna pd = new Pierna();
        CuerpoHumano ch = new CuerpoHumano(cer, c, bi, bd, pi,pd);
        ch.getBrazoIzquierdo().moverBrazo();

        CuerpoHumano ch2 = new CuerpoHumano();
        ch2.getBrazoDerecho().moverBrazo();

        CuerpoHumano ch3 = new CuerpoHumano(cer, c);
        ch3.getBrazoDerecho().moverBrazo();

        System.out.println(ch3.getClass());
    }
}
