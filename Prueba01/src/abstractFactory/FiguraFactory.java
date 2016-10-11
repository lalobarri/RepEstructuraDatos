package abstractFactory;

public class FiguraFactory {
	public static Figura getFigura(String tipo, float ladoA, float ladoB){
		if (tipo.equalsIgnoreCase("CUADRADO")){
			return new Cuadrado(ladoA);
		}else if(tipo.equalsIgnoreCase("RECTANGULO")){
			return new Rectangulo(ladoA, ladoB);
		}else
			return null;
	}

}
