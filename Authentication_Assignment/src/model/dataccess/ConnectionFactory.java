package model.dataccess;

public class ConnectionFactory {
	
	public DataBaseConnection getConnection(String dataBase) {
		if (dataBase != "postgres")
			return new MySQLConnection();
		else if (dataBase == "postgres")
			return new PostgresConnection();
		else
			return null;
	}
}
