package com.upc.edu.pe.expose;


import java.time.LocalDate;

public class Cliente extends Persona {

    public String codigoCliente;
    public String direccionInstalacion;
    public String tipoServicio;
    public LocalDate cicloFacturacion;

    public Cliente(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numeroDocumento, LocalDate fechaNacimiento, String direccion, String distrito, String departamento, String pais, String codigoCliente, String direccionInstalacion, String tipoServicio, LocalDate cicloFacturacion) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoDocumento, numeroDocumento, fechaNacimiento, direccion, distrito, departamento, pais);
        this.codigoCliente = codigoCliente;
        this.direccionInstalacion = direccionInstalacion;
        this.tipoServicio = tipoServicio;
        this.cicloFacturacion = cicloFacturacion;
    }

    public String getCodigoCliente() {
        return codigoCliente;
    }

    public String getDireccionInstalacion() {
        return direccionInstalacion;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public LocalDate getCicloFacturacion() {
        return cicloFacturacion;
    }

    public String obtenerDireccionInstalacion(){
        return direccionInstalacion + ", " + super.distrito + ", " + super.departamento + ", " + super.pais;
    }

    @Override
    public String toString() {
        return "Cliente encontrado { " +
                "Tipo de documento: '" + tipoDocumento + '\'' +
                ", Número de documento: '" + numeroDocumento + '\'' +
                ", Nombre completo: '" + super.obtenerNombreCompleto() + '\'' +
                ", Fecha de Nacimiento: " + fechaNacimiento +
                ", Edad: " + super.calcularEdad() +
                ", Dirección de instalación: '" + obtenerDireccionInstalacion() + '\'' +
                ", Tipo de servicio: '" + tipoServicio + '\'' +
                ", Ciclo de facturacion: " + cicloFacturacion.getDayOfMonth() +
                ", Domicilio: '" + obtenerDomicilio() + '\'' +
                '}';
    }
}
