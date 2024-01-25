package Evaluacion2.PracticaDesguace;

public class Coche extends Vehiculos{

    public Coche() {
        super();
    }

    public Coche(String modelo, int anios, String color, String matricula, double km, String observaciones) {
        super(modelo,anios,color,matricula,km,observaciones);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
