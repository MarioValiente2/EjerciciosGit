package Arrays;

public class OrdenarArray {
    public static void main(String[] args) {
        int numeros []=new  int[5];
        int ordenado []=new int[5];
        int menor=0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 20+1);
        }
        for (int i = 0; i < numeros.length; i++) {

        }
        for (int i = 0; i < numeros.length; i++) {
            System.out.print(numeros[i]+ " ");

        }
    }
}
