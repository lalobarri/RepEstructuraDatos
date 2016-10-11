package mx.edu.utng.hibernate04.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.OptimisticLockException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

import mx.edu.utng.hibernate04.HibernateUtils;
import mx.edu.utng.hibernate04.orm.Categoria;

public class DAOCategoria implements DAOBase<Categoria, Integer>{
	
	private SessionFactory factory = HibernateUtils.getSessionFactory();
	private Session session = null;
	
	public void closeSession(){
		if(session!=null){
			if(session.isOpen()){
				session.close();
			}
		}
	}
	
	public void openSession(){
		closeSession();
		session = factory.openSession();
	}

	public void persist(Categoria entity) {
		try{
			openSession();
			session.beginTransaction();
			session.save(entity);
			session.getTransaction().commit();
			closeSession();
		}catch(HibernateException he){
			System.out.println(he.getMessage());
			he.printStackTrace();
		}
		
	}

	public void update(Categoria entity) {
		try{
			openSession();
			session.beginTransaction();
			session.update(entity);
			session.getTransaction().commit();
			closeSession();
		}catch(HibernateException he){
			System.out.println(he.getMessage());
			he.printStackTrace();
		}
	}

	public Categoria findById(Integer id) {
		try{
			openSession();
			session.beginTransaction();
			Categoria cat=session.find(Categoria.class, id);
			session.getTransaction().commit();
			closeSession();
			return cat;
		}catch(HibernateException he){
			System.out.println(he.getMessage());
			he.printStackTrace();
			return null;
		}
		
	}

	public List<Categoria> findAll() {
		try{
			openSession();
			List<Categoria> lista = new ArrayList<Categoria>();
			session.beginTransaction();
			List list= session.createQuery("from Categoria").getResultList();
			for (Object object : list) {
				if(object instanceof Categoria){
					lista.add((Categoria)object);
				}
			}
			session.getTransaction().commit();
			closeSession();
			return list;
		}catch(HibernateException he){
			System.out.println(he.getMessage());
			he.printStackTrace();
			return null;
		}
	}

	public void deleteAll() {
		try{
			openSession();
			session.beginTransaction();
			session.createQuery("delete from Categoria").executeUpdate();
			session.getTransaction().commit();
			closeSession();
		}catch(HibernateException he){
			System.out.println(he.getMessage());
			he.printStackTrace();
			
		}
	}

	public void delete(Integer id) {
		try{
			openSession();
			session.beginTransaction();
			session.delete(id);
			session.getTransaction().commit();
			closeSession();
		}catch(HibernateException he){
			System.out.println(he.getMessage());
			he.printStackTrace();
			
		}
		
	}

}
