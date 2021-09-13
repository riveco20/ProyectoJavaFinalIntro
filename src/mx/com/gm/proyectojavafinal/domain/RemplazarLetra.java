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
        String fraseTransformada ="";
        String fraseIngresada=" ";
       try{
            fraseIngresada=consola.nextLine();
          if(fraseIngresada.matches("[+-]?\\d*(\\.\\d+)?")){
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
            }
           else {
               System.out.println("Debe ser una frase");
           }
       }catch (Exception ex){
            System.out.println("Ocurrio un error");
        }
        return fraseTransformada.concat(" "+fraseIngresada);
    }


}
