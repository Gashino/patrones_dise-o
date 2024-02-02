package negocio;

import negocio.interfacesEnums.BuscadorEjemplares;

import java.util.List;
import java.util.Random;

public class BuscadorAdapter implements BuscadorEjemplares{

	private Random random;
	private int encontrados;
	
	public BuscadorAdapter(){
		this.random=new Random();
		this.encontrados=0;
	}
	
	
	@Override
	public void buscarPorFecha(String fecha) {
		for (Ejemplar ejemplar : Biblioteca.getBiblioteca()) {
			if(ejemplar.getFechaPublicacion().equalsIgnoreCase(fecha)) {
				encontrados++;
				System.out.println("El ejemplar " + ejemplar.getTitulo()
				+ " con fecha de publicacion " + ejemplar.getFechaPublicacion().toUpperCase()
				+ " se encuentra en la estanteria :" + random.nextInt(10));
			}
		}
		if(encontrados==0) {
			System.out.println("NO SE ENCONTRARON EJEMPLARES");
		}
		
		this.encontrados=0;

    }

	@Override
	public void buscarPorCategoria(String cat) {
		for (Ejemplar ejemplar : Biblioteca.getBiblioteca()) {
			if(ejemplar.getClass().getSimpleName().equalsIgnoreCase(cat.replace(" ",""))) {
				encontrados++;
				System.out.println("El ejemplar " + ejemplar.getTitulo()
				+ " con categoria " + cat.toUpperCase()
				+ " se encuentra en la estanteria :" + random.nextInt(10));
			}
		}
		if(encontrados==0) {
			System.out.println("NO SE ENCONTRARON EJEMPLARES");
		}
		
		this.encontrados=0;


	}

	@Override
	public void buscarPorTitulo(String titulo) {
		for (Ejemplar ejemplar : Biblioteca.getBiblioteca()) {
			if(ejemplar.getTitulo().equalsIgnoreCase(titulo)) {
				encontrados++;
				System.out.println("El ejemplar " + ejemplar.getTitulo().toUpperCase()
				+ " se encuentra en la estanteria :" + random.nextInt(10));
			}
		}
		if(encontrados==0) {
			System.out.println("NO SE ENCONTRARON EJEMPLARES");
		}
		
		this.encontrados=0;


	}

	@Override
	public void buscarPorAutor(String autor) {
		for (Ejemplar ejemplar : Biblioteca.getBiblioteca()) {
			if(ejemplar.getAutor().equalsIgnoreCase(autor)) {
				encontrados++;
				System.out.println("El ejemplar " + ejemplar.getTitulo()
				+ " con autor " + autor.toUpperCase()
				+ " se encuentra en la estanteria :" + random.nextInt(10));
			}
		}
		if(encontrados==0) {
			System.out.println("NO SE ENCONTRARON EJEMPLARES");
		}
		
		this.encontrados=0;


	}
	

}
