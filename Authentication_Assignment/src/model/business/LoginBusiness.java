package model.business;

import java.sql.SQLException;

import model.dataccess.LoginDataAccess;

public class LoginBusiness {
	
	private static LoginBusiness instance;
	private String userName;
	private String password;
	
	private LoginBusiness(String usern, String pass) 
	{
		this.userName = usern;
		this.password = pass;
	}
	
	public static LoginBusiness getInstance() {
		
		if (instance == null) {
			instance = new LoginBusiness("", "");
		}
		return instance;
	}
	
	public boolean verifyCredentials() throws ClassNotFoundException, SQLException {
		return LoginDataAccess.getInstance().verifyCredentials();
	}
	
	public void setUserName (String usern) {
		this.userName = usern;
	}
	
	public void setPassword (String pass) {
		this.password = pass;
	}
}
