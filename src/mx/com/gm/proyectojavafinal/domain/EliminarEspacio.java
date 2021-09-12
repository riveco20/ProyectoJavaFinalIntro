package mx.com.gm.proyectojavafinal.domain;

import java.util.Scanner;

public class EliminarEspacio {
    public EliminarEspacio(){

    }

    public String eliminarEspacios(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = consola.nextLine();
        String nuevaFrase = frase.replace(" ","");
        return nuevaFrase ;
    }

    public static void main(String[] args) {
        EliminarEspacio frase = new EliminarEspacio();
        String fraseNueva= frase.eliminarEspacios();
        System.out.println(fraseNueva);
    }

}
