package Bucles;

import java.util.Scanner;

public class Ej09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 
		 * Hacer un programa que pida un número y calcule su factorial. 
		 * Por ejemplo, factorial de 3 es 3x2x1 = 6, factorial de 4 es 4x3x2x1 = 24.
		 */

		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca un numero");
		int num=scanner.nextInt();
		int cont=num;
		int total=0;
		int fact=0;
		while (cont!=0) {
			cont--;
			total= num*cont;
			fact=total+fact;
		}
		System.out.println(fact);
	}

}
