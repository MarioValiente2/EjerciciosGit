package Bucles;
import java.util.Scanner;
public class Ej21 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int num=1;
        int suma=0;
        int contador=-1;
        System.out.println("Introduzca numeros");
        do {
            num=scanner.nextInt();
            if (num<0){
                System.out.println("Numero invalido, introduzca otro");
                num=scanner.nextInt();
            }
            suma=suma+num;
            contador++;
        } while (num!=0);
        System.out.println("La media es: "+ suma/contador );
    }
}
