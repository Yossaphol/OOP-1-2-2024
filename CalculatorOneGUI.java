import java.awt.*;
import javax.swing.*;
public class CalculatorOneGUI {
    private JFrame fr;
    private JPanel p;
    private JButton btn1, btn2, btn3, btn4;
    private JTextField txt1,txt2, txt3;
    
    public CalculatorOneGUI() {
        fr = new JFrame("เครื่องคิดเลข");
        p = new JPanel();
        txt1 = new JTextField();
        txt2 = new JTextField();
        txt3 = new JTextField();
        btn1 = new JButton("บวก");
        btn2 = new JButton("ลบ");
        btn3 = new JButton("คูณ");
        btn4 = new JButton("หาร");
        
        fr.setLayout(new GridLayout(4,1));
        fr.add(txt1);
        fr.add(txt2);
        p.setLayout(new FlowLayout());
        fr.add(p);
        p.add(btn1);
        p.add(btn2);
        p.add(btn3);
        p.add(btn4);
        fr.add(txt3);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
