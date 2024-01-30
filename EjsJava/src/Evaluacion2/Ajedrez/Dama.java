package Evaluacion2.Ajedrez;

public class Dama extends Pieza {
    public Dama(String color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal() || mov.esDiagonal();
    }
}
