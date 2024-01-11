package Evaluacion2.Practica5a;

import java.util.Random;

public class Punto {
    private double ejeX;
    private double ejeY;

    public Punto(double ejeX, double ejeY) {
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }

    public double getEjeX() {
        return ejeX;
    }

    public double getEjeY() {
        return ejeY;
    }

    public Punto() {
        Random random = new Random();
        this.ejeX = random.nextDouble(1, 10);
        this.ejeY = random.nextDouble(1, 10);
    }

    public double calcularDistanciaDesde(Punto a) {
        return Math.sqrt(Math.pow(ejeX - a.ejeX, 2) + Math.pow(ejeY - a.ejeY, 2));
    }
    @Override
    public String toString() {
        return "Punto{" +
                "ejeX="+ ejeX +
                ", ejeY=" + ejeY +
                '}';

    }
}
