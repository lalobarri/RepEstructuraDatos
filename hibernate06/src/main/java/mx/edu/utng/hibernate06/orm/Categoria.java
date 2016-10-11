package mx.edu.utng.hibernate06.orm;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Table(name="Categoria")
@NamedQueries({
	@NamedQuery(
	name="findCategoriaById",
	query="FROM Categoria C WHERE C.idCat = :id_cat"
	),
	@NamedQuery(
			name="findCategoriaByName",
			query="FROM Categoria C WHERE C.nombre = :nombre_cat"
			)
	
})
@NamedNativeQueries({
	@NamedNativeQuery(
			name = "sqlFindCategoriaByDescripcion",
			query = "SELECT * FROM Categoria WHERE descripcion LIKE :descripcion_cat",
			resultClass=Categoria.class
			)
})

@Entity
public class Categoria implements java.io.Serializable{
	private int idCat;
	private String nombre;
	private String descripcion;
	
	/*private Set<Producto> productos = new HashSet<Producto>(0);*/
	
	public Categoria(){
		
	}
	/*
	@OneToMany(fetch=FetchType.LAZY, mappedBy="categoria")
	public Set<Producto> getProductos() {
		return productos;
	}
	public void setProductos(Set<Producto> productos) {
		this.productos = productos;
	}*/
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getIdCat() {
		return idCat;
	}
	public void setIdCat(int idCat) {
		this.idCat = idCat;
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
	@Column
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	@Override
	public String toString() {
		return "Categoria [idCat=" + idCat + ", nombre=" + nombre + ", descripcion=" + descripcion + "]";
	}
	

}
