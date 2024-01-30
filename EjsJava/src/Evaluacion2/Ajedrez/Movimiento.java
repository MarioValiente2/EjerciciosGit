package Evaluacion2.Ajedrez;

public class Movimiento {
    private Posicion posInicial;
    private Posicion posFinal;

    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    public Movimiento() {

    }

    public boolean esVertical() {
        return false;
    }

    public boolean esHorizontal() {
        return false;
    }

    public boolean esDiagonal() {
        return false;
    }
    public int saltoHorizontal(){
        return 0;
    }
    public int saltoVertical(){
        return 0;
    }

}
