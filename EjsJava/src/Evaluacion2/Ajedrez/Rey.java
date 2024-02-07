package Evaluacion2.Ajedrez;

public class Rey extends Pieza {
    /**
     * Constructor que inicializa el nombre de la pieza y recibe el parametro color
     * @param color Este parametro solo puede tomar dos valores B o N
     */
    public Rey(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre = "\u2654 ";
        else
            nombre = "\u265A ";
    }
    /**
     * Este metodo dice que los movimientos posibles del Rey solo pueden ser horizontales , verticales y diagonales
     * @param mov     Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuelve un booleano, si es un movimiento que el Rey no es capaz de hacer devolvera un false
     */
    @Override
    public boolean validoMovimiento(Movimiento mov, Tablero tablero) {
        boolean respuesta=false;
        if (Math.abs(mov.getPosFinal().getFila())-Math.abs(mov.getPosInicial().getFila())==1 || Math.abs(mov.getPosInicial().getFila())-Math.abs(mov.getPosFinal().getFila())==1){
            mov.esVertical();
            respuesta=true;
        }else if ((Math.abs(mov.getPosFinal().getColumna())-Math.abs(mov.getPosInicial().getColumna())==1) || Math.abs(mov.getPosInicial().getColumna())-Math.abs(mov.getPosFinal().getColumna())==1){
            mov.esHorizontal();
            respuesta=true;
        }
        return  respuesta;
    }
}
