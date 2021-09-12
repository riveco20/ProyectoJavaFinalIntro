package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.domain.*;

import java.util.Scanner;

public class ImpleOpNum implements OperNumI {

    public Scanner consola = new Scanner(System.in);

    @Override
    public void compararNumero(CompararNumero compararNumero) {
        CompararNumero compararNumero1 = compararNumero;
        int numero1 = consola.nextInt();
        int numero2 = consola.nextInt();
        compararNumero1.compararNumeros(numero1,numero2);

    }

}
