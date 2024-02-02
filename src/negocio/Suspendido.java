package negocio;

import negocio.interfacesEnums.EstadoSocio;

public class Suspendido implements EstadoSocio{

	@Override
	public void pedirPrestamo(Socio c, String idEjemplar) {
		System.out.println("No se puede solicitar un prestamo en el estado SUSPENDIDO...");
		
	}

	@Override
	public void devolverLibro(Socio c) {
		System.out.println("No se puede devolver un prestamo en el estado SUSPENDIDO...");
		System.out.println("DEBE IR A LAS OFICINAS A HABLAR CON EL BIBLIOTECARIO PARA VOLVER A ESTAR HABILITADO");
	}

}
