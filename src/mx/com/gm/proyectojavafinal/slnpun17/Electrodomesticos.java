package mx.com.gm.proyectojavafinal.slnpun17;

    public class Electrodomesticos {

        protected double precioBase=100;
        protected String color ="Blanco";
        protected char consumoEnergetico='F';
        protected double peso=5;

        public Electrodomesticos() {
        }

        public Electrodomesticos(double precioBase, double peso) {
            this.precioBase = precioBase;
            this.peso = peso;
        }

        public Electrodomesticos(double precioBase, String color, char consumoEnergetico, double peso) {
            this.precioBase = precioBase;
            this.color = color;
            this.consumoEnergetico = consumoEnergetico;
            this.peso = peso;
        }

        private void comprobarConsumoEnergetico(char letra){

            if(letra!='A' || letra !='B'){
                this.consumoEnergetico='F';
            }
            else if(letra!='C' || letra!='D'){
                this.consumoEnergetico='F';

            }

            else if(letra!='E' || letra!='F'){
                this.consumoEnergetico ='F';
            }
            else {
                this.consumoEnergetico=letra;
            }

        }

        private void comprobarCOlor(String color){

            if (color.equalsIgnoreCase("negro")){
                this.color=color;

            }

            else  if(color.equalsIgnoreCase("azul")){
                this.color=color;

            }

            else if(color.equalsIgnoreCase("rojo")) {
                this.color=color;

            }

            else if (color.equalsIgnoreCase("gris")){
                this.color=color;

            }

            else {
                this.color="Blanco";
            }

        }

        private void precioFinal(){

        }



        public double getPrecioBase() {
            return precioBase;
        }

        public String getColor() {
            return color;
        }

        public char getConsumoEnergetico() {
            return consumoEnergetico;
        }

        public double getPeso() {
            return peso;
        }

}
