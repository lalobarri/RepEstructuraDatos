package mx.edu.utng.hibernate05.services;

import java.util.List;

import mx.edu.utng.hibernate05.dao.CategoriaDAO;
import mx.edu.utng.hibernate05.orm.Categoria;

public class CategoriaService {
	private CategoriaDAO dao = new CategoriaDAO();
	
	public void persist(Categoria entity) {
		dao.openCurrentSessionwithTransaction();
		dao.persist(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public void update(Categoria entity) {
		dao.openCurrentSessionwithTransaction();
		dao.update(entity);
		dao.closeCurrentSessionwithTransaction();

	}

	public Categoria findById(Integer id) {
		dao.openCurrentSessionwithTransaction();
		Categoria cat=dao.findById(id);
		dao.closeCurrentSessionwithTransaction();
		return cat;
	}

	public void delete(Categoria entity) {
		dao.openCurrentSessionwithTransaction();
		dao.delete(entity);
		dao.closeCurrentSessionwithTransaction();
	}

	public List<Categoria> findAll() {
		dao.openCurrentSessionwithTransaction();
		List<Categoria> list = dao.findAll();
		dao.closeCurrentSessionwithTransaction();
		return list;
	}

	public void deleteAll() {
		dao.openCurrentSessionwithTransaction();
		dao.deleteAll();
		dao.closeCurrentSessionwithTransaction();
	}
}
