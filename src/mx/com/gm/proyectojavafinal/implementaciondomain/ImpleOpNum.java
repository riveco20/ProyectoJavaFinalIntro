package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.domain.*;

import java.util.Scanner;

public class ImpleOpNum implements OperNumI {

    public Scanner consola = new Scanner(System.in);

    @Override
    public void compararNumero(CompararNumero compararNumero,int num1, int num2) {
        compararNumero.setNumero1(num1);
        compararNumero.setNumero2(num2);
        if(num1>num2){
            System.out.println("Los numeros son diferentes");
            System.out.println("El numero: " + num1 + " Es mayor que el numero " + num2);
        }
        else if (num1<num2){
            System.out.println("Los numeros son diferentes");
            System.out.println("El numero: " + num1 + " Es menor que el numero " + num2);
        }

        else{
    }

    @Override
    public void comararNumeroIngresado(CompararNumero compararNumero) {
        System.out.println("Ingrese un numero");
        int numero1=consola.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2=consola.nextInt();
        compararNumero.compararNumeros(numero1,numero2);
    }

    @Override
    public void calcularAreaCirculo(AreaCirculo circulo) {
        circulo.calcularaArea();

    }

    @Override
    public void precioConIVA(PrecioIVA iva) {
        iva.CalcularIVA();
    }

    @Override
    public void numeroParImpar(NumeroParImpar numero) {
        numero.mostarParImpar();
    }

    @Override
    public void numeroParImparF(NumeroParImpar numero) {
         numero.numeroParImpaFor();
    }

    @Override
    public void NumeroMayorQCero(MayorQCero mayor) {
         mayor.mayorquecero();
    }

}
