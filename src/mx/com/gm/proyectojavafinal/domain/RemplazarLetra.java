package mx.com.gm.proyectojavafinal.domain;

import java.util.Scanner;

public class RemplazarLetra {
    private final String frase="La sonrisa sera la mejor arma contra la tristeza";

    public RemplazarLetra(){

    }

    public String remplazarcadena(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingres una frase por favor");
        String fraseIngresada=consola.nextLine();
        String nuevaFrase = frase.replace('a','e');
        return (nuevaFrase + " " +fraseIngresada);
    }

}
