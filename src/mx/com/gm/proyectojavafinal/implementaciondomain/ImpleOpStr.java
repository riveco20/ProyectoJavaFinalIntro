package mx.com.gm.proyectojavafinal.implementaciondomain;

import mx.com.gm.proyectojavafinal.domain.CompararNumero;
import mx.com.gm.proyectojavafinal.domain.ContadorLetra;
import mx.com.gm.proyectojavafinal.domain.DiaSemana;

public class ImpleOpStr implements OperStr{

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
}
