package Proxy;

public class Cliente {
	public static void main(String[] args) {
	    Informacion info = new Informacion("10.0.2.56", "10.8.8.2", "clien1");
		ServidorInterface cliente1 = new Proxy();
		
		//Escenario posibles:
		//P�gina correcta
		cliente1.enviaInformacion(info);
		
		//P�gina Prohibida
		info.setIpDestino("10.1.1.89");
		cliente1.enviaInformacion(info);
		
		//P�gian Vacia
		info.setIpDestino("");
		cliente1.enviaInformacion(info);
		
		//
		info.setIpDestino("10.2.1.15");
		cliente1.enviaInformacion(info);
		
	}

}
