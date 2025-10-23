package Chapter3.q3.withUi.forms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Chapter3.q3.withUi.OperationsImp;



public class DeleteForm extends JFrame {
	JLabel label1;
	JTextField field1;
	JButton button1,button2;
    public DeleteForm() {
       setLayout(new FlowLayout());
 	   setSize(500,500);
 	   setVisible(true);
 	   label1=new JLabel("Id : ");
 	   field1=new JTextField(20);
 	   button1=new JButton("Submit");
 	   button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			OperationsImp db=new OperationsImp();
			db.deleteData(Integer.parseInt(field1.getText()));
			System.out.println("Data Deleted");
			
		}
	});
 	   button2=new JButton("Reset");
 	   add(label1);
 	   add(field1);
 	   add(button1);
 	   add(button2);
    }
}
