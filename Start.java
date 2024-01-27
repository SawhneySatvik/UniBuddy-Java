package UniBuddy;

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame implements Runnable{
    
    Thread t;
    Start(){

        ImageIcon image1a = new ImageIcon(ClassLoader.getSystemResource("Pictures/mainLogin.jpeg"));
        Image image1b = image1a.getImage().getScaledInstance(1460, 780, Image.SCALE_DEFAULT);
        ImageIcon image1c = new ImageIcon(image1b);
        JLabel image1 = new JLabel(image1c);
        add(image1);

        /*ImageIcon image1a = new ImageIcon(ClassLoader.getSystemResource("Pictures/StartPageUniBuddy.jpeg"));
        JLabel image1 = new JLabel(image1a);
        add(image1);*/

        t = new Thread(this);
        t.start();
        setVisible(true);

        setLocation(250, 100);
        setSize(1200, 900);
    }

    public void run(){  
        try {
            Thread.sleep(5000);
            setVisible(false);

            new Login();
        } catch (Exception e) {
        }
    }

    public static void main(String[] args) {
        new Start();
    }
}
