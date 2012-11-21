import java.awt.BorderLayout;
import java.awt.Panel;
import javax.swing.JFrame;
@SuppressWarnings("unused")
public class TrafficLight {
	// Creates the main program
	public static void main(String[] args) {
		// new frame to put gui in
		JFrame frame = new JFrame("Traffic Light");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().add(new TrafficControlPanel());
		frame.pack();
		frame.setVisible(true);
	}
}

