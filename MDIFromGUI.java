import java.awt.*;
import javax.swing.*;
public class MDIFromGUI extends JFrame{
    private JDesktopPane desktopPane;
    private JInternalFrame frame1, frame2, frame3;
    private JPanel p1, p2, p3;
    private JMenuBar mb;
    private JMenu m1, m2, m3, ms1;
    private JMenuItem mi2, mi3, mi4, msi1, msi2;
    public MDIFromGUI() {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }
        desktopPane = new JDesktopPane();
        frame1 = new JInternalFrame("Application 01", false, true, true, true);
        frame2 = new JInternalFrame("Application 02", false, true, true, true);
        frame3 = new JInternalFrame("Application 03", false, true, true, true);
        
//        p1 = new JPanel();
//        p1.add(new JLabel("Frame1"));
//        frame1.getContentPane().add(p1);
        frame1.pack();
        frame1.setVisible(true);
        
//        p2 = new JPanel();
//        p2.add(new JLabel("Frame2"));
//        frame2.getContentPane().add(p2);
        frame2.pack();
        frame2.setVisible(true);
        
//        p3 = new JPanel();
//        p3.add(new JLabel("Frame3"));
//        frame3.getContentPane().add(p3);
        frame3.pack();
        frame3.setVisible(true);
        
        frame1.setSize(220, 150);
        frame2.setSize(250, 180);
        frame3.setSize(280, 200);
        
        frame1.setLocation(50, 260);
        frame2.setLocation(180, 80);
        frame3.setLocation(420, 180);
//        int x2 = frame1.getX() + frame1.getWidth() +10;
//        int y2 = frame1.getY();
//        frame2.setLocation(x2, y2);
//        
//        int x3 = x2 + frame2.getWidth() + 10;
//        frame3.setLocation(x3, y2);
        
        desktopPane.add(frame1);
        desktopPane.add(frame2);
        desktopPane.add(frame3);
        
        mb = new JMenuBar();
        
        m1 = new JMenu("File");
        m2 = new JMenu("Edit");
        m3 = new JMenu("View");
        this.setJMenuBar(mb);
        mb.add(m1);
        mb.add(m2);
        mb.add(m3);
        
        ms1 = new JMenu("New");
        mi2 = new JMenuItem("Open");
        mi3 = new JMenuItem("Save");
        mi4 = new JMenuItem("Exit");
        m1.add(ms1);
        m1.add(mi2);
        m1.addSeparator();
        m1.add(mi3);
        m1.add(mi4);
        
        msi1 = new JMenuItem("Window");
        msi2 = new JMenuItem("Message");
        ms1.add(msi1);
        ms1.add(msi2);
        
        this.add(desktopPane, BorderLayout.CENTER);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(800, 520);
        this.setVisible(true);
    }
}
