package mx.com.gm.proyectojavafinal.domain;

import java.util.Scanner;

public class DiaSemana {

    public DiaSemana(){

    }

    public void diasemana(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Digite el dia de la semana ");
        String diaEscrito = consola.nextLine();
        String dia=diaEscrito;
        switch (dia){

            case "lunes":{
                System.out.println("Si es un dia laboral");
                break;
            }
            case "martes":{
                System.out.println("Si es un dia laboral");
                break;
            }
            case "miercoles":{
                System.out.println("Si es un dia laboral");
                break;
            }
            case "jueves":{
                System.out.println("Si es un dia laboral");
                break;
            }
            case "viernes":{
                System.out.println("Si es un dia laboral");
                break;
            }
            case "sabado":{
                System.out.println("No es un dia laboral");
                break;
            }
            case "domingo":{
                System.out.println("No es un dia laboral");
                break;
            }

        }
    }
}
