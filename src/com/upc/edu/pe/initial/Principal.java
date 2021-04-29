package com.upc.edu.pe.initial;

import com.upc.edu.pe.expose.*;
import com.upc.edu.pe.exception.FacturaMontoDisputaExeption;
import com.upc.edu.pe.exception.FacturaPendienteNoEncontradaException;
import com.upc.edu.pe.exception.FraccionamientoExistenteException;
import com.upc.edu.pe.exception.UsuarioNoEncontradoException;
import com.upc.edu.pe.expose.DocumentoPago;
import com.upc.edu.pe.expose.Empresa;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Principal {


    static Empresa empresa = new Empresa(5);
    static DocumentoPago documentoPago = new DocumentoPago(15);

    public static void cargarAsesor() {

        Persona asesorUno = new Asesor("Carlos Alberto", "Torres", "Miranda",
                "DNI", "47876890", LocalDate.of(1990, Month.FEBRUARY, 16),
                31, "Av. Los Jardines 456", "Miraflores", "Lima",
                "Perú", "ctorres", "Peru123.", "AS0001");

        Persona asesorDos = new Asesor("Daniel", "Rojas", "Escobedo",
                "CEX", "09876545", LocalDate.of(1987, Month.AUGUST, 10),
                33, "Av. Los Lima 123", "Villa Maria del Triunfo", "Lima",
                "Perú", "drojas", "Peru123.", "AS0002");

        empresa.registrarPersona(asesorUno);
        empresa.registrarPersona(asesorDos);

    }

    public static void cargarCliente() {
        Persona clienteUno = new Cliente("Adriana", "Cajas", "Cortez",
                "DNI", "45767876", LocalDate.of(1987, Month.SEPTEMBER, 4),
                33, "Av. 2 de Mayo 787",
                "San Isidro", "Lima", "Perú", "45767876",
                "Av. 2 de Mayo 787, San Isidro, Lima, Perú",
                "Trio Stand Alone", LocalDate.of(1900, Month.SEPTEMBER, 15));

        Persona clienteDos = new Cliente("Patricia", "Cortez", "Huaman",
                "DNI", "45675456", LocalDate.of(1991, Month.MAY, 12),
                30, "Mz V, Lt 8, Urb. Pachacamac",
                "Villa el Salvador", "Lima", "Perú", "45675456",
                "Mz V, Lt 8, Urb. Pachacamac, Villa el Salvador, Lima, Perú",
                "Móvil Postpago Control", LocalDate.of(1900, Month.SEPTEMBER, 15));

        Persona clienteTres = new Cliente("William", "Navarro", "Vargas",
                "CEX", "114567876", LocalDate.of(1985, Month.APRIL, 24),
                35, "Av. Los Jardines 201",
                "San Juan de Miraflores", "Lima", "Perú", "CI98767",
                "Av. Los Jardines 201, San Juan de Miraflores, Lima, Perú",
                "Duo Cable + Internet", LocalDate.of(1900, Month.JUNE, 30));

        empresa.registrarPersona(clienteUno);
        empresa.registrarPersona(clienteDos);
        empresa.registrarPersona(clienteTres);


    }

    public static void cargarFactura() {
        Factura facturaUno = new Factura("FACTURA", "F374829289",
                "45767876","", 165.80, "Pagado", LocalDate.of(2021, Month.JANUARY, 15),
                LocalDate.of(2021, Month.FEBRUARY, 15));
        Factura facturaDos = new Factura("FACTURA", "F374829290",
                "45767876", "", 165.80, "Pagado", LocalDate.of(2021, Month.FEBRUARY, 15), LocalDate.of(2021, Month.MARCH, 15));
        Factura facturaTres = new Factura("FACTURA", "F374829291",
                "45767876", "",165.80, "Pendiente",
                LocalDate.of(2021, Month.MARCH, 15), LocalDate.of(2021, Month.APRIL, 15));


        Factura facturaCuatro = new Factura("FACTURA", "F789876568",
                "45675456","", 45.50, "Disputa",
                LocalDate.of(2020, Month.DECEMBER, 15), LocalDate.of(2021, Month.JANUARY, 15));
        Factura facturaCinco = new Factura("FACTURA", "F789876569","45675456",
                "",45.50,"Pagado",
                LocalDate.of(2021, Month.JANUARY, 15), LocalDate.of(2021, Month.FEBRUARY, 15));
        Factura facturaSeis = new Factura("FACTURA", "F789876570",
                "45675456","",45.50,"Pagado",
                LocalDate.of(2021, Month.FEBRUARY, 15), LocalDate.of(2021, Month.MARCH, 15));
        Factura facturaSiete = new Factura("FACTURA", "F789876571",
                "45675456","", 45.50, "Pendiente",
                LocalDate.of(2021, Month.MARCH, 15), LocalDate.of(2021, Month.APRIL, 15));


        Factura facturaOcho = new Factura("FACTURA", "F656898761",
                "114567876","", 120,"Pagado",
                LocalDate.of(2021, Month.JANUARY, 15), LocalDate.of(2021, Month.FEBRUARY, 15));
        Factura facturaNueve = new Factura("FACTURA", "F656898762",
                "114567876","", 120, "Pagado",
                LocalDate.of(2021, Month.FEBRUARY, 15), LocalDate.of(2021, Month.MARCH, 15));
        Factura facturaDiez = new Factura("FACTURA", "F656898763",
                "114567876","", 120,"Pagado",
                LocalDate.of(2021, Month.MARCH, 15), LocalDate.of(2021, Month.APRIL, 15));


        documentoPago.registrarDocumento(facturaUno);
        documentoPago.registrarDocumento(facturaDos);
        documentoPago.registrarDocumento(facturaTres);
        documentoPago.registrarDocumento(facturaCuatro);
        documentoPago.registrarDocumento(facturaCinco);
        documentoPago.registrarDocumento(facturaSeis);
        documentoPago.registrarDocumento(facturaSiete);
        documentoPago.registrarDocumento(facturaOcho);
        documentoPago.registrarDocumento(facturaNueve);
        documentoPago.registrarDocumento(facturaDiez);


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
        return documentoPago.getDocumentos(codigoCliente, tipoDocumento, estado);
    }

    public static double sumarFactura(ArrayList<Documento> facturas){
        double suma = 0;
        for (Documento factura: facturas
             ) {

            suma=suma + factura.getMonto();
        }

        return suma;
    }

    public  static  void registrarSolicitudFraccionamiento(Fraccionamiento solicitudfraccionamiento) throws FraccionamientoExistenteException,
            FacturaMontoDisputaExeption, FacturaPendienteNoEncontradaException {

        ArrayList<Documento> solicitudes = obtenerDocumento(solicitudfraccionamiento.getCodigoCliente(), solicitudfraccionamiento.getTipoDocumento(),
                solicitudfraccionamiento.getEstado());

        if (!solicitudes.isEmpty()){
            throw new FraccionamientoExistenteException("Ya tiene una solicitud de fraccionamiento ingresada.");
        }else{

            ArrayList<Documento> facturas = obtenerDocumento(solicitudfraccionamiento.getCodigoCliente(), "FACTURA", "Disputa");

            if (!facturas.isEmpty()){
                throw new FacturaMontoDisputaExeption("Usted tiene " + facturas.size() + " factura(s) con monto en disputa. No puede presentar una solicitud de fraccionamiento de deuda.");
            }else {
                facturas = obtenerDocumento(solicitudfraccionamiento.getCodigoCliente(), "FACTURA", "Pendiente");
                if (facturas.isEmpty()){
                    throw new FacturaPendienteNoEncontradaException("Usted no cuenta con facturas pendientes de pago. No puede presentar una solicitud de fraccionamiento de deuda.");
                }else{

                    double totalMontoFactura = sumarFactura(facturas);
                    double montoDescuento = 0;
                    int numeroCuota = 0;
                    double montoCuota = 0;

                    Fraccionamiento fraccionamiento = new Fraccionamiento(solicitudfraccionamiento.getTipoDocumento(),
                            solicitudfraccionamiento.getNumeroDocumento(), solicitudfraccionamiento.getCodigoCliente(),
                            solicitudfraccionamiento.getDescripcion(),0, solicitudfraccionamiento.getEstado(), solicitudfraccionamiento.getFechaSolicitud(),
                            totalMontoFactura, 0,0, 0 );

                    montoDescuento = fraccionamiento.getMontoDescuento();
                    fraccionamiento.setMontoDescuento(montoDescuento);
                    numeroCuota =fraccionamiento.getNumeroCuota();
                    fraccionamiento.setNumeroCuota(numeroCuota);
                    montoCuota = fraccionamiento.getMontoCuota();
                    fraccionamiento.setMontoCuota(montoCuota);
                    fraccionamiento.setMonto(totalMontoFactura-montoDescuento);
                    fraccionamiento.setEstado("Pendiente");
                    documentoPago.registrarDocumento(fraccionamiento);

                    System.out.println(fraccionamiento);

                }
            }
        }
    }

    public  static  void buscarCliente(String numeroDocumentoCliente){
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

    }

    public static void main(String[] args) throws UsuarioNoEncontradoException {

        cargarAsesor();
        cargarCliente();
        cargarFactura();

        String usuario;
        String clave;
        String numeroDocumentoCliente;
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
                    System.out.println("3. Consulta de facturas");
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

                            Fraccionamiento fraccionamiento = new Fraccionamiento("FRACCIONAMIENTO", "65646463",
                                    numeroDocumentoCliente,"",0,"Pendiente", LocalDate.now(), 0,
                                    0, 0, 0);
                            registrarSolicitudFraccionamiento(fraccionamiento);
                            System.out.println("Se registro la solicitud correctamente");
                            break;
                        case 3:
                            System.out.println("Has seleccionado la opcion 3");
                            break;
                        case 4:
                            System.out.println("Has seleccionado la opcion 4");
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
                } catch (FacturaPendienteNoEncontradaException ex) {
                    System.out.println(ex.getMessage());
                }catch (FraccionamientoExistenteException ex) {
                    System.out.println(ex.getMessage());
                }catch (FacturaMontoDisputaExeption ex) {
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