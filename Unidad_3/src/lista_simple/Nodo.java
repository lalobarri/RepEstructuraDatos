package lista_simple;

public class Nodo {
	private String info; //información o datos de la lista
	Nodo siguiente; // Puntero o referencia a un objeto de la misma clase
	
	public Nodo(String informacion,Nodo siguiente){ //Constructor
		this.info=informacion;
		this.siguiente=siguiente;
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
