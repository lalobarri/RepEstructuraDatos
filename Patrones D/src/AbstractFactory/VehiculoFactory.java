package AbstractFactory;

public class VehiculoFactory {
	
	public static Vehiculo getVehiculo(VehiculoAbstractFactory factory){
		return factory.crearVehiculo();
	}

}
