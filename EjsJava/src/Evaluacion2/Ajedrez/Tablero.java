package Evaluacion2.Ajedrez;

public class Tablero {
    Pieza tablero[][];
    public Tablero(){
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

        for (int i = 1; i < 2 ;i++) {
            for (int j = 0; j < tablero[1].length ; j++) {
                tablero[i][j]=new Peon("B");
            }
        }
        for (int i = 6; i < 7 ;i++) {
            for (int j = 0; j < tablero[1].length ; j++) {
                tablero[i][j]=new Peon("N");
            }
        }
    }
    public void pintarTablero(){
        int cont=8;
        System.out.println("  A  B  C D  E  F G  H");
        for (int i = 7; i >= 0; i--) {
            System.out.print(cont+" ");
            for (int j = 0; j < tablero[0].length; j++) {
                if (tablero[i][j]!=null) {
                    System.out.print(tablero[i][j]);
                }else
                    System.out.print(" \u25FC");
            }
            cont--;
            System.out.print("\n");
        }
    }
    //recorre array y si hay pieza (disinto de null) imprime su nombre
    public boolean hayPieza(int fila,int columna){
        boolean respuesta=false;
        if (tablero[fila][columna]!=null){
            respuesta=true;
        }
        return respuesta;
    }

    public boolean hayPieza(Posicion pos) {
        boolean respuesta=true;
        return respuesta;
    }

    public boolean hayPiezasEntre(Movimiento mov){
        return false;
    }
    public void ponPieza(Pieza figura, int fila, int columna){
            tablero[fila][columna]=figura;
    }
    public void ponPieza(Pieza figura, Posicion Pos){
            ponPieza(figura,new Posicion(Pos.getFila(), Pos.getColumna()));
    }
    public void quitaPieza(int fila,int columna){

    }
    public void quitaPieza(Posicion pos){

    }
    public Pieza devuelvePieza(int fila,int columna){
        return tablero[fila][columna];
    }
    public Pieza devuelvePieza(Posicion pos){
        return devuelvePieza(pos.getFila(), pos.getColumna());
    }

    public void mover(Movimiento mov) {

    }
}
