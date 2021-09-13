package mx.com.gm.proyectojavafinal.domain;

import java.util.Scanner;

public class EliminarEspacio {
    public EliminarEspacio(){

    }

    public String eliminarEspacios() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = consola.nextLine();
        String fraseSinEspacios = "";
        for (int i = 0; i < frase.length(); i++) {
            if (frase.charAt(i) != ' ') {
                String caracter = String.valueOf(frase.charAt(i));
                fraseSinEspacios += caracter;
            }
        }

            System.out.println(fraseSinEspacios);
            return fraseSinEspacios;
        }

    public static void main(String[] args) {
        EliminarEspacio eliminarespacio = new EliminarEspacio();
        eliminarespacio.eliminarEspacios();
    }
    }

