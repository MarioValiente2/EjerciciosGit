package Bucles;

public class Ej11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Hacer un programa que muestre todos los 
		 * resultados posibles que se pueden dar al lanzar dos dados.
		 */

		int num=1;
		int cont=1;
		int sum=0;
		int lineas=0;
		while (num!=7) {
			while (cont<=6) {
				sum= num+cont;
				System.out.println(num +" + "+ cont +" = "+sum);
				lineas++;
				cont++;
				
			}
			System.out.println("--------------------------");
			if (cont==7) {
				cont=1;
				num++;
			
			}
			
		}
		System.out.println("Total de posibilidades: "+ lineas);
	}

}
