package Bucles;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Ej03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca un número");
		int M=scanner.nextInt();
		System.out.println("Introduzca otro número");
		int N=scanner.nextInt();
		if (M==N) {
			System.out.println("Los dos numeros son iguales");
		}
		if(M<N) {
			System.out.println("El numero uno es menor al segundo");
		}
		N++;
		while (M>N) {
			M--;
			System.out.println(M);
		}
		scanner.close();
	}
	}
