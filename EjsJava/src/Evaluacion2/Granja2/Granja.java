package Evaluacion2.Granja2;

public class Granja {
    private Animal crear[];

    public Granja() {
        crear = new Animal[12];
        for (int i = 0; i < crear.length; i++) {
            if (i < 4) {
                crear[i] = new Gallina();
            } else if (i >= 4 && i < 8) {
                crear[i] = new Conejo();
            } else if (i>=8 && i<=12) {
                crear[i] = new Paloma();
            }
        }
    }

    public void mostrar() {
        for (int i = 0; i < crear.length; i++) {
            System.out.println(crear[i]+"\n");

        }
    }
    }
