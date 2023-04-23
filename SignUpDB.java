package application;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class SignUpDB
{

    public static void SignDatabase(String Name,String Password, String UserId,String Height,String Weight,String CalorieIn) 
    {

        String url = "jdbc:postgresql://localhost:5432/Diet Planner";
        String username = "postgres";
        String password = "Aditi@0510";

        String name = Name;
        String Id = UserId;
        String H = Height;
        String W = Weight;
        String In = CalorieIn;
        String P=Password;
        
        String query = "INSERT INTO SignUp(name,password,userid,height,weigth,calorieintake) VALUES(?,?,?,?,?,?)";

        try 
       
        (Connection con = DriverManager.getConnection(url, username, password);
             PreparedStatement p = con.prepareStatement(query)) 
        {

            p.setString(1, name);
            p.setString(2,P);
            p.setString(3, Id);
            p.setString(4,H);
            p.setString(5,W);
            p.setString(6,In);
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