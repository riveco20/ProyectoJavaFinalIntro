package mx.com.gm.proyectojavafinal.domain;

import java.util.LinkedList;
import java.util.Scanner;

public class ComparaPalabra {
    private LinkedList list1 = new LinkedList();
    private LinkedList list2 = new LinkedList();
    public ComparaPalabra() {
    }

    public void compararPalabras(){
        Scanner consola = new Scanner(System.in);
        try{
            System.out.println("Ingrese una palabra ");
            String palabra1 = consola.nextLine();
            System.out.println("Ingrese otra palabra");
            String palabra2 = consola.nextLine();
            if(palabra1.equalsIgnoreCase(palabra2)){
               System.out.println("Las palabras son iguales");
            }
            else if(palabra1.length()==palabra2.length()){
                System.out.println("Las palabras tiene misma longitud pero son diferente");
                for(int i=0; i<palabra1.length();i++){
                    if(palabra1.charAt(i)==palabra2.charAt(i)){
                        continue;
                    }
                    else if(palabra1.charAt(i)!=palabra2.charAt(i)){
                        list1.add(palabra1.charAt(i));
                        list2.add(palabra2.charAt(i));
                    }
                }
                System.out.println("Tiene las siguientes letras diferentes " + list1 + " " + list2);
            }
            else {
                System.out.println("La palabras tiene diferente longitud ");
            }

        }catch (Exception e){
            System.out.println("Ocurrio un error al ingresar las palabras");
        }

    }

}
