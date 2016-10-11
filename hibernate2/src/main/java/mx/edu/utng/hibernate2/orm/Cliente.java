package mx.edu.utng.hibernate2.orm;

import java.util.Date;

public class Cliente implements java.io.Serializable{
	//Clase buena para la generación del cliente
	private int id;
	private String Nombre;
	private String Direccion;
	private Date nacimiento;
	private Cita cita;
	private Contrato contrato;
	
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

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}
	
	

	public Contrato getContrato() {
		return contrato;
	}

	public void setContrato(Contrato contrato) {
		this.contrato = contrato;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", Nombre=" + Nombre + ", Direccion=" + Direccion + ", nacimiento=" + nacimiento
				+ "]";
	}

	
	
	
}
