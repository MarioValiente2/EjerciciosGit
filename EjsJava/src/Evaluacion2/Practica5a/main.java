package Evaluacion2.Practica5a;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Punto punto=new Punto();
        Scanner scanner=new Scanner(System.in);
        System.out.println(punto.toString());
        System.out.println("Eje x:");
        double ejeX= scanner.nextDouble();
        System.out.println("Eje y:");
        double ejey= scanner.nextDouble();
        Punto entrada= new Punto(ejeX,ejey);
        System.out.println(entrada.toString());
        System.out.println("Distancia: "+ entrada.calcularDistanciaDesde(entrada, punto));
    }
}
