import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class ImageObject extends GameObject{
BufferedImage image;
BufferedImage image2;

boolean r;
	public ImageObject(int x, int y, int width, int height, BufferedImage image) {
		super(x, y, width, height);
		this.image=image;
		this.image2=image2;
		// TODO Auto-generated constructor stub
	}
	public void draw(Graphics g){
		g.drawImage(image, x, y, width, height, null);
	}
	public void update(){

//		if(InputManager.LEFT_ARROW_KEY){
//			x-=10;
//			System.out.println("should move");
//		}
//		if(InputManager.RIGHT_ARROW_KEY){
//			x+=10;
//			System.out.println("should move");
//		}
	}

}
