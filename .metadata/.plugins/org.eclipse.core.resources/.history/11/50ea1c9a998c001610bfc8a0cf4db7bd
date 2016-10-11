package mx.edu.utng.hibernate05.dao;

import java.util.List;

public interface BaseDAO<T, Id extends java.io.Serializable> {

	public void persist(T entity);

	public void update(T entity);

	public T findById(Id id);

	public void delete(T entity);

	public List<T> findAll();

	public void deleteAll();
}
