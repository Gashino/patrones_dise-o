package negocio;

import negocio.interfacesEnums.EstadoSocio;
import negocio.interfacesEnums.StrategyComunicacion;
import java.util.ArrayList;
import java.util.List;
import static facade.socioController.existeSocio;
import static facade.menuFacade.scan;

public class Socio {
	private String nombre;
	private final String apellido;
	private final String dni;
	private final String nTelefono;
	private final String email;
	private Prestamo prestamo;
	private final StrategyComunicacion estrategiaComunicacion;
	private EstadoSocio estado;
	private int cantidadPrestamosEnTiempo;
	private List<Prestamo> antiguosPrestamos;
	
	public Socio(String nombre, String apellido, String dni, String nTelefono, String email,
			StrategyComunicacion estrategiaComunicacion) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.nTelefono = nTelefono;
		this.email = email;
		this.estrategiaComunicacion = estrategiaComunicacion;
		this.estado = new Habilitado();
		this.cantidadPrestamosEnTiempo=0;
		this.antiguosPrestamos= new ArrayList<>();
	}
	
	
	public void pedirPrestamo(String idEjemplar) {
		estado.pedirPrestamo(this, idEjemplar);
		
	}
	
	public void devolverLibro() {
		
		this.estado.devolverLibro(this);
	}

	public void cambiarState() {
		if (this.estado instanceof Habilitado) {
			this.estado = new Suspendido();
		} else {
			this.estado = new Habilitado();
		}
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

	
	public void setPrestamo(Prestamo p) {
		this.prestamo=p;
	}
	

	public StrategyComunicacion getEstrategiaComunicacion() {
		return estrategiaComunicacion;
	}




	@Override
	public String toString() {
		return "Socio [nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nTelefono=" + nTelefono
				+ ", email=" + email + "]";
	}


	public String getDni() {
		return dni;
	}

	
	
	public void agregarPrestamoAntiguo(Prestamo p) {
		antiguosPrestamos.add(p);
	}


	public List<Prestamo> getAntiguosPrestamos() {
		return antiguosPrestamos;
	}


	public void setAntiguosPrestamos(List<Prestamo> antiguosPrestamos) {
		this.antiguosPrestamos = antiguosPrestamos;
	}


	public Prestamo getPrestamo() {
		return prestamo;
	}
	
	public void agregarPrestamoEnTiempo() {
		this.cantidadPrestamosEnTiempo++;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

}
