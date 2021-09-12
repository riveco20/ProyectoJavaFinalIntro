package mx.com.gm.proyectojavafinal.slnpun17;
import mx.com.gm.proyectojavafinal.slnpun17.*;

    public class Lavadora extends Electrodomesticos {

        public int carga =5;


        public Lavadora(){

        }

        public Lavadora(double precioBase, double peso) {
            super(precioBase, peso);
        }

        public Lavadora(double precioBase, String color, char consumoEnergetico, double peso, int carga) {
            super(precioBase, color, consumoEnergetico, peso);
            this.carga = carga;
        }

        public void preicoFinal(){

        }

        public int getCarga() {
            return carga;
        }

    }
}
