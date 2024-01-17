package Evaluacion2.Granja2;

import java.util.Arrays;
import java.util.Random;

public class Gallina extends Animal {
    private final int minpeso=3;
    private final int maxpeso=5;
    private int huevos [];
    public Gallina (){
        super();
        Random random = new Random();
        huevos=new int[7];
        for (int i = 0; i < huevos.length ; i++) {
            huevos [i]=random.nextInt(0,2);
        }
        peso= random.nextDouble(minpeso,maxpeso);
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
                String.format("\nCantidad de huevos de cada dia %s",Arrays.toString(huevos));
                //"\nCantidad de huevos cada dia: " + Arrays.toString(huevos) + "\nMedia de huevos: "+Media();
    }

    public double Media(){
        double suma=0;
        for (int i = 0; i < huevos.length ; i++) {
            int media=huevos[i];
            suma=media+suma;
        }
        return suma/ huevos.length;
    }
}
