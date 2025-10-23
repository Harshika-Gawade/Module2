package Chapter1.q6;

import java.awt.FlowLayout;
import javax.swing.*;

public class Master extends JFrame {
    JMenuBar menuBar;
    JMenu menu1, menu2, menu3, menu4, menu5;
    JMenuItem item1, item2, item3, item4, item5, item6, item7, item8, item9, item10, item11, item12;
    JToolBar toolBar;
    JButton b1, b2, b3, b4;

    public Master() {
        setVisible(true);
        setSize(500,500);
        setLayout(new FlowLayout());

        toolBar = new JToolBar();
        
        b1 = new JButton("Home");
        b2 = new JButton("Doctor");
        b3 = new JButton("Patient");
        b4 = new JButton("Exit");
        
        toolBar.add(b1);
        toolBar.add(b2);
        toolBar.add(b3);
        toolBar.addSeparator();
        toolBar.add(b4);

        add(toolBar);
        menuBar = new JMenuBar();
        menu1 = new JMenu("Home");
        menu2 = new JMenu("Doctor");
        menu3 = new JMenu("Patient");
        menu4 = new JMenu("Accounts");
        menu5 = new JMenu("Ngo Accounts");

        item1 = new JMenuItem("About US");
        item2 = new JMenuItem("Services");
        item3 = new JMenuItem("Location");
        item4 = new JMenuItem("Exit");
        menu1.add(item1);
        menu1.add(item2);
        menu1.add(item3);
        menu1.add(item4);
        menuBar.add(menu1);

        item5 = new JMenuItem("Doctor Info");
        item6 = new JMenuItem("Doctor Registration");
        item7 = new JMenuItem("Payment");
        menu2.add(item5);
        menu2.add(item6);
        menu2.add(item7);
        menuBar.add(menu2);

        item8 = new JMenuItem("Patient Details");
        item9 = new JMenuItem("Billing");
        item10 = new JMenuItem("Registration");
        menu3.add(item8);
        menu3.add(item9);
        menu3.add(item10);
        menuBar.add(menu3);

        item11 = new JMenuItem("With gst");
        item12 = new JMenuItem("Payment Details");
        menu5.add(item12);
        menu4.add(item11);
        menu4.add(menu5);
        menuBar.add(menu4);

        add(menuBar);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Master();
    }
}
