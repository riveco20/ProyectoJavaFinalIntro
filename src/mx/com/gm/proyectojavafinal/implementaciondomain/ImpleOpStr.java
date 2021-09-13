package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.domain.*;

public class ImpleOpStr implements OperStr {

    @Override
    public void contadorLetra() {
        ContadorLetra frase = new ContadorLetra();
        frase.tamañoYBocales();
    }

    @Override
    public void diaSemana() {
        DiaSemana dia = new DiaSemana();
        dia.diasemana();
    }

    @Override
    public void cambiarLetra() {
        RemplazarLetra remplazarLetra = new RemplazarLetra();
        String nuevaPalabra = remplazarLetra.remplazarcadena();
        System.out.println(nuevaPalabra);
    }

    @Override
    public void menu() {
        Menu menu = new Menu();
        menu.menu();
    }

    @Override
    public void eliminarespacio() {
        EliminarEspacio eliminarespacio = new EliminarEspacio();
        eliminarespacio.eliminarEspacios();
    }

    @Override
    public void compararPalabra() {
        ComparaPalabra comparaPalabra = new ComparaPalabra();
        comparaPalabra.compararPalabras();
    }

}
