package Evaluacion2.Granja2;

import java.util.Arrays;
import java.util.Random;

public abstract class Animal {

    protected String nombre;
    protected int edad;
    protected double peso;
    private static final String [] nombres ={"Malo","Bueno", "Perico", "Felipe Gulugulu"};
    public Animal(String nombre, int edad, double peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    public Animal(){
        Random random=new Random();
        this.nombre = nombres[(int)(Math.random()*nombres.length)];
        this.edad = random.nextInt(1,10);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Soy un/a "+getClass().getSimpleName()+String.format("\nMe llamo %s, tengo %d años y peso %.2f Kg ",nombre,edad,peso);
    }
}
