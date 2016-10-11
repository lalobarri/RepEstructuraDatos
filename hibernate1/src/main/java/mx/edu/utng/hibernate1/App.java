package mx.edu.utng.hibernate1;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mx.edu.utng.hibernate1.orm.Cliente;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //Configuration conf=new Configuration().configure();
        //SessionFactory sessionFactory = conf.buildSessionFactory();
        //Session session = sessionFactory.openSession();
    	Session session = HibernateUtils.getSessionFactory().openSession();
        session.beginTransaction();
        Cliente clt = new Cliente();
        clt.setId(1);
        clt.setNombre("Juan Pérez");
        clt.setDireccion("Calle Guadalupe #32");
        //clt.setNacimiento(new Date(12,5,1978));
        session.save(clt);
        
        List<Cliente> lista = (List<Cliente>)session.createQuery("from Cliente").getResultList();
        for (Cliente c: lista) {
        	System.out.println(c);
			
		}
        session.getTransaction().commit();
        session.close();
        
        //Session session = HibernateUtils.getSessionFactory().openSession();
        
        Cliente clt2 = new Cliente();
        //clt2.set
        //session.delete(clt2);
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
