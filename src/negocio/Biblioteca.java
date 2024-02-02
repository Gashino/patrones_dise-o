package negocio;

import java.util.ArrayList;
import java.util.List;

import negocio.estrategias.*;
import negocio.interfacesEnums.GeneroLib;

public class Biblioteca {
	private static List<Ejemplar> biblioteca;
	
	private final List<Socio> socios;

	public Biblioteca() {
		this.socios = new ArrayList<>();
		socios.add(new Socio("Ana", "González", "12345678A", "555-1234", "ana.gonzalez@example.com", new Email()));
		socios.add(new Socio("Carlos", "Martínez", "23456789B", "555-5678", "carlos.martinez@example.com", new Whatsapp()));
		socios.add(new Socio("Elena", "Ruiz", "34567890C", "555-9876", "elena.ruiz@example.com", new Sms()));
		socios.add(new Socio("David", "Fernández", "45678901D", "555-4321", "david.fernandez@example.com", new Email()));
		socios.add(new Socio("Laura", "Díaz", "56789012E", "555-8765", "laura.diaz@example.com", new Whatsapp()));
		socios.add(new Socio("Javier", "Pérez", "67890123F", "555-1234", "javier.perez@example.com", new Sms()));
		socios.add(new Socio("Isabel", "López", "78901234G", "555-5678", "isabel.lopez@example.com", new Email()));
		socios.add(new Socio("Adrián", "García", "89012345H", "555-9876", "adrian.garcia@example.com", new Whatsapp()));
		socios.add(new Socio("Marta", "Hernández", "90123456I", "555-4321", "marta.hernandez@example.com", new Sms()));
		socios.add(new Socio("Antonio", "Moreno", "01234567J", "555-8765", "antonio.moreno@example.com", new Email()));
		socios.add(new Socio("María", "Rivera", "12345678K", "555-1234", "maria.rivera@example.com", new Whatsapp()));
		socios.add(new Socio("José", "Molina", "23456789L", "555-5678", "jose.molina@example.com", new Sms()));
		socios.add(new Socio("Luisa", "Vargas", "34567890M", "555-9876", "luisa.vargas@example.com", new Email()));
		socios.add(new Socio("Sergio", "Torres", "45678901N", "555-4321", "sergio.torres@example.com", new Whatsapp()));
		socios.add(new Socio("Natalia", "Sánchez", "56789012O", "555-8765", "natalia.sanchez@example.com", new Sms()));
		socios.add(new Socio("Raúl", "Gómez", "67890123P", "555-1234", "raul.gomez@example.com", new Email()));
		socios.add(new Socio("Carmen", "Romero", "78901234Q", "555-5678", "carmen.romero@example.com", new Whatsapp()));
		socios.add(new Socio("Pablo", "Jiménez", "89012345R", "555-9876", "pablo.jimenez@example.com", new Sms()));
		socios.add(new Socio("Silvia", "Ortega", "90123456S", "555-4321", "silvia.ortega@example.com", new Email()));
		socios.add(new Socio("Roberto", "Fuentes", "01234567T", "555-8765", "roberto.fuentes@example.com", new Whatsapp()));


		biblioteca = new ArrayList<>();
		biblioteca.add(new Libro("El Señor de los Anillos", "J.R.R. Tolkien", "1954-07-29", "001", GeneroLib.JUVENIL));
		biblioteca.add(new Revista("National Geographic", "Juan Carlos", "2023-01-01", "002"));
		biblioteca.add(new Diario("The New York Times", "NYT", "2023-01-01", "003"));
		biblioteca.add(new Libro("Cien años de soledad", "Gabriel García Márquez", "1967-05-30", "004", GeneroLib.POESIA));
		biblioteca.add(new Revista("Time", "Pedro Garcia", "2023-01-02", "005"));
        biblioteca.add(new Diario("The Guardian", "Guardian", "2023-01-02", "006"));
		biblioteca.add(new Libro("1984", "George Orwell", "1949-06-08", "007", GeneroLib.TERROR));
		biblioteca.add(new Revista("Scientific American", "Juan Pedro", "2023-01-03", "008"));
		biblioteca.add(new Diario("Le Monde", "LeMonde", "2023-01-03", "009"));
		biblioteca.add(new Libro("Harry Potter y la piedra filosofal", "J.K. Rowling", "1997-06-26", "010", GeneroLib.JUVENIL));
	}
	
	
	
	public static Ejemplar devolverById(String idEjemplar) {
		for (Ejemplar ejemplar : biblioteca) {
			if(ejemplar.getIdEjemplar().equalsIgnoreCase(idEjemplar)) {
				return ejemplar;
			}
		}
		return null;
	}
	
	public void agregarEjemplar(Ejemplar e) {
		biblioteca.add(e);
	}



	public static List<Ejemplar> getBiblioteca() {
		return biblioteca;
	}

	public List<Socio> getSocios(){
		return socios;
	}


	public void setBiblioteca(List<Ejemplar> biblioteca) {
		Biblioteca.biblioteca = biblioteca;
	}
	
	public void agregarSocio(Socio s) {
		socios.add(s);
	}



	@Override
	public String toString() {
		return "Biblioteca [toString()=" + super.toString() + "]";
	}



	
	
	
	
	
}
	
	

