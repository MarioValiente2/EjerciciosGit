package Evaluacion2.Granja2;

import java.util.Arrays;
import java.util.Random;

public class Gallina extends Animal {
    private int huevos [];
    public Gallina (){
        super();
    }

    public Gallina(String nombre, int edad, double peso) {

        super(nombre, edad, peso);
        Random random = new Random();
        huevos=new int[7];
        for (int i = 0; i < huevos.length ; i++) {
            huevos [i]=random.nextInt(0,2);
        }
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCantidad de huevos cada dia: " + Arrays.toString(huevos);
    }
}
