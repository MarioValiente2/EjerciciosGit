package Bucles;

public class Ej12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Hacer un programa que muestre las primeras 10 tablas de multiplicar.
		 */
		int contador=0;
		int total=0;
		int num=1;
		int tabla=1;
		while (num!=11) {
			System.out.println("Tabla del " + tabla);
			System.out.println("");
			while (contador!=11) {
				total=num*contador;
				System.out.println(num+ " x "+contador +" = " +total);
				contador++;
			}
			System.out.println("-------------");
			tabla++;
			if (contador==11){
				num++;
				contador=0;
			}
		}
	}

}
