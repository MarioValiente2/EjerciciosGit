package Evaluacion2.Ajedrez;

public class Rey extends Pieza{
    public Rey(String color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal() || mov.esDiagonal();
    }
}
