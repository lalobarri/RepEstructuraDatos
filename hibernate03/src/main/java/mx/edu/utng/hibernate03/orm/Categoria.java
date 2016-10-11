package mx.edu.utng.hibernate03.orm;

import java.util.HashSet;
import java.util.Set;

public class Categoria implements java.io.Serializable{
	private int idCat;
	private String nombre;
	private String descripcion;
	
	private Set<Producto> productos = new HashSet<Producto>(0);
	
	public Categoria(){
		
	}
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
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
		return "Categoria [idCat=" + idCat + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	

}
