package mx.edu.utng.hibernate05.orm;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Producto")
public class Producto implements java.io.Serializable{
	private int idProd;
	private String nombre;
	private String descripcion;
	private float precio;
	private Categoria categoria;
	
//	private Set<VentaDetalle> detalles=new HashSet<VentaDetalle>();
	
	/*
	public Set<VentaDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<VentaDetalle> detalles) {
		this.detalles = detalles;
	}*/


	public Producto(){
		
	}
	
	
	public Producto(int idProd, String nombre, String descripcion, float precio, Categoria categoria) {
		super();
		this.idProd = idProd;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.precio = precio;
		this.categoria = categoria;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdProd() {
		return idProd;
	}
	public void setIdProd(int idProd) {
		this.idProd = idProd;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCat", nullable=false)
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	@Column(length=20, nullable=false)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(length=200, nullable=false)
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Column(nullable=false)
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Producto [idProd=" + idProd + ", nombre=" + nombre + ", descripcion=" + descripcion + ", precio="
				+ precio + ", categoria=" + categoria + "]";
	}

	
	

}
