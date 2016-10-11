package mx.edu.utng.hibernate04.orm;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Cliente")
public class Cliente implements java.io.Serializable{ 
	private int idClt;
	private String nombre;
	private String primAp;
	private String segAp;
	private Facturacion facturacion;
	private Set<Contacto> contactos=new HashSet<Contacto>();
	
	/*
	private Set<Venta> ventas = new HashSet<Venta>(0);
	
	public Set<Venta> getVentas() {
		return ventas;
	}
	public void setVentas(Set<Venta> ventas) {
		this.ventas = ventas;
	}*/
	
	public Cliente() {
		
	}
	public Cliente(int idClt, String nombre, String primAp, String segAp/*, Set<Contacto> contactos*/) {
		super();
		this.idClt = idClt;
		this.nombre = nombre;
		this.primAp = primAp;
		this.segAp = segAp;
		/*this.contactos=contactos;*/
		/*thi = ventas;*/
	}
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdClt() {
		return idClt;
	}
	public void setIdClt(int idClt) {
		this.idClt = idClt;
	}
	
	@Column(length=20, nullable=false)
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	@Column(length=20, nullable=false)
	public String getPrimAp() {
		return primAp;
	}
	public void setPrimAp(String primAp) {
		this.primAp = primAp;
	}
	@Column(length=20, nullable=false)
	public String getSegAp() {
		return segAp;
	}
	public void setSegAp(String segAp) {
		this.segAp = segAp;
	}
	@OneToOne(fetch=FetchType.LAZY, mappedBy="cliente", cascade=CascadeType.ALL)
	public Facturacion getFacturacion() {
		return facturacion;
	}
	public void setFacturacion(Facturacion facturacion) {
		this.facturacion = facturacion;
	}
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
	public Set<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(Set<Contacto> contactos) {
		this.contactos = contactos;
	}
	
	

}
