package Bucles;

import java.util.Scanner;

public class Ej18 {
    public static void main(String[] args) {
        int num=1;
        int num2=0;
        int n= 9;
        int contador=0;
        while (contador<n){
            num2=num+num2;
            num=num2-num;
            contador++;
            System.out.print(num2+" ");
        }
    }
}
