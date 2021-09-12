package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.domain.*;

import java.util.Scanner;

public class ImpleOpNum implements OperNumI {

    public Scanner consola = new Scanner(System.in);

    @Override
    public void compararNumero(CompararNumero compararNumero,int num1, int num2) {
        CompararNumero compararNumero1 = compararNumero;
        compararNumero1.compararNumeros(num1,num2);
    }

    @Override
    public void comararNumeroIngresado(CompararNumero compararNumero) {
        CompararNumero compararNumero1 = compararNumero;
        System.out.println("Ingrese un numero");
        int numero1=consola.nextInt();
        System.out.println("Ingrese otro numero");
        int numero2=consola.nextInt();
        compararNumero1.compararNumeros(numero1,numero2);
    }

    @Override
    public void calcularAreaCirculo(AreaCirculo circulo) {
        AreaCirculo circulo1=circulo;
        circulo1.calcularaArea();

    }

}
