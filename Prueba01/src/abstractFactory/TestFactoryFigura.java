package abstractFactory;

public class TestFactoryFigura {
	public static void main(String[] args) {
		Figura c1 = FiguraFactory.getFigura("cuadrado", 10.5f, 10.5f);
		Figura r1 = FiguraFactory.getFigura("rectangulo", 10.5f, 30.5f);
		System.out.println("Factory Cuadrado::"+c1);
		System.out.println("Factory Rectangulo::"+r1);
	}

}
