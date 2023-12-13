package Evaluacion2;

import Evaluacion2.Calculadora;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Calculando:\n Introduzca 1. Sumar\n 2.Restar\n 3.Multiplicar\n 4.Dividir\n");
        int opcion = lector.nextInt();

        switch (opcion){
            case 1:
                //método que recibe y devuelve, sólo se encarga del procesado
                System.out.println("Introduzca operandos");
                byte num1 = lector.nextByte();
                byte num2 = lector.nextByte();
                int resultado = Calculadora.suma(num1,num2);
                System.out.println(resultado);
                System.out.println(Calculadora.suma(num1,num2));
                break;
            case 2:
                //método que ni recibe ni devuelve, se encarga de todo
                Calculadora.resta();
                break;
            case 3:
                //método que recibe y no devuelve
                System.out.println("Introduzca operandos");
                num1 = lector.nextByte();
                num2 = lector.nextByte();
                Calculadora.multiplicar(num1,num2);
                break;
            case 4:
                //método que no recibe y devuelve
                System.out.println(Calculadora.dividir());
        }

    }


}