package Prototype;

public class TestCloning {
	public static void main(String[] args) {
		
		CloneFactory clonadorZombie = new CloneFactory(); 
		
		Zombie z1 = new Zombie();
		z1.setNombre("Titan de la tumba");
		z1.setDescripcion("Criatura de la noche, cargada de muerte");
		
		Zombie clonedZombie = (Zombie)clonadorZombie.getClone(z1);
		
		System.out.println("Zombie el Original");
		System.out.println(z1);
		System.out.println("*o*======================*o*========================*o*");
		System.out.println("Zombie el Clon");
		System.out.println(clonedZombie);
		System.out.println("*o*======================*o*========================*o*");
		System.out.println("Se comprueba que no es el mismo objeto");
		System.out.println("z1 HashCode: " + System.identityHashCode(System.identityHashCode(z1)));
		System.out.println("clonedZombie HashCode: " + System.identityHashCode(System.identityHashCode(clonedZombie)));
	
		
		
	}

}
