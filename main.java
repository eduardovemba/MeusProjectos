import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class main {
public static void main(String[] args) {


    JFrame frame = new JFrame();
    JLabel label = new JLabel();

    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setLayout(null);
    frame.setSize(300, 300);

    label.setBackground(Color.BLACK);
    label.setOpaque(true);
    label.setBounds(0, 0, 100,100);


    frame.add(label);
    frame.setVisible(true);
   }
}