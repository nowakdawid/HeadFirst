package _431;

import javax.swing.*;
import java.awt.*;

public class ShrinkingCircle {

    int x = 1;
    int y = 1;
    JFrame frame = new JFrame();

    public static void main (String[] args) {
        ShrinkingCircle gui = new ShrinkingCircle();
        gui.go();
    }
    public void go() {
        frame.setDefaultCloseOperation(
                JFrame.EXIT_ON_CLOSE);
        MyDrawP drawP = new MyDrawP();
        frame.getContentPane().add(drawP);
        frame.setSize(500,270);
        frame.setVisible(true);
        for (int i = 0; i < 124; i++,x++,y++ ) {
            x++;
            drawP.repaint();
            try {
                Thread.sleep(50);
            } catch(Exception ex) { }
        }
    }
    class MyDrawP extends JPanel {
        public void paintComponent(Graphics g ) {
            Graphics2D g2d = (Graphics2D) g;
            g.setColor(Color.white);
            g.fillRect(0, 0, frame.getWidth(), frame.getHeight());
            g.setColor(Color.white);
            g.fillOval(0,0,500,230);
            GradientPaint gradient = new GradientPaint(70,70,Color.green, 230,230,Color.blue);
            g2d.setPaint(gradient);
            g2d.fillOval(x,y,500-x*2,230-y*2);
        }
    }

}
