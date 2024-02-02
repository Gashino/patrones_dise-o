package negocio;

import java.util.Date;

import negocio.interfacesEnums.PrestamoObserver;

public class Prestamo implements PrestamoObserver {
	private int fecha;
	private int fechaFinalizacion;
	private Socio socio;
	private Ejemplar ejemplar;
	
	
	
	public Prestamo(int fecha, int fechaFinalizacion, Socio socio, Ejemplar ejemplar) {
		super();
		this.fecha = fecha;
		this.fechaFinalizacion = fechaFinalizacion;
		this.socio = socio;
		this.ejemplar = ejemplar;
	}



	@Override
	public void darAviso2Dias(String mensaje) {
		this.socio.getEstrategiaComunicacion().enviarMensaje(mensaje);
		
	}



	@Override
	public void darAvisoDemora(String mensaje) {
		this.socio.getEstrategiaComunicacion().enviarMensaje(mensaje);		
	}



	public int getFecha() {
		return fecha;
	}



	public void setFecha(int fecha) {
		this.fecha = fecha;
	}



	public int getFechaFinalizacion() {
		return fechaFinalizacion;
	}



	public void setFechaFinalizacion(int fechaFinalizacion) {
		this.fechaFinalizacion = fechaFinalizacion;
	}



	public Socio getSocio() {
		return socio;
	}



	public void setSocio(Socio socio) {
		this.socio = socio;
	}



	public Ejemplar getEjemplar() {
		return ejemplar;
	}



	public void setEjemplar(Ejemplar ejemplar) {
		this.ejemplar = ejemplar;
	}



	@Override
	public String toString() {
		return "Prestamo [fecha=" + fecha + ", fechaFinalizacion=" + fechaFinalizacion + ", socio=" + socio
				+ ", ejemplar=" + ejemplar + "]";
	}
	
	
	
	
	
	
	
	
	
	
	
}
