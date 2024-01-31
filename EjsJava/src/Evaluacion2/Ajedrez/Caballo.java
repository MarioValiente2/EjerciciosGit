package Evaluacion2.Ajedrez;

public class Caballo extends Pieza{
    public Caballo(String color) {
        super(color);
        if (color.equalsIgnoreCase("N"))
            nombre= "\u2658 ";
        else
            nombre= "\u265E ";

    }

    @Override
    public boolean validoMovimiento(Movimiento mov) {
        boolean respuesta = false;
        if ((Math.abs(mov.saltoHorizontal())==2 &&  (Math.abs(mov.saltoVertical())==1)) ||(Math.abs(mov.saltoHorizontal())==1 &&  (Math.abs(mov.saltoVertical())==2)))
            respuesta = true;
        return respuesta;
    }
}
