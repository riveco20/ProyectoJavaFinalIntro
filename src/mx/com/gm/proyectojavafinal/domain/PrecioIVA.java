package mx.com.gm.proyectojavafinal.domain;

import javax.lang.model.element.PackageElement;
import java.util.*;

public class PrecioIVA {

    private double precio;
    private final double iva=21;


    public PrecioIVA() {
    }

    public PrecioIVA(double numero){
        this.precio=numero;

    }

    public double CalcularIVA(){
    Scanner consola = new Scanner(System.in);
        System.out.println("Ingresar el precio sin iva");
   this.precio =Double.parseDouble(consola.nextLine());

    double calculoIva=(precio*this.iva)/100d;
    double precioIva = precio+calculoIva;
    return precioIva;
    }


    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}
