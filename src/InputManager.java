import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

public class InputManager {
	public static boolean LEFT_ARROW_KEY = false;
	public static boolean RIGHT_ARROW_KEY = false;

	public static void mouseDragged(MouseEvent e) {
		InputManager.mouseDragged(e);
	}

	public static void mouseMoved(MouseEvent e) {
		InputManager.mouseMoved(e);
	}

	public static void mouseClicked(MouseEvent e) {
		InputManager.mouseClicked(e);
	}

	public static void mousePressed(MouseEvent e) {
		InputManager.mousePressed(e);
	}

	public static void mouseReleased(MouseEvent e) {
		InputManager.mouseReleased(e);
	}

	public static void mouseEntered(MouseEvent e) {
		InputManager.mouseEntered(e);
	}

	public static void mouseExited(MouseEvent e) {
		InputManager.mouseExited(e);
	}

	public static void keyTyped(KeyEvent e) {
		InputManager.keyTyped(e);
	}

	public static void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT_ARROW_KEY = true;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			RIGHT_ARROW_KEY = true;
		}
	}

	public static void keyReleased(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_LEFT) {
			LEFT_ARROW_KEY = false;
		}
		if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
			RIGHT_ARROW_KEY = false;
		}
	}
}
