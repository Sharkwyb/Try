import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.ImageIcon;
public class Trying extends JPanel implements ActionListener, MouseListener{

	JPanel cards;
	// cards
	private Image bg;
	private Image qu1;
	private Image qu2;
	private Image qu3;
	private int bg_width;
	private int bg_height;
	private int level = 0;
	private JLabel question; 
	private JLabel levelnumber;
	private JButton qb1;
	private int qb1_width;
	private int qb1_height;
	private JButton qb2;
	private JButton qb3;
	private int scorecalculator =0;
	private int totalscore =0;
	private int levelPosition=0;
	JButton[] correctanswers = new JButton[6];
	String [] questionlist = new String[6];
	String [] qb1Icon = new String[6];
	String [] qb2Icon = new String[6];
	String [] qb3Icon = new String[6];



	//switch questions
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == correctanswers[levelPosition]) {
			levelPosition++;
			qb1.setIcon(new ImageIcon(qb1Icon[levelPosition]));
			qb2.setIcon(new ImageIcon(qb2Icon[levelPosition]));
			qb3.setIcon(new ImageIcon(qb3Icon[levelPosition]));
			question.setText(questionlist[levelPosition]);
	

		}
		else {			
			
		}


	}

	public void setup(Trying p) {
		JFrame f = new JFrame("Chinese Learning Game");

		JPanel card1 = p;
		p.setLayout(null);
		JPanel card2 = new JPanel();
		//JPanel card2 = new JPanel();

		cards = new JPanel(new CardLayout());


		qb1Icon[0] = "src/mamal1.jpeg";
		qb1Icon[1] = "src/longl2.jpeg";

		qb2Icon[0] = "src/babal1.jpeg";
		qb2Icon[1] = "src/dianhual2.jpeg";
		
		qb3Icon[0] = "src/xiongdil1.jpeg";
		qb3Icon[1] = "src/ail2.jpeg";
		
		questionlist[0] = "What is \"Mother\" in Chinese?";
		questionlist[1] = "What is \"phone\" in Chinese?";
		
		
		
		
		
		
		
		//card2.setLayout(new FlowLayout());
		question = new JLabel(questionlist[0]);
		question.setFont(new Font("SansSerif Plain", Font.PLAIN, 25));
		question.setBounds(580, 20, 600, 100);
		card1.add(question);

		level++;
		levelnumber = new JLabel("Level "+ level);
		levelnumber.setFont(new Font("SansSerif Plain", Font.PLAIN, 25));
		levelnumber.setBounds(50, 20, 600, 100);
		card1.add(levelnumber);

		qb1 = new JButton();
		qb1.setBounds(150, 200, 316,202);
		qb1.setIcon(new ImageIcon(qb1Icon[0]));
		qb1.addActionListener(this);
		card1.add(qb1);

		qb2 = new JButton();
		qb2.setBounds(566, 200, 316,202);
		qb2.setIcon(new ImageIcon(qb2Icon[0]));
		qb2.addActionListener(this);
		card1.add(qb2);

		qb3 = new JButton();
		qb3.setBounds(982, 200, 316,202);
		qb3.setIcon(new ImageIcon(qb3Icon[0]));
		qb3.addActionListener(this);
		card1.add(qb3);
		validate();

		// Setup all the correct answers
		correctanswers[0] = qb1;






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
/*
		//one out of three question image
		ImageIcon i2 = new ImageIcon("src/mamal1.jpeg");
		qu1 = i2.getImage();

		//two out of three question image
		ImageIcon i3 = new ImageIcon("src/babal1.jpeg");
		qu2 = i3.getImage();

		//three out of three question image
		ImageIcon i4 = new ImageIcon("src/xiongdil1.jpeg");
		qu3 = i4.getImage();
*/
		//add mouse listener
		addMouseListener(this);
	}
	//background


	public int getHeight() {
		return bg_height;
	}
	public int getWidth() {
		return bg_width;
	}


	public void paintComponent(Graphics g) {
		//Sysout.println("Here");
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.drawImage(bg, 0, 0, null);

	}
	// paint background method



	public void mousePressed(MouseEvent evt) {

	}
	public void mouseClicked(MouseEvent evt) {

	}
	public void mouseReleased(MouseEvent e) {

	}
	public void mouseEntered(MouseEvent e) {

	}
	public void mouseExited(MouseEvent e) {

	}



	public static void main(String[] args) {
		Trying p = new Trying();
		p.setup(p);

	}
	//main








}

