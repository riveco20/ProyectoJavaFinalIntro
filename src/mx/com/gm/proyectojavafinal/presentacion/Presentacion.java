package mx.com.gm.proyectojavafinal.presentacion;
import java.util.Scanner;
public class Presentacion {

        public static void main(String[] args) {
            Scanner consola = new Scanner(System.in);
            int opcion = -1;
            int opcion2 = -1;
            while (opcion != 0) {
                try {

                    System.out.println("Elige una opncion: \n"
                            + "1. Comenzar juego\n"
                            + "0. Salir");
                    opcion = Integer.parseInt(consola.nextLine());

                    switch (opcion) {
                        case 1:
                            while (opcion2 != 0) {
                                try {
                                    System.out.println("Menu principal del juego");
                                    System.out.println("Elige una opncion: \n"
                                            + "1. Agregar Jugadores\n"
                                            + "2. Mostrar Lista\n"
                                            + "3. Comenzar carrera\n"
                                            + "4. Ver lista de todos los jugadores\n"
                                            + "0. Atras");
                                    opcion2 = Integer.parseInt(consola.nextLine());
                                    switch (opcion2) {
                                        case 1:
                                            break;
                                        case 2:
                                            break;
                                        case 3:
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
