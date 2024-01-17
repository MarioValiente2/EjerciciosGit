package Evaluacion2.Granja2;

import java.util.Arrays;

public class Granja {
    private Animal crear[];

    public Granja(int tamano) {
        crear = new Animal[tamano];
        for (int i = 0; i < crear.length; i++) {
            if (i % 2 == 0) {
                crear[i] = new Gallina();
            } else if (i < (tamano / 2)) {
                crear[i] = new Conejo();
            } else {
                crear[i] = new Paloma();
            }
        }
    }


    public void Mostrar() {
        for (int i = 0; i < crear.length; i++) {
            System.out.println(crear[i] + "\n");
        }
    }

    public String calcularMedia() {
        StringBuilder medias = new StringBuilder();
        for (int i = 0; i < crear.length; i++) {
            medias.append(crear[i]).append("\n");
        }
        return medias.toString();
    }
}


