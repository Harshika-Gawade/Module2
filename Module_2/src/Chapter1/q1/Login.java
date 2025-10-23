package Chapter1.q1;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class Login  extends JFrame{
	JLabel label1,label2;
	JTextField field1,field2;
	JButton button1,button2;
     public Login() {
    	setLayout(new FlowLayout());
		setVisible(true);
		setSize(500,500);
		label1=new JLabel("Username");
		label2=new JLabel("Password");
		field1=new JTextField(20);
		field2=new JTextField(20);
		button1=new JButton("Submit");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				try {
					ResultSet set = GetConnection.getConnection().prepareStatement("select * from info").executeQuery();
					set.next();
					String u=set.getString(1);
					String p=set.getString(2);
					if(field1.getText().equals(u) && field2.getText().equals(p)) {
						System.out.println("Logged in Successfull");
					}
					else {
						System.out.println("Unable to log in ");
					}
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				
				
			}
		});
		button2=new JButton("Reset");
		add(label1);
		add(field1);
		add(label2);
		add(field2);
		add(button1);
		add(button2);
		
	}
     public static void main(String[] args) {
		new Login();
	}
}
