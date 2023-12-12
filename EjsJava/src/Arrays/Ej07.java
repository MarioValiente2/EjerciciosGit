package Arrays;

public class Ej07 {
    public static void main(String[] args) {
        int numeros[] = new int[30];
        int contp = 0;
        int contn = 0;
        int contnu = 0;
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 61 - 30);
        }

        for (int i = 0; i < numeros.length; i++) {
                System.out.print(numeros[i] + " ");
        }

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] > 0) {
                contp++;
            }
            if (numeros[i] < 0) {
                contn++;
            }
            if (numeros[i] == 0) {
                contnu++;
            }
        }
        System.out.println();
        System.out.println("Números positivos: " + contp);
        System.out.println("Números negativos: " + contn);
        System.out.println("Números nulos: " + contnu);
    }
}
