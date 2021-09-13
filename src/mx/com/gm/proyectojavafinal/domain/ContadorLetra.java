package mx.com.gm.proyectojavafinal.domain;

import java.sql.SQLOutput;
import java.util.*;

public class ContadorLetra {
    public ContadorLetra() {

    }

    public void tamañoYBocales() {
        Scanner consola = new Scanner(System.in);

        System.out.println("Ingresa una frase");
        try {

            String frase = consola.nextLine();

     if(frase.length()>1){
         String fraseSinEspacios = "";
         int cantidadA, cantidadE, cantidadI, cantidadO, cantidadU;
         cantidadA = 0;
         cantidadE = 0;
         cantidadI = 0;
         cantidadO = 0;
         cantidadU = 0;
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


         for (int i = 0; i < frase.length(); i++) {
             if (frase.charAt(i) != ' ') {
                 String caracter = String.valueOf(frase.charAt(i));
                 fraseSinEspacios += caracter;
             }
         }

         System.out.println("Longitud de la frase: " + fraseSinEspacios.length());
         System.out.println("Cantida de bocales: " + "a:" + cantidadA + " e:" + cantidadE + " i: " + cantidadI + " O: " + cantidadO + " u: " + cantidadU);

     }
     else {
         System.out.println("Como minimo una palabra debe tener dos letras");
     }
          }catch (Exception e){
            System.out.println("Ingres frase no numero");
        }
    }


    }
