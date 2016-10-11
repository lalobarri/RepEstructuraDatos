package Command;

public class Celular implements Dispositivo{
	@Override
	public void encender() {
		System.out.println("El CELULAR esta ENCENDIDO");
		
	}

	@Override
	public void apagar() {
		System.out.println("El CELULAR esta APAGADO");
		
	}

	@Override
	public void cargaSO() {
		System.out.println("El CELULAR ha cargado el S.O.");
		
	}

	@Override
	public void cargaConexion() {
		System.out.println("El CELULAR carga la CONEXION");
		
	}

	@Override
	public void cerrarConexion() {
		System.out.println("El CELULAR cierra la CONEXIÓN");
		
	}


}
