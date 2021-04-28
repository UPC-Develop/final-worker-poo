package com.upc.edu.pe.entidad;

import java.time.LocalDate;

public class Fraccionamiento extends Documento {

    public Fraccionamiento(String tipoDocumento, String numeroDocumento, String codigoCliente,  String estado, LocalDate fechaSolicitud, String descripcion) {
        super(tipoDocumento, numeroDocumento, codigoCliente, descripcion, estado);
        this.fechaSolicitud = fechaSolicitud;
    }

    public LocalDate fechaSolicitud;

    public LocalDate getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(LocalDate fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }
}
