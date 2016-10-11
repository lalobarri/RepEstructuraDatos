package Command;

public class UsaComputadora implements Command  {
	private Dispositivo compu;

	@Override
	public void execute() {
		compu.encender();
		compu.cargaSO();
		compu.cerrarConexion();
		
	}

	public UsaComputadora(Dispositivo compu) {
		this.compu = compu;
	}
	


	

}
