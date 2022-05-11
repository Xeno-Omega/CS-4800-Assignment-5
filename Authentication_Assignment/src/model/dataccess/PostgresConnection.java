package model.dataccess;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class PostgresConnection implements DataBaseConnection {

	private static final String URL = "jdbc:postgresql://localhost:5432/authentication";

	private static final String USER = "postgres";

	private static final String PWD = "123";
	
	public Connection getDataBaseConnection() throws SQLException, ClassNotFoundException {
		Class.forName("org.postgresql.Driver");
		return DriverManager.getConnection(PostgresConnection.URL, PostgresConnection.USER, PostgresConnection.PWD);
	}
}
