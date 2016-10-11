package Builder;

public class OldSillaBuilder implements SillaBuilder {
	private Silla silla;
	
	public OldSillaBuilder(){
		this.silla= new Silla();
	}

	@Override
	public void buildPatas() {
		silla.setPatas("Patas de madera");
		
	}

	@Override
	public void buildAsiento() {
		silla.setAsiento("Asiento de Mimbre");
		
	}

	@Override
	public void buildRespaldo() {
		silla.setRespaldo("Respaldo Madera Tradicional");
		
	}

	@Override
	public Silla getSilla() {
		
		return this.silla;
	}
	

}
