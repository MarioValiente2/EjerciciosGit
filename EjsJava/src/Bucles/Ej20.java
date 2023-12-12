package Bucles;

public class Ej20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int hora=0;
		int minutos=0;
		int segundos=0;
		while (hora<24) {
			System.out.println(hora +":"+minutos+":"+segundos );
			if (segundos<=59) {
				segundos++;
			}if (segundos==60) {
				segundos=0;
				minutos++;
				}if (minutos==60) {
					minutos=0;
					hora++;
				}
		}

	}

}


