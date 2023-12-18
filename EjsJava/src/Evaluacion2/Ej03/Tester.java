package Evaluacion2.Ej03;

import java.util.Arrays;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int numero[]=new int[10];
        OperacionesArray.cargar(numero);
        System.out.println("Array Inicial");
        OperacionesArray.mostrar(numero);
        System.out.println();
        System.out.println("Array invertido");
        OperacionesArray.invertir(numero);
        System.out.println();
        System.out.println("Array ordenado");
        OperacionesArray.ordenar(numero);
        OperacionesArray.mostrar2(numero);
        System.out.println();
        double media=OperacionesArray.media(numero);
        System.out.println("La media es: "+media);
        System.out.println();
        System.out.println("Que numero quieres saber si esta");
        int num= scanner.nextInt();
        OperacionesArray.estar(numero, num);

    }

}
