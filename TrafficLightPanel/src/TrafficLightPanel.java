import javax.swing.*;
import java.awt.*;
@SuppressWarnings("serial")
public class TrafficLightPanel extends JPanel {
	private int currentState = 0;
	private final int NUM_LIGHTS = 3; // number of lights
	private final int X = 50, Y = 10, WIDTH = 50, HEIGHT = 130; // box size
	private final int DIAMETER = 30; // light diameter
	private final int X_OFFSET = 10, Y_OFFSET = 10; // offsets to position the lights in the box
	private final int PANEL_WIDTH = 150, PANEL_HEIGHT = 230; // the size of traffic control panel
	// Creates traffic light panel
	public TrafficLightPanel() {
		setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
	}
	public void paintComponent(Graphics page) {
		super.paintComponent(page);
		int lightOn = currentState % NUM_LIGHTS;
		setBackground(Color.white);
		page.setColor(Color.lightGray);
		page.fillRect(X, Y, WIDTH, HEIGHT);
		// Determines which light to turn on, and turns on the light
		if(lightOn == 0) {
			page.setColor(Color.red);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 10, DIAMETER, DIAMETER);
			page.setColor(Color.darkGray);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 50, DIAMETER, DIAMETER);
			page.setColor(Color.darkGray);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 90, DIAMETER, DIAMETER);
		} else if (lightOn == 2) {
			page.setColor(Color.darkGray);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 10, DIAMETER, DIAMETER);
			page.setColor(Color.yellow);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 50, DIAMETER, DIAMETER);
			page.setColor(Color.darkGray);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 90, DIAMETER, DIAMETER);
		} else {
			page.setColor(Color.darkGray);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 10, DIAMETER, DIAMETER);
			page.setColor(Color.darkGray);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 50, DIAMETER, DIAMETER);
			page.setColor(Color.green);
			page.fillOval(X_OFFSET + 50, Y_OFFSET + 90, DIAMETER, DIAMETER);
		}
	}
	public void change() {
		currentState++;
		repaint();
	}
}
