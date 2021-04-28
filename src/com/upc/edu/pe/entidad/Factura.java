package com.upc.edu.pe.entidad;

import java.time.LocalDate;
import java.util.Date;

public class Factura extends Documento{


    public LocalDate fechaEmision;
    public LocalDate fechaPago;
    public double monto;

    public Factura(String tipoDocumento, String numeroDocumento, String codigoCliente,  LocalDate fechaEmision, LocalDate fechaPago, double monto, String descripcion, String estado) {
        super(tipoDocumento, numeroDocumento, codigoCliente, descripcion, estado);
        this.fechaEmision = fechaEmision;
        this.fechaPago = fechaPago;
        this.monto = monto;
    }

    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }

    public double getMonto() {
        return monto;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "fechaEmision=" + fechaEmision +
                ", fechaPago=" + fechaPago +
                ", monto=" + monto +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", codigoCliente='" + codigoCliente + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", estado='" + estado + '\'' +
                '}';
    }
}
