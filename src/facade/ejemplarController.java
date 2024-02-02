package facade;

import negocio.Ejemplar;
import negocio.factorias.FactoryDiario;
import negocio.factorias.FactoryLibro;
import negocio.factorias.FactoryRevista;
import negocio.factorias.FactoryRevistaEspecializada;
import negocio.interfacesEnums.FactoryEjemplares;

import java.util.List;
import java.util.NoSuchElementException;

import static facade.menuFacade.*;

public class ejemplarController {
    public static void cargarEjemplar() {
        FactoryEjemplares factory;
        Ejemplar ejemplar = null;

        System.out.println("---Seleccionar tipo de ejemplar---");
        System.out.println("1)Libro, 2)Revista, 3)Revista Especializada 4)Diario");
        int seleccion = scan.nextInt();

        ejemplar = switch (seleccion) {
            case 1 -> {
                factory = new FactoryLibro();
                yield factory.crearEjemplar();
            }
            case 2 -> {
                factory = new FactoryRevista();
                yield factory.crearEjemplar();
            }
            case 3 -> {
                factory = new FactoryRevistaEspecializada();
                yield factory.crearEjemplar();
            }
            case 4 -> {
                factory = new FactoryDiario();
                yield factory.crearEjemplar();
            }
		default -> throw new IllegalArgumentException("Unexpected value: " + seleccion);
        };

        System.out.println("Ingresar titulo");
        String titulo = scan.next();
        System.out.println("Ingresar autor");
        String autor = scan.next();
        System.out.println("Ingresar fecha de publicacon formato (YYYY-MM-DD)");
        String fechaPublicacion = scan.next();
        System.out.println("Ingresar ID ejemplar");
        String idEjemplar = scan.next();
        String genero;

        assert ejemplar != null;
        ejemplar.setTitulo(titulo);
        ejemplar.setAutor(autor);
        ejemplar.setFechaPublicacion(fechaPublicacion);
        ejemplar.setIdEjemplar(idEjemplar);

        bib.agregarEjemplar(ejemplar);

        System.out.println("Ejemplar agregado con EXITO!");

    }

    public static void buscarEjemplar() {
        try {
            realizarBusqueda();
        } catch (NullPointerException | NoSuchElementException e) {
            System.out.println("Error durante la búsqueda: " + e.getMessage());
        }
    }

    private static void realizarBusqueda() {
        System.out.println("Buscar por:\n 1) Título\n 2) Categoría\n 3) Autor\n 4) Fecha");
        int seleccion = scan.nextInt();

        switch (seleccion) {
            case 1:
                System.out.println("Ingresar título:");
                scan.nextLine();
                String tituloBusqueda = scan.nextLine();
                buscador.buscarPorTitulo(tituloBusqueda);
                break;
            case 2:
                System.out.println("Ingresar categoría (Libro, Revista, Revista Especializada, Diario):");
                scan.nextLine();
                String categoriaBusqueda = scan.nextLine();
                buscador.buscarPorCategoria(categoriaBusqueda);
                break;
            case 3:
                System.out.println("Ingresar autor:");
                scan.nextLine();
                String autorBusqueda = scan.nextLine();
                buscador.buscarPorAutor(autorBusqueda);
                break;
            case 4:
                System.out.println("Ingresar fecha (YYYY-MM-DD):");
                scan.nextLine();
                String fechaBusqueda = scan.nextLine();
                buscador.buscarPorFecha(fechaBusqueda);
                break;
            default:
                System.out.println("Selección no válida. Introduce un número del 1 al 4.");
        }

    }


}