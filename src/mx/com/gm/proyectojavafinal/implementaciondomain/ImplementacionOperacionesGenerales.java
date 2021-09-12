package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.domain.*;

public class ImplementacionOperacionesGenerales implements OperacionesGeneralesI {


    @Override
    public void comparaNumerosConsla(CompararNumero comparaNumero) {

        CompararNumero comaparar = comparaNumero;
        comparaNumero.comprobar();

    }

    @Override
    public void compararNumeros(CompararNumero compararNumero, int num1, int num2) {
        CompararNumero comparar = compararNumero;
        comparar.compararNumeros(num1,num2);
    }

    @Override
    public void calcularRadio(AreaCirculo circulo) {
        AreaCirculo circulo1 = circulo;
        circulo1.calcularaArea();
    }

    @Override
    public void calcularIva() {
        PrecioIVA precio = new PrecioIVA();
        double valorApagar =precio.CalcularIVA();
        System.out.println("Precio con final: " +valorApagar);
    }

    @Override
    public void mostrarParImpar() {
        NumeroParImpar parImpar=new NumeroParImpar();
        parImpar.mostarParImpar();
    }


}
