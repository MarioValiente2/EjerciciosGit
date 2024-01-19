package Evaluacion2.Practica5b;

public class Profesor {

    public static void ponerNotas(Alumno notas) {
        notas.getAsig1().setCalificacion(Math.random() * 10);
        notas.getAsig2().setCalificacion(Math.random() * 10);
        notas.getAsig3().setCalificacion(Math.random() * 10);
    }
    public static double calcularMedia(Alumno notas){
        double nota1=notas.getAsig1().getCalificacion();
        double nota2=notas.getAsig2().getCalificacion();
        double nota3=notas.getAsig3().getCalificacion();
        return  ((nota1+nota2+nota3)/3);
    }
}
