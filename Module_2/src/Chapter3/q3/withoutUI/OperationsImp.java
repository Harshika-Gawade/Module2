package Chapter3.q3.withoutUI;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OperationsImp implements Operations {

	@Override
	public void insertData(String name, int id, String contact) {
		 
		try {
			PreparedStatement statement = GetConnection.getConnection().prepareStatement("insert into stuinfo values(?,?,?)");
			statement.setString(1, name);
			statement.setInt(2, id);
			statement.setString(3, contact);
			statement.executeUpdate();
			System.out.println("Data Inserted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	@Override
	public void updateData(int id, String name) {
		try {
			PreparedStatement statement = GetConnection.getConnection().prepareStatement("update stuinfo set name =? where id=?");
			statement.setString(1, name);
			statement.setInt(2, id);
			statement.executeUpdate();
			System.out.println("Data Updated");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void deleteData(int id) {
		try {
			PreparedStatement statement = GetConnection.getConnection().prepareStatement("delete from stuinfo where id=?");
			statement.setInt(1, id);
			statement.executeUpdate();
			System.out.println("Data Deleted");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void displayData() {
		try {
			ResultSet set = GetConnection.getConnection().prepareStatement("select * from stuinfo").executeQuery();
			while(set.next()) {
				System.out.println(set.getString(1) + " : " + set.getInt(2)  + " : " + set.getString(3));
			}
			
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	@Override
	public void searchData(int id) {
		try {
			PreparedStatement statement= GetConnection.getConnection().prepareStatement("select * from stuinfo where id=?");
			statement.setInt(1, id);
			ResultSet set=statement.executeQuery();
			while(set.next()) {
				System.out.println(set.getString(1) + " : " + set.getInt(2)  + " : " + set.getString(3));
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	

}
