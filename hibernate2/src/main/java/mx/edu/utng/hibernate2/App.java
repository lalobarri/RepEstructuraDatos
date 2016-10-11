package mx.edu.utng.hibernate2;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mx.edu.utng.hibernate2.orm.Cita;
import mx.edu.utng.hibernate2.orm.Cliente;
import mx.edu.utng.hibernate2.orm.Contrato;
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
        Cliente clt = new Cliente();
        clt.setId(1);
        clt.setNombre("Pablo López");
        clt.setDireccion("Calle Dolores");
        
        Contrato con = new Contrato();
        
        con.setPuesto("Gerente");
        con.setInicio(new Date(12,12,18));
        con.setCliente(clt);
        //clt.setContrato(con); 
        
        session.save(clt);
        session.save(con);
        /*
        Cliente clt = new Cliente();
        clt.setId(1);
        clt.setNombre("Edgar Rodríguez");
        clt.setDireccion("Calle sur 34 No 22");
        //clt.setNacimiento(new Date(12,5,1978));
        //session.save(clt);
        Cita cita=new Cita();
        
        cita.setId(1);
        cita.setTitulo("Clase 1");
        cita.setFecha(new Date(12,12,12));
        cita.setCliente(clt);
        clt.setCita(cita);
        
        session.save(clt);
        session.save(cita);
        
        */
        session.getTransaction().commit();
        HibernateUtils.shutdown();
    }
}
