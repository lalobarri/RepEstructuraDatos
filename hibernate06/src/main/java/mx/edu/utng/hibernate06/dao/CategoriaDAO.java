package mx.edu.utng.hibernate06.dao;

import java.util.List;

import mx.edu.utng.hibernate06.orm.Categoria;

public class CategoriaDAO extends GenericDAO implements
		BaseDAO<Categoria, Integer> {

	public void persist(Categoria entity) {
		getCurrentSession().save(entity);

	}

	public void update(Categoria entity) {
		getCurrentSession().update(entity);

	}

	public Categoria findById(Integer id) {
		Categoria cat = (Categoria) getCurrentSession().get(Categoria.class, id);
		return cat;
	}

	public void delete(Categoria entity) {
		getCurrentSession().delete(entity);

	}

	public List<Categoria> findAll() {
		List<Categoria> categorias = getCurrentSession().createQuery("from Categoria",Categoria.class).getResultList();
		return categorias;
	}

	public void deleteAll() {
		List<Categoria> entityList = findAll();
		for (Categoria entity : entityList) {
			delete(entity);
		}
	}
}
