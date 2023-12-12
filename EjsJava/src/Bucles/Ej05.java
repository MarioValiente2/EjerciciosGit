package Bucles;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Ej05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int aux=0;
		int inter =0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca un número");
		int M=scanner.nextInt();
		System.out.println("Introduzca otro número");
		int N=scanner.nextInt();
		System.out.println("Introduzca el intervalo");
		int Y=scanner.nextInt();
		
		if (M<N) {
			aux=M;
			M=N;
			N=aux;		
		}
		N=N+Y;
		do {
			while (M>N) {
				M=M-Y;
				System.out.println(M);
				}
		} while ((Y<M) && (Y<N));
		
		scanner.close();	

	}

}
