package com.upc.edu.pe.expose;

import java.time.LocalDate;

public class Persona {

    public String nombre;
    public String apellidoPaterno;
    public String apellidoMaterno;
    public String tipoDocumento;
    public String numeroDocumento;
    public LocalDate fechaNacimiento;
    public String direccion;
    public String distrito;
    public String departamento;
    public String pais;

    public Persona(){

    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numeroDocumento, LocalDate fechaNacimiento, String direccion, String distrito, String departamento, String pais) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.direccion = direccion;
        this.distrito = distrito;
        this.departamento = departamento;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getDistrito() {
        return distrito;
    }

    public String getDepartamento() {
        return departamento;
    }

    public String getPais() {
        return pais;
    }

    public  String obtenerNombreCompleto(){
        return nombre + " " + apellidoPaterno + " " + apellidoMaterno;
    }

    public  String obtenerDomicilio(){
        return direccion + ", " + distrito + ", " + departamento + ", " + pais;
    }
    public  int calcularEdad(){
        return LocalDate.now().getYear() - fechaNacimiento.getYear();
    }

}
