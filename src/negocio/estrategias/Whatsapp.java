package negocio.estrategias;

import negocio.interfacesEnums.StrategyComunicacion;

public class Whatsapp implements StrategyComunicacion{

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviando mensaje via whatsapp... ---> " + mensaje);
		
	}

	

	

}
