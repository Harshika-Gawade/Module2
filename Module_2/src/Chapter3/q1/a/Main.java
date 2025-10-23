package Chapter3.q1.a;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
  public static void main(String[] args) throws ClassNotFoundException, SQLException {
	  Class.forName("com.mysql.jdbc.Driver");
	 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdacM2Project","root","");
	 Statement statement=connection.createStatement();
	 statement.executeUpdate("insert into stuinfo values('harshika',1,'1333333')");
	 System.out.println("Data inserted");
	 connection.close(); 
}
}
