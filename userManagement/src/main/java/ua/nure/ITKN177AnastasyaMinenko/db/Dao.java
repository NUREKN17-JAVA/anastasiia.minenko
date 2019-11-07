package ua.nure.ITKN177AnastasyaMinenko.db;

import java.util.Collection;

import ua.nure.ITKN177AnastasyaMinenko.db.DatabaseException;

public interface Dao<T> {
	T create(T entity) throws DatabaseException;

	void update(T entity) throws DatabaseException;

	void delete(T entity) throws DatabaseException;

	T find(long id) throws DatabaseException;

	Collection<T> findAll() throws DatabaseException;
	
	
	void setConnectionFactory(ConnectionFactory connectionFactory);
}