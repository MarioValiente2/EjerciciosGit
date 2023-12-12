package Arrays;

import java.io.IOException;
import java.util.Scanner;
public class Ej20 {
    public static void main(String[] args) throws IOException {

        int texto[]=new int[20];
        System.out.println("Introduzca texto");
        for (int i = 0; i < texto.length; i++) {
            texto[i]= (char) System.in.read();
        }
        for (int i = 0; i < texto.length; i++) {
            System.out.print((char) texto[i]);
        }
    }

}
