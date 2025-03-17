import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.io.*;
public class MainView implements ActionListener, WindowListener {
    private JFrame fr;
    private JPanel p, p1, p2, p3, p4, p5, p6;
    private JButton btn1, btn2, btn3;
    private JTextField tf1, tf2, tf3;
    private JRadioButton rb1, rb2;
    private JLabel l1,l2, l3, l4;
    private ButtonGroup chg;
    public String text;
    
    public MainView() {
        fr = new JFrame("");
        p = new JPanel();
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        p4 = new JPanel();
        p5 = new JPanel();
        p6 = new JPanel();
        btn1 = new JButton("Save");
        btn2 = new JButton("Clear");
        btn3 = new JButton("Delete");
        tf1 = new JTextField("");
        tf2 = new JTextField("");
        tf3 = new JTextField("");
        rb1 = new JRadioButton("Income");
        rb2 = new JRadioButton("Expenses");
        l1 = new JLabel("Type: ");
        l2 = new JLabel("Amount: ");
        l3 = new JLabel("Detail: ");
        l4 = new JLabel("Delete ID: ");
        chg = new ButtonGroup();
        
        p.setLayout(new GridLayout(5, 1));
        p1.setLayout(new GridLayout(1,2));
        p2.setLayout(new GridLayout(1,2));
        p3.setLayout(new GridLayout(1,2));
        p4.setLayout(new FlowLayout());
        p5.setLayout(new GridLayout(1,3));
        p6.setLayout(new GridLayout(1,2));
        
        p.add(p1);
        p.add(p2);
        p.add(p3);
        p.add(p4);
        p.add(p5);
        
        p1.add(l1);
        p1.add(p6);
        p2.add(l2);
        p2.add(tf1);
        p3.add(l3);
        p3.add(tf2);
        p4.add(btn1);
        p4.add(btn2);
        p5.add(l4);
        p5.add(tf3);
        p5.add(btn3);
        
        chg.add(rb1);
        chg.add(rb2);
        p6.add(rb1);
        p6.add(rb2);
        fr.add(p);
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        fr.addWindowListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn2)) {
            tf1.setText("");
            tf2.setText("");
            tf3.setText("");
        } else if (ae.getSource().equals(btn1)) {
            String txt1 = tf1.getText();
            String txt2 = tf2.getText();
            String txt3 = tf3.getText();
            if (!rb1.isSelected() & !rb2.isSelected()) {
                JOptionPane.showMessageDialog(null, "You forgot to select the Income or Expenses types.", "Type Error", JOptionPane.ERROR_MESSAGE);
            } else if (txt1.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter text in detail field only.", "Amount Error", JOptionPane.ERROR_MESSAGE);
            } else if (txt2.isEmpty()) {
                JOptionPane.showMessageDialog(null, "Please enter text in detail field only.", "Deatil Error", JOptionPane.ERROR_MESSAGE);
            } else if (txt3.isEmpty()) {
                JOptionPane.showMessageDialog(null, "You forgot to fill th Delete ID Field.", "Delete ID Error", JOptionPane.ERROR_MESSAGE);
            } else {
                String type = "";
                if (rb1.isSelected()) {
                    type = "Income";
                } else {
                    type = "Expenses";
                }
                DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH.mm.ss");
                this.text = "["+txt3+"] - "+dtf.format(LocalDateTime.now())+" - ("+type+") Detail="+txt2+", Amount="+txt1+".";
                System.out.println(text);
            }
        } else if (ae.getSource().equals(btn3)) {
            
        }
    }
    public String showInfo() {
        return text;
    }
    @Override
    public void windowOpened(WindowEvent we) {
        
    }
    
    @Override
    public void windowClosing(WindowEvent we) {
        String str = text;
        try (FileOutputStream fout = new FileOutputStream("data.dat")) {
            for (int i = 0; i <str.length();i++) {
                fout.write(str.charAt(i));
            }
        } catch(IOException ex) {
            ex.printStackTrace();
        }
    }
    
    @Override
    public void windowClosed(WindowEvent we) {}
    @Override
    public void windowIconified(WindowEvent we) {}
    @Override
    public void windowDeiconified(WindowEvent we) {}
    @Override
    public void windowActivated(WindowEvent we) {}
    @Override
    public void windowDeactivated(WindowEvent we) {}
    
}
