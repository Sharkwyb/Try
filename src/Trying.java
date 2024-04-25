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
	private int level = 1;
	private int scorecalculator =0;
	private int totalscore =0;
	private int levelPosition=0;

	private JLabel question; 
	private JLabel levelnumber;
	private JLabel scoreshowing;
	private JLabel startingprank;

	private JButton qb1;
	private JButton qb2;
	private JButton qb3;
	private JButton st1;
	private JButton st2;


	JButton[] correctanswers = new JButton[8];
	String [] questionlist = new String[8];
	String [] qb1Icon = new String[8];
	String [] qb2Icon = new String[8];
	String [] qb3Icon = new String[8];


	//private int backgroundNum=0;

	//switch questions
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == st2) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards, "main");
		}
		else if (e.getSource() == st1) {
			System.exit(0);
		}

		else if (e.getSource() == correctanswers[levelPosition]) {
			levelPosition++;
			qb1.setVisible(true);
			qb2.setVisible(true);
			qb3.setVisible(true);
			qb1.setIcon(new ImageIcon(qb1Icon[levelPosition]));
			qb2.setIcon(new ImageIcon(qb2Icon[levelPosition]));
			qb3.setIcon(new ImageIcon(qb3Icon[levelPosition]));
			question.setText(questionlist[levelPosition]);
			levelnumber.setText("Level " + (levelPosition+1));

			if (levelPosition == 4) {
				
			}
			if (levelPosition == 6) {

			}

			if (scorecalculator == 0) {
				totalscore+=3;
			}
			else if (scorecalculator ==1) {
				totalscore += 2;
			}
			else  {
				totalscore +=1;
			}
			scorecalculator = 0;
			scoreshowing.setText("Score: "+totalscore );
		}
		//private int scorecalculator =0;
		//private int totalscore =0;
		else {			
			if (e.getSource() == qb1) {
				qb1.setVisible(false);
				scorecalculator++;
			}

			else if (e.getSource() == qb2) {
				scorecalculator++;
				qb2.setVisible(false);

			}
			else if (e.getSource() == qb3){
				qb3.setVisible(false);
				scorecalculator++;
			}

		}


	}

	public void setup(Trying p) {
		JFrame f = new JFrame("Chinese Learning Game");

		JPanel  card1 = p;
		p.setLayout(null);
		JPanel card2 = new JPanel();
		card2.setLayout(null);
		//JPanel card2 = new JPanel();

		cards = new JPanel(new CardLayout());


		qb1Icon[0] = "src/mamal1.jpeg";
		qb1Icon[1] = "src/longl2.jpeg";
		qb1Icon[2] = "src/bail3.jpg";
		qb1Icon[3] = "src/bul3.jpg";
		qb1Icon[4] = "src/qianfangbail5.jpeg";
		qb1Icon[5] = "src/KFC.jpg";



		qb2Icon[0] = "src/babal1.jpeg";
		qb2Icon[1] = "src/dianhual2.jpeg";
		qb2Icon[2] = "src/chil3.jpg";
		qb2Icon[3] = "src/bi4.jpeg";
		qb2Icon[4] = "src/xianfazhiren5.jpeg";
		qb2Icon[5] = "src/pizzahut.jpg";


		qb3Icon[0] = "src/xiongdil1.jpeg";
		qb3Icon[1] = "src/ail2.jpeg";
		qb3Icon[2] = "src/bul3.jpg";
		qb3Icon[3] = "src/shide4.jpeg";
		qb3Icon[4] = "src/bukesiyi.jpeg";
		qb3Icon[5] = "src/Mcdonalds.jpg";


		//unbelievable

		questionlist[0] = "What is \"mother\" in Chinese?";
		questionlist[1] = "What is \"phone\" in Chinese?";
		questionlist[2] = "What is \"white\" in Chinese?";
		questionlist[3] = "What is \"no\" in Chinese?";
		questionlist[4] = "What is \"unbelievable\" in Chinese?";
		







		//card2.setLayout(new FlowLayout());
		question = new JLabel(questionlist[0]);
		question.setFont(new Font("SansSerif Plain", Font.PLAIN, 40));
		question.setBounds(650, 60, 1200, 1200);
		card1.add(question);

		scoreshowing = new JLabel("Score: " + totalscore);
		scoreshowing.setFont(new Font("SansSerif Plain", Font.PLAIN, 25));
		scoreshowing.setBounds(1250, 20, 300, 100);
		card1.add(scoreshowing);

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
		correctanswers[1] = qb2;
		correctanswers[2] = qb1;
		correctanswers[3] = qb1;
		correctanswers[4] = qb3;
		correctanswers[5] = qb3;

		startingprank = new JLabel("Guess which one is \"start\" in Chinese");
		startingprank.setFont(new Font("SansSerif Plain", Font.PLAIN, 25));
		startingprank.setBounds(300, 300, 700, 100);
		card2.add(startingprank);

		st1 = new JButton("关闭");
		st1.setBounds(100,100,100,100);
		st1.addActionListener(this);
		card2.add(st1);

		st2 = new JButton("开始");
		st2.setBounds(500,100,100,100);
		st2.addActionListener(this);
		card2.add(st2);


		cards.add(card2, "start");
		cards.add(card1, "main");

		f.add(cards);
		f.setTitle("Chinese Learning game");
		f.setSize(p.getWidth(), p.getHeight());
		f.setLocationRelativeTo(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setVisible(true);
	}
	//setup




	public Trying() {

		ImageIcon i = new ImageIcon("src/bg7.jpg");
		bg = i.getImage();
		bg_width = bg.getWidth(null);
		bg_height = bg.getHeight(null);
		System.out.println("Width: " + bg_width);

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

		//if (backgroundNum==0)
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
