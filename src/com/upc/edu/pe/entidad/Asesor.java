package com.upc.edu.pe.entidad;

import java.time.LocalDate;

public class Asesor extends Persona {

    public String codigoAsesor;
    public String usuario;
    public String clave;


    public Asesor(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numeroDocumento, LocalDate fechaNacimiento, Integer edad, String direccion, String distrito, String departamento, String pais, String usuario, String clave, String codigoAsesor) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoDocumento, numeroDocumento, fechaNacimiento, edad, direccion, distrito, departamento, pais);
        this.usuario = usuario;
        this.clave = clave;
        this.codigoAsesor = codigoAsesor;
    }

    public String getCodigoAsesor() {
        return codigoAsesor;
    }

    public void setCodigoAsesor(String codigoAsesor) {
        this.codigoAsesor = codigoAsesor;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    @Override
    public String toString() {
        return "Asesor{" +
                "codigoAsesor='" + codigoAsesor + '\'' +
                ", usuario='" + usuario + '\'' +
                ", clave='" + clave + '\'' +
                ", nombre='" + nombre + '\'' +
                ", apellidoPaterno='" + apellidoPaterno + '\'' +
                ", apellidoMaterno='" + apellidoMaterno + '\'' +
                ", tipoDocumento='" + tipoDocumento + '\'' +
                ", numeroDocumento='" + numeroDocumento + '\'' +
                ", fechaNacimiento=" + fechaNacimiento +
                ", edad=" + edad +
                ", direccion='" + direccion + '\'' +
                ", distrito='" + distrito + '\'' +
                ", departamento='" + departamento + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
