package ua.nure.ITKN177.AnastasiyaMinenko.domain.db;

import java.sql.Connection;

public interface ConnectionFactory {

    Connection createConnection() throws DatabaseException;
}
