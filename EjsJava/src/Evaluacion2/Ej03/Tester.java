package Evaluacion2.Ej03;

import java.util.Arrays;

public class Tester {
    public static void main(String[] args) {
        int numero[]=new int[10];
        OperacionesArray.cargar(numero);
        OperacionesArray.mostrar(numero);
        System.out.println();
        OperacionesArray.ordenar(numero);
        OperacionesArray.mostrar2(numero);
    }

}
