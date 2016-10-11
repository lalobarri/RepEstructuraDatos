package mx.edu.utng.hibernate03.orm;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

public class Venta implements java.io.Serializable{
	private int idVen;
	private Date fecha;
	private Cliente cliente;
	private Set<VentaDetalle> detalles=new HashSet<VentaDetalle>();
	
	public Set<VentaDetalle> getDetalles() {
		return detalles;
	}

	public void setDetalles(Set<VentaDetalle> detalles) {
		this.detalles = detalles;
	}

	public Venta(int idVen, Date fecha, Cliente cliente) {
		super();
		this.idVen = idVen;
		this.fecha = fecha;
		this.cliente = cliente;
	}

	public Venta() {
		super();
	}

	public int getIdVen() {
		return idVen;
	}

	public void setIdVen(int idVen) {
		this.idVen = idVen;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
	
	
	
	

}
