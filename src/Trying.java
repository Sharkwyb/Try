import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Trying extends JPanel implements ActionListener, MouseListener{

	JPanel cards;
	// cards
	private Image bg;
	private Image qu1;
	private int bg_width;
	private int bg_height;
	private JLabel question; 


	// Card2: First Level
	// 3 birds, crossbow, arrow, 

	public void actionPerformed(ActionEvent e) {

	}

	public void setup(Trying p) {
		JFrame f = new JFrame("Chinese Learning Game");

		JPanel card1 = p;
		JPanel card2 = new JPanel();

		cards = new JPanel(new CardLayout());




		card2.setLayout(new FlowLayout());
		question = new JLabel("What is \"Mother\" in Chinese?");
		question.setFont(new Font("SansSerif Plain", Font.PLAIN, 20));
		card1.add(question);

		cards.add(card1, "C bg");
		cards.add(card2, "C text");
		f.add(cards);

		f.add(cards, BorderLayout.CENTER);
		f.setTitle("Chinese Learning game");
		f.setSize(p.getWidth(), p.getHeight());
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	//setup




	public Trying() {
		ImageIcon i = new ImageIcon("src/Graybackground.jpg");
		bg = i.getImage();
		bg_width = bg.getWidth(null);
		bg_height = bg.getHeight(null);
		System.out.println("Width: " + bg_width);

		//question image
		ImageIcon i2 = new ImageIcon("src/mama.jpg");
		qu1 = i2.getImage();
		
		//add mouse listener
		addMouseListener(this);
	}
	//background

	public int getWidth() {
		return bg_width;
	}
	public int getHeight() {
		return bg_height;
	}


	public void paintComponent(Graphics g) {
		//Sysout.println("Here");
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(bg, 0, 0, null);
		g2d.drawImage(qu1, 200, 200, null);
	}
	// paint background method



	public void mousePressed(MouseEvent evt) {
		System.out.println("In Mouse Pressed");
	}
	public void mouseClicked(MouseEvent evt) {
		System.out.println("In Mouse Clicked");
	}
	public void mouseReleased(MouseEvent e) {
		System.out.println("In Mouse Released");
	}
	public void mouseEntered(MouseEvent e) {
		System.out.println("In Mouse Entered");
	}
	public void mouseExited(MouseEvent e) {
		System.out.println("In Mouse Exited");
	}











































	public static void main(String[] args) {
		Trying p = new Trying();
		p.setup(p);

	}
	//main








}


