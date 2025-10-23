package Chapter3.q3.withUi.forms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Chapter3.q3.withUi.OperationsImp;


public class InsertForm extends JFrame{
	JLabel label1,label2,label3;
	JTextField field1,field2,field3;
	JButton button1,button2;
    public InsertForm() {
    	setLayout(new FlowLayout());
		setSize(500,500);
		setVisible(true);
		label1=new JLabel("Name : ");
		label2=new JLabel("Id :");
		label3=new JLabel("Contact");
		field1=new JTextField(20);
		field2=new JTextField(20);
		field3=new JTextField(20);
		button1=new JButton("Submit");
		button1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				OperationsImp db=new OperationsImp();
				db.insertData(field1.getText(), Integer.parseInt(field2.getText()), field3.getText());
				System.out.println("Data Inserted");
			}
		});
		button2=new JButton("Reset");
		add(label1);
		add(field1);
		add(label2);
		add(field2);
		add(label3);
		add(field3);
	    add(button1);
	    add(button2);
    }
    public static void main(String[] args) {
		new InsertForm();
	}
}
