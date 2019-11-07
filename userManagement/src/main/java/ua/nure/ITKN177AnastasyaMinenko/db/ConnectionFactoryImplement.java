package ua.nure.ITKN177AnastasyaMinenko.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryImplement implements ConnectionFactory {

	private String driver;
	private String url;
	private String user;
	private String password;

	public ConnectionFactoryImplement(String driver, String url, String user, String password) {
		this.driver = driver;
        this.url = url;
        this.user = user;
        this.password = password;
	}

	@Override
	public Connection createConnection() throws DatabaseException {
		String driver = "org.hsqldb.jdbcDriver";
		String url = "jdbc:hsqldb:file:db/usermanagement";
		String user = "sa";
		String password = "";

		try {
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			throw new DatabaseException(e);
		}
		try {
			return DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			throw new DatabaseException(e);
		}
	}

}