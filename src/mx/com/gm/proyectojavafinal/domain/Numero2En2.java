package mx.com.gm.proyectojavafinal.domain;


import java.security.spec.ECField;
import java.util.Scanner;

public class Numero2En2 {


    public int numero;

    public Numero2En2(){

    }

    public void contador() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingrese un numero menor que 1000");
        try {
            this.numero = consola.nextInt();

            if (numero < 1000) {
                System.out.println("------------------------");
                while (numero <= 1000) {

                    System.out.println(numero);
                    numero += 2;
                }
            } else {
                System.out.println("Se sale del limite maximo");
            }
        }catch (Exception ne){
            System.out.println("error");
        }
    }

}
