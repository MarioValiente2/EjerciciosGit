package Evaluacion2.AlquilerDeVehiculos;

import java.util.Arrays;
import java.util.Random;

public class Camion extends Vehiculos{
    int ruedas [];
    public Camion() {
        super();
        Random random = new Random();
        ruedas = new int[12];
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = random.nextInt(0, 4);
        }
    }
    public Camion(String modelo, int anios, String color, String matricula, double km,double tiempo) {
        super(modelo, anios, color, matricula, km,tiempo);
        Random random = new Random();
        ruedas = new int[12];
        for (int i = 0; i < ruedas.length; i++) {
            ruedas[i] = random.nextInt(0, 4);
        }
    }
    @Override
    public String toString() {
        return super.toString() + String.format("\nRuedas que gasta al año\n" + Arrays.toString(ruedas));
    }
}
