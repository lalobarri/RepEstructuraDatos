package exercise_02;

public class Persona {
	//propiedades
	private String nombre;
	private int edad;
	//métodos
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public void mostrarSaludo(){
		System.out.println("Hola "+this.nombre);
		System.out.println("Tienes "+this.edad);
		
	}
	

}
