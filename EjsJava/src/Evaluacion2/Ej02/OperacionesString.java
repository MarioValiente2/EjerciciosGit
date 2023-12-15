package Evaluacion2.Ej02;

public class OperacionesString {

    public static void iniciales(String nombre){
        System.out.println(nombre.charAt(0));
    }
    public static void iniciales1(String apellido){
        System.out.println(apellido.charAt(0));
    }
    public static void iniciales2(String apellido2){

        System.out.println(apellido2.charAt(0));
    }

    public static void mayus(String nombre, String apellido){
        System.out.println(nombre.toUpperCase()+apellido.toUpperCase());
    }
}
