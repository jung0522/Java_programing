package Game_copy;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import Game.Find_SMU;
import Game.RockPaperScissors;






class Panels extends JPanel 
{
	// �гε��� ���� cardLayout�ε� ��ü �г� ��ü�� ���� //
	JPanel cards = new JPanel(new CardLayout());
	// ��ü �г� ��ü�� ���� �޼��带 Ȱ���ϱ� ���� ������ ���� //
	CardLayout deck = (CardLayout) cards.getLayout();
	
	public Panels () 
	{

	// panel1 ���۷��� ���� page1 ��ü ���� //
	panel1 page1 = new panel1();
	// ��ü �гο� page1 �߰� //
	cards.add(page1, "panel1");
	// �ڱ� �ڽ�(��ü)�� �߰� //
	add(cards);
	
	panel2 page2 = new panel2();
	cards.add(page2, "page2");
	add(cards);
	
	panel3 page3 = new panel3();
	cards.add(page3, "page3");
	add(cards);
	
	panel4 page4 = new panel4();
	cards.add(page4, "page4");
	add(cards);
	
	panel5 page5 = new panel5();
	cards.add(page5, "page5");
	add(cards);
	
	panel6 page6 = new panel6();
	cards.add(page6, "page6");
	add(cards);
	
	panel7 page7 = new panel7();
	cards.add(page7, "page7");
	add(cards);
	
	panel8 page8 = new panel8();
	cards.add(page8, "page8");
	add(cards);
	
	panel9 page9 = new panel9();
	cards.add(page9, "page9");
	add(cards);
	
	panel_10 page10 = new panel_10();
	cards.add(page10, "page10");
	add(cards);
	
	panel_11 page11 = new panel_11();
	cards.add(page11, "page11");
	add(cards);
	
	panel_12 page12 = new panel_12();
	cards.add(page12, "page12");
	add(cards);

	panel_13 page13 = new panel_13();
	cards.add(page13, "page13");
	add(cards);
	
	}
	class panel1 extends JPanel implements ActionListener  
	{
		
		
		public panel1() 
		{
			// ������Ʈ�� ���� ��ġ�ϱ� ���� null�� ���̾ƿ� ���� //
			setLayout(null);
		    setBackground (Color.black);
		    // �г� ȭ�� ũ�� ���� //
			int width = 1320;
			int height = 750;
			setPreferredSize (new Dimension(width, height));
			
			// �ڱ� �ڽ� �г�(��ü)�� ������Ʈ�� ����//
		    ImageIcon graduation = new ImageIcon ("./src/image/Graduation.png");
		    JLabel Label2 = new JLabel (graduation);
		    Label2.setBounds(520, 2, 250, 250);
		    add(Label2);

		    ImageIcon title = new ImageIcon ("./src/image/Ÿ��Ʋ.png");
		    JLabel Label4 = new JLabel (title);
		    Label4.setBounds(180, 180, 900, 400);
		    add(Label4);
		   
		    JButton next = new JButton("Game Start!");
		    next.addActionListener (this);	

			next.setPreferredSize(new Dimension(50, 50));
			next.setBounds(530, 550, 200, 50);
			next.setFont(new Font("�𸮽�9",Font.BOLD,30));
			
			add(next);
				

		}
			// ����ڰ� ��ư�� ������ next �޼��带 �̿� ���� �������� �̵� //
				public void actionPerformed (ActionEvent event) 	
				{
					deck.next(cards);	
					
				}
			

	}
	class panel2 extends JPanel implements ActionListener
	{
		public panel2 () 
		{
			 
			        setLayout(null);
			        
					setBackground (Color.black);
					JLabel label1 = new JLabel("<html>��հ� ������� �б� ��Ȱ�� ��ģ<br>"
							+ "<html>�����̴� ���� ������ �����ߴ�!!<br>"
							+ "<html>�׷��� �̰� ����?! �ƹ��� ã�ƺ��� �������� ������ �ʴ´�<br>"
							+ "<html>����� �ǵ��� �����̴� ���� ������ �� ��򰡷� �޷�����<br>"
							+ "<html>���ݺ��� �������� �Ҿ���� �������� ã�� ������ ���۵ȴ�!!<br>");
					label1.setForeground(Color.white);
					label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
					label1.setBounds(50, -180, 1200, 700);
					add(label1);
					
					ImageIcon certification = new ImageIcon ("./src/image/certificate.png");
					JLabel Label2 = new JLabel (certification);
					Label2.setBounds(50, 200, 500, 500);
					add(Label2);
					
					ImageIcon find = new ImageIcon ("./src/image/find.png");
					JLabel Label3 = new JLabel (find);
					Label3.setBounds(750, 200, 500, 500);
					add(Label3);
				
					JButton next = new JButton("next");
					next.addActionListener (this);	

					next.setPreferredSize(new Dimension(50, 50));
					next.setBounds(530, 550, 200, 50);
					next.setFont(new Font("�𸮽�9",Font.BOLD,30));
					
					add(next);
					
					
						
					
		}
		public void actionPerformed (ActionEvent event) 	
		{
			deck.next(cards);	
			
		}
	}
	
