package Bucles;

import java.util.Scanner;

public class Ej07 {

	/*
	 Hacer un programa que pida N números por teclado, los sume y en calcule la media.
	 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca cuantos numeros vas a introducir");
		int total=scanner.nextInt();
		int contador=1;
		float suma=0;
		while (contador<=total) {
			contador++;
			System.out.println("Introuzca un numero");
			float num=scanner.nextFloat();
			suma=suma+num;
		}
		System.out.printf("La media es: %.2f", suma/(float)total);
	}

}
