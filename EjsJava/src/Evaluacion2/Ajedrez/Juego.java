package Evaluacion2.Ajedrez;

public class Juego {
    private String elTurno; //B ó N
    private int contador = 0;

    /**
     * Ver valor del Turno
     * @return Devuelve el valor del Turno
     */
    public String getTurno() {
        return elTurno;
    }

    /**
     * Modifica el valor del Turno a partir del parametro
     * @param elTurno Nuevo valor del Turno
     */
    public void setElTurno(String elTurno) {
        this.elTurno = elTurno;
    }

    /**
     * Modifica el valor del Contador a partir del parametro
     * @param contador Nuevo valor del Contador
     */
    public void setContador(int contador) {
        this.contador = contador;
    }
    /**
     * Da el turno a cada jugador
     * @return devuelve N o B
     */
    public String darTurno() {
        if (contador % 2 != 0) {
            elTurno = "N";
        } else {
            elTurno = "B";
        }
        return elTurno;
    }

    /**
     * Metodo que suma 1 al Contador
     */
    public void cambiarTurno(){
        contador++;
    }
    /**
     * Ver si cada caracter esta en rango
     * @param x Este parametro será cada caracter de la jugada sependiendo de la posicion tomara diferentes valores
     * @return Devuelve un boolean dependiendo si esta entre 0 y 7
     */
    public boolean estaRango(int x) {
        return x >= 0 && x <= 7;
    }

    /**
     * Este metodo convierte la jugada a valores entre 0 y 7 y es donde se encuentran las restricciones, con estas
     * restricciones vemos si la jugada es valida, si no lo es habrá que introducir otra jugada, asi hasta que sea una valida.
     * Estas restricciones tambien se refieren a los movimientos de cada pieza
     * @param jugada
     * @param tablero
     * @return Devuelve un Movimiento
     */
    public Movimiento jugada(String jugada, Tablero tablero) {
        Movimiento nuevo = null;
        if (jugada.length() != 4)
            System.out.println("Jugada Inválida. El formato es A1A2");
        else {
            int filaInicial = jugada.charAt(1) - 49;
            int filaFinal = jugada.charAt(3) - 49;
            int columnaInicial = jugada.charAt(0) - 65;
            int columnaFinal = jugada.charAt(2) - 65;
            //chequeo
            if (!(estaRango(filaInicial)) || !(estaRango(filaFinal)) || !(estaRango(columnaInicial)) || !(estaRango(columnaFinal)))
                System.out.println("Jugada Inválida. El formato debe ser del tipo A1A2 (A..H, 1..8)");
            else if (!tablero.hayPieza(filaInicial, columnaInicial)) {
                System.out.println("No hay pieza");
            } else if (!(tablero.hayPieza(filaInicial, columnaInicial) && tablero.devuelvePieza(filaInicial, columnaInicial).color.equalsIgnoreCase(elTurno))) {
                System.out.println("No puedes mover la pieza del contrario");
            } else if (tablero.hayPieza(filaFinal, columnaFinal) && tablero.devuelvePieza(filaFinal, columnaFinal).color.equalsIgnoreCase(elTurno)) {
                System.out.println("No te comas tus piezas");
            } else {//válido
                nuevo = new Movimiento(new Posicion(filaInicial, columnaInicial), new Posicion(filaFinal, columnaFinal));
            }
        }
        return nuevo;
    }
}
