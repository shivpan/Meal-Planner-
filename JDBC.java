package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBC {
       //  jdbc url
     //    jdbc username
       //jdbc password
	private final String url ="jdbc:postgresql://localhost/Diet Planner";
	private final String user = "postgres";
	private final String password ="Aditi@0510";
	
	private void connect() {
		try(Connection connection=DriverManager.getConnection(url, user, password);){
		if(connection !=null) {
			System.out.println("Connected to POstgreSQL server successfully!!!");
		}else {
			System.out.println("Failed to connect to PostgreSQL server.");
		}
			
		}catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		     }
		 }
		
	public static void main(String[]args) {
		JDBC sqlConnect = new JDBC();
	    sqlConnect.connect();
		
	}
}
	





	

