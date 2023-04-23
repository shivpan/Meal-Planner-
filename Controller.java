package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Controller 
{
	 @FXML
	 private Button signup,login,breakfast,lunch,dinner,getr,getrL,getrb,getrqs;
	 @FXML
	 private Button saveqs;
	 @FXML
	 private Button myrec;
	 @FXML
	 private Button trial;
	 @FXML
	 private PasswordField pass;
	 @FXML
	 private Button cc;
	 @FXML
	 private TextField uname;
	 @FXML
	 private TextField uid;
	 @FXML
	 private TextField uheight;
	 @FXML
	 private TextField uweight;
	 @FXML
	 private TextField intake;
	 @FXML
	 private TextArea rname;
	 @FXML
	 private TextArea lname;
	 @FXML
	 private TextArea instr;
	 @FXML 
	 private TextField ingre;
	 @FXML
	 private Button saverecipe;
	 @FXML
	 private TextField uname1;
	 @FXML
	 private PasswordField pass1;
	 @FXML
	 private  Label rnamee;
	 @FXML
	 private  Label instructions;
	 @FXML
	 private  Label ingredients;
	 Connection conn;
	 PreparedStatement pst = null;
	 ResultSet rs = null; 

 private Stage stage;
 private Scene scene;
 private Parent root;
 
 //Scene switch to Login
 public void UserLogin(ActionEvent event) throws IOException
 {
  root = FXMLLoader.load(getClass().getResource("UserLogin.fxml"));
  stage = (Stage)((Node)event.getSource()).getScene().getWindow();
  scene = new Scene(root);
  stage.setScene(scene);
  stage.show();
 }
 
public class App extends Application 
{
	 public static void main(String[] args) throws Exception 
	 {
	 launch(args);
	 }
	  
	  @Override
	  public void start(Stage arg0) throws Exception 
	  {
	  Parent root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
	  Scene sc = new Scene(root);
	  arg0.setScene(sc);
	  arg0.setTitle("DPDB");
	  arg0.show();
	 }
}
 
//Scene switch to Admin login
public void AdminLogin(ActionEvent event) throws IOException 
{
 Parent root = FXMLLoader.load(getClass().getResource("AdminLogin.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}
 
//Scene switch to Admin create
public void AdminCreate(ActionEvent event) throws IOException 
{
 Parent root = FXMLLoader.load(getClass().getResource("AdminCreate.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene sitch userLogin to signup
public void SignUp(ActionEvent event) throws IOException 
{
 root = FXMLLoader.load(getClass().getResource("SignUp.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene switch to Main Menu
@FXML
public void AfterLogin(ActionEvent event) throws IOException, SQLException
{
	
System.out.println(uname1.getText());
System.out.println(pass1.getText());
String usern = uname1.getText();
String passw = pass1.getText();
JdbcDao jdbcDao = new JdbcDao();
boolean flag = jdbcDao.validate(usern,passw);
if (!flag) 
    {	
	root = FXMLLoader.load(getClass().getResource("Wrong.fxml"));
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
    System.out.println("Wrong");       
    } 
else
{
 root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
 }
}

//
public void MainMenu(ActionEvent event) throws IOException
{
root = FXMLLoader.load(getClass().getResource("MainMenu.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

//Scene switch main menu to suggested-time
public void SuggestedTime(ActionEvent event) throws IOException
{
 root = FXMLLoader.load(getClass().getResource("SuggestedTime.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene switch Suggested time to Breakfast
public void BreakFast(ActionEvent event) throws IOException
{
 root = FXMLLoader.load(getClass().getResource("Breakfast.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();	
}

//Scene switch Suggested time to Lunch
public void Lunch(ActionEvent event) throws IOException
{
 root = FXMLLoader.load(getClass().getResource("Lunch.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene Switch Suggested to Dinner
public void Dinner(ActionEvent event) throws IOException
{
 root = FXMLLoader.load(getClass().getResource("Dinner.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene switch Main menu to Snacks
public void QuickSnack(ActionEvent event) throws IOException
{
 root = FXMLLoader.load(getClass().getResource("QuickSnack.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene switch to Create recipee
public void CreateRecipee(ActionEvent event) throws IOException 
{
 root = FXMLLoader.load(getClass().getResource("CreateRecipee.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene switch to Myrecipee
public void MyRecipee(ActionEvent event) throws IOException 
{
 root = FXMLLoader.load(getClass().getResource("MyRecipee.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//Scene switch to list
public void List(ActionEvent event) throws IOException
{
 root = FXMLLoader.load(getClass().getResource("List.fxml"));
 stage = (Stage)((Node)event.getSource()).getScene().getWindow();
 scene = new Scene(root);
 stage.setScene(scene);
 stage.show();
}

//for create recipe
public void SaveRecipe(ActionEvent event) throws IOException
{
System.out.println(rname.getText());	 
CreateRecipeDB.CRDB(rname.getText());
}

//for create lunch
public void SaveLunch(ActionEvent event) throws IOException
{
System.out.println(lname.getText());	 
CreateLunch.CLDB(lname.getText());
}

//for create breakfast
public void SaveBreakfast(ActionEvent event) throws IOException
{
System.out.println(lname.getText());
CreateBreakfast.CBDB(lname.getText());
}

//for create breakfast
public void SaveDinner(ActionEvent event) throws IOException
{
System.out.println(lname.getText());	 
CreateDinner.CDDB(lname.getText());
}

//for create quicksnack
public void SaveQuickSnack(ActionEvent event) throws IOException
{
System.out.println(lname.getText());	 
CreateQuickSnack.CQSDB(lname.getText());
}

//for create SignUP
public void SaveSignUp(ActionEvent event) throws IOException
{
	root = FXMLLoader.load(getClass().getResource("Right.fxml"));
	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
	scene = new Scene(root);
	stage.setScene(scene);
	stage.show();
	  System.out.println(uname.getText());
	  System.out.println(pass.getText());
	  System.out.println(uid.getText());
	  System.out.println(uheight.getText());
	  System.out.println(uweight.getText());
	  System.out.println(intake.getText());
	 
	  SignUpDB.SignDatabase(uname.getText(),pass.getText(),uid.getText(),uheight.getText(), uweight.getText(), intake.getText());

}

public static Connection connect_db() throws SQLException
{
    String url = "jdbc:postgresql://localhost:5432/Diet Planner";
    String username = "postgres";
    String password = "Aditi@0510";
    return DriverManager.getConnection(url,username,password);
}
public void getr(ActionEvent event) throws IOException
{
	String query2 = "SELECT rname FROM DINNER ORDER BY RANDOM() LIMIT 1;";
	String ret="";
	 try(Connection conn = connect_db();
			 
			 PreparedStatement pstmp = conn.prepareStatement(query2);)

     {
		 
		 
    ResultSet rstm=pstmp.executeQuery();

               
                while(rstm.next())
                {
                          ret += rstm.getString("rname");
                                                                        
                }
               
            }
    catch(SQLException ex)
    {
    System.err.println("Error:" + ex);
    }
	
	 rnamee.setText(ret);
}

public void getlunch(ActionEvent event) throws IOException
{
	String query2 = "SELECT rname FROM LUNCH ORDER BY RANDOM() LIMIT 1;";

	String ret="";

	 try(Connection conn = connect_db();
			 
			 PreparedStatement pstmp = conn.prepareStatement(query2);)

     {
		 
		 
    ResultSet rstm=pstmp.executeQuery();

               
                while(rstm.next())
                {
                          ret += rstm.getString("rname");
                                                                        
                }
 
                
            }
    catch(SQLException ex)
    {
    System.err.println("Error:" + ex);
    }
	

	 rnamee.setText(ret);
}

public void getbf(ActionEvent event) throws IOException
{
	String query2 = "SELECT rname FROM BREAKFAST ORDER BY RANDOM() LIMIT 1;";
	String ret="";

	 try(Connection conn = connect_db();
			 
			 PreparedStatement pstmp = conn.prepareStatement(query2);)

     {
		 
		 
    ResultSet rstm=pstmp.executeQuery();

               
                while(rstm.next())
                {
                          ret += rstm.getString("rname");
                                                                        
                }
                
            }
    catch(SQLException ex)
    {
    System.err.println("Error:" + ex);
    }
	
	 rnamee.setText(ret);
}

public void getrqs(ActionEvent event) throws IOException
{
	String query2 = "SELECT rname FROM QUICKSNACK ORDER BY RANDOM() LIMIT 1;";

	String ret="";

	 try(Connection conn = connect_db();
			 
			 PreparedStatement pstmp = conn.prepareStatement(query2);)

     {
		 
		 
    ResultSet rstm=pstmp.executeQuery();

               
                while(rstm.next())
                {
                          ret += rstm.getString("rname");
                                                                        
                }

                
            }
    catch(SQLException ex)
    {
    System.err.println("Error:" + ex);
    }
	

	 rnamee.setText(ret);
}

public void getmyrec(ActionEvent event) throws IOException
{
	String query2 = "SELECT rname FROM CreateRecipe ORDER BY RANDOM() LIMIT 1;";
	String ret="";
	 try(Connection conn = connect_db();
			 
			 PreparedStatement pstmp = conn.prepareStatement(query2);)

     {
		 
		 
    ResultSet rstm=pstmp.executeQuery();

               
                while(rstm.next())
                {
                          ret += rstm.getString("rname");
                                                                        
                }

                
            }
    catch(SQLException ex)
    {
    System.err.println("Error:" + ex);
    }
	
	 rnamee.setText(ret);
   }



}




