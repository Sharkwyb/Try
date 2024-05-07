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
	private JLabel qb1choicedescription;
	private JLabel qb2choicedescription;
	private JLabel qb3choicedescription;
	private JLabel correctchoicedescription;
	private JLabel correctanswerdescription;
	
	
	private JButton qb1;
	private JButton qb2;
	private JButton qb3;
	private JButton st1;
	private JButton st2;
	private JButton correctpagecontinue;

	
	JButton[] correctanswers = new JButton[8];
	String [] questionlist = new String[8];
	String [] qb1Icon = new String[8];
	String [] qb2Icon = new String[8];
	String [] qb3Icon = new String[8];
	String [] qb1buttondescription = new String[8];
	String [] qb2buttondescription = new String[8];
	String [] qb3buttondescription = new String[8];
	String [] correctanswerdescriptionarray = new String [8];

 
	//private int backgroundNum=0;

	//switch questions
	public void actionPerformed(ActionEvent e) {
		
		//starting page settings
		if (e.getSource() == st2) {
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards, "main");
		}
		else if (e.getSource() == st1) {
			System.exit(0);
		}
		
		
		
		
		//main game
		else if (e.getSource() == correctanswers[levelPosition] ) {
			levelPosition++;
			qb1.setVisible(true);
			qb2.setVisible(true);
			qb3.setVisible(true);
			qb1.setIcon(new ImageIcon(qb1Icon[levelPosition]));
			qb2.setIcon(new ImageIcon(qb2Icon[levelPosition]));
			qb3.setIcon(new ImageIcon(qb3Icon[levelPosition]));
			question.setText(questionlist[levelPosition]);
			levelnumber.setText("Level " + (levelPosition+1));


			
		}
		
		
		else if (e.getSource() == qb1 || e.getSource() == qb2 || e.getSource() == qb3){	
			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards, "correcting");

			if (e.getSource() == qb1) {
				qb1choicedescription.setVisible(true);
				qb1choicedescription.setText(qb1buttondescription[levelPosition]);		
				
				//scorecalculator++;
				
			}

			else if (e.getSource() == qb2) {
				qb2choicedescription.setVisible(true);
				qb2choicedescription.setText(qb2buttondescription[levelPosition]);				

				
				//scorecalculator++;
				//qb2.setVisible(false);

			}
			else if (e.getSource() == qb3){
				qb3choicedescription.setVisible(true);
				qb3choicedescription.setText(qb3buttondescription[levelPosition]);
			//	scorecalculator++;
			}
			
			
			

		}
		else if (e.getSource() == correctpagecontinue){

			CardLayout cl = (CardLayout)(cards.getLayout());
			cl.show(cards, "main");
			qb3choicedescription.setVisible(false);
			qb2choicedescription.setVisible(false);
			qb1choicedescription.setVisible(false);
			System.out.println("?");

		}


	}

	public void setup(Trying p) {
		JFrame f = new JFrame("Chinese Learning Game");

		JPanel  card1 = p;
		p.setLayout(null);
		JPanel card2 = new card2background();
		card2.setLayout(null);
		JPanel card3 = new backgroundcard3();
		card3.setLayout(null);
		//JPanel card2 = new JPanel();

		cards = new JPanel(new CardLayout());


		qb1Icon[0] = "src/mamal1.jpeg";
		qb1Icon[1] = "src/longl2.jpeg";
		qb1Icon[2] = "src/bail3.jpg";
		qb1Icon[3] = "src/bul3.jpg";
		qb1Icon[4] = "src/qianfangbail5.jpeg";
		qb1Icon[5] = "src/pizzahut.jpg";



		qb2Icon[0] = "src/babal1.jpeg";
		qb2Icon[1] = "src/dianhual2.jpeg";
		qb2Icon[2] = "src/chil3.jpg";
		qb2Icon[3] = "src/bi4.jpeg";
		qb2Icon[4] = "src/xianfazhiren5.jpeg";
		qb2Icon[5] = "src/Mcdonalds.jpg";


		qb3Icon[0] = "src/xiongdil1.jpeg";
		qb3Icon[1] = "src/ail2.jpeg";
		qb3Icon[2] = "src/bul3.jpg";
		qb3Icon[3] = "src/shide4.jpeg";
		qb3Icon[4] = "src/bukesiyi.jpeg";
		qb3Icon[5] = "src/KFC.jpg";


		//unbelievable

		questionlist[0] = "What is \"mother\" in Chinese?";
		questionlist[1] = "What is \"phone\" in Chinese?";
		questionlist[2] = "What is \"white\" in Chinese?";
		questionlist[3] = "What is \"no\" in Chinese?";
		questionlist[4] = "What is \"unbelievable\" in Chinese?";
		questionlist[5] = "What is \"McDonald's\" in Chinese?";
		
		//description arrays
		qb1buttondescription[0] = ""; //correct answer 妈妈
		qb1buttondescription[1] = "龙 means dragon";
		qb1buttondescription[2] = "";//correct answer 白
		qb1buttondescription[3] = "";//correct answer 不
		qb1buttondescription[4] = "千方百计 means try all kinds of ways and use all kinds of strategies";
		qb1buttondescription[5] = "PIZZA HUT !";
		
		qb2buttondescription[0] = "爸 means father"; 
		qb2buttondescription[1] = "";//
		qb2buttondescription[2] = "吃 means eating";
		qb2buttondescription[3] = "比 is compare in Chinese";
		qb2buttondescription[4] = "先发制人 means take action first before anyone else get a chance to do it";
		qb2buttondescription[5] = "";//
		
		qb3buttondescription[0] = "兄弟 means brother"; 
		qb3buttondescription[1] = "爱 means love";
		qb3buttondescription[2] = "不 means no (remember this!)";
		qb3buttondescription[3] = "是的 means yes";
		qb3buttondescription[4] = "";//
		qb3buttondescription[5] = "KFC";

		//correct answer description array
		
		correctanswerdescriptionarray[0] = "Mother";
		correctanswerdescriptionarray[1] = "Phone";
		correctanswerdescriptionarray[2] = "White";
		correctanswerdescriptionarray[3] = "No";
		correctanswerdescriptionarray[4] = "Unbelievable";
		correctanswerdescriptionarray[5] = "McDonald's";
		correctanswerdescriptionarray[6] = "";
		







		//card2.setLayout(new FlowLayout());
		correctanswerdescription = new JLabel(correctanswerdescriptionarray[0]);
		correctanswerdescription.setFont(new Font ("SansSerif Plain", Font.PLAIN, 33));
		correctanswerdescription.setBounds(720, 600, 700, 100);
		card3.add(correctanswerdescription);
		
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
		
		startingprank = new JLabel("Guess which one is \"start\" in Chinese");
		startingprank.setFont(new Font("SansSerif Plain", Font.PLAIN, 25));
		startingprank.setBounds(300, 300, 700, 100);
		card2.add(startingprank);
		
		//correcting page descriptions
		qb1choicedescription = new JLabel("");
		qb1choicedescription.setFont(new Font("SansSerif Plain", Font.PLAIN, 33));
		qb1choicedescription.setBounds(720, 130, 700, 100);
		card3.add(qb1choicedescription);
		
		qb2choicedescription = new JLabel("");
		qb2choicedescription.setFont(new Font("SansSerif Plain", Font.PLAIN, 33));
		qb2choicedescription.setBounds(720, 130, 700, 100);
		card3.add(qb2choicedescription);
		
		qb3choicedescription = new JLabel("");
		qb3choicedescription.setFont(new Font("SansSerif Plain", Font.PLAIN, 33));
		qb3choicedescription.setBounds(720, 130, 700, 100);
		card3.add(qb3choicedescription);
		
		correctchoicedescription = new JLabel("");
		correctchoicedescription.setFont(new Font("SansSerif Plain", Font.PLAIN, 25));
		correctchoicedescription.setBounds(600,600,700,100);
		card3.add(correctchoicedescription);
		
		

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
		
		st1 = new JButton("关闭");
		st1.setBounds(100,100,100,100);
		st1.addActionListener(this);
		card2.add(st1);

		st2 = new JButton("开始");
		st2.setBounds(500,100,100,100);
		st2.addActionListener(this);
		card2.add(st2);
		
		correctpagecontinue = new JButton("continue");
		correctpagecontinue.setBounds(1200, 600, 100, 100);
		correctpagecontinue.addActionListener(this);
		card3.add(correctpagecontinue);
		
		
		
		// Setup all the correct answers
		correctanswers[0] = qb1;
		correctanswers[1] = qb2;
		correctanswers[2] = qb1;
		correctanswers[3] = qb1;
		correctanswers[4] = qb3;
		correctanswers[5] = qb2;

		
		
		cards.add(card2, "start");
		cards.add(card1, "main");
		cards.add(card3, "correcting");
		
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
