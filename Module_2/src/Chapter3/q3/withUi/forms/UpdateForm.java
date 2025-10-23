package Chapter3.q3.withUi.forms;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import Chapter3.q3.withUi.OperationsImp;



public class UpdateForm extends JFrame{
	JLabel label1,label2;
	JTextField field1,field2;
	JButton button1,button2;
   public UpdateForm() {
	   setLayout(new FlowLayout());
	   setSize(500,500);
	   setVisible(true);
	   label1=new JLabel("Id : ");
	   label2=new JLabel("Name : ");
	   field1=new JTextField(20);
	   field2=new JTextField(20);
	   button1=new JButton("Submit");
	   button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			OperationsImp db=new OperationsImp();
			db.updateData(Integer.parseInt(field1.getText()), field2.getText());
			System.out.println("Data Updated");
			
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
}
