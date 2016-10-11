package Builder;

public class SillaProcess {
	private SillaBuilder sillaBuilder;
	
	public  SillaProcess(SillaBuilder sillaBuilder) {
		this.sillaBuilder=sillaBuilder;
	}
	public Silla getSilla(){
		return this.sillaBuilder.getSilla();
	}
	public void cronstruirSilla(){
		this.sillaBuilder.buildPatas();
		this.sillaBuilder.buildAsiento();
		this.sillaBuilder.buildRespaldo();
	}

}
