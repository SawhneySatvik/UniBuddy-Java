package UniBuddy;

import javax.swing.*;
import java.awt.*;

public class map1 extends JFrame{

    map1(){
        ImageIcon image1a = new ImageIcon(ClassLoader.getSystemResource("Pictures/3416941023_5520db887b_c.jpg"));
        Image image1b = image1a.getImage().getScaledInstance(1460, 780, Image.SCALE_DEFAULT);
        ImageIcon image1c = new ImageIcon(image1b);
        JLabel image1 = new JLabel(image1c);
        add(image1);

        setLocation(250, 100);
        setSize(1600, 1000);
        setVisible(true);
    }

    public static void main(String[] args) {
        new map1();
    }
}
