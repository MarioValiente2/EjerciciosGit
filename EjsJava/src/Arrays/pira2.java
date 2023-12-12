package Arrays;

import java.util.Scanner;
public class pira2 {
    public static void main(String[] args) {
        int fila=0;
        int columna=0;
        int num=1;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Numero de filas y columnas");
        int n= scanner.nextInt();
        while (fila<n) {
            columna = 0;
            num = 1;
            while (columna <= fila) {
                System.out.print(num);
                columna++;
                num++;
            }
            System.out.println();
            fila++;
        }
    }
}
