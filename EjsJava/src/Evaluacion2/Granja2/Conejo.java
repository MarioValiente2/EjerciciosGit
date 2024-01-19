package Evaluacion2.Granja2;

import java.util.Arrays;
import java.util.Random;

public class Conejo extends Animal {
    private final int minpeso = 5;
    private final int maxpeso = 10;
    private int zanahoriasSemana[];

    public Conejo() {
        super();
        zanahoriasSemana = new int[7];
        Random random = new Random();
        for (int i = 0; i < zanahoriasSemana.length; i++) {
            zanahoriasSemana[i] = random.nextInt(1, 5);
        }
        peso = random.nextDouble(minpeso, maxpeso);
    }

    public Conejo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        zanahoriasSemana = new int[7];
        Random random = new Random();
        for (int i = 0; i < zanahoriasSemana.length; i++) {
            zanahoriasSemana[i] = random.nextInt(1, 5);
        }

    }

    public String toString() {
        return super.toString() +
                String.format("\nNumeros de zanahorias que come cada dia %s", Arrays.toString(zanahoriasSemana));
        //"\nNumeros de zanahorias que come cada dia" + Arrays.toString(zanahoriasSemana) + "Media de huevos: "+ Media();
    }

    public double Media() {
        double suma = 0;
        for (int i = 0; i < zanahoriasSemana.length; i++) {
            int media = zanahoriasSemana[i];
            suma = media + suma;
        }
        return suma / zanahoriasSemana.length;
    }

}
