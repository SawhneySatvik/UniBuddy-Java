package UniBuddy;

import javax.swing.*;
import java.awt.*;

public class map2 extends JFrame{

    map2(){
        ImageIcon image1a = new ImageIcon(ClassLoader.getSystemResource("Pictures/trichy-campus-layout.jpg"));
        Image image1b = image1a.getImage().getScaledInstance(1460, 780, Image.SCALE_DEFAULT);
        ImageIcon image1c = new ImageIcon(image1b);
        JLabel image1 = new JLabel(image1c);
        add(image1);

        setLocation(250, 100);
        setSize(1600, 1000);
        setVisible(true);
    }

    public static void main(String[] args) {
        new map2();
    }
}