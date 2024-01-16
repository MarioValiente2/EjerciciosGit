package Evaluacion2.Granja2;

import java.util.Arrays;
import java.util.Random;

public class Conejo extends Animal{
    private int zanahoriasSemana[];
    public Conejo(){
        super();
    }
    public Conejo(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        zanahoriasSemana=new int[7];
        Random random=new Random();
        for (int i = 0; i < zanahoriasSemana.length ; i++) {
            zanahoriasSemana [i]= random.nextInt(1,5);
        }

    }
    public String toString() {
        return super.toString() +
                "\nNumeros de zanahorias que come cada dia" + Arrays.toString(zanahoriasSemana);
    }


}
