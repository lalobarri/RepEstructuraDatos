package Builder;

public class TestSillaBuilder {
	public static void main(String[] args) {
		SillaBuilder oldSilla = new OldSillaBuilder();
		
		SillaProcess sillaProcess = new SillaProcess(oldSilla);
		
		sillaProcess.cronstruirSilla();
		
		Silla firstSilla = sillaProcess.getSilla();
		
		
		System.out.println("Construllendo Silla");
		System.out.println("Respaldo de la Silla: "+firstSilla.getRespaldo());
		System.out.println("Asiendo de la Silla: "+firstSilla.getAsiento());
		System.out.println("Patas de la Silla: "+firstSilla.getPatas());
	}
	

}
