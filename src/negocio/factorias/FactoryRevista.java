package negocio.factorias;

import negocio.Ejemplar;
import negocio.Revista;
import negocio.interfacesEnums.FactoryEjemplares;

public class FactoryRevista implements FactoryEjemplares{

	@Override
	public Ejemplar crearEjemplar() {
		return new Revista(null, null, null, null);
	}
	
	

}
