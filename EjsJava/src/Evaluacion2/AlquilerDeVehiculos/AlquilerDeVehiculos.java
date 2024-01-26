package Evaluacion2.AlquilerDeVehiculos;


public class AlquilerDeVehiculos extends Vehiculos {

    private Vehiculos[] vehiculos;


    public AlquilerDeVehiculos(int tamano) {
        vehiculos = new Vehiculos[tamano];
        for (int i = 0; i < vehiculos.length; i++) {
            if (i % 2 == 0) {
                vehiculos[i] = new Coche();
            } else if (i < (tamano / 2)) {
                vehiculos[i] = new Moto();
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
    public boolean darAlta() {
        return false;
    }
    public boolean darBaja() {
        return false;
    }
    public boolean modificar() {
        return false;
    }
    public boolean modificarColor() {
        return false;
    }
}
