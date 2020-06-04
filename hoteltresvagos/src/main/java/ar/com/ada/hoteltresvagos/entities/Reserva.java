package ar.com.ada.hoteltresvagos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.* ;

@Entity
@Table(name = "reserva")
public class Reserva {

    private int reservaId;
    private Date fechaReserva;
    private Date fechaIngreso;
    private Date fechaEgreso;
    private int habitacion;
    private double importeReserva;
    private BigDecimal importeTotal;
    private BigDecimal importePagado;
    private int tipoEstadoId; //Por ahora vamos a crear esto como int 
    private Huesped huesped;

    //double importe = 0;
    //double importe2 = 1; 
    //double importe3 = importe + importe2; 

    //BigDecimal importe = new BigDecimal(0);
    //BigDecimal importe2 = new BigDecimal(1);
    //BigDecimal importe3 = importe.add(importe2);
    
    //double importe = (var1 * 10/365) + 50 + var3*8;

    //double importe = 1;
}    