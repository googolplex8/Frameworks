import javax.swing.JFrame;

public class GameWindow {
	public static void main(String[] args) {
		new GameWindow().createUI();
	}

	JFrame frame = new JFrame("Stuff");
	GamePanel panel = new GamePanel();

	void createUI() {
		frame.setVisible(true);
		frame.add(panel);
		frame.setSize(800, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
