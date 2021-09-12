package mx.com.gm.proyectojavafinal.presentacion;
import mx.com.gm.proyectojavafinal.domain.AreaCirculo;
import mx.com.gm.proyectojavafinal.domain.CompararNumero;
import mx.com.gm.proyectojavafinal.implementaciondomain.ImpleOpNum;

import java.util.Scanner;
public class Presentacion {

        public static void main(String[] args) {
            ImpleOpNum operNum = new ImpleOpNum();
            Scanner consola = new Scanner(System.in);

            int opcion = -1;
            int opcion2 = -1;
            while (opcion != 0) {
                try {
                    System.out.println("Elige una opncion: \n"
                            + "1. Comenzar \n"
                            + "0. Salir");
                    opcion = Integer.parseInt(consola.nextLine());
                    switch (opcion) {
                        case 1:
                            while (opcion2 != 0) {
                                try {
                                    System.out.println("Menu principal");
                                    System.out.println("Elige una opncion: \n"
                                            + "1. Comparar dos numeros cuales quiera\n"
                                            + "2. Comarar numero ingresado por consola\n"
                                            + "3. Calcular area de un circulo\n"
                                            + "4. Ver lista de todos los jugadores\n"
                                            + "0. Atras");
                                    opcion2 = Integer.parseInt(consola.nextLine());
                                    switch (opcion2) {
                                        case 1:
                                            CompararNumero oper1= new CompararNumero();
                                            operNum.compararNumero(oper1,2,3);
                                            break;
                                        case 2:
                                            CompararNumero oper2 = new CompararNumero();
                                            operNum.comararNumeroIngresado(oper2);
                                            break;
                                        case 3:
                                            AreaCirculo circulo = new AreaCirculo();
                                            circulo.calcularaArea();
                                            break;
                                        case 4:
                                            break;
                                        case 0:
                                            System.out.println("Salio del menu");
                                            break;
                                        default:
                                            System.out.println("Opcion invalidad");
                                            break;

                                    }
                                }catch (Exception e){
                                    System.out.println("No ingrese letras solo numeros");
                                }

                            }
                        case 0:
                            System.out.println("Hasta pronto");
                            break;
                        default:
                            System.out.println("Opcion invalidad");
                            break;
                    }

                } catch (Exception e) {
                    System.out.println("No ingrese letras solo numeros");
                }
            }
        }

    }
