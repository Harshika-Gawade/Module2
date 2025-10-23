package Chapter1.q2;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Signup extends JFrame{
	JLabel label1,label2,label3,label4;
	JTextField field1,field2,field3,field4;
	JButton button1,button2;
    public Signup() {
     setLayout(new FlowLayout());
	 setVisible(true);
	 setSize(500,500);
	 label1=new JLabel("Name");
	 label2=new JLabel("Contact");
	 label3=new JLabel("Gender");
	 label4=new JLabel("City");
	 field1=new JTextField(20);
	 field2=new JTextField(20);
	 field3=new JTextField(20);
	 field4=new JTextField(20);
	 button1=new JButton("Submit");
	 button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			try {
				PreparedStatement statement=GetConnection.getConnection().prepareStatement("insert into info values(?,?,?,?)");
				statement.setString(1, field1.getText());
				statement.setString(2, field2.getText());
				statement.setString(3, field3.getText());
				statement.setString(4, field4.getText());
				statement.executeUpdate();
				System.out.println("Data inserted into database");
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			
			
		}
	});
	 button2=new JButton("Reset");
	 button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			field1.setText(" ");
			field2.setText(" ");
			field3.setText(" ");
			field4.setText(" ");
			System.out.println("Data reseted");
			
		}
	});
	 add(label1);
	 add(field1);
	 add(label2);
	 add(field2);
	 add(label3);
	 add(field3);
	 add(label4);
	 add(field4);
	 add(button1);
	 add(button2);
	 }
    
    public static void main(String[] args) {
	   new Signup();
	}
}
