package Bucles;

import java.util.Scanner;

public class Ej10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que pida N números. El programa ha de decir 
		 * cuantos hay de pares, y cuantos de impares.
		 */
		int num=0;
		int contp=0;
		int conti=0;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Introduzca un numero, para salir escribe 4321");
			num=scanner.nextInt();
			if (num%2==0) {
				contp++;
			}else {
				conti++;
			}
		} while (num!=4321);
		if (num==4321) {
			conti--;
		}
		System.out.println("Hay "+contp+" número/s par/es y "+conti+" numero/s impar/es.");

	}

}
