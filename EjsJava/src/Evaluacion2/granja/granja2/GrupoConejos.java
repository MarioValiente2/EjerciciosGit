package Evaluacion2.granja.granja2;

import Evaluacion2.granja.Conejo;

import java.util.Random;

public class GrupoConejos {
    private Conejo [] conejos;
    public GrupoConejos(){
        conejos=new Conejo[10];
        for (int i = 0; i <conejos.length ; i++) {
            conejos[i]= new Conejo();
        }
    }
    public void mostrar(){
        for (int i = 0; i < conejos.length; i++) {
            System.out.println(conejos[i]);
        }
    }
}
