package Bucles;

import java.util.Scanner;

public class Ej19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=1;
		int contp=0;
		int contn=0;
		int cont0=0;
		while (contador<=20) {
			Scanner scanner=new Scanner(System.in);
			System.out.println("Introduzca un numero");
			int num=scanner.nextInt();
			contador++;
			if (num>0) {
			contp++;
			}
			if (num<0) {
				contn++;
			}
			if (num==0) {
			cont0++;
			}
		}
		System.out.println("Hay "+ contp+ " numeros positivos, " + contn+" numeros negativos y "+ cont0+" numeros 0.");
	}

}
