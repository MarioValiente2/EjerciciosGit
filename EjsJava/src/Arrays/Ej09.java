package Arrays;

public class Ej09 {
    public static void main(String[] args) {
        int numeros[]= new  int[10];
        int suma=0;
        int suma2=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 15+1);
        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i] + " ");
        }
        for (int i = 0; i < numeros.length; i++) {
            if  (i%2==0) {
                suma = suma + numeros[i];
                System.out.println("");
                System.out.println("Numero con posicion par:"+ numeros[i]);
            }
        }
        System.out.println();
        System.out.println("La suma total es de: "+suma);
        System.out.println("-----------------------------");
        for (int i = 0; i < numeros.length; i++) {
            if  (i%2==1) {
                suma2 = suma2 + numeros[i];
                System.out.println("");
                System.out.println("Numero con posicion impar:"+ numeros[i]);
            }
        }
        System.out.println();
        System.out.println("La suma total es de: "+suma2);
    }
}
