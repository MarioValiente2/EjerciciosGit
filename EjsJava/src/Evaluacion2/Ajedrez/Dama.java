package Evaluacion2.Ajedrez;

public class Dama extends Pieza {
    /**
     * Constructor que inicializa el nombre de la pieza y recibe el parametro color
     * @param color Este parametro solo puede tomar dos valores B o N
     */
    public Dama(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2655 ";
        else
            nombre= "\u265B ";

    }

    /**
     * Este metodo dice que los movimientos posibles del Peon solo pueden ser horizontales o verticales y para comer en diagonal
     * @param mov Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuelve un booleano, si es un movimiento que la Dama  no es capaz de hacer devolvera un false
     */
    @Override
    public boolean validoMovimiento(Movimiento mov,Tablero tablero) {
        return mov.esVertical() || mov.esHorizontal() || mov.esDiagonal();
    }
}
