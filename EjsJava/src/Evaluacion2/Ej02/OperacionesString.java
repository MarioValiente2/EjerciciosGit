package Evaluacion2.Ej02;

public class OperacionesString {
    public static void iniciales(String nombre, String apellido, String apellido2){

        StringBuilder frase=new StringBuilder(nombre.charAt(0)).append(apellido.charAt(0)).append(apellido2.charAt(0)).append("\n").append(nombre.toUpperCase()).append(" ").append(apellido.toUpperCase());
        System.out.println(frase);
    }
}
