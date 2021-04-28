package com.upc.edu.pe.negocio;

import com.upc.edu.pe.entidad.Factura;
import com.upc.edu.pe.entidad.Persona;

public class DocumentoPago {

    private Factura[] facturas;
    private int cantidad;

    public DocumentoPago(int numeroElementos) {
        facturas = new Factura[numeroElementos];
        cantidad = 0;
    }

    public void registrarFactura(Factura factura) {
        facturas[cantidad] = factura;
        cantidad++;
    }

    public Factura[] getFacturas() {
        return facturas;
    }


}
