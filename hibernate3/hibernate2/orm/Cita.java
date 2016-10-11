package mx.edu.utng.hibernate2.orm;
import java.util.Date;

public class Cita implements java.io.Serializable{
	private int id;
	private String titulo;
	private Date fecha;
	private Cliente cliente;
	
	public Cita(){
		titulo="";
		fecha= new Date(12,12,12);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
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

	@Override
	public String toString() {
		return "Cita [id=" + id + ", titulo=" + titulo + ", fecha=" + fecha + ", cita=" + cliente + "]";
	}

	
	
	

}
