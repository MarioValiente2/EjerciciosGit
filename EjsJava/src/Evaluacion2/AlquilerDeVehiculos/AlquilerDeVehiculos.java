package Evaluacion2.AlquilerDeVehiculos;


public class AlquilerDeVehiculos extends Vehiculo {

    private Vehiculo[] vehiculos;


    public AlquilerDeVehiculos(int tamano) {
        vehiculos = new Vehiculo[tamano];
        for (int i = 0; i < vehiculos.length; i++) {
            if (i % 2 == 0) {
                vehiculos[i] = new Coche();
            } else if (i < (tamano / 2)) {
                vehiculos[i] = new Camion();
            } else {
                vehiculos[i] = null;
            }
        }
    }

    public void Mostrar() {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i] + "\n");
        }
    }
    public boolean darAlta(String modelo, int anios, String color, String matricula, double km, double tiempo) {
        boolean estar=false;
        for (int i = 0; i < vehiculos.length && !estar; i++) {
            if (vehiculos[i]==null){
                vehiculos[i]= new Coche(modelo,anios,color,matricula,km,tiempo);
                estar=true;
            }
        }
        return estar;
    }
    public boolean darBaja(String matricula) {
        boolean estar=true;
        for (int i = 0; i < vehiculos.length ; i++) {
            if (vehiculos[i]!=null && vehiculos[i].getMatricula().equalsIgnoreCase(matricula) ){
                vehiculos[i]=null;
                estar=false;
            }
        }
        return estar;
    }
    public void listarporColor(String color){
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i]!=null && vehiculos[i].getColor().equalsIgnoreCase(color)){
                System.out.println(vehiculos[i] + "\n");
            }
        }
    }
    public boolean modificar(String matricula) {
        boolean cambiar=false;
        for (int i = 0; i < vehiculos.length; i++) {
            if (vehiculos[i]!=null && vehiculos[i].getMatricula().equalsIgnoreCase(matricula) && cambiar==false){

            }
        }

        return cambiar;
    }
    public boolean modificarColor() {
        return false;
    }

}
