package Arrays;

import java.util.Random;
import java.util.Scanner;

public class Aleatorio {
	public static void main(String args[]) {
		System.out.println("Introduce el número de caras");
		Scanner lectorScanner = new Scanner(System.in);
		int caras = lectorScanner.nextInt();
		for(int i= 0; i<100; i++) {
			double resultado = Math.random();
			int dado = (int)(resultado*caras);
			System.out.println(dado+1);
		}
		
		double notas = Math.random()*11; //notas
		
		for(int i= 0; i<100; i++) {
			double temperaturas = Math.random()*101-50; //-50, 50 rango de temperaturas
			System.out.println((int)temperaturas);
		}
		System.out.println("---------------------------");
		int valorBajo = -50;
		int valorAlto = 50;
		for(int i= 0; i<100; i++) {
			double temperaturas = Math.random()*(valorAlto-valorBajo+1)+valorBajo;
			System.out.println((int)temperaturas);
		}
		
		for(int i= 0; i<100; i++) {
			double temperaturasVerano = Math.random()*11+20;
			System.out.println((int)temperaturasVerano);
		}
		
		Random random = new Random();
		for(int i= 0; i<100; i++) {
			System.out.println(random.nextDouble(-50, 50));
		}
	}
}
