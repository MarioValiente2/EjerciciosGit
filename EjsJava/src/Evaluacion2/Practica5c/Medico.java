package Evaluacion2.Practica5c;

public abstract class Medico {
    protected String nombre;
    protected int edad;
    protected char sexo;
    protected double horas;
    protected double salariohora;

    public Medico(String nombre, int edad, char sexo, double horas, double salariohora) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.horas = horas;
        this.salariohora = salariohora;
    }

    public Medico(){
        nombre="Pepe";
        edad=21;
        sexo='M';
        horas=40;
        salariohora=12.4;
    }
    public String mostrarDatos(){
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", sexo=" + sexo +
                ", horas=" + horas +
                ", salariohora=" + salariohora +
                '}';
    }

    abstract public double calcularSalario();
}
