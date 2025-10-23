package Chapter3.q3.withUi.forms;

import java.awt.FlowLayout;
import java.util.Iterator;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import Chapter3.q3.withUi.OperationsImp;



public class Show  extends JFrame{
   public Show() {
	   setLayout(new FlowLayout());
	   setSize(500,500);
	   setVisible(true);
	   OperationsImp db=new OperationsImp();
	   db.displayData();
   }
	   
}
   
   