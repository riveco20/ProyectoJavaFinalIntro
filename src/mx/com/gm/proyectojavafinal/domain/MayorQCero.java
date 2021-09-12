package mx.com.gm.proyectojavafinal.domain;

import java.util.*;

public class MayorQCero {

    private int numero;

    public MayorQCero(){

    }

    public void mayorquecero(){
        Scanner consola = new Scanner(System.in);
        int numero1;
        do {
            System.out.println("Digite un numero mayor o igual que 0");
            numero1 = Integer.parseInt(consola.nextLine());
        } while (numero1<=0);
        System.out.println("El numero "+numero1+" es mayor o igual que 0");
   }
}
