import java.awt.*;
import javax.swing.*;
public class CalculatorTwoGUI {
    private JFrame fr;
    private JPanel p1,p2;
    private JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10, btn11, btn12, btn13, btn14, btn15, btn16;
    private JTextField txt;
    
    public CalculatorTwoGUI() {
        fr = new JFrame("My Calculator");
        p1 = new JPanel();
        p2 = new JPanel();
        txt = new JTextField();
        btn1 = new JButton("0");
        btn2 = new JButton("1");
        btn3 = new JButton("2");
        btn4 = new JButton("3");
        btn5 = new JButton("4");
        btn6 = new JButton("5");
        btn7 = new JButton("6");
        btn8 = new JButton("7");
        btn9 = new JButton("8");
        btn10 = new JButton("9");
        btn11 = new JButton("c");
        btn12 = new JButton("=");
        btn13 = new JButton("+");
        btn14 = new JButton("-");
        btn15 = new JButton("x");
        btn16 = new JButton("/");
        
        fr.setLayout(new BorderLayout());
        fr.add(p2, BorderLayout.NORTH);
        p2.setLayout(new BorderLayout());
        p2.add(txt);
        fr.add(p1, BorderLayout.CENTER);
        p1.setLayout(new GridLayout(4,4));
        p1.add(btn8);
        p1.add(btn9);
        p1.add(btn10);
        p1.add(btn13);
        p1.add(btn5);
        p1.add(btn6);
        p1.add(btn7);
        p1.add(btn14);
        p1.add(btn2);
        p1.add(btn3);
        p1.add(btn4);
        p1.add(btn15);
        p1.add(btn1);
        p1.add(btn11);
        p1.add(btn12);
        p1.add(btn16);
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
}
