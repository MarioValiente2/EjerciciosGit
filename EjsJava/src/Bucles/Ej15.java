package Bucles;

import java.util.Scanner;

public class Ej15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca numero");
		int numero=scanner.nextInt();
		System.out.println("Introduzca numero");
		int numero2=scanner.nextInt();
		int calculo=0;
		int contador=0;
		calculo= numero*numero2;
		while (contador<numero2) {
			System.out.print(numero);
			contador++;
			if (contador<numero2) {
				System.out.print("+");
			}else if (contador==numero2) {
				System.out.println("="+calculo);
			}
			
		}
		scanner.close();

	}

}
