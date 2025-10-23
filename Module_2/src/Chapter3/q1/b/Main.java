package Chapter3.q1.b;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Main {
	  public static void main(String[] args) throws ClassNotFoundException, SQLException {
		  Class.forName("com.mysql.jdbc.Driver");
		 Connection connection=DriverManager.getConnection("jdbc:mysql://localhost:3306/sdacM2Project","root","");
		 PreparedStatement  statement=connection.prepareStatement("insert into stuinfo values(?,?,?)");
		 statement.setString(1, "Harshika");
		 statement.setInt(2, 2);
		 statement.setString(3, "222222");
		 statement.executeUpdate();
		 System.out.println("DATA INSERTED");
		 connection.close();
	}
	}

