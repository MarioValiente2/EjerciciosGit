package Evaluacion2.Ajedrez;

public abstract class Pieza {
    protected String color;
    protected String nombre;

    public Pieza(String color) {
        nombre = getClass().getSimpleName();
        this.color = color;
    }

    public String getColor() {
        return color;
    }
    public abstract boolean validoMovimiento (Movimiento mov,Tablero tablero);
    public  boolean pintarPieza(String nombre){
        return false;
    }
    @Override
    public String toString() {
        return nombre;
    }
}
