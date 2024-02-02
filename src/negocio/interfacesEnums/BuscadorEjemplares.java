package negocio.interfacesEnums;

import negocio.Ejemplar;

import java.util.List;

public interface BuscadorEjemplares {
	
	void buscarPorFecha(String fecha);
	void buscarPorCategoria(String cat);
	void buscarPorTitulo(String titulo);
	void buscarPorAutor(String autor);

}
