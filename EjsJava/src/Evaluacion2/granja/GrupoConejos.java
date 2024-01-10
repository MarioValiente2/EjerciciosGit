package Evaluacion2.granja;

import Evaluacion2.granja.Conejo;

import java.util.Random;

public class GrupoConejos {
    private Conejo [] conejos;
    public GrupoConejos(int tamano){
        conejos=new Conejo[tamano];
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
