package Bucles;

import java.util.Scanner;

public class Ej36 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Introduzca un numero");
        int num= scanner.nextInt();
        int contador=num;
        int contador2=0;
        while (contador>0){
            if (num%contador==0){
                contador2++;
            }
            contador--;
        }
        if (contador2<3){
            System.out.println("El numero es primo");
        }else
            System.out.println("El numero no es primo");
    }
}
