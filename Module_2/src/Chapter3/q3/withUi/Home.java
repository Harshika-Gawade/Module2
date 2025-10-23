package Chapter3.q3.withUi;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

import Chapter3.q3.withUi.forms.DeleteForm;
import Chapter3.q3.withUi.forms.InsertForm;
import Chapter3.q3.withUi.forms.SearchForm;
import Chapter3.q3.withUi.forms.Show;
import Chapter3.q3.withUi.forms.UpdateForm;

public class Home extends JFrame {
	JButton button1,button2,button3,button4,button5;
   public Home() {
	setVisible(true);
	setLayout(new FlowLayout());
	setSize(500,500);
	button1=new JButton("Insert Data");
	button1.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new InsertForm();
			
		}
	});
	button2=new JButton("Update Data");
	button2.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new UpdateForm();
			
		}
	});
	button3=new JButton("Delete Data");
	button3.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new DeleteForm();
			
		}
	});
	button4=new JButton("Display Data");
	button4.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new Show();
			
		}
	});
	button5=new JButton("Search Data");
	button5.addActionListener(new ActionListener() {
		
		@Override
		public void actionPerformed(ActionEvent e) {
			new SearchForm();
			
		}
	});
	add(button1);
	add(button2);
	add(button3);
	add(button4);
	add(button5);
}
   public static void main(String[] args) {
	new Home();
}
}
