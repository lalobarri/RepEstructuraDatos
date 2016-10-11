package mx.edu.utng.hibernate1;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	private static final SessionFactory sessionFactory = createSessionFactory();
	
	private static final SessionFactory createSessionFactory(){
		return new Configuration().configure().buildSessionFactory();
	}
	public static SessionFactory getSessionFactory(){
		return sessionFactory;
	}
	public static void shutdown(){
		getSessionFactory().close();
	}
	

}
