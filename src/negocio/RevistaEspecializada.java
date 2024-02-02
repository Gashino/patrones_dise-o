package negocio;

import negocio.interfacesEnums.TipoRevista;

public class RevistaEspecializada extends Revista {
	private TipoRevista tipoRevista;

	public RevistaEspecializada( String titulo, String autor, String fechaPublicacion,String idEjemplar,
			TipoRevista tipoRevista) {
		super(titulo, autor, fechaPublicacion,idEjemplar);
		this.tipoRevista = tipoRevista;
	}

	public TipoRevista getTipoRevista() {
		return tipoRevista;
	}

	public void setTipoRevista(TipoRevista tipoRevista) {
		this.tipoRevista = tipoRevista;
	}
	

	
}
