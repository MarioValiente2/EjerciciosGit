package Evaluacion2.PracticaDesguace;


public class Desguace extends Vehiculos {

        private Vehiculos []vehiculos;

        public Desguace(int tamano){
            vehiculos = new Vehiculos[tamano];
                for (int i = 0; i < vehiculos.length; i++) {
                    if (i % 2 == 0) {
                       vehiculos[i]= new Coches();
                    } else if (i < (tamano / 2)) {
                        vehiculos[i] = new Moto();
                    } else {
                        vehiculos[i] = new Camión();
                    }
                }
        }
    public void Mostrar() {
        for (int i = 0; i < vehiculos.length; i++) {
            System.out.println(vehiculos[i] + "\n");
        }
    }
}
