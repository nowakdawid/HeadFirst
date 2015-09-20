package _417;

import javax.swing.*;
import java.awt.*;

public class SimpleAnimation {

    JFrame frame;
    int x = 40;
    int y = 40;

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {

            g.setColor(Color.white);
            g.fillRect(0, 0, frame.getWidth(), frame.getHeight());

            g.setColor(Color.green);
            g.fillOval(x, y, 40, 40);

        }
    }

    public static void main(String[] args) {

        SimpleAnimation simpleAnimation = new SimpleAnimation();
        simpleAnimation.animate();

    }

    public void animate() {

        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        MyDrawPanel drawPanel = new MyDrawPanel();
        frame.getContentPane().add(drawPanel);

        frame.setSize(300, 300);
        frame.setVisible(true);

        for (int i = 0; i < 130; i++) {

            x++;
            y++;

            drawPanel.repaint();

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }


    }

}
