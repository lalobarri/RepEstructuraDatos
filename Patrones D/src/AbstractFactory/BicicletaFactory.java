package AbstractFactory;

public class BicicletaFactory implements VehiculoAbstractFactory{
	private String marca;
	private int modelo;
	private String color;
	
	
	

	public BicicletaFactory(String marca, int modelo, String color) {
		
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}




	@Override
	public Vehiculo crearVehiculo() {
		
		return new Bicicleta(marca, modelo, color); 
	}
	

}
