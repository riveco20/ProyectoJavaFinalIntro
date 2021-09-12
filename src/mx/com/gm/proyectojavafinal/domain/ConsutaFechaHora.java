package mx.com.gm.proyectojavafinal.domain;

import java.util.*;
import java.util.Date;
import java.text.SimpleDateFormat;


public class ConsutaFechaHora {
    public Date fecha;

    public ConsutaFechaHora() {
    }

    public void consultarFecha(){

        String formato = "yyyy-mm-dd HH:mm:ss";
        SimpleDateFormat formato2 = new SimpleDateFormat(formato);
        System.out.println(this.fecha = new Date());

    }


}
