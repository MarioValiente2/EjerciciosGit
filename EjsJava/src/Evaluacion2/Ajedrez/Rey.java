package Evaluacion2.Ajedrez;

public class Rey extends Pieza {
    private boolean enroque=true;

    /**
     * Constructor que inicializa el nombre de la pieza y recibe el parametro color
     *
     * @param color Este parametro solo puede tomar dos valores B o N
     */
    public Rey(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre = "\u2654 ";
        else
            nombre = "\u265A ";
    }

    public boolean isEnroque() {
        return enroque;
    }

    /**
     * Este metodo dice que los movimientos posibles del Rey solo pueden ser horizontales , verticales y diagonales
     *
     * @param mov     Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuelve un booleano, si es un movimiento que el Rey no es capaz de hacer devolvera un false
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean respuesta = false;
        if (Math.abs(mov.getPosFinal().getFila()) - Math.abs(mov.getPosInicial().getFila()) == 1 || Math.abs(mov.getPosInicial().getFila()) - Math.abs(mov.getPosFinal().getFila()) == 1) {
            mov.esVertical();
            respuesta = true;
            enroque = false;
        } else if ((Math.abs(mov.getPosFinal().getColumna()) - Math.abs(mov.getPosInicial().getColumna()) == 1) || Math.abs(mov.getPosInicial().getColumna()) - Math.abs(mov.getPosFinal().getColumna()) == 1) {
            mov.esHorizontal();
            respuesta = true;
            enroque = false;
        } else if (color.equalsIgnoreCase("B") && (mov.getPosInicial().getFila() == 0 && mov.getPosInicial().getColumna() == 4) && (mov.getPosFinal().getFila() == 0 && mov.getPosFinal().getColumna() == 6) || (mov.getPosFinal().getFila() == 0 && mov.getPosFinal().getColumna() == 2) && isEnroque()) {
            mov.esHorizontal();
            respuesta = true;
        } else if (color.equalsIgnoreCase("N") && (mov.getPosInicial().getFila() == 7 && mov.getPosInicial().getColumna() == 4) && ((mov.getPosFinal().getFila() == 7 && mov.getPosFinal().getColumna() == 6) || ((mov.getPosFinal().getFila() == 7 && mov.getPosFinal().getColumna() == 2))) && isEnroque()) {
            respuesta = true;
        }
        return respuesta;
    }
}
