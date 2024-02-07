package Evaluacion2.Ajedrez;

public class Movimiento {
    private Posicion posInicial;
    private Posicion posFinal;

    /**
     * Constructor que recibe dos parametros
     * @param posInicial Compuesto por una fila y una columna
     * @param posFinal Compuesto por una fila y una columna
     */
    public Movimiento(Posicion posInicial, Posicion posFinal) {
        this.posInicial = posInicial;
        this.posFinal = posFinal;
    }

    /**
     * Constructor vacio
     */
    public Movimiento() {
    }

    /**
     * Ver valor de la posicion Inicial
     * @return Devuelve el valor de la posicion Inicial
     */
    public Posicion getPosInicial() {
        return posInicial;
    }

    /**
     * Modifica el valor de la posicion Inicial a partir de otro parametro
     * @param posInicial Nuevo valor de la posicion Inicial
     */
    public void setPosInicial(Posicion posInicial) {
        this.posInicial = posInicial;
    }

    /**
     * Ver valor de la posicion Final
     * @return  Devuelve el valor de la posicion Final
     */
    public Posicion getPosFinal() {
        return posFinal;
    }

    /**
     * Modifica el valor de la posicion Final a partir de otro parametro
     * @param posFinal Nuevo valor de la posicion Final
     */
    public void setPosFinal(Posicion posFinal) {
        this.posFinal = posFinal;
    }

    /**
     * Metodo para saber si el movimiento es vertical, la columna inicial debe de ser igual a la final
     * @return Devuelve una respuesta, si la respuesta es true el movimiento es el correcto
     */
    public boolean esVertical() {
        boolean respuesta =false;
        if (posInicial.getColumna()==posFinal.getColumna()){
            respuesta= true;
        }
        return respuesta ;
    }

    /**
     *  Metodo para saber si el movimiento es horizontal, la fila inicial debe de ser igual a la final
     * @return Devuelve una respuesta, si la respuesta es true el movimiento es el correcto
     */
    public boolean esHorizontal() {
        boolean respuesta =false;
        if (posInicial.getFila()==posFinal.getFila()){
            respuesta= true;
        }
        return respuesta;
    }

    /**
     * Metodo para saber si el movimiento es diagonal, llama a los metodos saltoHorizontal y saltoVerical,tienen que ser iguales
     * @return Devuelve una respuesta, si la respuesta es true el movimiento es el correcto
     */
    public boolean esDiagonal() {
        boolean respuesta=false;
        if (Math.abs(saltoHorizontal())==Math.abs(saltoVertical())){
            respuesta=true;
        }
        return respuesta;
    }

    /**
     * Metodo para saber si el movimiento es un salto horizontal, utiliza la posicion inicial y final de la columna
     * @return
     */
    public int saltoHorizontal(){
        return posFinal.getColumna()-posInicial.getColumna();
    }

    /**
     * Metodo para saber si el movimiento es un salto vertical, utiliza la posicion inicial y final de la fila
     * @return
     */
    public int saltoVertical(){
        return posFinal.getFila()-posInicial.getFila();
    }
    public  int saltoDiagonal(){
        return (int) Math.sqrt(Math.pow(saltoHorizontal(),2)+Math.pow(saltoVertical(),2));
    }
}