	class panel3 extends JPanel implements ActionListener
	{
		public panel3 () 
		{
			 
			        setLayout(null);
			        
					setBackground (Color.black);
					JLabel label1 = new JLabel("<html>[���̸���]: �����?! �������� �Ҿ���ȴٰ�?!<br>"
							+ "<html>[���̸���]: ��.. �� �´�! ������ �� ������ ???�� ��� �����ݾ�<br>"
							+ "<html>[���̸���]: ���� �������� �˷��޶�� �� �ƴ���?<br>"
							+ "<html>[���̸���]: ���� �̹� ������ Ŭ�����ϸ� ???�� �˷����� <br>"
							+ "<html>[���̸���]: ���� �����̴� ������!!<br>");
					label1.setForeground(Color.white);
					label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
					label1.setBounds(50, -180, 1200, 700);
					add(label1);
					
					ImageIcon hilion = new ImageIcon ("./src/image/�Ѿ�� ���̸���2.png");
					JLabel Label2 = new JLabel (hilion);
					Label2.setBounds(750, 200, 500, 500);
					add(Label2);
					
					JButton next = new JButton("next");
					next.addActionListener (this);	

					next.setPreferredSize(new Dimension(50, 50));
					next.setBounds(530, 550, 200, 50);
					next.setFont(new Font("�𸮽�9",Font.BOLD,30));
					
					add(next);
					
					
						
					
		}
		public void actionPerformed (ActionEvent event) 	
		{
			deck.next(cards);	
			
		}
	}
	public class panel4 extends JPanel implements ActionListener  
	{
		/** 
		 * ���������� ����  
		 */	
		protected RockPaperScissors game;
		/** 
		 * Ÿ�̸�  
		 */	
		private   Timer timer;
		
		/** 
		 * ���������� ������   
		 */	
		protected int[] playerA;
		/** 
		 * ���������� �����   
		 */	
		protected int[] playerB;

		/** 
		 * ���������� �������� ���� ����� �̹����� ǥ��    
		 */	
		protected JLabel imgPlayerA;
		/** 
		 * ���������� ������� ���� ����� �̹����� ǥ��  
		 */	
		protected JLabel imgPlayerB;

		/** 
		 * ���������� �����ڿ� ������� ���¸� ���ڿ��� ǥ��      
		 */	
		protected JLabel strPlayer1;
		protected JLabel strPlayer2;

		/** 
		 * ���������� ��ư      
		 */	
		protected JButton[] button;	
		/** 
		 * ���������� 3����, �̼��� 1����, ���� 2������ 2���� �迭�� ����Ͽ� �� 8(=(3+1)*2)���� ����� �̹����� �غ�      
		 */	
		protected ImageIcon[][] image;
		
		/** 
		 * ���������� �⺻ �̹��� ��� 
		 */	
		protected final int BASE = 0;
		/** 
		 * ���������� �̰��� �� �̹��� ���  
		 */	
		protected final int WIN = 1;
		/** 
		 * ���������� ����� ����ǥ �̹��� ���   
		 */	
		protected final int QUESTIONMARK = 3;

		/**
		 * ���������� GUI �г� �ʱ�ȭ 
		 */
		
