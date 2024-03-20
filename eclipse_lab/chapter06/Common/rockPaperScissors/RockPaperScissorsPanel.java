package rockPaperScissors;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ���������� GUI �г� 
 * @author So Young Park
 * @version 0.8
 */
public class RockPaperScissorsPanel extends JPanel implements ActionListener  
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
	protected JLabel strPlayers;

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
	public RockPaperScissorsPanel() 
	{
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
		 final String imgPath = "./Common/rockPaperScissors/image/";
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
		this.strPlayers = new JLabel( "<html><body>[��]<br>[��]</body></html>", JLabel.CENTER );		
		this.imgPlayerA = new JLabel( image[QUESTIONMARK][BASE] );
		this.imgPlayerB = new JLabel( image[QUESTIONMARK][BASE] );
		
		this.add( this.imgPlayerB );
		this.add( this.strPlayers );
		this.add( this.imgPlayerA );

		// ���������� �Է� ��ư 3�� �ʱ�ȭ  
		button = new JButton[3];
		button[game.SCISSORS] = new JButton( new ImageIcon( image[game.SCISSORS][BASE].getImage().getScaledInstance( 30, 30, Image.SCALE_SMOOTH ) ) );
		button[game.SCISSORS].addActionListener( this ); 

		button[game.ROCK] = new JButton( new ImageIcon( image[game.ROCK][BASE].getImage().getScaledInstance( 30, 30, Image.SCALE_SMOOTH ) ) );
		button[game.ROCK].addActionListener( this ); 

		button[game.PAPER] = new JButton( new ImageIcon( image[game.PAPER][BASE].getImage().getScaledInstance( 30, 30, Image.SCALE_SMOOTH ) ) );
		button[game.PAPER].addActionListener( this ); 
		this.add( new JLabel("  ���� ���� ���� �����ϼ���  ") );
		this.add( button[game.SCISSORS] );
		this.add( button[game.ROCK] );
		this.add( button[game.PAPER] );

		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(220, 530));		
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
		{ 			
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
		// �����ڰ� ���� ���������� ���� 
		playerA[0] = selectRockPaperScissors( event );
		// ����� ���Ƿ� ���������� ���� 
		playerB[0] = game.selectRockPaperScissors();

		// ���� ����� GUI ȭ�鿡 ������Ʈ 
		setGameResult();
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
		}
	}
}	
