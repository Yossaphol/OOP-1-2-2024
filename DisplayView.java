import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileOutputStream;
import java.io.IOException;
public class DisplayView implements WindowListener{
    private JFrame fr;
    private JPanel p;
    private JTextArea tarea;
    private MainView showInfo;
    public DisplayView() {
        fr = new JFrame();
        p = new JPanel();
        tarea = new JTextArea();
        
        p.setLayout(new GridLayout(1,1));
        p.add(tarea);
        fr.add(p);
        fr.addWindowListener(this);
        tarea.setText(String.valueOf(showInfo));
        
        fr.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fr.setSize(500,300);
        fr.setVisible(true);
    }
    
    @Override
    public void windowOpened(WindowEvent we) {
        
    }
    
    @Override
    public void windowClosing(WindowEvent we) {
        String str = tarea.getText();
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
