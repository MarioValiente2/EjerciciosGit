package Evaluacion2.Practica5b;
public class main {
    public static void main(String[] args) {
        Asignatura asig1 = new Asignatura(23);
        Asignatura asig2 = new Asignatura(50);
        Asignatura asig3 = new Asignatura(10);
        Alumno alumno=new Alumno(asig1, asig2, asig3);
        Profesor profesor = new Profesor();
        profesor.ponerNotas(alumno);
        System.out.printf("La media del alumno es: %.0f", profesor.calcularMedia(alumno));
    }
}
