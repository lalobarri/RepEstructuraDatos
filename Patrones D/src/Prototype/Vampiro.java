package Prototype;

public class Vampiro implements Criatura{
	private String nombre;
	private String familia;
	public Vampiro(){
		System.out.println("Vampiro creado");
	}
	
	@Override
	public Object clone(){
		System.out.println("El Vampiro se esta creando");
		Vampiro vampiroObject=null;
		try{
			vampiroObject = (Vampiro)super.clone();
		}catch(CloneNotSupportedException cnex){
			System.out.println("No sufuciente para crear el Vampiro");
			cnex.printStackTrace();
		}
		return vampiroObject;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getFamilia() {
		return familia;
	}

	public void setFamilia(String familia) {
		this.familia = familia;
	}

	@Override
	public String toString() {
		return "Vampiro [nombre=" + nombre + ", familia=" + familia + "]";
	}
	
	

}
