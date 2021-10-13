import javax.swing.*;
import java.awt.event.*;
public class CurrencyConverter {

    public static void main(String args[]){
        converter();
    }

    public static void converter(){
        JFrame f = new JFrame("CONVERTER");
        // Lable for currency
        JLabel l1, l2;

        // FOr Enterring text in java
        JTextField t1 , t2;

        // Buttons....
        // JButton b1, b2, b3;
        JButton b3, b4;

        l1 = new JLabel("Rupees:");
        l1.setBounds(20, 40, 100, 30);

        l2 = new JLabel("Dollar:");
        l2.setBounds(20, 90, 100, 30);

        t1 = new JTextField("0");
        t1.setBounds(80, 40, 150, 30);
        t2 = new JTextField("0");
        t2.setBounds(80, 90, 150, 30);



        b3 = new JButton("CONVERT TO DOLLAR");
        b3.setBounds(250, 40, 160, 30);

        b4 = new JButton("CONVERT TO RUPEES");
        b4.setBounds(250, 90, 160, 30);

        
        b3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e)
            {
                double d = Double.parseDouble(t1.getText());

                double d1 = (d/ 72.90);

                String str1 = String.valueOf(d1);

                t2.setText(str1);
            }
        });

        b4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                double d2 = Double.parseDouble(t2.getText());
                double d3 = (d2 * 62.25);

                String str2 = String.valueOf(d3);
                t1.setText(str2);
            }
        });

        f.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e)
            {
                System.exit(0);
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(b3);
        f.add(b4);

        f.setLayout(null);
        f.setSize(400, 300);
        f.setVisible(true);

    }

    
}