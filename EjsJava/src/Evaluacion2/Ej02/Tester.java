package Evaluacion2.Ej02;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        String nombre;
        System.out.println("Dime tu nombre");
        nombre=scanner.nextLine();
        String apellido1;
        System.out.println("Dime tu primer apellido");
        apellido1=scanner.nextLine();
        String apellido2;
        System.out.println("Dime tu segundo apellido");
        apellido2=scanner.nextLine();


        OperacionesString.iniciales(nombre);
        OperacionesString.iniciales1(apellido1);
        OperacionesString.iniciales2(apellido2);

        OperacionesString.mayus(nombre,apellido1);
    }
}
