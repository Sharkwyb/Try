import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Trying extends JPanel implements ActionListener{
	
	JPanel cards;
	// cards
	private Image bg;
	private int bg_width;
	private int bg_height;
	
	
	
	// Card2: First Level
	// 3 birds, crossbow, arrow, 
	
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public void setup() {
		JFrame f = new JFrame("Chinese Learning Game");
		
		JPanel card2 = new JPanel();
		
		cards = new JPanel(new CardLayout());
		
		cards.add(card2, "C2");
		
		f.add(cards, BorderLayout.CENTER);
		
		f.setTitle("Chinese Learning game");
		f.setSize(1500, 1000);
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	
	public Trying() {
		ImageIcon i = new ImageIcon("src/Graybackground.png");
		bg = i.getImage();
		bg_width = bg.getWidth(null);
		bg_height = bg.getHeight(null);
		
	}
	public int getWidth() {
		return bg_width;
	}
	public int getHeight() {
		return bg_height;
	}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(bg, 0, 0, null);
	}
	// background method
	
	public static void main(String[] args) {
		Trying c2 = new Trying();
		c2.setup();
	}
}
