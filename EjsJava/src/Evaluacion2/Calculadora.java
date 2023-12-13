package Evaluacion2;

import java.util.Scanner;

public class Calculadora {
    public static int suma (int x, int y){
        int resultado = x + y;
        //return x+y;
        return resultado;
    }
    public static void resta (){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca operandos");
        byte num1 = lector.nextByte();
        byte num2 = lector.nextByte();
        System.out.println(num1-num2);
    }
    public static void multiplicar(byte num1, byte num2) {
        System.out.println(num1*num2);
    }

    public static int dividir (){
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca operandos");
        byte num1 = lector.nextByte();
        byte num2 = lector.nextByte();
        return num1/num2;
    }
}
