package com.upc.edu.pe.initial;

import com.upc.edu.pe.exception.*;
import com.upc.edu.pe.expose.*;
import com.upc.edu.pe.expose.DocumentoEmpresa;
import com.upc.edu.pe.expose.Empresa;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Principal {


    static Empresa empresa = new Empresa(5);
    static DocumentoEmpresa documentoEmpresa = new DocumentoEmpresa(15);

    public static void cargarAsesor() {
        Persona asesorUno = new Asesor("Carlos Alberto", "Torres", "Miranda",
                "DNI", "47876890", LocalDate.of(1990, Month.FEBRUARY, 16),
                "Av. Los Jardines 456", "Miraflores", "Lima",
                "Perú", "ctorres", "Peru123.", "AS0001");

        Persona asesorDos = new Asesor("Daniel", "Rojas", "Escobedo",
                "CEX", "09876545", LocalDate.of(1987, Month.AUGUST, 10),
                "Av. Los Lima 123", "Villa Maria del Triunfo", "Lima",
                "Perú", "drojas", "Peru123.", "AS0002");

        empresa.registrarPersona(asesorUno);
        empresa.registrarPersona(asesorDos);
    }
    public static void cargarCliente() {
        Persona clienteUno = new Cliente("Adriana", "Cajas", "Cortez",
                "DNI", "70030460", LocalDate.of(1987, Month.SEPTEMBER, 4),
                "Av. 2 de Mayo 787",
                "San Isidro", "Lima", "Perú", "45767876",
                "Av. 2 de Mayo 787",
                "Trio Stand Alone", LocalDate.of(1900, Month.SEPTEMBER, 15));

        Persona clienteDos = new Cliente("Patricia", "Cortez", "Huaman",
                "DNI", "44487230", LocalDate.of(1991, Month.MAY, 12),
                "Mz V, Lt 8, Urb. Pachacamac",
                "Villa el Salvador", "Lima", "Perú", "45675456",
                "Mz V, Lt 8, Urb. Pachacamac",
                "Móvil Postpago Control", LocalDate.of(1900, Month.SEPTEMBER, 15));

        Persona clienteTres = new Cliente("William", "Navarro", "Vargas",
                "CEX", "114567876", LocalDate.of(1985, Month.APRIL, 24),
                "Av. Los Jardines 201",
                "San Juan de Miraflores", "Lima", "Perú", "CI98767",
                "Av. Los Jardines 201",
                "Duo Cable + Internet", LocalDate.of(1900, Month.JUNE, 30));

        empresa.registrarPersona(clienteUno);
        empresa.registrarPersona(clienteDos);
        empresa.registrarPersona(clienteTres);
    }
    public static void cargarRecibo() {

        Documento reciboUno = new Recibo("RECIBO", "R374829289",
                "70030460","", 165.80, "Pagado", LocalDate.of(2021, Month.JANUARY, 15),
                LocalDate.of(2021, Month.FEBRUARY, 15));
        Documento reciboDos = new Recibo("RECIBO", "R374829290",
                "70030460", "", 165.80, "Pagado", LocalDate.of(2021, Month.FEBRUARY, 15), LocalDate.of(2021, Month.MARCH, 15));
        Documento reciboTres = new Recibo("RECIBO", "R374829291",
                "70030460", "",165.80, "Pendiente",
                LocalDate.of(2021, Month.MARCH, 15), LocalDate.of(2021, Month.APRIL, 15));

        Documento reciboCuatro = new Recibo("RECIBO", "R789876568",
                "44487230","", 45.50, "Disputa",
                LocalDate.of(2020, Month.DECEMBER, 15), LocalDate.of(2021, Month.JANUARY, 15));
        Documento reciboCinco = new Recibo("RECIBO", "R789876569","45675456",
                "",45.50,"Pagado",
                LocalDate.of(2021, Month.JANUARY, 15), LocalDate.of(2021, Month.FEBRUARY, 15));
        Documento reciboSeis = new Recibo("RECIBO", "R789876570",
                "44487230","",45.50,"Pagado",
                LocalDate.of(2021, Month.FEBRUARY, 15), LocalDate.of(2021, Month.MARCH, 15));
        Documento reciboSiete = new Recibo("RECIBO", "R789876571",
                "44487230","", 45.50, "Pendiente",
                LocalDate.of(2021, Month.MARCH, 15), LocalDate.of(2021, Month.APRIL, 15));


        Documento reciboOcho = new Recibo("RECIBO", "R656898761",
                "114567876","", 120,"Pagado",
                LocalDate.of(2021, Month.JANUARY, 15), LocalDate.of(2021, Month.FEBRUARY, 15));
        Documento reciboNueve = new Recibo("RECIBO", "R656898762",
                "114567876","", 120, "Pagado",
                LocalDate.of(2021, Month.FEBRUARY, 15), LocalDate.of(2021, Month.MARCH, 15));
        Documento reciboDiez = new Recibo("RECIBO", "R656898763",
                "114567876","", 120,"Pagado",
                LocalDate.of(2021, Month.MARCH, 15), LocalDate.of(2021, Month.APRIL, 15));


        documentoEmpresa.registrarDocumento(reciboUno);
        documentoEmpresa.registrarDocumento(reciboDos);
        documentoEmpresa.registrarDocumento(reciboTres);
        documentoEmpresa.registrarDocumento(reciboCuatro);
        documentoEmpresa.registrarDocumento(reciboCinco);
        documentoEmpresa.registrarDocumento(reciboSeis);
        documentoEmpresa.registrarDocumento(reciboSiete);
        documentoEmpresa.registrarDocumento(reciboOcho);
        documentoEmpresa.registrarDocumento(reciboNueve);
        documentoEmpresa.registrarDocumento(reciboDiez);


    }
    public static boolean AutenticarAsesor(String usuario, String clave) throws UsuarioNoEncontradoException {
        boolean autenticar = false;
        for (Persona persona : empresa.getPersonas()
        ) {

            Asesor asesor = (Asesor) persona;
            autenticar = asesor.validarUsuario(usuario, clave);

            if (autenticar == true)
                return autenticar;
        }
        return autenticar;
    }
    public static ArrayList<Documento> obtenerDocumento(String codigoCliente, String tipoDocumento, String estado) {
        return documentoEmpresa.getDocumentos(codigoCliente, tipoDocumento, estado);
    }
    public static ArrayList<Documento> obtenerDocumento(String codigoCliente, String tipoDocumento) {
        return documentoEmpresa.getDocumentos(codigoCliente, tipoDocumento);
    }
    public static double sumarRecibo(ArrayList<Documento> recibos){
        double suma = 0;
        for (Documento recibo: recibos
             ) {

            suma=suma + recibo.getMonto();
        }
        return suma;
    }
    public  static  void registrarSolicitudFraccionamiento(Fraccionamiento solicitudfraccionamiento) throws FraccionamientoExistenteException,
            ReciboMontoDisputaExeption, ReciboPendienteNoEncontradoException {

        ArrayList<Documento> solicitudes = obtenerDocumento(solicitudfraccionamiento.getCodigoCliente(), solicitudfraccionamiento.getTipoDocumento(),
                solicitudfraccionamiento.getEstado());

        if (!solicitudes.isEmpty()){
            throw new FraccionamientoExistenteException("Ya tiene una solicitud de fraccionamiento ingresada.");
        }else{

            ArrayList<Documento> recibos = obtenerDocumento(solicitudfraccionamiento.getCodigoCliente(), "RECIBO", "Disputa");

            if (!recibos.isEmpty()){
                throw new ReciboMontoDisputaExeption("Usted tiene " + recibos.size() + " recibo(s) con monto en disputa. No puede presentar una solicitud de fraccionamiento de deuda.");
            }else {
                recibos = obtenerDocumento(solicitudfraccionamiento.getCodigoCliente(), "RECIBO", "Pendiente");
                if (recibos.isEmpty()){
                    throw new ReciboPendienteNoEncontradoException("Usted no cuenta con recibos pendientes de pago. No puede presentar una solicitud de fraccionamiento de deuda.");
                }else{

                    double totalMontoRecibo = sumarRecibo(recibos);
                    double montoDescuento = 0;
                    int numeroCuota = 0;
                    double montoCuota = 0;

                    Fraccionamiento fraccionamiento = new Fraccionamiento(solicitudfraccionamiento.getTipoDocumento(),
                            solicitudfraccionamiento.generarNumeroDocumento(), solicitudfraccionamiento.getCodigoCliente(),
                            solicitudfraccionamiento.getDescripcion(),0, solicitudfraccionamiento.getEstado(), solicitudfraccionamiento.getFechaSolicitud(),
                            totalMontoRecibo, 0,0, 0 );

                    montoDescuento = fraccionamiento.calcularMontoDescuento();
                    fraccionamiento.setMontoDescuento(montoDescuento);
                    numeroCuota =fraccionamiento.calcularNumeroCuota();
                    fraccionamiento.setNumeroCuota(numeroCuota);
                    montoCuota = fraccionamiento.calcularMontoCuota();
                    fraccionamiento.setMontoCuota(montoCuota);
                    fraccionamiento.setMonto(totalMontoRecibo-montoDescuento);
                    documentoEmpresa.registrarDocumento(fraccionamiento);

                    System.out.println(fraccionamiento);
                }
            }
        }
    }
    public  static  boolean buscarCliente(String numeroDocumentoCliente){
        boolean econtrar = false;
        for (Persona persona: empresa.getPersonas()
             ) {
            if(persona.getNumeroDocumento().equals(numeroDocumentoCliente)){
                econtrar = true;
                System.out.println(persona);
            }
        }

        if (econtrar == false)
            System.out.println("La persona buscada no es cliente de la empresa.");

        return econtrar;
    }
    public static void main(String[] args) throws UsuarioNoEncontradoException {

        cargarAsesor();
        cargarCliente();
        cargarRecibo();

        String usuario;
        String clave;
        String numeroDocumentoCliente;
        String tipoDocumento;
        ArrayList<Documento> documentos;
        boolean autenticar = false;
        boolean salir = false;
        int opcionSeleccionada;

        Scanner sn = new Scanner(System.in);
        System.out.println("Ingrese su usuario:");
        usuario = sn.nextLine();
        System.out.println("Ingrese su contraseña:");
        clave = sn.nextLine();

        try {
            AutenticarAsesor(usuario, clave);
            while (!salir) {
                try {
                    System.out.println("\n");
                    System.out.println("--------------Menu de opciones--------------");
                    System.out.println("1. Consulta de cliente");
                    System.out.println("2. Registro de fraccionamiento de deuda");
                    System.out.println("3. Consulta de recibos");
                    System.out.println("4. Consulta de fraccionamiento");
                    System.out.println("5. Salir");
                    System.out.println("--------------------------------------------");
                    System.out.println("Por favor seleccione una de las opciones...");
                    System.out.println("--------------------------------------------");

                    opcionSeleccionada = sn.nextInt();
                    Scanner sc = new Scanner(System.in);
                    switch (opcionSeleccionada) {
                        case 1:
                            System.out.println("Ingrese número de documento del cliente:");
                            numeroDocumentoCliente = sc.nextLine();
                            buscarCliente(numeroDocumentoCliente);
                            break;
                        case 2:
                            System.out.println("Ingrese número de documento del cliente:");
                            numeroDocumentoCliente = sc.nextLine();

                            if(buscarCliente(numeroDocumentoCliente)){
                                Fraccionamiento fraccionamiento = new Fraccionamiento("FRACCIONAMIENTO",
                                        "",
                                        numeroDocumentoCliente,"",0,"Pendiente", LocalDate.now(), 0,
                                        0, 0, 0);
                                registrarSolicitudFraccionamiento(fraccionamiento);
                                System.out.println("Se registro la solicitud de fraccionamiento de forma correcta.");
                            };
                            break;
                        case 3:
                            System.out.println("Ingrese número de documento del cliente:");
                            numeroDocumentoCliente = sc.nextLine();

                            if(buscarCliente(numeroDocumentoCliente)){
                                tipoDocumento = "RECIBO";
                                documentos = obtenerDocumento(numeroDocumentoCliente, tipoDocumento);

                                if(documentos.isEmpty()){
                                    throw new DocumentoNoEncontradoException("No se han encontrado recibos para el cliente.");
                                }else{
                                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                                    for (Documento documento:documentos
                                    ) {
                                        System.out.println(documento);
                                    }
                                }
                            }
                            break;
                        case 4:
                            System.out.println("Ingrese número de documento del cliente:");
                            numeroDocumentoCliente = sc.nextLine();
                            tipoDocumento = "FRACCIONAMIENTO";
                            if(buscarCliente(numeroDocumentoCliente)){
                                documentos = obtenerDocumento(numeroDocumentoCliente, tipoDocumento);

                                if(documentos.isEmpty()){
                                    throw new DocumentoNoEncontradoException("No se han encontrado solicitudes de fraccionamiento para el cliente.");

                                }else{
                                    System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
                                    for (Documento documento:documentos
                                    ) {
                                        System.out.println(documento);
                                    }
                                }
                            }
                            break;
                        case 5:
                            salir = true;
                            break;
                        default:
                            System.out.println("Esta opción no se encuentra disponible");
                    }
                }catch (InputMismatchException ex) {
                    System.out.println("Por favor seleccione una opción del menú");
                    sn.next();
                } catch (ReciboPendienteNoEncontradoException ex) {
                    System.out.println(ex.getMessage());
                }catch (FraccionamientoExistenteException ex) {
                    System.out.println(ex.getMessage());
                }catch (ReciboMontoDisputaExeption ex) {
                    System.out.println(ex.getMessage());
                }catch (DocumentoNoEncontradoException ex) {
                    System.out.println(ex.getMessage());
                }catch (Exception ex) {
                    System.out.println("Error no controlado: " + ex.getMessage());
                }
            }

        } catch (UsuarioNoEncontradoException ex) {
            System.out.println(ex.getMessage());
        }catch (Exception ex) {
            System.out.println("Error no controlado: " + ex.getMessage());
        }
    }
}
