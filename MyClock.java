import java.awt.*;
import javax.swing.*;
import java.util.*;
public class MyClock extends JLabel implements Runnable {
    public void run() {
        while (true) {
            Calendar d = Calendar.getInstance();
            int sec = d.get(Calendar.SECOND);
            int min = d.get(Calendar.MINUTE);
            int hour = d.get(Calendar.HOUR_OF_DAY);
            
            setFont(new Font("kodchasan", Font.BOLD, 48));
            
            String time = String.format("%02d : %02d : %02d", hour, min, sec);
            setText(time);
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
