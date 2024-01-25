package Evaluacion2.PracticaDesguace;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listado de Vehiculos, cuantos quieres ver:");
        int tamano=scanner.nextInt();
        Desguace lista=new Desguace(tamano);
        lista.Mostrar();

        System.out.println("Cual es tu vehiculo 1.Coche, 2. Camion y 3. Moto");
        int opcion=scanner.nextInt();

        System.out.println("Introduce las Caracteristicas del vehículo: Modelo, Años de uso, Color, Matricula, Kilometros");
        String modelo= scanner.next();
        int anios=scanner.nextInt();
        String color=scanner.next();
        String matricula=scanner.next();
        double km=scanner.nextInt();
        System.in.read();
        System.out.println("Alguna observacion:");
        String observaciones= scanner.nextLine();
        if (opcion == 1) {
            Coche nuevo=new Coche(modelo,anios,color,matricula,km,observaciones);
            System.out.println(nuevo.toString());
        } else if (opcion == 2) {
            Camion nuevo=new Camion(modelo,anios,color,matricula,km,observaciones);
            System.out.println(nuevo.toString());
        } else if (opcion == 3) {
            Moto nuevo=new Moto(modelo,anios,color,matricula,km,observaciones);
            System.out.println(nuevo.toString());
        }

    }
}
