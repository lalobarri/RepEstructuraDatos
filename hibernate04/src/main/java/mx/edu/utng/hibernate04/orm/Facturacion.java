package mx.edu.utng.hibernate04.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Facturacion implements Serializable {
	private Integer idClt;
	private Cliente cliente;
	private String rfc;
	private String domicilio;
	
	public Facturacion() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Facturacion( Cliente cliente, String rfc, String domicilio) {
		super();
		
		this.cliente = cliente;
		this.rfc = rfc;
		this.domicilio = domicilio;
	}
	
	@GenericGenerator(name="generator",strategy="foreign", parameters=@Parameter(name="property",value="cliente"))
	@Id
	@GeneratedValue(generator="generator")
	@Column(name="idClt", unique=true,nullable=false)
	public Integer getIdClt() {
		return idClt;
	}

	public void setIdClt(Integer idClt) {
		this.idClt = idClt;
	}
	@OneToOne(fetch=FetchType.LAZY)
	@PrimaryKeyJoinColumn
	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	@Column
	public String getRfc() {
		return rfc;
	}

	public void setRfc(String rfc) {
		this.rfc = rfc;
	}
	@Column
	public String getDomicilio() {
		return domicilio;
	}

	public void setDomicilio(String domicilio) {
		this.domicilio = domicilio;
	}
	

}
