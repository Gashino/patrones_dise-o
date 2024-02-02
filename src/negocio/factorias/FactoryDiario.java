package negocio.factorias;

import negocio.Diario;
import negocio.Ejemplar;
import negocio.interfacesEnums.FactoryEjemplares;

public class FactoryDiario implements FactoryEjemplares {
	
	@Override
	public Ejemplar crearEjemplar() {
		
		return new Diario(null, null, null, null);
	}

	
}
