package Evaluacion2.Ajedrez;

public class Tablero {
    Pieza tablero[][];

    public Tablero() {
        tablero = new Pieza[8][8];
        tablero[0][0] = new Torre("B");
        tablero[0][1] = new Caballo("B");
        tablero[0][2] = new Alfil("B");
        tablero[0][3] = new Dama("B");
        tablero[0][4] = new Rey("B");
        tablero[0][5] = new Alfil("B");
        tablero[0][6] = new Caballo("B");
        tablero[0][7] = new Torre("B");
        tablero[7][0] = new Torre("N");
        tablero[7][1] = new Caballo("N");
        tablero[7][2] = new Alfil("N");
        tablero[7][3] = new Dama("N");
        tablero[7][4] = new Rey("N");
        tablero[7][5] = new Alfil("N");
        tablero[7][6] = new Caballo("N");
        tablero[7][7] = new Torre("N");

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
    }

    public void pintarTablero() {
        int cont = 8;
        System.out.println("  A  B  C D  E  F G  H");
        for (int i = 7; i >= 0; i--) {
            System.out.print(cont + " ");
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j] != null) {
                    System.out.print(tablero[i][j]);
                } else if ((i + j) % 2 == 1) {
                    System.out.print("\u25FC ");
                } else
                    System.out.print("\u25FB ");
            }
            cont--;
            System.out.print("\n");
        }
    }

    //recorre array y si hay pieza (disinto de null) imprime su nombre
    public boolean hayPieza(int fila, int columna) {
        boolean respuesta = false;
        if (tablero[fila][columna] != null) {
            respuesta = true;
        }
        return respuesta;
    }

    public boolean hayPieza(Posicion pos) {
        return hayPieza(pos.getFila(), pos.getColumna());
    }

    public boolean hayPiezasEntre(Movimiento mov) {
        boolean salir = false;
        if (mov.esVertical()) {
            if (mov.getPosInicial().getFila() > mov.getPosFinal().getFila()) {
                for (int i = mov.getPosInicial().getFila()+1; i < mov.getPosFinal().getFila() && !salir; i++) {
                    if (hayPieza(i, mov.getPosInicial().getColumna())) {
                        salir = true;
                    }
                }
            } else {
                for (int i = mov.getPosInicial().getFila()+1; i < mov.getPosFinal().getFila() && !salir; i--) {
                    if (hayPieza(i, mov.getPosInicial().getColumna())) {
                        salir = true;
                    }
                }
            }
        }
        if (mov.esHorizontal()) {
            if (mov.getPosInicial().getColumna() > mov.getPosFinal().getColumna()) {
                for (int i = mov.getPosInicial().getColumna()+1; i < mov.getPosFinal().getColumna() && !salir; i++) {
                    if (hayPieza(mov.getPosInicial().getFila(),i)) {
                        salir = true;
                    }
                }
            } else {
                for (int i = mov.getPosInicial().getColumna() + 1; i < mov.getPosFinal().getColumna() && !salir; i--) {
                    if (hayPieza(mov.getPosInicial().getFila(), i)) {
                        salir = true;
                    }
                }
            }
        }
        return salir;
    }

    public void ponPieza(Pieza figura, int fila, int columna) {
        tablero[fila][columna] = figura;
    }

    public void ponPieza(Pieza figura, Posicion Pos) {
        ponPieza(figura, new Posicion(Pos.getFila(), Pos.getColumna()));
    }

    public void quitaPieza(int fila, int columna) {
        tablero[fila][columna] = null;
    }

    public void quitaPieza(Posicion pos) {
        quitaPieza(pos.getFila(), pos.getColumna());
    }

    public Pieza devuelvePieza(int fila, int columna) {
        return tablero[fila][columna];
    }

    public Pieza devuelvePieza(Posicion pos) {
        return devuelvePieza(pos.getFila(), pos.getColumna());
    }

    public void mover(Movimiento mov) {
        ponPieza(tablero[mov.getPosInicial().getFila()][mov.getPosInicial().getColumna()], mov.getPosFinal().getFila(), mov.getPosFinal().getColumna());
        quitaPieza(mov.getPosInicial());
    }
}
