package mx.com.gm.proyectojavafinal.implementaciondomain;

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

}
