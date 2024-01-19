package Evaluacion2.Practica5c;

import java.util.Arrays;
import java.util.Random;

public class MedicoAsistenciaDomiciliaria extends Medico{

    private int [] kmVisitas;
    private double tarifaKm;


    public double calcularSalario(){

        return horas*salariohora;
    }

    public MedicoAsistenciaDomiciliaria(){
        super();
        Random random = new Random();
        kmVisitas= new int [10];
        for (int i = 0; i <kmVisitas.length ; i++) {
            kmVisitas[i]= random.nextInt(1,5);
        }
        tarifaKm=15;
    }
    public String mostrarDatos () {
        return "MedicoAsistenciaDomiciliaria{" +
                "kmVisitas=" + Arrays.toString(kmVisitas) +
                ", tarifaKm=" + tarifaKm +
                '}';
    }
}
