package Evaluacion2.PracticaDesguace;

public class Coches extends Vehiculos{

    public Coches() {
        super();
    }

    public Coches(String modelo, int anios, String color, String matricula, double km, String observaciones) {
        super(modelo,anios,color,matricula,km,observaciones);
    }

    @Override
    public String toString() {
        return super.toString()+ "Coches{}";
    }
}
