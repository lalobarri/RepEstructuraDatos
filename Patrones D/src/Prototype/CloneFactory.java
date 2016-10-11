package Prototype;

public class CloneFactory {
	//Clase que funciona como fabrica de clones
	public Criatura getClone(Criatura criatura){
		
		return (Criatura)criatura.clone();
	}

}
