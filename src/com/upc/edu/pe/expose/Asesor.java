package com.upc.edu.pe.expose;

import com.upc.edu.pe.exception.UsuarioNoEncontradoException;

import java.time.LocalDate;

public class Asesor extends Persona implements Usuario {

    public String codigoAsesor;
    public String usuario;
    public String clave;

    public Asesor() {

    }

    public Asesor(String nombre, String apellidoPaterno, String apellidoMaterno, String tipoDocumento, String numeroDocumento, LocalDate fechaNacimiento, String direccion, String distrito, String departamento, String pais, String usuario, String clave, String codigoAsesor) {
        super(nombre, apellidoPaterno, apellidoMaterno, tipoDocumento, numeroDocumento, fechaNacimiento, direccion, distrito, departamento, pais);
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
    public boolean validarUsuario(String usuario, String clave) throws UsuarioNoEncontradoException {

        String usuarioAsesor = getUsuario();
        String claveUsuario = getClave();

        if(usuario.equals(usuarioAsesor) && claveUsuario.equals(clave))
            return true;
        else
            throw new UsuarioNoEncontradoException("Usuario o clave incorrectos");
    }
}
