import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener {
	Timer timer;
	int x = 200;
	int y = 200;
	int xspeed = 15;
	int yspeed = 10;
	GameObject ob = new GameObject(10, 10, 10, 10);
	ImageObject iObject;
	ImageObject iObject2;
	public GamePanel() {
		timer = new Timer(50, this);
		
		BufferedImage image = null;
		BufferedImage image2 = null;
		try
		{
			image2 = ImageIO.read(this.getClass().getResourceAsStream("field.jpg"));
			image = ImageIO.read(this.getClass().getResourceAsStream("prince.png"));
				}
		catch(Exception e)
		{
			System.err.println("There was an error loading your image.");
		}        
		iObject2 = new ImageObject(0, 0, 3200/2, 2129/2, image2);
		iObject = new ImageObject(10, 450, 1500/4, 1990/4, image);
		timer.start();
	}

	public void paintComponent(Graphics g) {
		ob.draw(g);
//		g.setColor(Color.BLUE.darker());
//		g.fillRect(x, y, 100, 100);
//		x += xspeed;
//		y += yspeed;
//
//		if (x >= 700 || x <= 0) {
//			xspeed = -xspeed;
//		}
//		if (y >= 700 || y <= 0) {
//			yspeed = -yspeed;
//		}
		iObject2.draw(g);
		iObject.draw(g);
		}

	@Override
	public void actionPerformed(ActionEvent e) {
		//System.out.println("one something has passed");
		repaint();
		iObject.update();
	}
}