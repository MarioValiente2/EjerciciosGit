package Evaluacion2.Practica5a;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Punto punto = new Punto();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Eje x: y el Eje y:");
        System.out.println(punto.toString());
        double ejeX = scanner.nextDouble();
        double ejey = scanner.nextDouble();
        Punto entrada = new Punto(ejeX, ejey);
        System.out.printf("Distancia del punto: %.2f", entrada.calcularDistanciaDesde(punto));
        Circulo circulo = new Circulo();
        System.out.printf("\n"+circulo.toString());
        System.out.printf("\nDistancia del circulo: %.2f",circulo.calcularDistanciaDesde(entrada));
        System.out.printf("\nArea del circulo: %.2f",circulo.calcularArea(circulo.getRadio()));
        System.out.printf("\nPerimetro del circulo: %.2f",circulo.calcularPerimetro(circulo.getRadio()));

        Triangulo triangulo=new Triangulo();
        System.out.println("\n"+triangulo.toString());
        System.out.printf("\nDistancia del triangulo: %.2f", triangulo.calcularDistanciaDesde(punto));
        System.out.printf("\nArea del triangulo: %.2f",triangulo.calcularArea());
        System.out.printf("\nPerimetro del triangulo: %.2f",triangulo.calcularPerimetro());
    }
}
