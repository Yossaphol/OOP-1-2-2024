import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class PoringConstructor implements ActionListener {
    private JFrame fr;
    private JPanel p;
    private JButton btn1;
    private Poring poring;
    
    public PoringConstructor() {
        fr = new JFrame("");
        p = new JPanel();
        btn1 = new JButton("Add");
        
        p.add(btn1);
        fr.add(p);
        
        btn1.addActionListener(this);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(btn1)) {
            Poring.increaseCount();
            poring = new Poring();
            Thread t = new Thread(poring);
            t.start();
        }
    }
}
