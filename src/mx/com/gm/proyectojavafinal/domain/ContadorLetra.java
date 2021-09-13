package mx.com.gm.proyectojavafinal.domain;

import java.util.*;

public class ContadorLetra {

    public ContadorLetra() {

    }

    public void tamañoYBocales() {
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingresa una frase");
        String frase = consola.nextLine();
        int cantidadA,cantidadE,cantidadI,cantidadO,cantidadU;
        cantidadA=0;
        cantidadE=0;
        cantidadI=0;
        cantidadO=0;
        cantidadU=0;
        for (char c : frase.toCharArray()) {
            if (c == 'a' || c == 'A') {
                cantidadA += 1;
            } else if (c == 'e' || c == 'E') {
                cantidadE += 1;
            } else if (c == 'i' || c == 'I') {
                cantidadI += 1;

            } else if (c == 'o' || c == 'O') {
                cantidadO += 1;

            } else if (c == 'u' || c == 'U') {
                cantidadU += 1;

            }
        }
        String longitud = frase.replace(" ", "");
        System.out.println("Longitud de la frase: " + longitud.length());
        System.out.println("Cantida de bocales: " + "a:" + cantidadA + " e:" + cantidadE + " i: " + cantidadI + " O: " + cantidadO + " u: " +cantidadU);
    }


}
