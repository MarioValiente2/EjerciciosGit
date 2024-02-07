package Evaluacion2.Ajedrez;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Tablero tablero = new Tablero();
        tablero.pintarTablero();
        Juego enviar = new Juego();
        String jugada;
        Movimiento mov = null;
        do {
            do {
                System.out.println("Turno de: " + enviar.darTurno());
                System.out.println("Introduce la jugada");
                jugada = scanner.next();
                jugada = jugada.toUpperCase();
                mov = enviar.jugada(jugada, tablero);
            } while (mov == null);
            if (tablero.devuelvePieza(mov.getPosInicial()).validoMovimiento(mov, tablero) && !tablero.hayPiezasEntre(mov)) {
                tablero.mover(mov);
                enviar.cambiarTurno();
                tablero.pintarTablero();
            }
        } while (mov != null);
        //validar la pieza de la pos inicial de mov, si puede o no puede hacer el mov

        //enviar.jugada(jugada,);


    }
}
