package mx.edu.utng.hibernate05.orm;

import java.io.Serializable;

public class VentaDetalle implements Serializable{
	private VentaDetalleId id = new VentaDetalleId();
	private Producto producto;
	private Venta venta;
	private int cantidad;
	
	public VentaDetalle() {
		super();
	}

	public VentaDetalle(VentaDetalleId id, Producto producto, Venta venta, int cantidad) {
		super();
		this.id = id;
		this.producto = producto;
		this.venta = venta;
		this.cantidad = cantidad;
	}

	public VentaDetalleId getId() {
		return id;
	}

	public void setId(VentaDetalleId id) {
		this.id = id;
	}

	public Producto getProducto() {
		return producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	public Venta getVenta() {
		return venta;
	}

	public void setVenta(Venta venta) {
		this.venta = venta;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	
	
	
	

}
