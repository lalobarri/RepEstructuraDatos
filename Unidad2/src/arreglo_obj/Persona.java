package arreglo_obj;

public class Persona {
	private String nombre;
	private int edad;
	private double sueldo;
	
	
	public Persona(String nombre, int edad, double sueldo) {
		
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	public Persona() {
		
	}

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
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + "]";
	}
	
	

}
