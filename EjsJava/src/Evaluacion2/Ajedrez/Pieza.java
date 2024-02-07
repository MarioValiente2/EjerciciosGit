package Evaluacion2.Ajedrez;

public abstract class Pieza {
    protected String color;
    protected String nombre;

    /**
     * Es el constructor esta clase (Pieza). Inicializa el atributo nombre (nombre de la pieza en cuestion) y el color
     * @param color Recibe el color que es de tipo String y solo puede ser B o N.
     */
    public Pieza(String color) {
        nombre = getClass().getSimpleName();
        this.color = color;
    }
    /**
     * Es un metodo llamado validoMovimiento que es de tipo Boolean y es abstracto,recibe dos prametros para poder validad el movimiento
     * @param mov Este parametro esta compuesto por una posicion Inicial y otra final con la que determina el tipo de movimiento
     * @param tablero Pertenece a la clase Tablero
     * @return Devuleve si el movimiento es valido o no (True/False)
     */
    public abstract boolean validoMovimiento (Movimiento mov,Tablero tablero);
    /**
     * Es un metodo de tipo String llamado toString
     * @return Devuelve el atributo nombre
     */
    @Override
    public String toString() {
        return nombre;
    }

    /**
     * Ver valor del color
     * @return Devuelve el valor del color
     */
    public String getColor() {
        return color;
    }

}
