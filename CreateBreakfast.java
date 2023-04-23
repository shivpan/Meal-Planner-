package application;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CreateBreakfast
{
    public static void CBDB(String rname) 
    {

        String url = "jdbc:postgresql://localhost:5432/Diet Planner";
        String username = "postgres";
        String password = "Aditi@0510";

        String name = rname;

        
        String query = "INSERT INTO BREAKFAST(rname) VALUES(?)";

        try 
       
        (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement p = con.prepareStatement(query)) 
        {

            p.setString(1,name);

            p.executeUpdate();
            System.out.println("Sucessfully created.");
        }
    
        catch (Exception e)
        {
        	System.out.println("ERROR CONNECTION");
        	System.out.println(e);
        }

    }

}
