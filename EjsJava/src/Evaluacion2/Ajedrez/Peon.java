package Evaluacion2.Ajedrez;

public class Peon extends Pieza {
    /**
     * Constructor que inicializa el nombre de la pieza y recibe el parametro color
     *
     * @param color Este parametro solo puede tomar dos valores B o N
     */
    public Peon(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre = "\u2659 ";
        else
            nombre = "\u265F ";
    }

    /**
     * Este metodo dice que los movimientos posibles del Peon solo pueden ser diagonales o verticales
     *
     * @param mov     Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuelve un booleano, si es un movimiento que el Peon no es capaz de hacer devolvera un false
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean respuesta = false;
        if (color.equalsIgnoreCase("B") && tablero.hayPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) && (mov.esDiagonal() && mov.saltoVertical()== 1)) {
            respuesta = true;
        } else if (color.equalsIgnoreCase("N") && tablero.hayPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) && (mov.esDiagonal() && mov.saltoVertical() == -1)) {
            respuesta = true;
        } else if (color.equalsIgnoreCase("B") && !tablero.hayPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) && mov.getPosInicial().getFila() == 1 && (mov.saltoVertical() == 1 || mov.saltoVertical() == 2) && !mov.esDiagonal()) {
            respuesta = true;
        } else if (color.equalsIgnoreCase("N") && !tablero.hayPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) && mov.getPosInicial().getFila() == 6 && (mov.saltoVertical() == -1 || mov.saltoVertical() == -2)&& !mov.esDiagonal()) {
            respuesta = true;
        } else if (color.equalsIgnoreCase("B") && !tablero.hayPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) && mov.saltoVertical() == 1 && !mov.esDiagonal()) {
            respuesta = true;
        } else if (color.equalsIgnoreCase("N") && !tablero.hayPieza(mov.getPosFinal().getFila(), mov.getPosFinal().getColumna()) && mov.saltoVertical() == -1 && !mov.esDiagonal()) {
            respuesta = true;
        }else
            System.out.println("Movimiento no valido");
        return respuesta;

    }

}
