package mx.com.gm.proyectojavafinal.domain;

import java.util.Scanner;

public class CompararNumero {
    private int numero1;
    private int numero2;

    public CompararNumero() {
    }

    public void compararNumeros(int numero1, int numero2){
        this.numero1=numero1;
        this.numero2=numero2;
        if(numero1>numero2){
            System.out.println("Los numeros son diferentes");
            System.out.println("El numero: " + numero1 + " Es mayor que el numero " + numero2);
        }
        else if (numero1<numero2){
            System.out.println("Los numeros son diferentes");
            System.out.println("El numero: " + numero1 + " Es menor que el numero " + numero2);
        }

        else{

            System.out.println("Los numeros son iguales");
        }
    };
    public int getNumero1() {
        return this.numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return this.numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

}
