package Arrays;

import java.util.Scanner;

public class indexof {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduzca correo electronico");
        String frase = scanner.nextLine();
        if (frase.indexOf("@") != -1) {
            System.out.println(frase.substring(6));
            System.out.println(frase);
        }
    }
}
