package Evaluacion2.AlquilerDeVehiculos;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Listado de Vehiculos, cuantos quieres ver:");
        int tamano = scanner.nextInt();
        AlquilerDeVehiculos lista = new AlquilerDeVehiculos(tamano);
        lista.Mostrar();
        System.out.println("Dar de alta,Vehiculo 1.Coche, 2. Camion y 3. Moto");
        int opcion = scanner.nextInt();
        System.out.println("Introduce las Caracteristicas del vehículo: Modelo, Años de uso, Color, Matricula, Kilometros");
        String modelo = scanner.next();
        int anios = scanner.nextInt();
        String color = scanner.next();
        String matricula = scanner.next();
        double km = scanner.nextInt();
        System.out.println("Elige el periodo de tiempo");
        double tiempo = scanner.nextDouble();
        if (opcion == 1) {
            Coche nuevo = new Coche(modelo, anios, color, matricula, km, tiempo);
            AlquilerDeVehiculos alta=new AlquilerDeVehiculos(modelo,anios, color, matricula, km, tiempo);
            System.out.println(nuevo.toString());
        } else if (opcion == 2) {
            Camion nuevo = new Camion(modelo, anios, color, matricula, km, tiempo);
            System.out.println(nuevo.toString());
        } else if (opcion == 3) {
            Moto nuevo = new Moto(modelo, anios, color, matricula, km, tiempo);
            System.out.println(nuevo.toString());
        }
    }
}
