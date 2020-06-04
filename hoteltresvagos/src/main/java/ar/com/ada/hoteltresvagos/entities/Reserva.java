package ar.com.ada.hoteltresvagos.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.* ;

@Entity
@Table(name = "reserva")
public class Reserva {

    @Id
    @Column(name = "reserva_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private int reservaId;
    @Column(name = "fecha_reserva")
    private Date fechaReserva;
    @Column(name = "fecha_ingreso")
    private Date fechaIngreso;
    @Column(name = "fecha_egreso")
    private Date fechaEgreso;
    private int habitacion; //No coloco anotación porque se llaman igual en la db
    @Column(name = "importe_reserva")
    private double importeReserva;
    @Column(name = "importe_total")
    private BigDecimal importeTotal;
    @Column(name = "fecha_pagado")
    private BigDecimal importePagado;
    @Column(name = "tipo_estado")
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