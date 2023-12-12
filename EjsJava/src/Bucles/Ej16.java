package Bucles;

import java.util.Scanner;

public class Ej16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca la base");
		int base=scanner.nextInt();
		System.out.println("Introduzca el exponente");
		int expo=scanner.nextInt();
		int contador=expo;
		int calc=0;
		while (contador>1) {
			contador--;
			calc=base*base;
		}
		System.out.println(calc);
	}

}
