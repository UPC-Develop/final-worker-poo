package com.upc.edu.pe.expose;

public class Documento {


    public String tipoDocumento;
    public String numeroDocumento;
    public String codigoCliente;
    public String descripcion;
    public double monto;
    public String estado;

    public Documento(String tipoDocumento, String numeroDocumento, String codigoCliente, String descripcion, double monto, String estado) {
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.codigoCliente = codigoCliente;
        this.descripcion = descripcion;
        this.monto = monto;
        this.estado = estado;
    }



    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getEstado() {
        return estado;
    }

    public  String generarNumeroDocumento(){
            return String.valueOf((int)(1000000000 * Math.random()));
    }

}
