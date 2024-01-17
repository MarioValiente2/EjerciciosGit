package Evaluacion2.Granja2;

import java.util.Arrays;
import java.util.Random;

public class Paloma extends Animal{
    private final int minpeso=1;
    private final int maxpeso=3;
    private int pichones [];
    public Paloma(){
        super();
        Random random=new Random();
        pichones=new int[12];
        for (int i = 0; i < pichones.length ; i++) {
            pichones [i]=random.nextInt(1,5);
        }
        peso= random.nextDouble(minpeso,maxpeso);
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
        return super.toString() + String.format("\nNumeros de pichones de cada mes %s",Arrays.toString(pichones));
                //String.format("\nNumeros de pichones de cada mes: %s \nLa media es: %.2d", Arrays.toString(pichones),Media());
    }
    public double Media(){
        double suma=0;
        for (int i = 0; i < pichones.length ; i++) {
            int media=pichones[i];
             suma=media+suma;
        }
        return suma/ pichones.length;
    }

}
