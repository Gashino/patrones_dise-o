package facade;

import negocio.Biblioteca;
import negocio.BuscadorAdapter;
import negocio.Calendario;

import java.util.Scanner;

import static facade.ejemplarController.buscarEjemplar;
import static facade.ejemplarController.cargarEjemplar;
import static facade.prestamoController.*;
import static facade.socioController.actualizarUsuario;
import static facade.socioController.cargarSocio;
import static facade.timeController.proximoDia;

public class menuFacade {
    // Métodos para mostrar diferentes tipos de menús

    static Biblioteca bib = new Biblioteca();
    public static Scanner scan = new Scanner(System.in);
    static Calendario calendario = new Calendario(1);
    static BuscadorAdapter buscador = new BuscadorAdapter();

    public static void main(String[] args) {

        System.out.println("DIA: "+calendario.getCurrentTime());

        mostrarOpciones();
        int respuesta = scan.nextInt();

        switch (respuesta) {
            case 1:
                cargarSocio();
                main(args);
                break;
            case 2:
                cargarEjemplar();
                main(args);
                break;
            case 3:
                buscarEjemplar();
                main(args);
                break;
            case 4:
                crearPrestamo();
                main(args);
                break;
            case 5:
                devolverPrestamo();
                main(args);
                break;
            case 6:
                actualizarPlazoPrestamo();
                main(args);
                break;
            case 7:
                verPrestamoSocio();
                main(args);
                break;
            case 8:
                verHistorialPrestamos();
                main(args);
                break;
            case 9:
                actualizarUsuario();
                main(args);
                break;
            case 10:
                proximoDia();
                main(args);
                break;
            case 11:
                System.out.println("FINALIZANDO SESION...");
                break;
            default:
            	System.out.println("Ingresar opcion valida");
            	main(args);
            	break;

        }


    }


    public static void mostrarOpciones() {
        System.out.println("-------------------------------------");
        System.out.println("1) CARGAR SOCIO");
        System.out.println("2) CARGAR EJEMPLAR");
        System.out.println("3) BUSCAR EJEMPLAR");
        System.out.println("4) CREAR PRESTAMO");
        System.out.println("5) DEVOLVER PRESTAMO");
        System.out.println("6) ACTUALIZAR DIAS DE ENTREGA");
        System.out.println("7) VER PRESTAMOS SOCIO");
        System.out.println("8) VER HISTORIAL DE SOCIO");
        System.out.println("9) ACTUALIZAR INFORMACION SOCIO");
        System.out.println("10) PROXIMO DIA");
        System.out.println("11) FINALIZAR SESION");
        System.out.println("-------------------------------------");
    }
}
