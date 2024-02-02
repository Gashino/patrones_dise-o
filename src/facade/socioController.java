package facade;

import negocio.Socio;
import negocio.interfacesEnums.StrategyComunicacion;

import static facade.menuFacade.bib;
import static facade.menuFacade.scan;
import negocio.estrategias.*;


public class socioController {
    public static void cargarSocio() {

        System.out.print("Nombre: ");
        String nombre = scan.next();

        System.out.print("Apellido: ");
        String apellido = scan.next();

        System.out.print("DNI: ");
        String dni = scan.next();

        System.out.print("telefono: ");
        String nTelefono = scan.next();

        System.out.print("mail: ");
        String email = scan.next();

        StrategyComunicacion strat = null;

        System.out.println("Seleccionar medio de comunicacion favorito:");
        System.out.println("1)WhatsApp, 2)SMS, 3)Email");
        int strategy = scan.nextInt();


        strat = switch (strategy) {
            case 1 -> new Whatsapp();
            case 2 -> new Sms();
            case 3 -> new Email();
            default -> new Sms();
        };

        bib.agregarSocio(new Socio(nombre,apellido,dni,nTelefono,email,strat));



    }

    public static Socio existeSocio(String dni) {
        if (bib != null && bib.getSocios() != null) {
            for (Socio socio : bib.getSocios()) {
                if (socio.getDni().equalsIgnoreCase(dni)) {
                    return socio;
                }
            }
        }
        System.out.println("No se encontró el socio con DNI: " + dni);
        return null;

        }


    public static void actualizarUsuario() {
        String dni;
        System.out.println("Ingresar DNI de socio");
        dni=scan.next();
        Socio s= existeSocio(dni);
        if(s!=null) {
            System.out.println("Loggeando cambios realizados al cliente " + s.getNombre().toUpperCase() + "...");
        }
        else {System.out.println("Usuario no encontrado...");}
    }

}
