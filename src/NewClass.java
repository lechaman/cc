import java.awt.FlowLayout;
import javax.swing.*;
	public class NewClass{
	    public static void main(String s[]) {
	        JFrame frame = new JFrame("RECAPITULATIF");
	        JPanel panel = new JPanel();
	        panel.setLayout(new FlowLayout());
	        JLabel label = new JLabel("RECAPITULATIF");
	        panel.add(label);
	        frame.add(panel);
	        frame.setSize(300, 300);
	        frame.setLocationRelativeTo(null);
                 frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        frame.setVisible(true);

	    }

    void setVisible(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
	}