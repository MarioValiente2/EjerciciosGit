package Evaluacion2.Ajedrez;

public class Torre extends Pieza{
    public Torre(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2656 ";
        else
            nombre= "\u265C ";
    }

    @Override
    public boolean validoMovimiento(Movimiento mov,Tablero tablero) {
        //return (!tablero.hayPiezasEntre(mov))?mov.esVertical() || mov.esHorizontal():false;
        return (mov.esVertical() || mov.esHorizontal());
    }


}
