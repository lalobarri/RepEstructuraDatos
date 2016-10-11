package mx.edu.utng.hibernate06;

import java.util.List;

import javax.persistence.PersistenceException;

import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.LogicalExpression;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

import mx.edu.utng.hibernate06.dao.CategoriaDAO;
import mx.edu.utng.hibernate06.interceptor.HibernateInterceptor;
import mx.edu.utng.hibernate06.orm.Categoria;
import mx.edu.utng.hibernate06.services.CategoriaService;

/**
 * Hello world!
 *
 */
public class App {
	
	public static void testListener(){
		CategoriaDAO catDAO = new CategoriaDAO();
		Session session = catDAO.openCurrentSession(new HibernateInterceptor());
		
		session.beginTransaction();
		Categoria cat= session.load(Categoria.class, new Integer(3));
		System.out.println("Categoria obtenida: "+cat);
		
		Categoria cat1=new Categoria();
		cat1.setIdCat(1);
		cat1.setNombre("Hogar");
		cat1.setDescripcion("Artículos para el hogar");
		
		Categoria cat2 = new Categoria();
		cat2.setIdCat(2);
		cat2.setNombre("Limpieza");
		cat2.setDescripcion("Artículos de limpieza");
		
		Categoria cat3 = new Categoria();
		cat3.setIdCat(3);
		cat3.setNombre("Muebles");
		cat3.setDescripcion("Muebles importados");
		
		session.save(cat1);
		cat.setNombre("Electrónico");
		session.save(cat2);
		session.save(cat3);
		
		session.save(cat);
		session.getTransaction().commit();
		session.close();
		
		
	}
	
	public static void testNamedQuery(){
		CategoriaDAO catDAO = new CategoriaDAO();
		Session session = catDAO.openCurrentSessionwithTransaction();
		
		Query<Categoria> query = session.getNamedQuery("findCategoriaById");
		query.setParameter("id_cat", 5);
		System.out.println(query.getSingleResult());
		
		query = session.getNamedQuery("findCategoriaByName");
		query.setParameter("nombre_cat", "Hogar");
		System.out.println(query.getResultList());
		
		query = session.getNamedNativeQuery("sqlFindCategoriaByDescripcion");
		query.setParameter("descripcion_cat", "%hogar%");
		System.out.println(query.getResultList());
		
	}
	
	public static void main(String[] args) {
		//testLogicalExpression();
		//testPaginacion();
		//testProyecciones();
		//testSQL();
		//testListener();
		testNamedQuery();
		HibernateUtils.shutdown();
	}

}
