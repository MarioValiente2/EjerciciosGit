package Bucles;

import java.io.IOException;
import java.util.Scanner;

public class EJ23 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		/*
		 * Contar el número de palabras que hay en una frase. La frase debe terminar con un ‘.’
		 */
		
		int contador=0;
		char letra;
		int palabra=0;
		int car=0;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Introduzca la frase");
		do {
			letra= (char) System.in.read();
			if (letra==' ') {
				palabra++;
			}
			if (letra=='.') {
				palabra++;
			}
			if (letra!='.' && letra!=' ') {
				car++;
			}
		} while (letra!='.');
		System.out.println("Hay " + palabra + " palabras" + " y "+ car +" letras");

	}

}
