package Bucles;

import java.util.Scanner;

public class Ej17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca las veces que se repite la cadena");
		int N=scanner.nextInt();
		int contador=1;
		int mul=1;
		int calc=1;
		while (contador<N) {
			System.out.print(calc+",");
			mul=mul*2;
			calc=mul;
			contador++;
		}
		if (contador==N);
			System.out.println(calc);
	}

}
