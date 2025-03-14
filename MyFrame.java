import java.awt.*;
import javax.swing.*;
public class MyFrame {
    private JFrame f;
    private JPanel p;
    private MyClock cock;
    private Thread t;
    
    public MyFrame() {
        f = new JFrame("Time");
        p = new JPanel();
        cock = new MyClock();
        f.add(cock);
        t = new Thread(cock);
        t.start();
        f.setLocation(800, 500);
        f.setLayout(new FlowLayout());
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.pack();
        f.setVisible(true);
    }
}
