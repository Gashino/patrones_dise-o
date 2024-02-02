package negocio;

import java.util.ArrayList;
import java.util.List;

public class Calendario {
	private int fechaActual;
	private List<Prestamo> prestamos;
	
	
	public Calendario(int fechaActual) {
		this.fechaActual = fechaActual;
		this.prestamos = new ArrayList<>();
	}
	
	
	public int getCurrentTime() {
		return this.fechaActual;
	}

	public void notificar() {
		for (Prestamo prestamo : prestamos) {
			int diasRestantes = calcularDiasRestantes(prestamo);

			if (diasRestantes == 3) {
				notificarProximoVencimiento(prestamo);
			} else if (diasRestantes == 0) {
				notificarVencimiento(prestamo);
				prestamo.getSocio().cambiarState();
			}
		}
	}

	private int calcularDiasRestantes(Prestamo prestamo) {
		return prestamo.getFechaFinalizacion() - fechaActual;
	}

	private void notificarProximoVencimiento(Prestamo prestamo) {
		String mensaje = prestamo.getSocio().getNombre().toUpperCase() +
				" tiene un préstamo del libro " +
				prestamo.getEjemplar().getTitulo().toUpperCase() +
				" próximo a VENCER";
		prestamo.darAviso2Dias(mensaje);
	}

	private void notificarVencimiento(Prestamo prestamo) {
		String mensaje = prestamo.getSocio().getNombre().toUpperCase() +
				" tiene un préstamo del libro " +
				prestamo.getEjemplar().getTitulo().toUpperCase() +
				" VENCIDO";
		prestamo.darAvisoDemora(mensaje);
	}

	
	public void sumarDia() {
		this.fechaActual++;
	}
	
	public void agregarPrestamo(Prestamo p) {
		this.prestamos.add(p);
	}
	
	public void eliminarPrestamo(Prestamo p) {
		this.prestamos.remove(p);
	}
	
}
