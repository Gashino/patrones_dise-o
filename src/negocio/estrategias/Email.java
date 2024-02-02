package negocio.estrategias;

import negocio.interfacesEnums.StrategyComunicacion;

public class Email implements StrategyComunicacion{

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviando mail... ---> " + mensaje);
		
	}
	
	

}
