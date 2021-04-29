package com.upc.edu.pe.negocio;

import com.upc.edu.pe.entidad.Documento;
import com.upc.edu.pe.entidad.Factura;
import com.upc.edu.pe.entidad.Persona;
import sun.swing.BakedArrayList;

import java.util.ArrayList;

public class DocumentoPago {

    private Documento[] documentos;
    private int cantidad;

    public DocumentoPago(int numeroElementos) {
        documentos = new Documento[numeroElementos];
        cantidad = 0;
    }

    public void registrarDocumento(Documento documento) {
        documentos[cantidad] = documento;
        cantidad++;
    }

    public Documento[] getDocumentos() {
        return documentos;
    }

    public ArrayList<Documento> getDocumentos(String codigoCliente , String tipoDocumento, String estado) {

        ArrayList<Documento> documentosFiltrados = new ArrayList<>();

        for (Documento documento: documentos
             ) {

            if (documento != null){
                if (codigoCliente.equals(documento.getCodigoCliente()) && tipoDocumento.equals(documento.getTipoDocumento())
                        && estado.equals(documento.getEstado())){
                    documentosFiltrados.add(documento);
                }
            }
        }
        return documentosFiltrados;
    }

    public ArrayList<Documento> getDocumentos(String codigoCliente , String tipoDocumento) {

        ArrayList<Documento> documentosFiltrados = new ArrayList<>();

        for (Documento documento: documentos
        ) {

            if (documento != null) {
                if (codigoCliente.equals(documento.getCodigoCliente()) && tipoDocumento.equals(documento.getTipoDocumento())) {
                    documentosFiltrados.add(documento);
                }
            }
        }
        return documentosFiltrados;
    }


}
