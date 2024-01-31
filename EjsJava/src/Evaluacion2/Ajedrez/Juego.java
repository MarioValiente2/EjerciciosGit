package Evaluacion2.Ajedrez;

public class Juego {
    private String elTurno; //B ó N

    public String getTurno(){
        return elTurno;
    }
    public void setElTurno(String elTurno) {
        this.elTurno = elTurno;
    }

    public boolean estaRango(int x){
        return x>=0 && x<=7;
    }
    public Movimiento jugada(String jugada, Tablero tablero){
        Movimiento nuevo=null;

        int filaInicial=jugada.charAt(1)-49;
        int filaFinal=jugada.charAt(3)-49;
        int columnaInicial= jugada.charAt(0)-65;
        int columnaFinal= jugada.charAt(2)-65;
        //chequeo
        if (jugada.length()!=4)
            System.out.println("Jugada Inválida. El formato es A1A2");
        else if (!estaRango(filaInicial) || !(estaRango(filaFinal)) || !(estaRango(columnaInicial)) || !(estaRango(columnaFinal)))
            System.out.println("Jugada Inválida. El formato debe ser del tipo A1A2 (A..H, 1..8)");


        //nuevo = new Movimiento(new Posicion(filaInicial,columnaInicial), new )
        return nuevo;
    }
}
