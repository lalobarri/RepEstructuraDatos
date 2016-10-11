package Proxy;

public class ServidorWeb implements ServidorInterface {

	@Override
	public boolean enviaInformacion(Informacion info) {
		String ipValida=info.getIpDestino();
		if (!ipValida.isEmpty()){
			System.out.println("Se ha cargado la página del Servidor Web");
			return true;
		}else{
			System.out.println("Lo sentimos no se pueda cargar la página");
			return false;
		}
		
		
	}

	@Override
	public boolean recibeInformacion(Informacion info) {
		String ipValida=info.getIpOrigen();
		System.out.println("Se carga la información de: "+ipValida );
		return false;
	}

}
