package mx.com.gm.proyectojavafinal.domain;
import java.util.Scanner;

public class AreaCirculo {

    private double radio;

    public AreaCirculo() {

    }

    public void calcularaArea(){
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa el radio");
try {
    double radio = Double.parseDouble(consola.nextLine());
    if (radio >= 0) {
        double area = Math.PI * (Math.pow(radio, 2));
        System.out.println(area);
    } else {
        System.out.println("NO Ingrese numeros negativos");
    }
}catch (Exception ex){
    System.out.println("Ocurrio un error");
}
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

}
