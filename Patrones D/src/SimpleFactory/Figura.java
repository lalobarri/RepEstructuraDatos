package SimpleFactory;

public abstract class Figura {
	private float ladoA;
	private float area;
	private float perimetro;
	
	
	
	
	public Figura(float ladoA) {
		super();
		this.ladoA = ladoA;
	}
	public abstract void calculaArea();
	public abstract void calculaPerimetro();
	public float getLadoA() {
		return ladoA;
	}
	public void setPerimetro(float perimetro) {
		this.perimetro = perimetro;
	}
	
	
	@Override
	public String toString() {
		return "Figura [ladoA=" + ladoA + ", area=" + area + ", perimetro=" + perimetro + "]";
	}

}
