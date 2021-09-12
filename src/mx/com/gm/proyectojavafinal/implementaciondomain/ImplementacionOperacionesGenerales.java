package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.Remplazarletra;
import mx.com.gm.proyectojavafinal.domain.*;

public class ImplementacionOperacionesGenerales implements OperacionesGeneralesI {


    @Override
    public void comparaNumerosConsla(CompararNumero comparaNumero) {

        CompararNumero comaparar = comparaNumero;
        comparaNumero.comprobar();

    }

    @Override
    public void compararNumeros(CompararNumero compararNumero, int num1, int num2) {
        CompararNumero comparar = compararNumero;
        comparar.compararNumeros(num1,num2);
    }

    @Override
    public void calcularRadio(AreaCirculo circulo) {
        AreaCirculo circulo1 = circulo;
        circulo1.calcularaArea();
    }

    @Override
    public void calcularIva() {
        PrecioIVA precio = new PrecioIVA();
        double valorApagar =precio.CalcularIVA();
        System.out.println("Precio con final: " +valorApagar);
    }

    @Override
    public void mostrarParImpar() {
        NumeroParImpar parImpar=new NumeroParImpar();
        parImpar.mostarParImpar();
    }

    @Override
    public void mostrarParImparFor() {
        NumeroParImpar parImpar = new NumeroParImpar();
        parImpar.numeroParImpaFor();
    }

    @Override
    public void mayorQcero() {
        MayorQCero mayor = new MayorQCero();
        mayor.mayorquecero();
    }

    @Override
    public void diasemana() {
        DiaSemana diasemana = new DiaSemana();
        diasemana.diasemana();
    }

    @Override
    public void modificarLetra() {
        Remplazarletra letra = new Remplazarletra();
        String frase=letra.remplazarcadena();
        System.out.println(frase);
    }

    @Override
    public void eliminarEspacio() {
        EliminarEspacio espacio = new EliminarEspacio();
       String espacio2= espacio.eliminarEspacios();
        System.out.println(espacio2);
    }

    @Override
    public void contadorLetra() {
        ContadorPalabra frase = new ContadorPalabra();
        frase.tamañoYBocales();
    }

    @Override
    public void consultarFecha() {
      ConsutaFechaHora fecha = new ConsutaFechaHora();
      fecha.consultarFecha();
    }

    @Override
    public void contadorNumero() {
        Numero2En2 num = new Numero2En2();
        num.contador();
    }


}
