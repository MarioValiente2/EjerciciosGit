package Evaluacion2.PracticaDesguace;

import Evaluacion2.Granja2.Conejo;
import Evaluacion2.Granja2.Gallina;
import Evaluacion2.Granja2.Paloma;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String modelo;
        int anios;
        String color;
        String matricula;
        double km;
        String observaciones;
        System.out.println("Cual es tu vehiculo 1.Coche, 2. Camión y 3. Moto");
        int opcion=scanner.nextInt();
        System.out.println("Introduce las Caracteristicas del vehículo: Modelo, Años de uso, Color, Matricula, Kilometros, Observaciones");
        modelo= scanner.next();
        anios=scanner.nextInt();
        color=scanner.next();
        matricula=scanner.next();
        km=scanner.nextInt();
        observaciones=scanner.next();
        if (opcion == 1) {
            Coches nuevo=new Coches(modelo,anios,color,matricula,km,observaciones);
            System.out.println(nuevo.toString());
        } else if (opcion == 2) {
            Camión nuevo=new Camión(modelo,anios,color,matricula,km,observaciones);
            System.out.println(nuevo.toString());
        } else if (opcion == 3) {
            Moto nuevo=new Moto(modelo,anios,color,matricula,km,observaciones);
            System.out.println(nuevo.toString());
        }



        System.out.println("Listado de Vehiculos, cuantos quieres ver");
        int tamano=scanner.nextInt();
        Desguace lista=new Desguace(tamano);
        lista.Mostrar();
    }
}
