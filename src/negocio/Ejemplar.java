package negocio;

public abstract class Ejemplar {
	private String titulo;
	private String autor;
	private String fechaPublicacion;
	private boolean estado;
	private String idEjemplar;
	
	
	
	public Ejemplar(String titulo,String autor, String fechaPublicacion,String idEjemplar) {
		this.titulo = titulo;
		this.autor = autor;
		this.fechaPublicacion = fechaPublicacion;
		this.estado = true;
		this.idEjemplar = idEjemplar;
	}



	public String getTitulo() {
		return titulo;
	}



	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getFechaPublicacion() {
		return fechaPublicacion;
	}



	public void setFechaPublicacion(String fechaPublicacion) {
		this.fechaPublicacion = fechaPublicacion;
	}



	public boolean isEstado() {
		return estado;
	}



	public void setEstado(boolean estado) {
		this.estado = estado;
	}



	public String getIdEjemplar() {
		return idEjemplar;
	}



	public void setIdEjemplar(String idEjemplar) {
		this.idEjemplar = idEjemplar;
	}



	@Override
	public String toString() {
		return "\nTitulo : " + this.titulo +
				"\nAutor : " + this.autor +
				"\nFechaPublicacion: " + this.fechaPublicacion+
				"\nID: " + this.idEjemplar+
				"\n-----------------------------------";
	}
	
	
	
	
	
	
	
}
