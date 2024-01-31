package Evaluacion2.Ajedrez;

public class Dama extends Pieza {
    public Dama(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2655 ";
        else
            nombre= "\u265B ";

    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal() || mov.esDiagonal();
    }
}
