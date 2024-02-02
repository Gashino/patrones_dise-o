package negocio.factorias;

import java.util.Scanner;

import negocio.Ejemplar;
import negocio.RevistaEspecializada;
import negocio.interfacesEnums.FactoryEjemplares;
import negocio.interfacesEnums.GeneroLib;
import negocio.interfacesEnums.TipoRevista;

public class FactoryRevistaEspecializada implements FactoryEjemplares{
	Scanner n = new Scanner(System.in);

	@Override
	public Ejemplar crearEjemplar() {
	
		
		System.out.println("INGRESAR TIPO REVISTA (CIENCIA, ECONOMIA, LITERATURA");
		String seleccion=n.nextLine();
		
		TipoRevista seleccionFinal;
		
		try {
			seleccionFinal= TipoRevista.valueOf(seleccion.toUpperCase());
		} catch (Exception e) {
			seleccionFinal=TipoRevista.SINREGISTRAR;
		}
		
		
		return new RevistaEspecializada(null, null, null, null, seleccionFinal);
	}

}