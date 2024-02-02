package negocio.estrategias;

import negocio.interfacesEnums.StrategyComunicacion;

public class Sms implements StrategyComunicacion{

	@Override
	public void enviarMensaje(String mensaje) {
		System.out.println("Enviando mensaje SMS...  ---> " + mensaje);
		
	}
	
	

}
