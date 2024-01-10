package Evaluacion2.granja;

import java.util.Arrays;
import java.util.Random;

public class Conejo {
    private String nombre;
    private int edad;
    private int gazapos;
    private int [] zanahoriasSemana;
    private static final String [] nombres ={"Malo","Bueno", "Perico", "Felipe Gulugulu"};
    public Conejo(){
        Random random=new Random();
        this.nombre = nombres[(int)(Math.random()*nombres.length)];
        this.edad = random.nextInt(1,5);
        this.gazapos= random.nextInt(1,100);
        zanahoriasSemana=new int[7];
        for (int i = 0; i < zanahoriasSemana.length ; i++) {
            zanahoriasSemana [i]= random.nextInt(1,5);
        }

    }
    public Conejo(String nombre,int edad, int gazapos){
        this.nombre = nombre;
        this.edad = edad;
        this.gazapos= gazapos;
        zanahoriasSemana=new int[7];
        Random random=new Random();
        for (int i = 0; i < zanahoriasSemana.length ; i++) {
            zanahoriasSemana [i]= random.nextInt(1,5);
        }
    }
    public String toString(){
        return String.format("Me llamo %s, tengo %d años y tengo %d gazapos \nComo muchas zanahorias %s ",nombre,edad,gazapos, Arrays.toString(zanahoriasSemana));
    }

}
