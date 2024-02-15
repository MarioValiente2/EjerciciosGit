package Evaluacion2.Ajedrez;

public class Alfil extends Pieza{
    /**
     * Constructor que inicializa el nombre de la pieza y recibe el parametro color
     * @param color Este parametro solo puede tomar dos valores B o N
     */
    public Alfil(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2657 ";
        else
            nombre= "\u265D ";
    }

    /**
     * Este metodo dice que los movimientos posibles del Alfil solo puede ser diagonal
     * @param mov Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuelve un booleano, si es un movimiento que el Alfil no es capaz de hacer devolvera un false
     */
    @Override
    public boolean validoMovimiento(Movimiento mov,Tablero tablero) {
        boolean respuesta = false;
        if (mov.esDiagonal() && !tablero.hayPiezasEntre(mov)) {
            respuesta = true;
        }
        return respuesta;
    }
}
