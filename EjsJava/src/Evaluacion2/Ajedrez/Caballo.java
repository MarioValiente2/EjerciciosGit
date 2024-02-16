package Evaluacion2.Ajedrez;

public class Caballo extends Pieza{
    /**
     * Constructor que inicializa el nombre de la pieza y recibe el parametro color
     * @param color Este parametro solo puede tomar dos valores B o N
     */
    public Caballo(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2658 ";
        else
            nombre= "\u265E ";
    }
    /**
     *  Este metodo dice que los movimientos posibles del Caballo solo pueden ser salto horizontal  o salto vertical
     * @param mov Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuelve un booleano, si es un movimiento que el Caballo no es capaz de hacer devolvera un false
     */
    @Override
    public boolean validoMovimiento(Movimiento mov,Tablero tablero) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal())==2  && (Math.abs(mov.saltoVertical())==1)) || (Math.abs(mov.saltoHorizontal())==1 &&  (Math.abs(mov.saltoVertical())==2))) {
            respuesta = true;
        }
        return respuesta;
    }
}
