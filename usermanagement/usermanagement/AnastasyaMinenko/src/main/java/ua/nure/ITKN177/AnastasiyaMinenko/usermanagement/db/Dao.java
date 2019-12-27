package ua.nure.ITKN177.AnastasiyaMinenko.usermanagment.db;

import java.util.Collection;

public interface Dao<T> {
    T create(T entity) throws DatabaseException;

    void update(T entity) throws DatabaseException;

    void delete(T entity) throws DatabaseException;

    T find(Long id) throws DatabaseException;

    Collection<T> findAll() throws DatabaseException;

    void setConnectionFactory(ConnectionFactory connectionFactory);
}
