package mx.com.gm.proyectojavafinal.domain;

import java.util.LinkedList;
import java.util.Scanner;

public class RemplazarLetra {
    private final String frase="La sonrisa sera la mejor arma contra la tristeza";
    private LinkedList list = new LinkedList();

    public RemplazarLetra(){

    }

    public String remplazarcadena(){
        Scanner consola = new Scanner(System.in);
        System.out.println("Ingres una frase por favor");
        String fraseIngresada=consola.nextLine();
        String fraseTransformada ="";
        for (char c : frase.toCharArray()) {
            if(c=='a'){
                list.add('e');
            }
            else if (c!='a'){
                list.add(c);
            }

        }

        for (int i =0; i<list.size();i++){
                String caracter =String.valueOf(list.get(i));
                fraseTransformada +=caracter;

        }
        System.out.println(list);
        System.out.println(fraseTransformada);
        return fraseTransformada.concat(fraseIngresada);
    }


}
