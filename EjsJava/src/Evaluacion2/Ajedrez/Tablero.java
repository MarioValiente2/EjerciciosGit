package Evaluacion2.Ajedrez;

import java.util.Scanner;

public class Tablero {
    Pieza tablero[][];
    /**
     * Es el constructor de esta clase (Tablero), no recibe ningun parametro, lo que hace es inicializar el atributo tablero [][].
     * En cada posicion del array crea una pieza.
     */
    public Tablero() {
        tablero = new Pieza[8][8];
        tablero[0][0] = new Torre("B");
        tablero[0][1] = new Caballo("B");
        //tablero[0][2] = new Alfil("B");
        tablero[0][3] = new Dama("B");
        tablero[0][4] = new Rey("B");
        //tablero[0][5] = new Alfil("B");
        //tablero[0][6] = new Caballo("B");
        tablero[0][7] = new Torre("B");
        tablero[7][0] = new Torre("N");
        //tablero[7][1] = new Caballo("N");
        //tablero[7][2] = new Alfil("N");
        tablero[7][3] = new Dama("N");
        tablero[7][4] = new Rey("N");
        //tablero[7][5] = new Alfil("N");
        //tablero[7][6] = new Caballo("N");
        tablero[7][7] = new Torre("N");
        /*
        for (int i = 1; i < 2; i++) {
            for (int j = 0; j < tablero[1].length; j++) {
                tablero[i][j] = new Peon("B");
            }
        }
        for (int i = 6; i < 7; i++) {
            for (int j = 0; j < tablero[1].length; j++) {
                tablero[i][j] = new Peon("N");
            }
        }
         */
    }
    /**
     * Este metodo imprime el atributo tablero que es un array bidimensional empezando desde la ultima posicion hasta la primera.
     * En la posicion que no hay ninguna pieza pone un cuadrado blanco o negro respectivamente
     */
    public void pintarTablero() {
        int cont = 8;
        System.out.println("  A  B  C D  E  F G  H");
        for (int i = 7; i >= 0; i--) {
            System.out.print(cont + " ");
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j]);
                }
                else if ((i + j) % 2 == 1) {
                    System.out.print("\u25FC ");
                } else System.out.print("\u25FB ");
            }
            cont--;
            System.out.print("\n");
        }
        System.out.println("  A  B  C D  E  F G  H");
    }

    public Posicion encontrarRey(Juego turno){
        boolean encontrado=false;
        for (int i = 0; i < tablero.length && !encontrado; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                if (tablero[i][j]!=null && tablero[i][j].getColor().equalsIgnoreCase(turno.darTurno())){
                    if (tablero[i][j] instanceof Rey){
                        return new Posicion(i,j) ;
                    }
                }
            }
        }
        return null;
    }

    public boolean Jaque( Juego juego){
        boolean jaque=false;
        Posicion rey= encontrarRey(juego);
        for (int i = 0; i < tablero.length && !jaque ; i++) {
            for (int j = 0; j < tablero[i].length ; j++) {
                if (tablero[i][j]!=null  && !tablero[i][j].getColor().equalsIgnoreCase(juego.darTurno()) && tablero[i][j].validoMovimiento(new Movimiento(new Posicion(i,j),rey),this)){
                    jaque=true;
                }
            }
        }
        return jaque;
    }

    /**
     * En este metodo llamdo hayPieza a partir de estos dos parametros mira en la coordenada si hay alguna pieza o no
     *
     * @param fila
     * @param columna
     * @return Devuelve respuesta, este booleano empieza en false  y si en esa posicion hay una pieza se vuelve true
     */
    public boolean hayPieza(int fila, int columna) {
        boolean respuesta = false;
        if (tablero[fila][columna] != null ) {
            respuesta = true;
        }
        return respuesta;
    }

    /**
     * Este metodo llamado hayPieza a partir del parametro mira si hay alguna pieza o no
     *
     * @param pos Este parametro esta compuesto por una fila y una columna
     * @return Devuelve un booleano
     */
    public boolean hayPieza(Posicion pos) {
        return hayPieza(pos.getFila(), pos.getColumna());
    }

    /**
     * Este metodo revisa a partir de un movimiento,si es posible hacer ese movimiento buscando que no haya ninguna pieza en
     * medio de la jugada, esto afecta a todas las piezas menos al Caballo. Los movimientos que verifica son los siguientes: Vertical, Horizaontal y Diagonal
     *
     * @param mov Este parametro esta compuesto por una Posicion Inicial y una Final
     * @return Devuelve un booleano, si no escuentra piezas devuelve un false y si encuentra una o mas devuelve un true
     */
    public boolean hayPiezasEntre(Movimiento mov) {
        boolean salir = false;
        if (mov.esVertical()) {
            if (mov.getPosInicial().getFila() > mov.getPosFinal().getFila()) {
                for (int i = mov.getPosInicial().getFila() - 1; i > mov.getPosFinal().getFila() && !salir; i--) {
                    if (hayPieza(i, mov.getPosInicial().getColumna())) {
                        salir = true;
                    }
                }
            } else {
                for (int i = mov.getPosInicial().getFila() + 1; i < mov.getPosFinal().getFila() && !salir; i++) {
                    if (hayPieza(i, mov.getPosInicial().getColumna())) {
                        salir = true;
                    }
                }
            }
        } else if (mov.esHorizontal()) {
            if (mov.getPosInicial().getColumna() > mov.getPosFinal().getColumna()) { //izq
                for (int i = mov.getPosInicial().getColumna() - 1; i > mov.getPosFinal().getColumna() && !salir; i--) {
                    if (hayPieza(mov.getPosInicial().getFila(), i)) {
                        salir = true;
                    }
                }
            } else {
                for (int i = mov.getPosInicial().getColumna() + 1; i < mov.getPosFinal().getColumna() && !salir; i++) {//derecha
                    if (hayPieza(mov.getPosInicial().getFila(), i)) {
                        salir = true;
                    }
                }
            }
        } else if (mov.esDiagonal()) {
            if ((mov.getPosInicial().getFila() > mov.getPosFinal().getFila()) && (mov.getPosInicial().getColumna() < mov.getPosFinal().getColumna())) {  //fila decrece y columan crece
                for (int i = mov.getPosInicial().getFila() - 1, j = mov.getPosInicial().getColumna()+1; i > mov.getPosFinal().getFila() && !salir; i--, j++) {
                    if (hayPieza(i, j)) {
                        salir = true;
                    }
                }
            } else if ((mov.getPosInicial().getFila() > mov.getPosFinal().getFila()) && (mov.getPosInicial().getColumna() > mov.getPosFinal().getColumna())) {
                for (int i = mov.getPosInicial().getFila() - 1, j = mov.getPosInicial().getColumna()-1; i > mov.getPosFinal().getFila() && !salir; i--, j--) {
                    if (hayPieza(i, j)) {
                        salir = true;
                    }
                }
            } else if ((mov.getPosInicial().getFila() < mov.getPosFinal().getFila()) && (mov.getPosInicial().getColumna() > mov.getPosFinal().getColumna())) {
                for (int i = mov.getPosInicial().getFila() + 1, j = mov.getPosInicial().getColumna()-1; i < mov.getPosFinal().getFila() && !salir; i++, j--) {
                    if (hayPieza(i, j)) {
                        salir = true;
                    }
                }

            } else if ((mov.getPosInicial().getFila() < mov.getPosFinal().getFila()) && (mov.getPosInicial().getColumna() < mov.getPosFinal().getColumna())) {
                for (int i = mov.getPosInicial().getFila() + 1, j = mov.getPosInicial().getColumna()+1; i < mov.getPosFinal().getFila() && !salir; i++, j++) {
                    if (hayPieza(i, j)) {
                        salir = true;
                    }
                }
            }
        }
        return salir;
    }

    /**
     * Este metodo pone la pieza en una posicion a partir de una fila y una columna.
     *
     * @param figura  Hace referancia a la pieza
     * @param fila
     * @param columna
     */
    public void ponPieza(Pieza figura, int fila, int columna) {
        tablero[fila][columna] = figura;
    }

    /**
     * Este metodo pone la pieza en una posicion
     *
     * @param figura Hace referancia a la pieza
     * @param Pos    Compuesta por una fila y una columna
     */
    public void ponPieza(Pieza figura, Posicion Pos) {
        ponPieza(figura, new Posicion(Pos.getFila(), Pos.getColumna()));
    }

    /**
     * Este metodo quita una pieza de una posicion a partir de una fila y una columna
     *
     * @param fila
     * @param columna
     */
    public void quitaPieza(int fila, int columna) {
        tablero[fila][columna] = null;
    }

    /**
     * Este metodo quita una pieza de una posicion
     *
     * @param pos Compuesta por una fila y una columna
     */
    public void quitaPieza(Posicion pos) {
        quitaPieza(pos.getFila(), pos.getColumna());
    }

    /**
     * Este metodo mira la pieza que hay en una posicion a partir de una fila y una columna
     *
     * @param fila
     * @param columna
     * @return Devuelve una pieza
     */
    public Pieza devuelvePieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    /**
     * Este metodo mira la pieza que hay en una posicion
     *
     * @param pos Compuesta por una fila y una columna
     * @return Devuelve una pieza
     */
    public Pieza devuelvePieza(Posicion pos) {
        return devuelvePieza(pos.getFila(), pos.getColumna());
    }

    /**
     * Realiza el movimiento, primero pone la pieza en la posicion que ha obtenido de la jugada
     * y despues quita la pieza que se encuentra en la posicion inicial
     *
     * @param mov Compuesto por la posicion Inicial y la final
     */
    public void mover(Movimiento mov) {
        ponPieza(tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()], mov.getPosFinal().getFila(), mov.getPosFinal().getColumna());
        quitaPieza(mov.getPosInicial());
    }
    public String Coronar(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Que pieza quieres: DAMA, ALFIL, CABALLO o TORRE");
        String ficha=scanner.next();
        return ficha.toUpperCase();
    }

}
