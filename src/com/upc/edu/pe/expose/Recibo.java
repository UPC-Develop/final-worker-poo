package com.upc.edu.pe.expose;

import java.time.LocalDate;

public class Recibo extends Documento{


    public LocalDate fechaEmision;
    public LocalDate fechaPago;

    public Recibo(String tipoDocumento, String numeroDocumento, String codigoCliente, String descripcion, double monto, String estado, LocalDate fechaEmision, LocalDate fechaPago) {
        super(tipoDocumento, numeroDocumento, codigoCliente, descripcion, monto, estado);
        this.fechaEmision = fechaEmision;
        this.fechaPago = fechaPago;
    }


    public LocalDate getFechaEmision() {
        return fechaEmision;
    }

    public LocalDate getFechaPago() {
        return fechaPago;
    }



    @Override
    public String toString() {
        return "Recibo{" +
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
