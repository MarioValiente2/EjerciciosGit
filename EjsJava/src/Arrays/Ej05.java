package Arrays;

public class Ej05 {
    public static void main(String[] args) {
        int diagonal [] [] = new int[5][5];
        for (int i = 0; i < diagonal.length ; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                if (j==i) {
                    diagonal[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < diagonal.length ; i++) {
            for (int j = 0; j < diagonal[i].length; j++) {
                System.out.print(diagonal[i][j] +" ");
            }
            System.out.println();
        }
    }
}
