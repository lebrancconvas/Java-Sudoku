package sudoku;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Main extends JFrame implements ActionListener {
    JFrame frame;
    JTextField t1, t2;
    JButton b1;
    Main() {
        //Set TextField
        t1 = new JTextField();
        t1.setBounds(100,100,200,50);
        t2 = new JTextField();
        t2.setBounds(100, 250, 200, 50);
        t2.setEditable(false);

        //Set Button
        b1 = new JButton("Calculate");
        b1.setBounds(100, 400, 100, 50);
        b1.addActionListener(this);

        //Add Components
        add(t1); add(t2); add(b1);

        //Frame Setting
        setSize(800, 800);
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        String s1 = t1.getText();
        long a = Long.parseLong(s1);
        long b = 0;
        if(e.getSource() == b1) {
            b = factorial(a);
        }
        String result = String.valueOf(b);
        t2.setText(result);
    }

    public long factorial(long number) {
        long result = 1;
        for(long i = 1; i <= number; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        new Main();
    }
}