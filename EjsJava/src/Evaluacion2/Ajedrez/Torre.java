package Evaluacion2.Ajedrez;

public class Torre extends Pieza {
    private boolean mover=true;
    /**
     * Constructor que inicializa el nombre de la pieza y recibe el parametro color
     * @param color Este parametro solo puede tomar dos valores B o N
     */
    public Torre(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre = "\u2656 ";
        else nombre = "\u265C ";
    }


    /**
     * Este metodo dice que los movimientos posibles de la torre solo pueden ser horizontales o verticales
     * @param mov Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuelve un booleano, si es un movimiento que la Torre no es capaz de hacer devolvera un false
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean respuesta=false;
        if (mov.esVertical() && !tablero.hayPiezasEntre(mov)){
            mover=true;
            respuesta=true;
        } else if (mov.esHorizontal() && !tablero.hayPiezasEntre(mov) ) {
            mover=true;
            respuesta=true;
        }

        return respuesta;
        //return (mov.esVertical() || mov.esHorizontal())? mover : !mover;
    }

    public boolean isMover() {
        return mover;
    }
}
