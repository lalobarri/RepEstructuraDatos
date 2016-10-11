package pruebas;

public class Nodo {
	private String info;
	Nodo siguiente;
	
	public Nodo(String info, Nodo siguiente) {
		super();
		this.info = info;
		this.siguiente = siguiente;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public Nodo getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Nodo siguiente) {
		this.siguiente = siguiente;
	}
	
	
	

}
