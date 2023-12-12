package Arrays;

public class ExplicacionBidimensionales {
    public static void main(String[] args) {
        //filas, columnas
        double notas [][] = new double[25][6];
        //entrada de datos
        for (int fila = 0; fila < notas.length; fila++) { //notas.length -> filas
            for (int columna = 0; columna < notas[1].length; columna++ ){ //notas[0].length-> columnas
               notas[fila][columna]= Math.random()*9+1;
            }
            System.out.println();

        }
       //salida de datos
        for (int fila = 0; fila < notas.length; fila++) { //notas.length -> filas
            for (int columna = 0; columna < notas[0].length; columna++ ){ //notas[0].length-> columnas
               //System.out.print(notas[fila][columna]+ " ");
               //System.out.printf("%3.0f ",notas[fila][columna]); //sin decimales
                System.out.printf("%.2f ",notas[fila][columna]);
            }
            System.out.println();

        }


    }
}
