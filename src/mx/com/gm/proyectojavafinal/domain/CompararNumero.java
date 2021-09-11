package mx.com.gm.proyectojavafinal.domain;

import java.util.Scanner;

public class CompararNumero {
    private int numero1;
    private int numero2;

    public CompararNumero() {
    }

    public void compararNumeros(int numero1, int numero2){

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

    public void comprobar(){

        Scanner consola = new Scanner(System.in);
        int opcion=1;
        while(opcion!=0){
            try{
                System.out.println("Ingresa un numero");
                int numero1= consola.nextInt();
                System.out.println("Ingresa otro numero");
                int numero2= consola.nextInt();
                this.compararNumeros(numero1, numero2);
                System.out.println("Deseas salir");
                opcion= consola.nextInt();

            }catch(Exception e){
                System.out.println("Ocurrio un error");
                break;

            }
            System.out.println("Hasta la proxima amigo");
        }

    }
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
