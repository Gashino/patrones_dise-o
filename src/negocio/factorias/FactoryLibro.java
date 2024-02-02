package negocio.factorias;

import java.util.Scanner;

import negocio.Ejemplar;
import negocio.Libro;
import negocio.interfacesEnums.FactoryEjemplares;
import negocio.interfacesEnums.GeneroLib;

public class FactoryLibro implements FactoryEjemplares{
	Scanner n = new Scanner(System.in);
	
	@Override
	public Ejemplar crearEjemplar() {
		
		System.out.println("INGRESAR TIPO LIBRO (ACCION,COMEDIA,POLICIAL,TERROR,CFICCION,JUVENIL,ROMANCE,POESIA");
		String seleccion=n.nextLine();
		GeneroLib seleccionFinal;
		
		try {
			seleccionFinal= GeneroLib.valueOf(seleccion.toUpperCase());
		} catch (Exception e) {
			seleccionFinal=GeneroLib.SINREGISTRAR;
		}
		
		
		return new Libro(null, null, null, null,seleccionFinal);
	}
	
	

}
