package AbstractFactory;

//Clase abstracta que servir� como base (Clase Padre o SuperClase) para le patr�n Abstract Factory

public abstract class Vehiculo  {
	//M�todo abstractos de la clase
	public abstract String getMarca();
	public abstract int getModelo();
	public abstract String getColor();
	
	
	@Override
	public String toString() {
		return "Vehiculo [getMarca()=" + getMarca() + ", getModelo()=" + getModelo() + ", getColor()=" + getColor()
				+ "]";
	}
	
	

}
