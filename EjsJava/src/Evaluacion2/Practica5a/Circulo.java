package Evaluacion2.Practica5a;

public class Circulo {
    private Punto central;
    private double radio;

    public Circulo(Punto central, double radio) {
        this.central = central;
        this.radio = radio;
    }
    public Circulo(){
        this.central = new Punto();
        this.radio = 3 ;
    }

    public Circulo(double radio, double x, double y){
        this.radio = radio;
        central = new Punto(x,y);
    }

    public double calcularDistanciaDesde (Punto punto  ){
        return punto.calcularDistanciaDesde(punto,central)-radio;
    }

    public double calcularArea (double radio) {
        return Math.PI*Math.pow(radio,2);
    }

    public double getRadio() {
        return radio;
    }
    public  double calcularPerimetro(double radio){
        return 2*Math.PI*radio;
    }
    public Punto getCentral() {
        return central;
    }
    public Circulo(double radio) {
        this.radio = radio;
    }
}
