package Evaluacion2.PracticaDesguace;

import java.util.Random;

public abstract class Vehiculos  {
    protected  String modelo;
    protected String matricula;
    protected String color;
    protected int anios;
    protected double km;
    protected String observaciones;

    private static final String [] colores ={"Rojo","Verde", "Azul", "Negro","Blanco","Naranja"};
    private static final String [] letras ={"MCK","GTC", "KLN", "HJT","FRD","LWQ"};

    public Vehiculos(){
        Random random = new Random();
        this.matricula= crearMatricula();
        this.color=colores[(int)(Math.random()*colores.length)];
        this.anios= random.nextInt(1,10);
        this.km=ponerKm();
        this.observaciones=getObservaciones();
    }
    public Vehiculos(String modelo, int anios, String color, String matricula, double km, String observaciones) {
        this.modelo=modelo;
        this.matricula = matricula;
        this.color = color;
        this.anios = anios;
        this.km = km;
        this.observaciones = observaciones;
    }

    public static String crearMatricula(){
        Random random = new Random();
        int cont1= random.nextInt(0,9);
        int cont2=random.nextInt(0,9);
        int cont3=random.nextInt(0,9);
        int cont4=random.nextInt(0,9);

        String letra=letras[(int)(Math.random()*letras.length)];

        return String.format("La matricula es %d%d%d%d%s",cont1,cont2,cont3,cont4,letra);
    }


    public double ponerKm(){
        Random random = new Random();
       if (anios<=2){
           km= random.nextDouble(15000,24000);
       }else if (anios>2 && anios<=7){
           km= random.nextDouble(24000,50000);
       }
       else{
           km=random.nextDouble(50000,100000);
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

    public String getObservaciones() {
        return observaciones;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName()+String.format("Caracteristicas del vehiculo:\n" +
                "\tMatricula: "+matricula +"\n"+
                "\tColor: "+color+ "\n" +
                "\tAños de uso: "+ anios +"\n\t"+"");
    }
}
