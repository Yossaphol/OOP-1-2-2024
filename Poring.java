import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class Poring implements Runnable, MouseListener {
    private JFrame fr;
    private JLabel label;
    private ImageIcon poring;
    private static int count = 0;
    private int x, y;
    private boolean running = true;
    
    @Override
    public void run() {
        fr = new JFrame("");
        poring = new ImageIcon(getClass().getResource("/poor.png"));
        Image img = poring.getImage().getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        
        poring = new ImageIcon(img);
        label = new JLabel(poring);
        label.addMouseListener(this);
        this.showCount();
        
        fr.setLayout(new FlowLayout());
        fr.add(label);
        
        x = (int)(Math.random() * 1240);
        y = (int)(Math.random() * 720);
        
        fr.setLocation(x, y);
        
        fr.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        fr.setSize(200, 150);
        fr.setVisible(true);
        
        this.move();
    }
    
    public static void increaseCount() {
        count++;
    }
    
    public void showCount() {
        label.setText(count + "");
    }
    
    public void move() {
        while (running) {
            x += (int)(Math.random() * 11) - 5;
            y += (int)(Math.random() * 11) - 5;
            
            fr.setLocation(x, y);
            
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    @Override
    public void mousePressed(MouseEvent e) { }
    
    @Override
    public void mouseReleased(MouseEvent e) { }
    
    @Override
    public void mouseEntered(MouseEvent e) { }
    
    @Override
    public void mouseExited(MouseEvent e) { }

    @Override
    public void mouseClicked(MouseEvent e) {
        fr.dispose();
    }
}
