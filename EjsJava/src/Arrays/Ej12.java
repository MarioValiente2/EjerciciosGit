package Arrays;

public class Ej12 {
    public static void main(String[] args) {
        int marco[][] = new int[5][15];
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                if ((i==0) || (j==0)|| (i==marco.length-1)||(j==marco[i].length-1))  {
                    marco [i] [j]=1;
                }
            }
        }
        for (int i = 0; i < marco.length; i++) {
            for (int j = 0; j < marco[i].length; j++) {
                System.out.print(marco[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        char marco2[][] = new char[5][15];
        for (int i = 0; i < marco2.length; i++) {
            for (int j = 0; j < marco2[i].length; j++) {
                if ((i == 0) || (j == 0) || (i == marco2.length - 1) || (j == marco2[i].length - 1))
                    marco2[i][j] = '1';
                else
                    marco2[i][j] = 32;

            }
        }
        for (int i = 0; i < marco2.length; i++) {
            for (int j = 0; j < marco2[i].length; j++) {
                System.out.print(marco2[i][j] + " ");
            }
            System.out.println();
        }
    }
}

