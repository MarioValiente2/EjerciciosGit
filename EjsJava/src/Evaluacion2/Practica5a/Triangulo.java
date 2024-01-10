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
    public Triangulo(){
        this.punto1=new Punto();
        this.punto2=new Punto();
        this.punto3=new Punto();
    }
    public Triangulo(double x1,double x2,double x3, double  y1,double y2, double y3){
        this.punto1= new Punto(x1= punto1.getEjeX(),y1= punto1.getEjeY());
        this.punto2= new Punto(x2= punto2.getEjeX(),y2= punto2.getEjeY());
        this.punto3= new Punto(x3= punto3.getEjeX(),y3= punto3.getEjeY());
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

    public double calcularDistanciaDesde (Punto punto){
        return punto.calcularDistanciaDesde(punto1,punto);
    }
}
