package com.upc.edu.pe.inicial;

import com.upc.edu.pe.entidad.Asesor;
import com.upc.edu.pe.entidad.Cliente;
import com.upc.edu.pe.entidad.Factura;
import com.upc.edu.pe.entidad.Persona;
import com.upc.edu.pe.negocio.DocumentoPago;
import com.upc.edu.pe.negocio.Empresa;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class Principal {



    static Empresa empresa = new Empresa(5);
    static DocumentoPago documentoPago = new DocumentoPago(10);

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
                "San Isidro", "Lima", "Perú", "CI25898",
                "Av. 2 de Mayo 787, San Isidro, Lima, Perú",
                "Trio Stand Alone", LocalDate.of(1900,Month.SEPTEMBER, 15));

        Persona clienteDos = new Cliente("Patricia", "Cortez", "Huaman",
                "DNI", "45675456", LocalDate.of(1991, Month.MAY, 12),
                30, "Mz V, Lt 8, Urb. Pachacamac",
                "Villa el Salvador", "Lima", "Perú", "CI89765",
                "Mz V, Lt 8, Urb. Pachacamac, Villa el Salvador, Lima, Perú",
                "Móvil Postpago Control", LocalDate.of(1900,Month.SEPTEMBER, 15));

        Persona clienteTres = new Cliente("William", "Navarro", "Vargas",
                "CEX", "114567876", LocalDate.of(1985, Month.APRIL, 24),
                35, "Av. Los Jardines 201",
                "San Juan de Miraflores", "Lima", "Perú", "CI98767",
                "Av. Los Jardines 201, San Juan de Miraflores, Lima, Perú",
                "Duo Cable + Internet", LocalDate.of(1900,Month.JUNE, 30));

        empresa.registrarPersona(clienteUno);
        empresa.registrarPersona(clienteDos);
        empresa.registrarPersona(clienteTres);


    }

    public  static void cargarFactura(){
        Factura facturaUno = new Factura("FACTURA","F374829289",
                "CI25898", LocalDate.of(2021,Month.JANUARY, 15),
                LocalDate.of(2021,Month.FEBRUARY, 15), 165.80, "", "Pagado");

        Factura facturaDos = new Factura("FACTURA","F374829290",
                "CI25898", LocalDate.of(2021,Month.FEBRUARY, 15),LocalDate.of(2021,Month.MARCH, 15), 165.80, "","Pagado");

        Factura facturaTres = new Factura("FACTURA","F374829291",
                "CI25898",
                LocalDate.of(2021,Month.MARCH, 15),LocalDate.of(2021,Month.APRIL, 15), 165.80, "", "Pendiente");


        Factura facturaCuatro = new Factura("FACTURA","CI89765",
                "CI89765",
                LocalDate.of(2020,Month.DECEMBER, 15),LocalDate.of(2021,Month.JANUARY, 15), 45.50,"", "Disputa");
        Factura facturaCinco = new Factura("FACTURA","F789876569",
                "CI89765",
                LocalDate.of(2021,Month.JANUARY, 15),LocalDate.of(2021,Month.FEBRUARY, 15), 45.50, "", "Pagado");
        Factura facturaSeis = new Factura("FACTURA","F789876570",
                "CI89765",
                LocalDate.of(2021,Month.FEBRUARY, 15),LocalDate.of(2021,Month.MARCH, 15), 45.50, "", "Pagado");
        Factura facturaSiete = new Factura("FACTURA","F789876571",
                "CI89765",
                LocalDate.of(2021,Month.MARCH, 15),LocalDate.of(2021,Month.APRIL, 15), 45.50, "", "Pendiente");


        Factura facturaOcho = new Factura("FACTURA","F656898761",
                "CI98767",
                LocalDate.of(2021,Month.JANUARY, 15),LocalDate.of(2021,Month.FEBRUARY, 15), 120, "","Pagado");
        Factura facturaNueve = new Factura("FACTURA","F656898762",
                "CI98767",
                LocalDate.of(2021,Month.FEBRUARY, 15),LocalDate.of(2021,Month.MARCH, 15), 120,"", "Pagado");
        Factura facturaDiez = new Factura("FACTURA","F656898763",
                "CI98767",
                LocalDate.of(2021,Month.MARCH, 15),LocalDate.of(2021,Month.APRIL, 15), 120,"", "Pagado");


        documentoPago.registrarFactura(facturaUno);
        documentoPago.registrarFactura(facturaDos);
        documentoPago.registrarFactura(facturaTres);
        documentoPago.registrarFactura(facturaCuatro);
        documentoPago.registrarFactura(facturaCinco);
        documentoPago.registrarFactura(facturaSeis);
        documentoPago.registrarFactura(facturaSiete);
        documentoPago.registrarFactura(facturaOcho);
        documentoPago.registrarFactura(facturaNueve);
        documentoPago.registrarFactura(facturaDiez);



    }

    public static void main(String[] args) {

        cargarAsesor();
        cargarCliente();
        cargarFactura();




        for (Persona persona: empresa.getPersonas()) {
           System.out.println(persona);
        }

        for (Factura factura: documentoPago.getFacturas()) {
            System.out.println(factura);
        }

        /*String usuario;
        String clave;

        Scanner sn = new Scanner(System.in);

        System.out.println("Ingrese su usuario:");

        usuario = sn.nextLine();

        System.out.println("Ingrese su contraseña:");

        clave = sn.nextLine();

        System.out.println(usuario + " " + clave);*/




        /*boolean salir = false;
        int opcion; //Guardaremos la opcion del usuario

        while (!salir) {

            System.out.println("1. Opcion 1");
            System.out.println("2. Opcion 2");
            System.out.println("3. Opcion 3");
            System.out.println("4. Salir");

            try {

                System.out.println("Escribe una de las opciones");
                opcion = sn.nextInt();

                switch (opcion) {
                    case 1:
                        System.out.println("Has seleccionado la opcion 1");
                        break;
                    case 2:
                        System.out.println("Has seleccionado la opcion 2");
                        break;
                    case 3:
                        System.out.println("Has seleccionado la opcion 3");
                        break;
                    case 4:
                        salir = true;
                        break;
                    default:
                        System.out.println("Solo números entre 1 y 4");
                }
            } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
        }*/
    }
}
