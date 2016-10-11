package mx.edu.utng.hibernate03.orm;

import java.util.HashSet;
import java.util.Set;

public class Cliente implements java.io.Serializable{ 
	private int idClt;
	private String nombre;
	private String primAp;
	private String segAp;
	
	private Set<Venta> ventas = new HashSet<Venta>(0);
	
	public Set<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}
	public int getIdClt() {
		return idClt;
	}
	public void setIdClt(int idClt) {
		this.idClt = idClt;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimAp() {
		return primAp;
	}
	public void setPrimAp(String primAp) {
		this.primAp = primAp;
	}
	public String getSegAp() {
		return segAp;
	}
	public void setSegAp(String segAp) {
		this.segAp = segAp;
	}
	public Cliente() {
		
	}
	public Cliente(int idClt, String nombre, String primAp, String segAp, Set<Venta> ventas) {
		super();
		this.idClt = idClt;
		this.nombre = nombre;
		this.primAp = primAp;
		this.segAp = segAp;
		this.ventas = ventas;
	}
	
	

}
