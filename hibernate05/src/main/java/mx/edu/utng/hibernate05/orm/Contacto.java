package mx.edu.utng.hibernate05.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Contacto implements Serializable{
	private ContactoId idContacto;
	private String datoContacto;
	private TipoContacto tipoCont;
	private Cliente cliente;
	
	
	
	public Contacto(ContactoId idContacto, String datoContacto, TipoContacto tipoCont, Cliente cliente) {
		super();
		this.idContacto = idContacto;
		this.datoContacto = datoContacto;
		this.tipoCont = tipoCont;
		this.cliente = cliente;
	}
	@EmbeddedId
	public ContactoId getIdContacto() {
		return idContacto;
	}
	public void setIdContacto(ContactoId idContacto) {
		this.idContacto = idContacto;
	}
	@Column
	public String getDatoContacto() {
		return datoContacto;
	}
	public void setDatoContacto(String datoContacto) {
		this.datoContacto = datoContacto;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idTipoCont", nullable=false, insertable=false, updatable=false)
	public TipoContacto getTipoCont() {
		return tipoCont;
	}
	public void setTipoCont(TipoContacto tipoCont) {
		this.tipoCont = tipoCont;
	}
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idClt", nullable=false,  insertable=false, updatable=false)
	public Cliente getCliente() {
		return cliente;
	}
	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
}
