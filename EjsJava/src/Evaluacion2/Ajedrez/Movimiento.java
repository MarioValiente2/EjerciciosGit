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

    public Posicion getPosInicial() {
        return posInicial;
    }

    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }

    public Posicion getPosFinal() {
        return posFinal;
    }

    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }

    public boolean esVertical() {
        boolean respuesta =false;
        if (posInicial.getColumna()==posFinal.getColumna()){
            respuesta= true;
        }
        return respuesta ;
    }

    public boolean esHorizontal() {
        boolean respuesta =false;
        if (posInicial.getFila()==posFinal.getFila()){
            respuesta= true;
        }
        return respuesta;
    }

    public boolean esDiagonal() {
        boolean respuesta=false;
        if (esVertical()==esHorizontal()){
            respuesta=true;
        }
        return respuesta;
    }
    public int saltoHorizontal(){
        return posFinal.getColumna()-posInicial.getColumna();
    }
    public int saltoVertical(){
        return posFinal.getFila()-posInicial.getFila();
    }

}
