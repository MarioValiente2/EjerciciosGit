package Evaluacion2.AlquilerDeVehiculos;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listado de Vehiculo, cuantos quieres ver:");
        int tamano = scanner.nextInt();
        AlquilerDeVehiculos lista = new AlquilerDeVehiculos(tamano);
        lista.Mostrar();
        System.out.println("Dar de alta,Vehiculo 1.Coche, 2. Camion");
        int opcion = scanner.nextInt();
        System.out.println("Introduce las Caracteristicas del vehículo: Modelo, Años de uso, Color, Matricula, Kilometros");
        String modelo = scanner.next();
        int anios = scanner.nextInt();
        String color = scanner.next();
        String matricula = scanner.next();
        double km = scanner.nextInt();
        System.out.println("Elige el periodo de tiempo:");
        double tiempo = scanner.nextDouble();
        if (opcion == 1) {
            if (lista.darAlta(modelo, anios, color, matricula, km, tiempo)==true){
                System.out.println("Añadido correctamente");
            }else
                System.out.println("No se ha podido añadir");
        } else if (opcion == 2) {
            if (lista.darAlta(modelo, anios, color, matricula, km, tiempo)==true){
                System.out.println("Añadido correctamente");
            }else
                System.out.println("No se ha podido añadir");
        }
        lista.Mostrar();
        System.out.println("Dar de baja, introduce matricula");
        matricula= scanner.next();
        if (lista.darBaja(matricula)==false){
            System.out.println("Se ha dado de  baja correctamente");
        }else
            System.out.println("No se ha podido dar de baja");
        lista.Mostrar();

        System.out.println("Requisitos del vehiculo, color");
        color= scanner.next();
        lista.listarporColor(color);

        System.out.println("Modificar atributo, ingresa la matricula");
        lista.modificar(matricula);

    }
}
