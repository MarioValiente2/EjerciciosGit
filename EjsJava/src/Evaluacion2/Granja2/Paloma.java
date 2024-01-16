package Evaluacion2.Granja2;

import java.util.Arrays;
import java.util.Random;

public class Paloma extends Animal{
    private int minpeso=1;
    private int maxpeso=4;
    private int pichones [];
    public Paloma(){
        super();
    }

    public Paloma(String nombre, int edad, double peso) {
        super(nombre, edad, peso);
        Random random=new Random();
        pichones=new int[12];
        for (int i = 0; i < pichones.length ; i++) {
            pichones [i]=random.nextInt(1,5);
        }
    }
    public int[] getPichones() {
        return pichones;
    }
    public void setPichones(int[] pichones) {
        this.pichones = pichones;
    }

    public int getMinpeso() {
        return minpeso;
    }

    public int getMaxpeso() {
        return maxpeso;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNumeros de pichones de cada mes: " + Arrays.toString(pichones);
    }
}
