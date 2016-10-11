package mx.edu.utng.hibernate04;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mx.edu.utng.hibernate04.dao.DAOCategoria;
import mx.edu.utng.hibernate04.orm.Categoria;
import mx.edu.utng.hibernate04.orm.Cliente;
import mx.edu.utng.hibernate04.orm.Contacto;
import mx.edu.utng.hibernate04.orm.ContactoId;
import mx.edu.utng.hibernate04.orm.Facturacion;
import mx.edu.utng.hibernate04.orm.Producto;
import mx.edu.utng.hibernate04.orm.TipoContacto;
import mx.edu.utng.hibernate04.orm.Venta;
import mx.edu.utng.hibernate04.orm.VentaDetalle;
import mx.edu.utng.hibernate04.orm.VentaDetalleId;

/**
 * Hello world!
 *
 */
public class App 
{
	private static Producto testProducto(Categoria cat, Session session){
		Producto prod1 = new Producto(1,"Camara digital","Cannon",1200,cat);
		Producto prod2 = new Producto(2,"Reloj de pulsera","Casio",200,cat);
		cat.getProductos().add(prod1);
		cat.getProductos().add(prod2);
		session.save(prod1);
		session.save(prod2);
		return prod1;
	}
	
	private static Categoria testCategoria(Session session){
		Categoria cat=new Categoria();
		cat.setIdCat(1);
		cat.setNombre("Electrónica");
		cat.setDescripcion("Artículos eléctricos y electrónicos");
		session.save(cat);
		return cat;
	}
	
	private static void showCategoria(Session session, int idCat){
		Categoria cat=new Categoria();
		cat.setIdCat(idCat);
		cat=session.find(Categoria.class, new Integer(1));
		System.out.println(cat);
	}
	
	private static Cliente testCliente(Session session){
		Cliente clt =new Cliente(1, "Pedro","Guerrero","González");
		Facturacion fact=new Facturacion(clt, "GEGP081088FF5", "Carre 45");
		clt.setFacturacion(fact);
		session.save(clt);
		//session.save(fact);

		return clt;
	}
	private static void testContactos(Session session, Cliente clt){
		TipoContacto tipoC = new TipoContacto(1, "telefono");
		session.save(tipoC);
		
		Contacto cont=new Contacto(new ContactoId(clt.getIdClt(),1), "57458909", tipoC, clt);
		clt.getContactos().add(cont);
		tipoC.getContactos().add(cont);
		session.save(tipoC);
		session.save(cont);
		
		
		
	}
	private static void daoTest(){
		DAOCategoria daoCat = new DAOCategoria();
		Categoria cat=new Categoria();
		cat.setIdCat(1);
		cat.setNombre("Electrónica");
		cat.setDescripcion("Artículo eléctricos");
		
		daoCat.persist(cat);
		System.out.println(cat);
		
		List<Categoria> list = daoCat.findAll();
		System.out.println(list);
		
		daoCat.delete(cat.getIdCat());
		
		
	}
	
    public static void main( String[] args )
    {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        
        //Categoria cat=testCategoria(session);
        //Producto prod=testProducto(cat, session);
        Cliente clt=testCliente(session);
        testContactos(session, clt);
        
        //showCategoria(session, 1);
        
        
        /*
        Categoria cat=new Categoria();
        cat.setNombre("Electrónica");
        cat.setDescripcion("Artículos eléctricos y electrónicos");
        Set<Producto> productos = new HashSet<Producto>();
        
        Producto prod=new Producto(1, "Pantalla LG", "58 pulgadas",25000f,cat);
        productos.add(prod);
        productos.add(new Producto(2, "Blue Ray HP", "Reproductor",2200f,cat));
        productos.add(new Producto(3, "Memoria USB", "Kngston 8GB",500f,cat));
        
        cat.setProductos(productos);
        
        session.save(cat);
        for (Producto producto : productos) {
			session.save(producto);
		}
        
        Cliente clt=new Cliente();
        clt.setIdClt(1);
        clt.setNombre("Juan");
        clt.setPrimAp("Pérez");
        clt.setSegAp("López");
        
        Set<Venta> ventas=new HashSet<Venta>();
        Venta ven = new Venta(1, new Date(12,12,12),clt);
        ventas.add(ven);
        ventas.add(new Venta(2, new Date(11,11,11),clt));
        clt.setVentas(ventas);
        session.save(clt);
        for (Venta venta : ventas) {
			session.save(venta);
		}
        
        VentaDetalle detalle=new VentaDetalle(new VentaDetalleId(prod.getIdProd(), ven.getIdVen()),
        		prod,ven,78);
        session.save(detalle);*/
        
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
