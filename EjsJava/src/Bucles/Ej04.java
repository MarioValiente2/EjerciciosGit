package Bucles;

import java.util.Scanner;

public class Ej04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int aux=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca un número");
		int M=scanner.nextInt();
		System.out.println("Introduzca otro número");
		int N=scanner.nextInt();
		if (M<N) {
			aux=M;
			M=N;
			N=aux;		
		}
		N++;
		while (M>N) {
				M--;
				System.out.println(M);
			}
		scanner.close();
	}
}
