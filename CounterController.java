import java.awt.*;
import javax.swing.*;
public class CounterController {
    Counter c;
    private JFrame fr;
    private JPanel p;
    public CounterController() {
        c = new Counter();
        fr = new JFrame("Time Counter");
        p = new JPanel();
        
        p.add(c);
        fr.add(p);
        fr.setLayout(new FlowLayout());
        Thread t = new Thread(c);
        t.start();
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(300,120);
        fr.setLocation(500, 500);
        fr.setVisible(true);
    }
    
}