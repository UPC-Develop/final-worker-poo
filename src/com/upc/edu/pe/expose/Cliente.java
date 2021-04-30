package com.upc.edu.pe.expose;


import java.time.LocalDate;

public class Cliente extends Persona {

    public String codigoCliente;
    public String direccionInstalacion;
    public String tipoServicio;
    public LocalDate cicloFacturacion;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numeroDocumento, LocalDate fechaNacimiento, Integer edad, String direccion, String distrito, String departamento, String pais, String codigoCliente, String direccionInstalacion, String tipoServicio, LocalDate cicloFacturacion) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoDocumento, numeroDocumento, fechaNacimiento, edad, direccion, distrito, departamento, pais);
        this.codigoCliente = codigoCliente;
        this.direccionInstalacion = direccionInstalacion;
        this.tipoServicio = tipoServicio;
        this.cicloFacturacion = cicloFacturacion;
    }



    public String getCodigoCliente() {
        return codigoCliente;
    }

    public void setCodigoCliente(String codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    public String getDireccionInstalacion() {
        return direccionInstalacion;
    }

    public void setDireccionInstalacion(String direccionInstalacion) {
        this.direccionInstalacion = direccionInstalacion;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public LocalDate getCicloFacturacion() {
        return cicloFacturacion;
    }

    public void setCicloFacturacion(LocalDate cicloFacturacion) {
        this.cicloFacturacion = cicloFacturacion;
    }

    @Override
    public String toString() {
        return "Cliente {" +
                "Tipo de documento: '" + tipoDocumento + '\'' +
                ", Número de documento: '" + numeroDocumento + '\'' +
                ", Nombre: '" + nombre + '\'' +
                ", Apellido paterno: '" + apellidoPaterno + '\'' +
                ", Apellido materno: '" + apellidoMaterno + '\'' +
                ", Fecha de Nacimiento: " + fechaNacimiento +
                ", Edad: " + edad +
                ", Dirección de instalacion: '" + direccionInstalacion + '\'' +
                ", Tipo de servicio: '" + tipoServicio + '\'' +
                ", Ciclo de facturacion: " + cicloFacturacion.getDayOfMonth() +
                ", Dirección: '" + direccion + '\'' +
                ", Distrito: '" + distrito + '\'' +
                ", Departamento: '" + departamento + '\'' +
                ", País: '" + pais + '\'' +
                '}';
    }
}
