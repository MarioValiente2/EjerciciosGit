package Evaluacion2.Ajedrez;

public class Alfil extends Pieza{
    public Alfil(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2657 ";
        else
            nombre= "\u265D ";
    }
    @Override
    public boolean validoMovimiento(Movimiento mov,Tablero tablero) {
        return mov.esDiagonal();
    }
}
