package Evaluacion2.Ajedrez;

public class Posicion {

    private int fila;
    private int columna ;

    /**
     * Constructor que recibe dos parametros para determinar la posicion
     * @param fila
     * @param columna
     */
    public Posicion(int fila, int columna) {
        this.fila = fila;
        this.columna = columna;
    }

    /**
     * Constructor vacio que inicializa la fila y la columna
     */
    public Posicion(){
        this.fila=0;
        this.columna=0;
    }

    /**
     *  Ver valor de la fila
     * @return Devuelve la fila
     */
    public int getFila() {
        return fila;
    }

    /**
     * Modificar el valor de la fila a partir de un parametro
     * @param fila
     */
    public void setFila(int fila) {
        this.fila = fila;
    }

    /**
     * Ver valor de la columna
     * @return Devuelve la columna
     */
    public int getColumna() {
        return columna;
    }

    /**
     * Modificar el valor de la columna a partir de un parametro
     * @param columna
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }

    /**
     * Es un metodo de tipo String llamado toString
     * @return Devuelve la fila y la columna
     */
    @Override
    public String toString() {
        return "Posicion{" +
                "fila=" + fila +
                ", columna=" + columna +
                '}';
    }
}
