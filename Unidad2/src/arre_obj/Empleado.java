package arre_obj;

public class Empleado {
	private String nombre;
	private int edad;
	private double sueldo;
	
	public Empleado(String nombre, int edad, double sueldo) {
		super();
		this.nombre = nombre;
		this.edad = edad;
		this.sueldo = sueldo;
	}
	
	
	public Empleado() {
		super();
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	public int getEdad() {
		return edad;
	}
	public double getSueldo() {
		return sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", edad=" + 
	             edad + ", sueldo=" + sueldo + "]";
	}
	
	

}
