package AbstractFactory;

public class Automovil extends Vehiculo{
	private String marca;
	private int modelo;
	private String color;
	
	

	public Automovil(String marca, int modelo, String color) {	
		this.marca = marca;
		this.modelo = modelo;
		this.color = color;
	}

	//Se deben implementar los métodos que están sin implementar de la clase abstracta
	@Override
	public String getMarca() {
		
		return marca;
	}

	@Override
	public int getModelo() {
		
		return modelo;
	}

	@Override
	public String getColor() {
		
		return color;
	}

}
