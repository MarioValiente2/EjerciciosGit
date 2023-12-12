package Bucles;

import java.util.Scanner;

public class Ej28 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num=scanner.nextInt();
        int contador=num-1;
        int suma=0;
        while (contador>0){
            if (num%contador==0){
                suma=suma+contador;
            }
            contador--;
        }
        if (suma==num){
            System.out.println("El número es perfecto");
        }else
            System.out.println("El número no es perfecto");
    }
}
