package mx.com.gm.proyectojavafinal.domain;

public class NumeroParImpar {

    public NumeroParImpar(){

    }

    public void mostarParImpar(){
        System.out.println("Montrando numeros para e impaar");
        int min =1;
        while (min<=100){
            if(min%2==0){
                System.out.println("Numeros Pares: " + min);
            }
            else {
                System.out.println("Numeros impares: "+ min);
            }
            min++;
        }
        System.out.println("Hasta pronto");
    }

    public void numeroParImpaFor(){
        for (int i =0; i<=100;i++){
            if(i%2==0){
                System.out.println("Numeros Pares: " + i);
            }
            else {
                System.out.println("Numeros impares: "+ i);
            }
             }
    }
}
