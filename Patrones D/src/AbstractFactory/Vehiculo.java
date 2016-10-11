package AbstractFactory;

//Clase abstracta que servirá como base (Clase Padre o SuperClase) para le patrón Abstract Factory

public abstract class Vehiculo  {
	//Método abstractos de la clase
	public abstract String getMarca();
	public abstract int getModelo();
	public abstract String getColor();
	
	
	@Override
	public String toString() {
		return "Vehiculo [getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getColor()=" + getColor()
				+ "]";
	}
	
	

}
