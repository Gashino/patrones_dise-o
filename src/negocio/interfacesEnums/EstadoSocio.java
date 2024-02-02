package negocio.interfacesEnums;

import negocio.Socio;

public interface EstadoSocio {
	void pedirPrestamo(Socio c, String idEjemplar);
	void devolverLibro(Socio c);
}
