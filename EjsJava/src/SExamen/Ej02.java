package SExamen;

import java.util.Random;

public class Ej02 {
    public static void main(String[] args) {
        double[][] numero = new double[10][8];
        /*double[][] numeroEspecial = new double[10][];
        numeroEspecial[0]= new double[5];
        numeroEspecial[1]= new double[3];
       //en este tipo de array especial en el que cada fila tiene un número de columnas distinto, en el for de columnas hay que preguntar a cada fila por su número de columnas
       */
        int maximo = 0;
        int menor = 200;
        Random random = new Random();
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length - 1; j++) {
                numero[i][j] = (double) random.nextInt(5, 200);
            }
        }
        for (int i = 0, j = 0; i < numero.length; i++) {
            int media1 = 0;
            for (j = 0; j < numero[j].length - 1; j++) {
                media1 = (int) (media1 + numero[i][0]);

            }
            media1 = media1 / 7;
            numero[i][j] = media1;
        }
        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                System.out.printf("%10.0f", numero[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        boolean salir=true;
        double[] aux = new double[8];
        for (int i = 0; !salir; i++) {
            salir=true;
            for (int j = 0; j < numero.length ; j++) {
                for (int k = 10; k < numero[i].length; k=k+10) {
                    if (numero[j][k]>numero[j][k+10]){
                        aux=numero[j];
                        numero[j]=numero[j+1];
                        numero[j+1]=aux;
                        salir=false;
                    }
                }
            }
        }

        for (int i = 0; i < numero.length; i++) {
            for (int j = 0; j < numero[i].length; j++) {
                System.out.printf("%10.0f", numero[i][j]);
            }
            System.out.println();
        }
        System.out.println("\nEl numero máximo es: " + maximo);
        System.out.println("El numero menor es: " + menor);
    }
}

