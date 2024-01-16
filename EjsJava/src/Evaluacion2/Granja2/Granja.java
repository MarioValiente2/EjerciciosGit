package Evaluacion2.Granja2;

import Evaluacion2.granja.Conejo;

public class Granja {
    public Granja(int tamano) {
        Animal crear []=new Animal[tamano];
        for (int i = 0; i <crear.length ; i++) {
            crear[i]= new Gallina();
        }
    }

}
