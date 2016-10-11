package Command;

public class Computadora implements Dispositivo {

	@Override
	public void encender() {
		System.out.println("La COMPUTADORA esta ENCENDIDA");
		
	}

	@Override
	public void apagar() {
		System.out.println("La COMPUTADORA esta APAGADA");
		
	}

	@Override
	public void cargaSO() {
		System.out.println("La COMPUTADORA ha cargado el S.O.");
		
	}

	@Override
	public void cargaConexion() {
		System.out.println("La COMPUTADORA carga la CONEXION");
		
	}

	@Override
	public void cerrarConexion() {
		System.out.println("La COMPUTADORA cierra la CONEXIÓN");
		
	}

}
