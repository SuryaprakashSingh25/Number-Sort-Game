package JavaProject;
import java.sql.*;
import javax.swing.*;
public class sqliteConnection {
	Connection conn = null;
  public static Connection dbConnector() {
	  try {
		  Class.forName("org.sqlite.JDBC");
		  Connection conn=DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Suraj\\eclipse-workspace\\PlayerLoginGame.db");
		  JOptionPane.showMessageDialog(null, "Connection Successful");
		  return conn;
	  }
	  catch(Exception e){
		  JOptionPane.showMessageDialog(null, e);
		  return null;
	  }
  }
}
