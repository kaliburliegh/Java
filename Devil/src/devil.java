import java.awt.*;
import javax.swing.*;

public class devil {

	/**
	 * Nicholas Land
	 * CSE 230
	 * Project 2
	 */
	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Nested Panels");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon icon = new ImageIcon("devil.gif");
		
		JLabel label1, label2, label3;
		
		// Set up first subpanel
		JPanel subPanel1 = new JPanel();
		subPanel1.setPreferredSize(new Dimension(150, 100));
		label1 = new JLabel("Devil left", icon, SwingConstants.CENTER);
		subPanel1.add(label1);
		subPanel1.setBackground(Color.cyan);
		
		// Set up second subpanel
		JPanel subPanel2 = new JPanel();
		subPanel2.setPreferredSize(new Dimension(150, 100));
		label2 = new JLabel("Devil Right", icon, SwingConstants.CENTER);
		label2.setHorizontalTextPosition(SwingConstants.LEFT);
		subPanel2.add(label2);
		subPanel2.setBackground(Color.red);
		
		// Set up third subpanel
		JPanel subPanel3 = new JPanel();
		subPanel3.setPreferredSize(new Dimension(150, 100));
		label3 = new JLabel("Devil Above", icon, SwingConstants.CENTER);
		label3.setVerticalTextPosition(SwingConstants.BOTTOM);
		subPanel3.add(label3);
		subPanel3.setBackground(Color.blue);
		
		// Set up primary panel
		JPanel primary = new JPanel();
		primary.setBackground(Color.yellow);
		primary.add(subPanel1);
		primary.add(subPanel2);
		primary.add(subPanel3);
		
		// display the panel
		frame.getContentPane().add(primary);
		frame.pack();
		frame.setVisible(true);
		
	}

}
