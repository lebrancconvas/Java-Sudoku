package sudoku;
import javax.swing.*;

public class Main extends JFrame {
    JFrame frame;
    Main() {
        JButton button = new JButton("Button 1");
        button.setBounds(100, 100, 100, 100);
        add(button);
        setSize(500, 500);
        setLayout(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }
}