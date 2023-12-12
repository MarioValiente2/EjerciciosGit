package Bucles;

import java.util.Scanner;

public class Ej06 {

	/*
	 Hacer un programa que pida un número, y después muestre su tabla de multiplicar.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int contador=0;
		int total=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca un número");
		int num=scanner.nextInt();
		while (contador<10) {
			total=num*contador;
			contador++;
			System.out.println(num+ " x "+contador +" = " +total);
		}
	}

}
