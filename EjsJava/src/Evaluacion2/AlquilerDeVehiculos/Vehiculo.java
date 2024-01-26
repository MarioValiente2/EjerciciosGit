package Evaluacion2.AlquilerDeVehiculos;

import java.util.Random;

public abstract class Vehiculo {
    protected String modelo;
    protected String matricula;
    protected String color;
    protected int anios;
    protected double km;
    protected double tiempo;
    protected double precio;

    private static final String[] colores = {"Rojo", "Verde", "Azul", "Negro", "Blanco", "Naranja"};
    private static final String[] letras = {"MCK", "GTC", "KLN", "HJT", "FRD", "LWQ"};
    private static final String[] model = {"656FGE6D1", "4BDTVJDF8", "FY8FNJ4U","85BHC6R6E8","D7E8FMJ7D9"};
    public Vehiculo() {
        Random random = new Random();
        this.modelo=model[(int) (Math.random() * model.length)];
        this.matricula = crearMatricula();
        this.color = colores[(int) (Math.random() * colores.length)];
        this.anios = random.nextInt(1, 10);
        this.km = ponerKm();
        this.tiempo=random.nextDouble(1,20);
    }

    public Vehiculo(String modelo, int anios, String color, String matricula, double km, double tiempo) {
        this.modelo = modelo;
        this.matricula = matricula;
        this.color = color;
        this.anios = anios;
        this.km = km;
        this.tiempo=tiempo;
    }

    public static String crearMatricula() {
        Random random = new Random();
        int cont1 = random.nextInt(0, 9);
        int cont2 = random.nextInt(0, 9);
        int cont3 = random.nextInt(0, 9);
        int cont4 = random.nextInt(0, 9);

        String letra = letras[(int) (Math.random() * letras.length)];

        return String.format("%d%d%d%d%s", cont1, cont2, cont3, cont4, letra);
    }
    public double ponerPrecio(){
        Random random = new Random();
        if (tiempo<3){
            precio=random.nextDouble(100,400);
        } else if (tiempo<10){
            precio=random.nextDouble(400,700);
        }else
            precio= random.nextDouble(700,1200);
        return precio;
    }
    public double ponerKm() {
        Random random = new Random();
        if (anios <= 2) {
            km = random.nextDouble(15000, 24000);
        } else if (anios <= 7) {
            km = random.nextDouble(24000, 50000);
        } else {
            km = random.nextDouble(50000, 100000);
        }
        return km;
    }
    public String getMatricula() {
        return matricula;
    }

    public String getColor() {
        return color;
    }

    public int getAnios() {
        return anios;
    }

    public double getKm() {
        return km;
    }


    @Override
    public String toString() {
        return getClass().getSimpleName() + String.format("\nModelo: %s\nMatricula: %s\nColor: %s\nAños de uso: %d\nKm: %.2f Km\nTiempo: %.2f dias\nPrecio: %.2f €", modelo,matricula,color,anios,km,tiempo,ponerPrecio());
    }
}
