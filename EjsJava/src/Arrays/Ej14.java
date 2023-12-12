package Arrays;

public class Ej14 {
    public static void main(String[] args) {
        int numeros []={1,2,4,1,2};
        int contador=0;
        boolean repe=true;
        for (int i = 0; i < numeros.length ; i++) {
            System.out.print(numeros[i]+ " ");
        }
        for (int i = 0; i < numeros.length; i++) {
                for (int j = i-1; j >=0 ; j--) {
                    if (numeros[j]==numeros[i]){
                        repe=false;
                    }
                }
            contador=0;
            if (repe){
                for (int j = 0; j < numeros.length; j++) {
                    int aux=numeros[i];
                    if (numeros[j]==aux){
                        contador++;
                    }
                }
                System.out.println();
                System.out.println("Hay "+ contador+" "+numeros[i]);
            }
        }
    }
}
