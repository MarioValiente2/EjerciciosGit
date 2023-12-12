package Bucles;

import java.util.Random;
import java.util.Scanner;

import javax.lang.model.element.Element;

public class Ej38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random random=new Random();
		int num=random.nextInt(1,20);
		System.out.println(num);
		int num2=0;
		int contador=0;
		Scanner scanner=new Scanner(System.in);
		do {
			System.out.println("Introduzca un numero del 1 al 20");
			num2=scanner.nextInt();
			contador++;
			if (num2>num) {
				System.out.println("El numero es menor");
			}
			if (num2<num) {
				System.out.println("El numero es mayor");
			}
		} while ((num2!=num) && (contador!=5));
		
		if ((num2==num) && (contador==5))
			System.out.println("Has acertado el número ");

		if (num2==num && (contador!=5))
			System.out.println("Has acertado el número");
		
		if (contador==5)
			System.out.println("No has acertado el número, el número es:"+ num);
	}

}
