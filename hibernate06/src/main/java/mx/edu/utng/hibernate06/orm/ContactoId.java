package mx.edu.utng.hibernate06.orm;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;

@Embeddable
public class ContactoId implements Serializable{
	private int idClt;
	private int idContacto;
	
	public ContactoId(){
		super();
	}

	public ContactoId(int idClt, int idContacto) {
		super();
		this.idClt = idClt;
		this.idContacto = idContacto;
	}

	@Column (name="idClt", nullable=false)
	public int getIdClt() {
		return idClt;
	}

	public void setIdClt(int idClt) {
		this.idClt = idClt;
	}
	
	@Column (name="idContacto", nullable=false)
	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	
	

}
