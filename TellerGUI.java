import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class TellerGUI implements ActionListener {
    private JFrame fr;
    private JPanel p1, p2, p3;
    private JButton btn1, btn2, btn3;
    private JTextField txt1, txt2;
    private JLabel l1, l2;
    private Account account;
    public TellerGUI() {
        account = new Account(6000, "customer");
        fr = new JFrame("Teller GUI");
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        btn1 = new JButton("Deposit");
        btn2 = new JButton("Withdraw");
        btn3 = new JButton("Exit");
        l1 = new JLabel("Balance");
        l2 = new JLabel("Amount");
        txt1 = new JTextField(String.valueOf(account.getBalance()));
        txt1.setEditable(false);
        txt2 = new JTextField();
        
        p1.setLayout(new BorderLayout());
        p2.setLayout(new BorderLayout());
        p3.setLayout(new FlowLayout());
        fr.setLayout(new GridLayout(4,1));
        
        fr.add(p1);
        p1.add(l1, BorderLayout.WEST);
        p1.add(txt1, BorderLayout.CENTER);
        
        fr.add(p2);
        p2.add(l2, BorderLayout.WEST);
        p2.add(txt2, BorderLayout.CENTER);
        
        fr.add(p3);
        p3.add(btn1);
        p3.add(btn2);
        p3.add(btn3);
        fr.add(new JPanel());
        
        btn1.addActionListener(this);
        btn2.addActionListener(this);
        btn3.addActionListener(this);
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.pack();
        fr.setVisible(true);
    }
    double amount;
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource().equals(btn3)) {
            System.exit(0);
        } else if (ae.getSource().equals(btn1)) { // deposit ฝาก
            amount = Double.parseDouble(txt2.getText());
            account.withdraw(amount);
            txt1.setText(String.valueOf(account.getBalance()));
        } else if (ae.getSource().equals(btn2)) { //withdraw ถอน
            amount = Double.parseDouble(txt2.getText());
            account.deposit(amount);
            txt1.setText(String.valueOf(account.getBalance()));
        }
    }
}
