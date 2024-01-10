package Evaluacion2.granja;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Conejo Aleatorio");
        Conejo random = new Conejo();
        System.out.println("Cuantos conejos quieres");
        int tamano= scanner.nextInt();
        GrupoConejos nuevos =new GrupoConejos(tamano);
        nuevos.mostrar();

        System.out.println("Introduce el nombre del conejo, la edad y el numero de gazapos de éste año");
        String nombre = scanner.nextLine();
        int edad = scanner.nextInt();
        int gazapos = scanner.nextInt();

        Conejo nuevo = new Conejo(nombre, edad, gazapos);
        System.out.println(nuevo.toString());
    }
}
