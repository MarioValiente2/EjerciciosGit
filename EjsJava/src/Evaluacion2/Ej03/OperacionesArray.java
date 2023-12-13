package Evaluacion2.Ej03;

import java.util.Arrays;
import java.util.Random;

public class OperacionesArray {
    public static void cargar(int numero[]){
        Random random=new Random();
        for (int i = 0; i < numero.length ; i++) {
            numero[i]= random.nextInt(1,10);
        }
    }
    public static void mostrar(int numero[]){
        for (int i = 0; i < numero.length ; i++) {
            System.out.print(numero[i]+" ");
        }
    }
    public static void ordenar(int numero[]){
        Arrays.sort(numero);
    }
    public static void mostrar2(int numero[]){
        for (int i = 0; i < numero.length ; i++) {
            System.out.print(numero[i]+" ");
        }

    }


}
