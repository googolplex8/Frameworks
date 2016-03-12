import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;
	int x = 200;
	int y = 200;
	int xspeed = 15;
	int yspeed = 10;
	GameObject ob = new GameObject(10, 10, 10, 10);

	public GamePanel() {
		timer = new Timer(50, this);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		ob.draw(g);
		g.setColor(Color.BLUE.darker());
		g.fillRect(x, y, 100, 100);
		x += xspeed;
		y += yspeed;

		if (x >= 700 || x <= 0) {
			xspeed = -xspeed;
		}
		if (y >= 700 || y <= 0) {
			yspeed = -yspeed;
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("one something has passed");
		repaint();
	}
}