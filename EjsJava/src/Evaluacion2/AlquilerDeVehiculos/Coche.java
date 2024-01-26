package Evaluacion2.AlquilerDeVehiculos;

import java.util.Arrays;
import java.util.Random;

public class Coche extends Vehiculo {
    private int[] averias;

    public Coche() {
        super();
        Random random = new Random();
        averias = new int[12];
        for (int i = 0; i < averias.length; i++) {
            averias[i] = random.nextInt(0, 4);
        }
    }
    public Coche(String modelo, int anios, String color, String matricula, double km, double tiempo) {
        super(modelo, anios, color, matricula, km, tiempo);
        Random random = new Random();
        averias = new int[12];
        for (int i = 0; i < averias.length; i++) {
            averias[i] = random.nextInt(0, 4);
        }
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\nAverias al año\n" + Arrays.toString(averias));
    }

}
