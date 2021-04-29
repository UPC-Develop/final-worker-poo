package com.upc.edu.pe.entidad;

import java.time.LocalDate;

public class Fraccionamiento extends Documento {

    public Fraccionamiento(String tipoDocumento, String numeroDocumento, String codigoCliente, String descripcion, double monto, String estado, LocalDate fechaSolicitud, double montoTotal, double montoDescuento, int numeroCuota, double montoCuota) {
        super(tipoDocumento, numeroDocumento, codigoCliente, descripcion, monto, estado);
        this.fechaSolicitud = fechaSolicitud;
        this.montoTotal = montoTotal;
        this.montoDescuento = montoDescuento;
        this.numeroCuota = numeroCuota;
        this.montoCuota = montoCuota;
    }

    public LocalDate fechaSolicitud;
    public double montoTotal;
    public double montoDescuento;
    public int numeroCuota;
    public double montoCuota;

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public void setMontoDescuento(double montoDescuento) {
        this.montoDescuento = montoDescuento;
    }



    public void setNumeroCuota(int numeroCuota) {
        this.numeroCuota = numeroCuota;
    }



    public void setMontoCuota(double montoCuota) {
        this.montoCuota = montoCuota;
    }


    public double getMontoDescuento() {
        if (getMontoTotal() > 150){
            montoDescuento = getMontoTotal() * 0.2;
        }
        return montoDescuento;
    }

    public int getNumeroCuota() {

        if ((getMontoTotal() - getMontoDescuento()) > 100 )
            numeroCuota = 4;
        else
            numeroCuota = 2;

        return numeroCuota;
    }

    public double getMontoCuota() {
        montoCuota = (getMontoTotal()-getMontoDescuento())/ getNumeroCuota();
        return montoCuota;
    }

    @Override
    public String toString() {
        return "Fraccionamiento{" +
                "fechaSolicitud=" + fechaSolicitud +
                ", montoTotal=" + montoTotal +
                ", montoDescuento=" + montoDescuento +
                ", numeroCuota=" + numeroCuota +
                ", montoCuota=" + montoCuota +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", codigoCliente='" + codigoCliente + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", monto=" + monto +
                ", estado='" + estado + '\'' +
                '}';
    }
}
