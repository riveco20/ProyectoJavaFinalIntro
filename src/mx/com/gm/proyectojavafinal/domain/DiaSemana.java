package mx.com.gm.proyectojavafinal.domain;

import java.util.Scanner;

public class DiaSemana {

    public DiaSemana() {

    }

    public void diasemana() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Digite el dia de la semana ");
        try {
            String diaEscrito = consola.nextLine();

            diaEscrito.toLowerCase();
            switch (diaEscrito) {
                case "lunes": {
                    System.out.println("Si es un dia laboral");
                    break;
                }
                case "martes": {
                    System.out.println("Si es un dia laboral");
                    break;
                }
                case "miercoles": {
                    System.out.println("Si es un dia laboral");
                    break;
                }
                case "jueves": {
                    System.out.println("Si es un dia laboral");
                    break;
                }
                case "viernes": {
                    System.out.println("Si es un dia laboral");
                    break;
                }
                case "sabado": {
                    System.out.println("No es un dia laboral");
                    break;
                }
                case "domingo": {
                    System.out.println("No es un dia laboral");
                    break;
                }
                default: {
                    System.out.println("El dia inscrito no es valido");
                }

            }
        } catch (Exception e) {
            System.out.println("Ocurrio un error al ingresar el dia");
        }
    }
}