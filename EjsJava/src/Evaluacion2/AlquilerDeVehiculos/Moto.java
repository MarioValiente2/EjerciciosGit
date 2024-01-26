package Evaluacion2.AlquilerDeVehiculos;

import java.util.Arrays;
import java.util.Random;

public class Moto extends Vehiculo {
    private int kms[];
    public Moto() {
        super();
        Random random = new Random();
        kms = new int[12];
        for (int i = 0; i < kms.length; i++) {
            kms[i] = random.nextInt(3000, 15000);
        }
    }
    public Moto(String modelo, int anios, String color, String matricula, double km,double tiempo) {
        super(modelo,anios,color,matricula,km,tiempo);
        Random random = new Random();
        kms = new int[12];
        for (int i = 0; i < kms.length; i++) {
            kms[i] = random.nextInt(3000, 15000);
        }
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\nKilometros que hace al año\n" + Arrays.toString(kms));
    }
}
