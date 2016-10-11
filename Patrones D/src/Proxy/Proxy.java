package Proxy;

public class Proxy implements ServidorInterface{
	String ipProhibidas="10.1.1.89";
	String ipCache="10.2.1.15";

	@Override
	public boolean enviaInformacion(Informacion info) {
		String ipDestino=info.getIpDestino();
		if(ipDestino.contentEquals(ipProhibidas)){
			System.out.println("A esta página no se pude entrar");
			return false;
		}
		else{
			if (ipDestino.contentEquals(ipCache)){
				System.out.println("La página se ha cargado de la Cache");
			}else{
				//Aquí es donde se manda llamar al servidor Web(Objeto Real)
				ServidorWeb sw = new ServidorWeb();
				sw.enviaInformacion(info);
			}
			
			return true;
		}
	}

	@Override
	public boolean recibeInformacion(Informacion info) {
		if(info.getIpOrigen().contentEquals(ipProhibidas)){
			System.out.println("Contenido Inapropiado");
			//Cargar información
			ServidorWeb sw = new ServidorWeb();
			sw.recibeInformacion(info);
			return false;
		}
		else{
			System.out.println("Se muestra el contenido permitido");
			return true;
		}
			
	}
	
	
	

}
