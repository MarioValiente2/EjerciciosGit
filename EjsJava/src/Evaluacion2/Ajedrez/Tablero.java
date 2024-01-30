package Evaluacion2.Ajedrez;

public class Tablero {
    Pieza tablero[][];
    public Tablero(){
        tablero = new Pieza[8][8];
        tablero[0][0] = new Torre("Blanco");
        tablero[0][7] = new Torre("Blanco");
        tablero[7][0] = new Torre("Negro");
        tablero[7][7] = new Torre("Negro");

    }
    public void pintarTablero(){
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[0].length; j++) {
                System.out.print(tablero[i][j]);
            }
            System.out.println("\n");
        }
    }
    //recorre array y si hay pieza (disinto de null) imprime su nombre
    public boolean hayPieza(int fila,int columna){
        return false;
    }

    public boolean hayPieza(Posicion pos) {
        return false;
    }

    public boolean hayPiezasEntre(Movimiento mov){
        return false;
    }
    public void ponPieza(Pieza figura, int fila, int columna){

    }
    public void ponPieza(Pieza figura, Posicion Pos){

    }
    public void quitaPieza(int fila,int columna){

    }
    public void QuitaPieza(Posicion pos){

    }
    public Pieza DevuelvePieza(int fila,int columna){
        return tablero[fila][columna];
    }
    public Pieza DevuelvePieza(Posicion pos){
        return null;
    }

}
