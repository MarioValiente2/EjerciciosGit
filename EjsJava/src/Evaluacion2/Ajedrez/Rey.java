package Evaluacion2.Ajedrez;

public class Rey extends Pieza{
    public Rey(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2654 ";
        else
            nombre= "\u265A ";
    }
    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal() || mov.esDiagonal();
    }
}
