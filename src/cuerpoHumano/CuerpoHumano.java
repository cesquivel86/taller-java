package cuerpoHumano;

public class CuerpoHumano {
    private Cerebro cerebro= new Cerebro();
    private Corazon corazon= new Corazon();
    private Brazo brazoIzquierdo= new Brazo();
    private Brazo brazoDerecho= new Brazo();
    private Pierna pierdaDerecha= new Pierna();
    private Pierna piernaIzquierda= new Pierna();

    public CuerpoHumano(){
        cerebro= new Cerebro();
        corazon=new Corazon();
        brazoIzquierdo= new Brazo();
        brazoDerecho= new Brazo();
        piernaIzquierda= new Pierna();
        pierdaDerecha=new Pierna();
    }

    public CuerpoHumano(Cerebro cer, Corazon cor){
        cerebro= cer;
        corazon=cor;
    }

    public CuerpoHumano(Cerebro cerebro, Corazon corazon, Brazo brazoIzquierdo, Brazo brazoDerecho, Pierna pierdaDerecha, Pierna piernaIzquierda) {
        this.cerebro = cerebro;
        this.corazon = corazon;
        this.brazoIzquierdo = brazoIzquierdo;
        this.brazoDerecho = brazoDerecho;
        this.pierdaDerecha = pierdaDerecha;
        this.piernaIzquierda = piernaIzquierda;
    }

    public Cerebro getCerebro() {
        return cerebro;
    }

    public void setCerebro(Cerebro cerebro) {
        this.cerebro = cerebro;
    }

    public Corazon getCorazon() {
        return corazon;
    }

    public void setCorazon(Corazon corazon) {
        this.corazon = corazon;
    }

    public Brazo getBrazoIzquierdo() {
        return brazoIzquierdo;
    }

    public void setBrazoIzquierdo(Brazo brazoIzquierdo) {
        this.brazoIzquierdo = brazoIzquierdo;
    }

    public Brazo getBrazoDerecho() {
        return brazoDerecho;
    }

    public void setBrazoDerecho(Brazo brazoDerecho) {
        this.brazoDerecho = brazoDerecho;
    }

    public Pierna getPierdaDerecha() {
        return pierdaDerecha;
    }

    public void setPierdaDerecha(Pierna pierdaDerecha) {
        this.pierdaDerecha = pierdaDerecha;
    }

    public Pierna getPiernaIzquierda() {
        return piernaIzquierda;
    }

    public void setPiernaIzquierda(Pierna piernaIzquierda) {
        this.piernaIzquierda = piernaIzquierda;
    }
}
