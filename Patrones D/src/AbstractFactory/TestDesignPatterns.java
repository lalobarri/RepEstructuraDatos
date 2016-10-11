package AbstractFactory;

public class TestDesignPatterns {
	public static void main(String[] args) {
		testAbstractFactory();
		
		
	}
	
	public static void testAbstractFactory(){
		Vehiculo auto =  VehiculoFactory.getVehiculo(new AutomovilFactory("Nissan",2015,"Gris"));
		Vehiculo bici =  VehiculoFactory.getVehiculo(new BicicletaFactory("Benotto",2011,"Blanca"));
		System.out.println("Fabrica Abstracta Automovil :: "+auto);
		System.out.println("Fabrica Abstracta Bicicleta :: "+bici);
	}

}