		// ��� life ���� //
		protected int life = 10;
		// �¸� win ���� //
		protected int win = 0;
		// ���(���� ��ȸ)�� ��Ÿ���� ���� //
		protected JLabel label3;
		// �¸� Ƚ���� ��Ÿ���� ���� //
		protected JLabel label4;
		
		
		public panel4() 
		{
			// ȭ�鿡 �°� �ϱ� ���� ���ġ //
			setLayout(null);
		        
			setBackground (Color.black);
			// ���������� ���� �ʱ�ȭ 
			this.game = new RockPaperScissors();
			// ���������� ���� �� ��� 1�� �����ٰ� ������� �� �ֵ��� Ÿ�̸� ����  
			this.timer = new Timer( 1000, new TimerListener() );
			
			// �����ڿ� ������� ���������� ���� ��� �� ������ 2���� ������ ���� 
			this.playerA = new int[2];
			this.playerB = new int[2];
			this.playerA[0] = this.playerB[0] = game.SCISSORS;
			this.playerA[1] = this.playerB[1] = BASE;
			// ���������� 3����, �̼��� 1����, ���� 2������ 2���� �迭�� ����Ͽ� �� 8(=(3+1)*2)���� ����� �̹����� �غ� 
			final String imgPath = "./src/rockPaperScissors/image/";
			image = new ImageIcon[4][2];
			final String pathImgScissors = imgPath + "scissors.gif";
			final String pathImgRock = imgPath + "rock.gif";
			final String pathImgPaper = imgPath + "paper.gif";
			final String pathImgScissorsWin = imgPath + "scissors_win.gif";
			final String pathImgRockWin = imgPath + "rock_win.gif";
			final String pathImgPaperWin = imgPath + "paper_win.gif";
			final String pathImgQuestionmark = imgPath + "questionmark.gif";
			image[QUESTIONMARK][BASE] = new ImageIcon( new ImageIcon( pathImgQuestionmark ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[QUESTIONMARK][WIN] = new ImageIcon( new ImageIcon( pathImgQuestionmark ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.SCISSORS][BASE] = new ImageIcon( new ImageIcon( pathImgScissors ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.SCISSORS][WIN] = new ImageIcon( new ImageIcon( pathImgScissorsWin ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.ROCK][BASE] = new ImageIcon( new ImageIcon( pathImgRock ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.ROCK][WIN] = new ImageIcon( new ImageIcon( pathImgRockWin ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.PAPER][BASE] = new ImageIcon( new ImageIcon( pathImgPaper ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
			image[game.PAPER][WIN] = new ImageIcon( new ImageIcon( pathImgPaperWin ).getImage().getScaledInstance( 200, 200, Image.SCALE_SMOOTH ) );
				
			// �����ڿ� ������� ���������� �̹��� ȭ�� �ʱ�ȭ 
			strPlayer1 = new JLabel( "<html><br><br>[���̸���]", JLabel.CENTER );
			strPlayer2 = new JLabel( "<html><br><br>[������]", JLabel.CENTER );
			strPlayer1.setForeground(Color.white);
			strPlayer2.setForeground(Color.white);
			imgPlayerA = new JLabel( image[QUESTIONMARK][BASE] );
			imgPlayerB = new JLabel( image[QUESTIONMARK][BASE] );
			
		    imgPlayerB.setBounds(400, -90, 500, 500);
			strPlayer1.setBounds(400, 10, 500, 500);
			strPlayer2.setBounds(400, 30, 500, 500);
			imgPlayerA.setBounds(400, 180, 500, 500);
			add( imgPlayerB );
			add( strPlayer1 );
			add( strPlayer2 );
			add( imgPlayerA );

			// ���������� �Է� ��ư 3�� �ʱ�ȭ  
			button = new JButton[3];
			button[game.SCISSORS] = new JButton( new ImageIcon( image[game.SCISSORS][BASE].getImage().getScaledInstance( 50, 50, Image.SCALE_SMOOTH ) ) );
			button[game.SCISSORS].addActionListener( this ); 

			button[game.ROCK] = new JButton( new ImageIcon( image[game.ROCK][BASE].getImage().getScaledInstance( 50, 50, Image.SCALE_SMOOTH ) ) );
			button[game.ROCK].addActionListener( this ); 

			button[game.PAPER] = new JButton( new ImageIcon( image[game.PAPER][BASE].getImage().getScaledInstance( 50, 50, Image.SCALE_SMOOTH ) ) );
			button[game.PAPER].addActionListener( this ); 
			
			button[game.SCISSORS].setBounds(500, 550, 100, 70);
			button[game.ROCK].setBounds(600, 550, 100, 70);
			button[game.PAPER].setBounds(700, 550, 100, 70);
			
			add( button[game.SCISSORS] );
			add( button[game.ROCK] );
			add( button[game.PAPER] );
			
			JLabel label1 = new JLabel("<html>STAGE1: ���������� ����<br><br>");
			label1.setForeground(Color.white);
			label1.setFont(new Font("�𸮽�9",Font.BOLD,30));
			label1.setBounds(500, -300, 1200, 700);
			add(label1);
			
			JLabel label2 = new JLabel( "<html>���� ���: ���̸��°� ������������ �ؼ� <br>"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp&nbsp;4���� �̱�� Ŭ����!<br>"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
					+ "<html> &nbsp;&nbsp&nbsp;����� �� 10!<br>"
		         	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
		          	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
		        	+ "<html> &nbsp;&nbsp&nbsp;�� ������ 1�� ����!<br>");
			label2.setForeground(Color.white);
			label2.setFont(new Font("�𸮽�9",Font.BOLD,25));
			label2.setBounds(50, -250, 1200, 700);
			add(label2);
			
			// ���� ��ȸ�� Ȯ���� �� �ְ� �ؽ�Ʈ �� ��ġ //
			label4 = new JLabel("life: " + life );
			label4.setForeground(Color.white);
			label4.setFont(new Font("�𸮽�9",Font.BOLD,50));
			label4.setBounds(1106, 10, 300, 100);
			add(label4);

			// �¸� Ƚ���� Ȯ���� �� �ְ� �ؽ�Ʈ �� ��ġ //
			label3 = new JLabel("win: " + win );
			label3.setForeground(Color.white);
			label3.setFont(new Font("�𸮽�9",Font.BOLD,50));
			label3.setBounds(1100, 60, 300, 100);
			add(label3);

			
			
		}

		/**
		 * �����ڰ� ��ư�� ������ ������ ���������� ����� int�� �ڷ�� ��ȯ
		 * @param event ��ư�� ������ ������ ��� 
		 * @return ���������� ���� ��� 
		 */
		protected int selectRockPaperScissors( ActionEvent event )
		{
			if( event.getSource() == button[game.SCISSORS] ) 
				return game.SCISSORS;
			else if ( event.getSource() == button[game.ROCK] ) 
				return game.ROCK;
			else
				return game.PAPER;
		}
		
		/**
		 * ���������� ���� ����� �м��Ͽ� ���� �̰���� ǥ��
		 */
		protected void setGameResult() 
		{
			String result = game.judge( playerA[0], playerB[0] );
			if ( result.contains( "�����ڰ� �̰���ϴ�" ) )
			{ 	// ����ڰ� �̱� ��� �¸� Ƚ�� ������Ʈ// 
				win++;
				label3.setText("win: "+ win);
				playerA[1] = WIN;
				playerB[1] = BASE;
			} 
			else if ( result.contains( "������� �̰���ϴ�" ) )
			{ 			
				playerA[1] = BASE;
				playerB[1] = WIN;
			} 
			else
			{
				playerA[1] = BASE;
				playerB[1] = BASE;	
			}
		} 
			
		/**
		 * �����ڰ� ������������ ���ý� ����� ���ð� ���Ͽ� ���� ����� �����ϰ� ���� ��Ȳ ������Ʈ 
		 * @param event : �������� ���������� ���� ��� 
		 */
		public void actionPerformed( ActionEvent event )  
		{
			
			label4.setText("life: "+life);
			// �����ڰ� ���� ���������� ���� 
			playerA[0] = selectRockPaperScissors( event );
			// ����� ���Ƿ� ���������� ���� 
			playerB[0] = game.selectRockPaperScissors();

			// ���� ����� GUI ȭ�鿡 ������Ʈ 
			setGameResult();
			String result = game.judge( playerA[0], playerB[0] );
			if ( result.contains( "�����ڰ� �̰���ϴ�" ) )
			{
				
			}
				
			else {
				// ����ڰ� �� ��� ��� 1 ����
				life--;
				label4.setText("life: "+life);
			}
			imgPlayerA.setIcon( image[ playerA[0] ][ playerA[1] ] );
			imgPlayerB.setIcon( image[ playerB[0] ][ playerB[1] ] );	
			
			// ���� ���� ��� ��� 
			button[0].setEnabled( false );
			button[1].setEnabled( false );
			button[2].setEnabled( false );
			timer.start();		
			
		}
		
		/**
		 * Ÿ�̸� Ŭ���� 
		 */
		private class TimerListener implements ActionListener 
		{
			
			/**
			 * ��� ����� ���� �� ��� 
			 */
			public void actionPerformed( ActionEvent event ) 
			{
				timer.stop();		
				imgPlayerB.setIcon( image[QUESTIONMARK][BASE] );
				button[0].setEnabled( true );
				button[1].setEnabled( true );
				button[2].setEnabled( true );
				
				// �¸� Ƚ�� 4�̸� �������� Ŭ����� ���� �������� �̵� //
				if (win == 4) 
				
					deck.next(cards);
					
				
				else if (life == 0) 
				{
					// ���(���� ��ȸ) 0�̸� �� �������� ���ư� �ٽ� ���� ���� //
					deck.previous(cards);
					// ���, �¸� �ʱ�ȭ //
					life = 10;
					win = 0;
					// ����ڿ��� �˷��ִ� �ؽ�Ʈ�� �ʱ�ȭ //
					label4.setText("life: "+ life);
					label3.setText("win: " + +win);
				}	
			
				
			}
		}
	}	
	
		class panel5 extends JPanel implements ActionListener
		{
			public panel5 () 
			{
				 
				        setLayout(null);
				        
						setBackground (Color.black);
						JLabel label1 = new JLabel("<html>[���̸���]: ������!! �� ~ �����ε�<br>"
								+ "<html>[���̸���]: ���� ???�� �˷�����<br>"
								+ "<html>[���̸���]: ???�� '���θ�'�� �׷� �� ��Ϸ� ������~<br>"
								+ "<html>�ϾƸ����� ���θ��� �������� �������� ���ߴ�<br>"
								+ "<html>�׷��ٸ� ���θ��� ã�ư�����<br>");
						label1.setForeground(Color.white);
						label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
						label1.setBounds(50, -180, 1200, 700);
						add(label1);
						
						ImageIcon hilion2 = new ImageIcon ("./src/image/�Ѿ�� ���̸���.png");
						JLabel Label2 = new JLabel (hilion2);
						Label2.setBounds(750, 200, 500, 500);
						add(Label2);
						
						JButton next = new JButton("next");
						next.addActionListener (this);	

						next.setPreferredSize(new Dimension(50, 50));
						next.setBounds(530, 550, 200, 50);
						next.setFont(new Font("�𸮽�9",Font.BOLD,30));
						
						add(next);
						
						
							
						
			}
			public void actionPerformed (ActionEvent a) 	
			{
				deck.next(cards);	
				
			}
		}
		class panel6 extends JPanel implements ActionListener
		{
			public panel6 () 
			{
				 
				        setLayout(null);
				        
						setBackground (Color.black);
						JLabel label1 = new JLabel("<html>[���θ�]: ����~ �� ���ִ�!!<br>"
								+ "<html>[���θ�]: ������ ����! ���� ���̾�?<br>"
								+ "<html>[���θ�]: �����? �������� �Ҿ���Ⱦ�?!<br>"
								+ "<html>[���θ�]: �� �´�! ������ �� ������ �յ� ?�� �������� �þ�<br>"
								+ "<html>[���θ�]: ?�� �˷��޶��? ������ �� �񸻶� �׷��µ� ����� ���ָ� �˷��ٰ�<br>"
						        + "<html>[���θ�]: ���� ���ٰ�? �׷��ٸ� ���� ������ �ؼ� �̱�� �˷����� �޷�~<br>"
								+ "<html>[���θ�]: ���� ���� �����̴�! ����~");
						label1.setForeground(Color.white);
						label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
						label1.setBounds(50, -180, 1200, 700);
						add(label1);
						
						ImageIcon hilion2 = new ImageIcon ("./src/image/������ ���θ�.png");
						JLabel Label2 = new JLabel (hilion2);
						Label2.setBounds(750, 200, 500, 500);
						add(Label2);
						
						JButton next = new JButton("next");
						next.addActionListener (this);	

						next.setPreferredSize(new Dimension(50, 50));
						next.setBounds(530, 550, 200, 50);
						next.setFont(new Font("�𸮽�9",Font.BOLD,30));
						
						add(next);
						
						
							
						
			}
			public void actionPerformed (ActionEvent a) 	
			{
				deck.next(cards);	
				
			}
		}
		/**
		 * ����ã�� �г� 
		 * @author So Young Park
		 * @version 0.8
		 */
		public class panel7 extends JPanel implements ActionListener	
		{
			/** 
			 * ����ã�� ������   
			 */	
			protected int player;
			/** 
			 * ������ ���� �ִ� ��ġ
			 */	
			protected int ball;
			/** 
			 * ����ã�� ��ư      
			 */	
			private JButton[] button;	
			/** 
			 * Ÿ�̸�  
			 */	
			private Timer timer;
			/** 
			 * ����ã�� ���� ���¸� ���ڿ��� ǥ��      
			 */	
			protected JLabel label;	
			/** 
			 * ����ã�� ���ӿ��� �� ���¸� �̹����� ǥ��     
			 */	
			private JLabel[] cup;	
			/** 
			 * �� �̹����� �⺻ ��, ������ �ִ� ��, ����ã�⿡ ������ ���� 3���� ��츦 �غ�      
			 */	
			private ImageIcon[] img;	
			/** 
			 * �⺻ �� �̹��� ��ȣ  
			 */	
			private final int BASE = 0;
			/** 
			 * ������ �ִ� �� �̹��� ��ȣ  
			 */	
			private final int BALL = 1;
			/** 
			 * ����ã�⿡ ������ �� �̹��� ��ȣ 
			 */	
			private final int MISS = 2;
			// ���(���� ��ȸ) life ���� //
			private int life = 10;
			// �¸�(Ŭ���� ����) win ���� // 
			private int win = 0;
			// ���, �¸��� ����ڰ� �� �� �ֵ��� �ؽ�Ʈ�� ���� �� ���� //
			private JLabel label3;
			private JLabel label4;

			/**
			 * ����ã�� GUI �г� �ʱ�ȭ 
			 */
			public panel7() 
			{
				setLayout(null);
			        
				setBackground (Color.black);
				
				JLabel label1 = new JLabel("<html>STAGE2: ���� ã�� ����<br><br>");
				label1.setForeground(Color.white);
				label1.setFont(new Font("�𸮽�9",Font.BOLD,30));
				label1.setBounds(500, -300, 1200, 700);
				add(label1);
				
				JLabel label2 = new JLabel( "<html>���� ���: ���θ��� ������ ���� ���� <br>"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp&nbsp;������ ��� �� ��ȣ�� 5���� ���߸� Ŭ����!<br>"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
						+ "<html> &nbsp;&nbsp&nbsp;����� �� 10!<br>"
			         	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			          	+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
			        	+ "<html> &nbsp;&nbsp&nbsp;�� ���� ������ 1�� ����!<br>");
				label2.setForeground(Color.white);
				label2.setFont(new Font("�𸮽�9",Font.BOLD,25));
				label2.setBounds(50, -250, 1200, 700);
				add(label2);
				
				label4 = new JLabel("life: " + life );
				label4.setForeground(Color.white);
				label4.setFont(new Font("�𸮽�9",Font.BOLD,50));
				label4.setBounds(1106, 10, 300, 100);
				add(label4);

				label3 = new JLabel("win: " + win );
				label3.setForeground(Color.white);
				label3.setFont(new Font("�𸮽�9",Font.BOLD,50));
				label3.setBounds(1100, 60, 300, 100);
				add(label3);

				
				// �⺻ ��, ������ �ִ� ��, ����ã�⿡ ������ ���� 3���� ����� �̹����� �غ� 
				img = new ImageIcon[3];
				final String imgPath = "./src/ThreeCupGame/image/";
				final String PathImgCup  = imgPath + "cup.jpg";
				final String PathImgBall = imgPath + "cup_ball.jpg";
				final String PathImgFail = imgPath + "cup_fail.jpg";		
				img[ BASE ] = new ImageIcon( new ImageIcon( PathImgCup  ).getImage().getScaledInstance( 200, 250, Image.SCALE_SMOOTH ) );
				img[ BALL ] = new ImageIcon( new ImageIcon( PathImgBall ).getImage().getScaledInstance( 200, 250, Image.SCALE_SMOOTH ) );
				img[ MISS ] = new ImageIcon( new ImageIcon( PathImgFail ).getImage().getScaledInstance( 200, 250, Image.SCALE_SMOOTH ) );

				// �� 3���� �⺻ �̹����� �ʱ�ȭ 
				cup = new JLabel[3];
				cup[0] = new JLabel( img[ BASE ] );
				cup[1] = new JLabel( img[ BASE ] );
				cup[2] = new JLabel( img[ BASE ] );
				
				cup[0].setBounds(300, 200, 300, 300);
				cup[1].setBounds(505, 200, 300, 300);
				cup[2].setBounds(710, 200, 300, 300);
						
				add( cup[0] );
				add( cup[1] );
				add( cup[2] );

				// �� 3�� �Է� ��ư �ʱ�ȭ  
				button = new JButton[3];
				button[0] = new JButton( "1");
				button[0].addActionListener( this ); 

				button[1] = new JButton( "2" );
				button[1].addActionListener( this ); 

				button[2] = new JButton( "3" );
				button[2].addActionListener( this ); 


				button[0].setBounds(350, 480, 200, 30);
				button[1].setBounds(555, 480, 200, 30);
				button[2].setBounds(760, 480, 200, 30);		
				add( button[0] );
				add( button[1] );
				add( button[2] );
	


				// ����ã�� ���� �� ��� 1�� �����ٰ� ������� �� �ֵ��� Ÿ�̸� ����  
				this.timer = new Timer( 1000, new TimerListener() );
			}
			
			/**
			 * �����ڰ� ��ư�� ������ ������ ����ã�� ����� int�� �ڷ�� ��ȯ
			 * @param event ��ư�� ������ ������ ��� 
			 * @return ����ã�� ���� ��� 
			 */
			protected int selectCup( ActionEvent event )
			{
				if( event.getSource() == button[0] ) 
					return 0;
				else if ( event.getSource() == button[1] ) 
					return 1;
				else
					return 2;
			}
			
			/**
			 * ����ã�� ���� �� ���� ����� ȭ�鿡 ������Ʈ
			 */
			protected void showGameResult( int player, int ball ) 
			{
				cup[ ball ].setIcon( img[ BALL ] ); 
				if ( player != ball )
					cup[ player ].setIcon( img[ MISS ] ); 
				else {
					// ������ ��� ���� ���� ��� win 1 ���� //
					win++;
					// ����ڰ� �� �� �ִ� �¸� �ؽ�Ʈ ������Ʈ // 
				    label3.setText("win: "+win);
				}
			} 
			
			/**
			 * ����ã�� ���� �����ϱ� 
			 * @param event : �������� ����ã�� ���� ��� 
			 */
			public void actionPerformed( ActionEvent event )  
			{
				
				// �� 3�� �� �ϳ��� ���Ƿ� ������ ����� 
				this.ball = (int)( Math.random() * 3 );
				// �����ڴ� ������ ���� ���� ���߱� 
				this.player = this.selectCup( event );
				// ���� ����� GUI ȭ�鿡 ������Ʈ 
				showGameResult( this.player, this.ball );
				if ( player != ball ) {
					life--;
					label4.setText("life: "+life);
				}
					
				else {
					
					
				}
				
				// ���� ���� ��� ��� 
				timer.start();		
				button[0].setEnabled( false );
				button[1].setEnabled( false );
				button[2].setEnabled( false );
			}	
			
			/**
			 * Ÿ�̸� Ŭ���� 
			 */
			private class TimerListener implements ActionListener
			{
				/**
				 * ��� ����� ���� �� ��� 
				 */
				public void actionPerformed( ActionEvent event ) 
				{
					
					timer.stop();			
					// �ſ� ���� ����� ����ã�� ���� ���
					cup[0].setIcon( img[ BASE ] ); 
					cup[1].setIcon( img[ BASE ] ); 
					cup[2].setIcon( img[ BASE ] ); 	
					button[0].setEnabled( true );
					button[1].setEnabled( true );
					button[2].setEnabled( true );
					
					// ����ڰ� 5�� ���� ��� Ŭ���� ������ �޼������Ƿ� ���� �������� �̵� //
					if (win == 5) 
						deck.next(cards);
					
					else if (life == 0) 
					{
						// ���(���� ��ȸ)�� 0�� �� ��� �� �������� ���ư� �ٽ� ���� ���� //
						deck.previous(cards);
						// ���, �¸� Ƚ�� �ʱ�ȭ //
						life = 10;
						win = 0;
						// ���, �¸� ��Ÿ���� �ؽ�Ʈ �ʱ�ȭ //
						label4.setText("life: "+ life);
						label3.setText("win: " + +win);
					}
				}
			}
		}
		class panel8 extends JPanel implements ActionListener
		{
			public panel8 () 
			{
				 
				        setLayout(null);
				        
						setBackground (Color.black);
						JLabel label1 = new JLabel("<html>[���θ�]: ���� �Ǹ��ϱ�!<br>"
								+ "<html>[���θ�]: ���ӿ� �̰����� ?�� �˷�����<br>"
								+ "<html>[���θ�]: ?�� '��'�� �� ������ ��Ƽ��Ʈ�� �Ǳ� ���� ������ �̸�!<br>"
								+ "<html>���θ��� �� �������� �������� ���ߴ� <br>"
								+ "<html>�׷��ٸ� �� ã�ư�����<br>");
						label1.setForeground(Color.white);
						label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
						label1.setBounds(50, -180, 1200, 700);
						add(label1);
						
						ImageIcon hilion2 = new ImageIcon ("./src/image/������ ���θ�2.png");
						JLabel Label2 = new JLabel (hilion2);
						Label2.setBounds(750, 200, 500, 500);
						add(Label2);
						
						JButton next = new JButton("next");
						next.addActionListener (this);	

						next.setPreferredSize(new Dimension(50, 50));
						next.setBounds(530, 550, 200, 50);
						next.setFont(new Font("�𸮽�9",Font.BOLD,30));
						
						add(next);
						
						
							
						
			}
			public void actionPerformed (ActionEvent a) 	
			{
				deck.next(cards);	
				
			}
		}
			class panel9 extends JPanel implements ActionListener
			{
				public panel9 () 
				{
					 
					        setLayout(null);
					        
							setBackground (Color.black);
							JLabel label1 = new JLabel("<html>[��]: ����~ ���� �����̴� ��ȣ!<br>"
									+ "<html>[��]: ��! ������ �ݰ���~ ���� ���̾�?<br>"
									+ "<html>[��]: �� ������ ���� ������ �𸣰� ���� �����Ⱦ� �̾�..<br>"
									+ "<html>[��]: �������� ���� ���а� ????�� �־� ����<br>"
									+ "<html>[��]: �˾Ҿ� ????�� �˷��ٰ�. ��� �� ��Ź �ϳ��� ����� �� ������?<br>"
									+ "<html>[��]: ���� �ڹٸ� �̿��ؼ� ���� �����ε� �� ���� ���ֶ� ���� ��Ź�̾� �Ф�<br>"
									+ "<html>[��]: ���� ������ �׷� ���� �����̴�! ����~ <br>");
							label1.setForeground(Color.white);
							label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
							label1.setBounds(50, -180, 1200, 700);
							add(label1);
							
							ImageIcon hilion2 = new ImageIcon ("./src/image/�Ǳ��� ��.png");
							JLabel Label2 = new JLabel (hilion2);
							Label2.setBounds(750, 200, 500, 500);
							add(Label2);
							
							JButton next = new JButton("next");
							next.addActionListener (this);	

							next.setPreferredSize(new Dimension(50, 50));
							next.setBounds(530, 550, 200, 50);
							next.setFont(new Font("�𸮽�9",Font.BOLD,30));
							
							add(next);
							
							
								
							
				}
				public void actionPerformed (ActionEvent a) 	
				{
					deck.next(cards);	
					
				}
		}
			class panel_10 extends JPanel implements ActionListener { 
				// ���� �ӽ� ���� �г� //
				
				// ���ڵ��� ���� �� �迭 //
				   private JLabel[] Labels; 
				   
				// ���� �ӽ��� ���߰� ���� ��ư //
				   private JButton button; 
				   
				// ���ڵ��� ���� �迭�� //
				   private int[] Numbers; 
				// ���� �ӽ��� ���߰� ���� �� ���̴� Ÿ�̸� //
				   private Timer timer;
				// ��� �� ��Ÿ���� �� //   
				   private JLabel result;
				// ��� ��Ÿ�� �� //
				   private JLabel label3; 
				// ���� ��Ÿ�� �� //
				   private JLabel label4; 
			   // ��� 
				   int life = 10;
			   // ��ư ������ ī��Ʈ
				   int count = 0;
			   // �¸�
				   int win = 0;
				    
				   public panel_10() { 
					   
				      setLayout(null);
				      setBackground (Color.black);
				      
					  
					  JLabel label1 = new JLabel("<html>STAGE1: ���� �ӽ� ����<br><br>");
					  label1.setForeground(Color.white);
					  label1.setFont(new Font("�𸮽�9",Font.BOLD,30));
					  label1.setBounds(500, -300, 1200, 700);
					  add(label1);
					  
					  JLabel label2 = new JLabel( "<html>���� ���: �� �߸��� <br>"
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;����ؼ� ���ڰ� �ٲ�� ���� �ӽ��� ���缭<br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;������ ������ 6���� ����� Ŭ����!<br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Jackpot�� ��� �ٷ� Ŭ����!<br>"
								
                                + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp&nbsp;����� �� 10!<br>"
                                
	                            + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
	                            + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp&nbsp;�� ������ 1�� ����!<br><br><br><br><br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Combination List<br>"
								
                                + "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
                                + "<html> &nbsp;&nbsp&nbsp;Jackpot: ���ڰ� 777�� ���<br>"

								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;One pair: ���ڰ� �� ���� ���� ���<br>"
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Straight: ���ڰ� ���ʷ� �̾����� ���<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Reverse: ���ڰ� �ݴ�� �̾����� ���<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Trips: 3���� ���ڰ� ��� ���� ���<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Odd nums: ���ڰ� ��� Ȧ���� ���<br>" 
								
								+ "<html> &nbsp&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"
								+ "<html> &nbsp;&nbsp&nbsp;Even nums: ���ڰ� ��� ¦���� ���<br>" 
								+ "");
						label2.setForeground(Color.white);
						label2.setFont(new Font("�𸮽�9",Font.BOLD,20));
						label2.setBounds(30, -75, 1200, 700);
						add(label2);
						
						label4 = new JLabel("life: " + life );
						label4.setForeground(Color.white);
						label4.setFont(new Font("�𸮽�9",Font.BOLD,50));
						label4.setBounds(1106, 10, 300, 100);
						add(label4);

						label3 = new JLabel("win: " + win );
						label3.setForeground(Color.white);
						label3.setFont(new Font("�𸮽�9",Font.BOLD,50));
						label3.setBounds(1100, 60, 300, 100);
						add(label3);

					// 3�ڸ� ���ڸ� �ؽ��� ��Ÿ�� �� ���� 
				      Labels = new JLabel[3]; 
				    // 3�ڸ� ���� �迭
				      Numbers = new int[3];
				   
				      
                    // 3�ڸ� ���� �ʱ�ȭ �� ��ġ //
				      for (int i = 0; i < 3; i++) { 
				         Labels[i] = new JLabel("" + Numbers[i]); 
				         Labels[i].setForeground(Color.white);
				         Labels[i].setFont(new Font("�𸮽�9",Font.BOLD,180));
						 Labels[i].setBounds((i*100)+500, 100, 200, 200);

				        add(Labels[i]);

				       }
				      
				      
				     
				      // stop ��ư�� ���� ������ ���ڰ� �ٲ�� �ð� ����
				       timer = new Timer( 100, new TimerListener() );
				      // ����ؼ� ���� ����
				       timer.start();

                     // stop ��ư
				      button = new JButton("Stop"); 
				      button.setFont(new Font("�𸮽�9",Font.BOLD,50));
				      button.setBounds(510, 550, 300, 60);

				     add(button);
                      
				     // ��ư ������ �� �̺�Ʈ �߻�
				      button.addActionListener(this); 
				      
				      // ������ �� ���
				        result = new JLabel("Combination", JLabel.CENTER);
				        result.setForeground(Color.white);
				        result.setFont(new Font("�𸮽�9",Font.BOLD,70));
				        result.setBounds(410, 350, 500, 200);
						add(result);
						
						
				    
				   }



				   public void actionPerformed(ActionEvent event) { 
					   // ��ư ������ Ƚ�� 
					   count++;
					  
						if (count %2 != 0) 
						{
							
						   // ���� ���� ���߱�
						   timer.stop();
						   // ��ư �ؽ�Ʈ�� �ٽ� ���ư� �� �ְ� spin!���� ������Ʈ
					       button.setText("Spin!");
					       
					       // Jackpot: 777�� ���
					       if ( ( Numbers[0] == 7  ) &&
						    		( Numbers[1] == 7 ) &&
						    		( Numbers[2] == 7 ))
						       {
						    	   result.setText("Jackpot");
						    	   // �¸� +1
						    	   win = 6;
						    	   // �ؽ�Ʈ ������Ʈ
						    	   label3.setText("win: " + +win);
						    	   // �¸�(Ŭ���� ����) 5�� �Ǹ� ���� �������� �̵�
						    	   if (win == 6) 
										deck.next(cards);
						    	   
						       }
					       
					       // Trips: �ڸ� ���ڰ� ��� ���� ���
					       else if ( ( Numbers[0] == Numbers[1]  ) &&
						    		( Numbers[1] == Numbers[2] ) )
						       {
						    	   result.setText("Trips");
						    	   // �¸� +1
						    	   win++;
						    	   // �ؽ�Ʈ ������Ʈ
						    	   label3.setText("win: " + +win);
						    	   // �¸�(Ŭ���� ����) 5�� �Ǹ� ���� �������� �̵�
						    	   if (win == 6) 
										deck.next(cards);
						    	   
						       }
					      
					      // one pair: ���ڰ� �� ���� ���� ���
					       else if ( ( Numbers[0] == Numbers[1] ) ||
					    		( Numbers[1] == Numbers[2] ) ||  
					    		( Numbers[0] == Numbers[2] ) ) 
					       {
					    	   result.setText("one pair");
					    	   win++;
					    	   label3.setText("win: " + +win);
					    	   if (win == 6) 
									deck.next(cards);
					        	
					       }
					       // Straight: ���ڰ� ���ʷ� �̾����� ���
					       else  if ( ( Numbers[0] + 1 == Numbers[1]  ) &&
						    		( Numbers[1] + 1 == Numbers[2] ) )
						       {
						    	   result.setText("Straight");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					       // Reverse: ���ڰ� �ݴ�� �̾����� ���
					       else  if ( ( Numbers[2] + 1 == Numbers[1]  ) &&
						    		( Numbers[1] + 1 == Numbers[0] ) )
						       {
						    	   result.setText("Reverse");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					      // Odd nums: ���ڰ� ��� Ȧ��
					       else if ( ( Numbers[0] % 2 != 0 ) &&
						    		( Numbers[1] % 2 != 0 ) &&
						    		( Numbers[2] % 2 != 0 ) ) 
						       {
						    	   result.setText("Odd nums");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					       // Even nums: ���ڰ� ��� ¦��
					       else if ( ( Numbers[0] % 2 == 0 ) &&
						    		( Numbers[1] % 2 == 0 ) &&
						    		( Numbers[2] % 2 == 0 ) ) 
						       {
						    	   result.setText("Even nums");
						    	   win++;
						    	   label3.setText("win: " + +win);
						    	   if (win == 6) 
										deck.next(cards);
						       }
					      // Miss: ������ ������Ű�� ���� ���
					       else
					       {
					    	   
					    	   // ���(���� ��ȸ) 1����
							   life--;
							   // �ؽ�Ʈ ������Ʈ
							   label4.setText("life: "+ life);
					    	  
					    	   result.setText("Miss");
					    	   
					    	  // ���(���� ��ȸ) 0�� ���
					    	   if (life == 0) 
								{
						    	   // �� �������� ���ư���
									deck.previous(cards);
									// ���, �¸� �ʱ�ȭ
									life = 10;
									win = 0;
									
									label4.setText("life: "+ life);
									label3.setText("win: " + +win);
								}
					    	
					       }
					       
					   }
					
					   else
					   {
					   
					   // ���� ����ؼ� ����ǰ� Ÿ�̸� ��ŸƮ
					   timer.start();
					   // ��ư ���� ���߰� Stop!���� ������Ʈ
					   button.setText("Stop!");
					   // ���� ��� �ؽ�Ʈ �ʱ�ȭ
					   result.setText("Combination");
					   }
				      
				   } 
				   private class TimerListener implements ActionListener 
					{
						public void actionPerformed( ActionEvent event ) 
						{
							
							// ���ڰ� ����ؼ� �������� ����
							   
								
							for (int i = 0; i < 3; i++) { 
						         Numbers[i] = (int) (Math.random() * 10);

						         Labels[i].setText(""+Numbers[i]);
						         
						         }
							
							
							
							
						}
					}
				}


			
			class panel_11 extends JPanel implements ActionListener
			{
				public panel_11 () 
				{
					 
					        setLayout(null);
					        
							setBackground (Color.black);
							JLabel label1 = new JLabel("<html>[��]: ����� ������!! ����~<br>"
									+ "<html>[��]: �� ������ �������� ????�� �˷��ٰ�<br>"
									+ "<html>[��]: ????�� G418�̾� �� ���� ������ �־ �̸� ������ ��䳪��~<br>"
									+ "<html>��� �������� ���� ���а� G418�� �ִٰ� �Ͽ���<br>"
									+ "<html>���� ���� �޷�������!<br>");
							label1.setForeground(Color.white);
							label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
							label1.setBounds(50, -180, 1200, 700);
							add(label1);
							
							ImageIcon hilion2 = new ImageIcon ("./src/image/�Ǳ��� ��2.png");
							JLabel Label2 = new JLabel (hilion2);
							Label2.setBounds(750, 200, 500, 500);
							add(Label2);
							
							JButton next = new JButton("next");
							next.addActionListener (this);	

							next.setPreferredSize(new Dimension(50, 50));
							next.setBounds(530, 550, 200, 50);
							next.setFont(new Font("�𸮽�9",Font.BOLD,30));
							
							add(next);
							
							
								
							
				}
				public void actionPerformed (ActionEvent a) 	
				{
					deck.next(cards);	
					
				}
			}
				class panel_12 extends JPanel implements ActionListener
				{
					public panel_12 () 
					{
						 
						        setLayout(null);
						        
								setBackground (Color.black);
								JLabel label1 = new JLabel("<html>G418�� �޷��� �����̴� �̰������� �����<br>"
										+ "<html>�׷��� ĥ�� �ؿ� ������ ���𰡸� �߰��ϰ� �Ǿ���<br>"
										+ "<html>���� �����̴� ��� ���� ���� �Ҿ���� �������� ã�� �Ǿ���!!!!<br>");
								label1.setForeground(Color.white);
								label1.setFont(new Font("�𸮽�9",Font.BOLD,35));
								label1.setBounds(50, -180, 1200, 700);
								add(label1);
								
								
								ImageIcon certification = new ImageIcon ("./src/image/certificate.png");
								JLabel Label3 = new JLabel (certification);
								Label3.setBounds(50, 150, 500, 500);
								add(Label3);
								
								ImageIcon sparkle = new ImageIcon ("./src/image/sparkling.png");
								JLabel Label4 = new JLabel (sparkle);
								Label4.setBounds(200, 290, 100, 100);
								add(Label4);
								
								JLabel Label5 = new JLabel (sparkle);
								Label5.setBounds(338, 430, 100, 100);
								add(Label5);
								
								ImageIcon glad = new ImageIcon ("./src/image/glad.png");
								JLabel Label6 = new JLabel (glad);
								Label6.setBounds(700, 170, 500, 500);
								add(Label6);
								
								JButton next = new JButton("next");
								next.addActionListener (this);	

								next.setPreferredSize(new Dimension(50, 50));
								next.setBounds(530, 550, 200, 50);
								next.setFont(new Font("�𸮽�9",Font.BOLD,30));
								
								add(next);
								
								
									
								
					}
					public void actionPerformed (ActionEvent a) 	
					{
						deck.next(cards);	
						
					}
		}
				
	
	
}



	



