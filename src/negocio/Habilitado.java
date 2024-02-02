package negocio;

import negocio.interfacesEnums.EstadoSocio;

public class Habilitado implements EstadoSocio{



	@Override
	public void pedirPrestamo(Socio c, String idEjemplar) {
		Ejemplar e = Biblioteca.devolverById(idEjemplar);
		if(e!=null && e.isEstado()) {
			int diaFinal;
			
			if(e.getClass().getSimpleName().equalsIgnoreCase("Libro")){
				diaFinal = 10;
			}
			else {
				diaFinal = 5;
			}
			Prestamo prestamo = new Prestamo(0,diaFinal,c,e);
			e.setEstado(false);
			c.setPrestamo(prestamo);
			System.out.println("Prestamo creado con exito");
		}
		else {System.out.println("No existe tal ejemplar o se encuentra prestado");}
	}

	@Override
	public void devolverLibro(Socio c) {
		Prestamo p = c.getPrestamo();
		if(p!=null) {
			p.getEjemplar().setEstado(true);
			c.agregarPrestamoAntiguo(p);
			c.setPrestamo(null);
			c.agregarPrestamoEnTiempo();
			System.out.println("Devolucion realizada con exito!");
		}
		else {
			System.out.println("No hay prestamo para tal socio");
		}
	}
	
	
	
	

}
