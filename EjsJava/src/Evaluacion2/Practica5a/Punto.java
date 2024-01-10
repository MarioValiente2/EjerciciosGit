package Evaluacion2.Practica5a;

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
    public Punto(){
        this.ejeX=4;
        this.ejeY=6;
    }

    public double calcularDistanciaDesde(Punto punto,Punto punto2){

        return Math.sqrt (Math.pow(punto.ejeX-punto2.ejeX,2) + Math.pow(punto.ejeY- punto2.ejeY,2));
    }

    @Override
    public String toString() {
        return "Punto{" +
                "ejeX=" + ejeX +
                ", ejeY=" + ejeY +
                '}';

    }
}
