package com.upc.edu.pe.negocio;

import com.upc.edu.pe.exception.UsuarioNoEncontradoException;

public interface Usuario {

    public boolean validarUsuario(String usuario, String clave) throws UsuarioNoEncontradoException;

}
