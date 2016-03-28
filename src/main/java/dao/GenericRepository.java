package dao;

import java.util.Collection;
import java.util.List;
import java.util.Map;

import org.hibernate.Criteria;

import model.AbstractEntity;

public interface GenericRepository<T extends AbstractEntity> {

	public abstract Collection<T> list();

	public abstract T find(Long id);

	public abstract void remove(T entity);
	
	public abstract void delete(Long id);

	public abstract T save(T entity);
	
	@SuppressWarnings("rawtypes")
	public abstract Criteria createCriteria(Class clazz);
	
	@SuppressWarnings("rawtypes")
	public abstract List findLike (Class clazz, String fieldName);

	@SuppressWarnings("rawtypes")
	public List find(Class clazz, Map<String, Object> map);
	
}