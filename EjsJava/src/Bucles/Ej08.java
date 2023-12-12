package Bucles;

import java.util.Scanner;

public class Ej08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Hacer un programa que muestre los números del 1 al 200 que sean divisibles por 2 y 3.
		*/
		int numero=1;
		int contador=1;
		int linea=1;
		while (contador<=200) { 
			if (numero%2==0 && (numero%3==0)) {
				System.out.println(linea+"º:"+numero);
				linea++;
			}
			numero++;
			contador++;
		}
		
		
	}

}
