package Command;

public class UsaCelular implements Command{
	private Dispositivo cel;
	
	@Override
	public void execute() {
		cel.encender();
		cel.cargaSO();
		cel.cerrarConexion();
		
	}

	public UsaCelular(Dispositivo cel) {
		
		this.cel = cel;
	}
	

}
