package Evaluacion2.Ajedrez;

public class Peon extends Pieza {
    public Peon(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2659 ";
        else
            nombre= "\u265F ";
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esDiagonal();
    }
}
