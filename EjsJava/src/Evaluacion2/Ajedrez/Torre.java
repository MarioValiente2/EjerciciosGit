package Evaluacion2.Ajedrez;

public class Torre extends Pieza{
    public Torre(String color) {
        super(color);
        if (color.equalsIgnoreCase("Blanco"))
            nombre= "\u2656 ";
        else
            nombre= "\u265C ";
    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        return mov.esVertical() || mov.esHorizontal();
    }


}
