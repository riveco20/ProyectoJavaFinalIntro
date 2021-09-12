package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.domain.*;

import java.security.interfaces.DSAPublicKey;
import java.util.Scanner;


public class ImpleOpNum implements OperNumI {
    @Override
    public void compararNumero(int num1, int num2) {
        CompararNumero numero = new CompararNumero();
        numero.compararNumeros(num1,num2);
    }

    @Override
    public void comapararNumero() {
        Scanner consola = new Scanner(System.in);
        int numero1 = consola.nextInt();
        int numero2= consola.nextInt();
        CompararNumero numero = new CompararNumero();
        numero.compararNumeros(numero1,numero2);
    }

    @Override
    public void numeroPar() {
        NumeroParImpar numero = new NumeroParImpar();
        numero.mostarParImpar();
    }
    @Override
   public void numeroparFor(){
        NumeroParImpar numero = new NumeroParImpar();
        numero.numeroParImpaFor();
    }

    @Override
    public void aumento2En2() {
        Numero2En2 numero = new Numero2En2();
        numero.contador();

    }

    @Override
    public void calcularAreaC() {

        AreaCirculo area = new AreaCirculo();
        area.calcularaArea();

    }

    @Override
    public void calcularIva() {
        PrecioIVA iva = new PrecioIVA();
        iva.CalcularIVA();
    }

    @Override
    public void mayorQcero() {
        MayorQCero numero = new MayorQCero();
        numero.mayorquecero();
    }

    @Override
    public void consultarfecha(){
        ConsutaFechaHora fecha = new ConsutaFechaHora();
        fecha.consultarFecha();
    }
}