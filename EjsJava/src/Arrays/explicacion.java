package Arrays;

public class explicacion {
    public static void main(String[] args) {
       double calorias [][] = new double[4][5];
        for (int i = 0; i < calorias.length; i++) {
            for (int j = 0; j < calorias[i].length ; j++) {
                calorias[i][j]= (int) (Math.random()*1000);
            }
        }
        for (int i = 0; i < calorias.length; ) {
            for (int j = 0; j < calorias[0].length ; ) {
                System.out.printf("%10.0f",calorias[i][j]);
            }
            System.out.println();
        }

    }
}
