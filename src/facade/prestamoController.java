package facade;

import negocio.Prestamo;
import negocio.Socio;

import static facade.menuFacade.calendario;
import static facade.menuFacade.scan;
import static facade.socioController.existeSocio;

public class prestamoController {
    public static void crearPrestamo() {
        Prestamo prestamo = null;
        String dni;
        String idEjemplar;
        System.out.println("Ingresar DNI de socio: ");
        dni=scan.next();
        Socio s = existeSocio(dni);
        System.out.println("Ingresar ID de ejemplar: ");
        idEjemplar=scan.next();

        if(existeSocio(dni)!=null) {
            assert s != null;
            s.pedirPrestamo(idEjemplar);
            calendario.agregarPrestamo(s.getPrestamo());
        }
        else {
            System.out.println("No existe tal socio!");
        }


    }

    public static void devolverPrestamo() {
        String dni;
        System.out.println("Ingresar DNI de socio: ");
        dni = scan.next();
        Socio s = existeSocio(dni);
        if (s != null) {
            calendario.eliminarPrestamo(s.getPrestamo());
            s.devolverLibro();
        } else {
            System.out.println("No se encontró el socio con el DNI proporcionado.");
        }
    }


    public static void actualizarPlazoPrestamo() {
        String dni;
        int dias;

        System.out.println("Ingresar DNI de socio: ");
        dni = scan.next();
        Socio s = existeSocio(dni);

        try {
            if (s != null) {
                Prestamo prestamo = s.getPrestamo();

                if (prestamo != null) {
                    System.out.println("Ingresar cantidad de días extras para el préstamo del usuario " + s.getNombre().toUpperCase());
                    dias = scan.nextInt();

                    if (dias > 0) {
                        prestamo.setFechaFinalizacion(prestamo.getFechaFinalizacion() + dias);
                        System.out.println("OK");
                    } else {
                        System.out.println("La cantidad de días extras debe ser mayor que cero.");
                    }
                } else {
                    throw new NullPointerException("El socio no tiene un préstamo activo.");
                }
            } else {
                System.out.println("No existe el socio.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


    public static void verPrestamoSocio() {
        String dni;
        System.out.println("Ingresar DNI de socio");
        dni=scan.next();
        Socio s= existeSocio(dni);
        if(s!=null) {
            if(s.getPrestamo()!=null) {
                System.out.println("PRESTAMO DEL SOCIO: "+s.getPrestamo());
            }
            else {System.out.println("NO HAY PRESTAMO");}
        }
        else {System.out.println("NO EXISTE EL SOCIO");}
    }

    public static void verHistorialPrestamos() {
        String dni;
        System.out.println("Ingresar DNI de socio");
        dni=scan.next();
        Socio s= existeSocio(dni);
        if(s!=null) {
            if(!s.getAntiguosPrestamos().isEmpty()) {
                s.getAntiguosPrestamos().forEach(System.out::println);
            }
            else {System.out.println("NO HAY PRESTAMOS ANTIGUOS PARA EL SOCIO");}
        }
        else {System.out.println("NO EXISTE EL SOCIO");}
    }
}
