package model.dataccess;

import java.sql.Connection;
import java.sql.SQLException;

public class MySQLConnection implements DataBaseConnection {

	@Override
	public Connection getDataBaseConnection() throws SQLException, ClassNotFoundException {
		return null;
	}

}
