import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
@SuppressWarnings("serial")
public class TrafficControlPanel extends JPanel {
	// creates new object from traffic light panel called "tlp"
	TrafficLightPanel tlp = new TrafficLightPanel();
	private JButton push;
	public TrafficControlPanel() {
		// new button and listener
		push = new JButton("Change Light");
		push.addActionListener(new ChangeListener());
		// manages the border layout, so that the button is south, and the 
		// traffic light is center
		setLayout(new BorderLayout());
		add(push, BorderLayout.SOUTH);
		add(tlp, BorderLayout.CENTER);
	}
	// Represents a listener for button push events
	private class ChangeListener implements ActionListener {
		// Changes the light when the button is pushed
		public void actionPerformed(ActionEvent event) {		
			tlp.change();
		}
	}
}

