package Evaluacion2.Granja2;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) throws IOException {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Que animal quieres 1. Gallina, 2. Conejo y 3. Paloma");
            opcion = scanner.nextInt();
        } while (opcion != 1 && opcion != 2 && opcion != 3);
        System.out.println("Introduzca Nombre,Edad y peso");
        String nombre = scanner.next();
        int edad = scanner.nextInt();
        double peso = scanner.nextDouble();

        if (opcion == 1) {
            System.out.println("Has elegido una Gallina");
            Gallina nueva = new Gallina(nombre, edad, peso);
            System.out.println(nueva.toString());
        } else if (opcion == 2) {
            System.out.println("Has elegido un Conejo");
            Conejo nueva = new Conejo(nombre, edad, peso);
            System.out.println(nueva.toString());
        } else if (opcion == 3) {
            System.out.println("Has elegido una Paloma");
            Paloma nueva = new Paloma(nombre, edad, peso);
            System.out.println(nueva.toString());
        }
        System.out.println("Crear granja random, cuantos quieres");
        int tamano = scanner.nextInt();
        Granja nuevo = new Granja(tamano);
        nuevo.Mostrar();
        System.out.println(nuevo.calcularMedia());
    }

}
