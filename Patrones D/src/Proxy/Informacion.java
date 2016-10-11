package Proxy;

public class Informacion {
	private String ipOrigen;
	private String datos;
	private String ipDestino;
	
	
	public Informacion(String ipOrigen, String ipDestino,String datos) {
		super();
		this.ipOrigen = ipOrigen;
		this.datos = datos;
		this.ipDestino = ipDestino;
	}
	//Métodos Get y Set
	public String getIpOrigen() {
		return ipOrigen;
	}
	public void setIpOrigen(String ipOrigen) {
		this.ipOrigen = ipOrigen;
	}
	public String getDatos() {
		return datos;
	}
	public void setDatos(String datos) {
		this.datos = datos;
	}
	public String getIpDestino() {
		return ipDestino;
	}
	public void setIpDestino(String ipDestino) {
		this.ipDestino = ipDestino;
	}
	
	

}
