package Evaluacion2.Practica5a;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Punto punto = new Punto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eje x: y el Eje y:");
        double ejeX = scanner.nextDouble();
        double ejey = scanner.nextDouble();
        Punto entrada = new Punto(ejeX, ejey);
        System.out.println("Distancia: " + entrada.calcularDistanciaDesde(entrada, punto));
        Circulo circulo = new Circulo();
        System.out.println("Distancia del circulo: " + circulo.calcularDistanciaDesde(entrada));
        System.out.println("Area del circulo:" + circulo.calcularArea(circulo.getRadio()));
        System.out.println("Perimetro del circulo: " + circulo.calcularPerimetro(circulo.getRadio()));

        Triangulo triangulo=new Triangulo();
        System.out.println("Distancia del triangulo: " + triangulo.calcularDistanciaDesde(punto));
    }
}
