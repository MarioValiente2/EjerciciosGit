package Evaluacion2.Ej01;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("Que quieres hacer?, 1.Primo, 2.Pirámide y 3.Salir");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    System.out.println("Introduzca operando");
                    int num1 = scanner.nextInt();
                    OperacionesVarias.primo(num1);
                    break;
                case 2:
                    System.out.println("Introduzca N");
                    int ene = scanner.nextInt();
                    OperacionesVarias.piramide(ene);
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Saliendo...");
            }
        } while (opcion != 3);

    }
}

