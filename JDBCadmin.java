package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class JDBCadmin 
{
	    private static final String DATABASE_URL = "jdbc:postgresql://localhost:5432/Diet Planner?useSSL=false";
	    private static final String DATABASE_USERNAME = "postgres";
	    private static final String DATABASE_PASSWORD = "Aditi@0510";
	    private static final String SELECT_QUERY = "SELECT * FROM AdminLogin WHERE username = ? and pass = ?";

	    public boolean validate(String usern, String passw) throws SQLException {

	        // Step 1: Establishing a Connection and 
	        // try-with-resource statement will auto close the connection.
	        try (Connection connection = DriverManager
	            .getConnection(DATABASE_URL, DATABASE_USERNAME, DATABASE_PASSWORD);

	            // Step 2:Create a statement using connection object
	            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_QUERY)) {
	            preparedStatement.setString(1, usern);
	            preparedStatement.setString(2, passw);

	            System.out.println(preparedStatement);

	            ResultSet resultSet = preparedStatement.executeQuery();
	            if (resultSet.next()) {
	                return true;
	            }


	        } catch (SQLException e) {
	            // print SQL exception information
	            System.out.println("Wrong");
	        }
	        return false;
	    }
}
