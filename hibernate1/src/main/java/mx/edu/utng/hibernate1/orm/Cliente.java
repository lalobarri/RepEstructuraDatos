package mx.edu.utng.hibernate1.orm;

import java.util.Date;

public class Cliente implements java.io.Serializable{
	//Clase buena para la generación del cliente
	private int id;
	private String Nombre;
	private String Direccion;
	private Date nacimiento;
	
	public Cliente(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getDireccion() {
		return Direccion;
	}
	public void setDireccion(String direccion) {
		Direccion = direccion;
	}
	public Date getNacimiento() {
		return nacimiento;
	}
	public void setNacimiento(Date nacimiento) {
		this.nacimiento = nacimiento;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", Nombre=" + Nombre + ", Direccion=" + Direccion + "]";
	}
	
	
	
	
}
