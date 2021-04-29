package com.upc.edu.pe.expose;

public class Empresa {

    private Persona[] personas;
    private int cantidad;


    public Empresa(int numeroElementos) {
        personas = new Persona[numeroElementos];
        cantidad = 0;
    }

    public void registrarPersona(Persona persona) {
        personas[cantidad] = persona;
        cantidad++;
    }

    public Persona[] getPersonas() {
        return personas;
    }

}
