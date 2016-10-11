package mx.edu.utng.hibernate03;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mx.edu.utng.hibernate03.orm.Categoria;
import mx.edu.utng.hibernate03.orm.Cliente;
import mx.edu.utng.hibernate03.orm.Producto;
import mx.edu.utng.hibernate03.orm.Venta;
import mx.edu.utng.hibernate03.orm.VentaDetalle;
import mx.edu.utng.hibernate03.orm.VentaDetalleId;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        
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
        session.save(detalle);
        
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
