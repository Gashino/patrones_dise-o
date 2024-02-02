package negocio;

import negocio.interfacesEnums.GeneroLib;

public class Libro extends Ejemplar {
	private GeneroLib genero;

	public Libro(String titulo, String autor, String fechaPublicacion, String idEjemplar,GeneroLib genero) {
		super(titulo, autor, fechaPublicacion,idEjemplar);
		this.genero = null;
	}

	public GeneroLib getGenero() {
		return genero;
	}

	public void setGenero(GeneroLib genero) {
		this.genero = genero;
	}

	

	
}
