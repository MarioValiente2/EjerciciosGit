package Evaluacion2.Ej01;

public class OperacionesVarias {
    public static void primo(int x){
        int contador=x-1;
        int contador2=0;
        while (contador>0){
            if (x%contador==0){
                contador2++;
            }
            contador--;
        }
        if (contador2==1){
            System.out.println("Es primo");
        }else System.out.println("No es primo");
    }
    public static void piramide(int y){
        int fila=1;
        int columnas=1;
        while (fila<y){
            columnas=1;
            while (columnas<=fila){
                System.out.print("*");
                columnas++;
            }
            System.out.println();
            fila++;
        }
        while (fila>=0){
            columnas=1;
            while (columnas<=fila){
                System.out.print("*");
                columnas++;
            }
            System.out.println();
            fila--;
        }
    }

}
