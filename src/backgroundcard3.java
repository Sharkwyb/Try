import java.awt.*;
import javax.swing.*;
public class backgroundcard3 extends JPanel {
	private Image bg;
	private int bg_width;
	private int bg_height;
	public backgroundcard3 () {
		ImageIcon i = new ImageIcon("src/cobg2.jpg");
		bg = i.getImage();
		bg_width = bg.getWidth(null);
		bg_height = bg.getHeight(null);
	}
	public int getWidth () {
		return bg_width;
	}
	public int getHeight () {
		return bg_height;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;
		g2d.drawImage(bg, 0, 0, null);
	}
}