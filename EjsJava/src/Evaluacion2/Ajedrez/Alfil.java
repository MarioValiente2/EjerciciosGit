package Evaluacion2.Ajedrez;

public class Alfil extends Pieza{
    public Alfil(String color) {
        super(color);
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esDiagonal();
    }
}
