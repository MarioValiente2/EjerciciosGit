package Evaluacion2.Practica5a;

public class Triangulo {
    private Punto punto1;
    private Punto punto2;
    private Punto punto3;

    public Triangulo(Punto punto1, Punto punto2, Punto punto3) {
        this.punto1 = punto1;
        this.punto2 = punto2;
        this.punto3 = punto3;
    }

    public Triangulo() {
        this.punto1 = new Punto();
        this.punto2 = new Punto();
        this.punto3 = new Punto();
    }

    public Triangulo(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.punto1 = new Punto(x1 = punto1.getEjeX(), y1 = punto1.getEjeY());
        this.punto2 = new Punto(x2 = punto2.getEjeX(), y2 = punto2.getEjeY());
        this.punto3 = new Punto(x3 = punto3.getEjeX(), y3 = punto3.getEjeY());
    }

    public Punto getPunto1() {
        return punto1;
    }

    public Punto getPunto2() {
        return punto2;
    }

    public Punto getPunto3() {
        return punto3;
    }

    public double calcularDistanciaDesde(Punto punto) {
        return punto1.calcularDistanciaDesde(punto);
    }

    public double calcularArea() {
        double s = (punto1.calcularDistanciaDesde(punto2) + punto2.calcularDistanciaDesde( punto3) + punto3.calcularDistanciaDesde(punto1)) / 2;
        return Math.sqrt(s * (s - punto1.calcularDistanciaDesde(punto2)) * (s - punto2.calcularDistanciaDesde(punto3)) * (s - punto3.calcularDistanciaDesde(punto1)));
    }

    public double calcularPerimetro() {
        double lado1 = punto1.calcularDistanciaDesde(punto2);
        double lado2 = punto2.calcularDistanciaDesde(punto3);
        double lado3 = punto3.calcularDistanciaDesde(punto1);
        return lado1 + lado2 + lado3;
    }

    @Override
    public String toString() {
        return "Triangulo{" +
                "punto1=" + punto1 +
                ", punto2=" + punto2 +
                ", punto3=" + punto3 +
                '}';
    }
}
