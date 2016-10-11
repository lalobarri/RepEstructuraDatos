package Prototype;

public class Zombie implements Criatura{
	private String nombre;
	private String descripcion;
	public Zombie(){
		System.out.println("Zombie creado");
	}
	
	@Override
	public Object clone(){
		System.out.println("El Zombie se esta creando");
		Zombie zombieObject=null;
		try{
			zombieObject = (Zombie)super.clone();
		}catch(CloneNotSupportedException cnex){
			System.out.println("No sufuciente para crear el Zombie");
			cnex.printStackTrace();
		}
		return zombieObject;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	@Override
	public String toString() {
		return "Zombie [nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	
		

}
