package AbstractFactory;

public class AutomovilFactory implements VehiculoAbstractFactory{
	private String marca;
	private int modelo;
	private String color;
	
	
	public AutomovilFactory(String marca, int modelo, String color) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}


	@Override
	public Vehiculo crearVehiculo() {
		
		return new Automovil(marca, modelo, color);
	}
	

}
