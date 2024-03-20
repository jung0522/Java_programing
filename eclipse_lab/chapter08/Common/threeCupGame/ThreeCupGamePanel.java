package threeCupGame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ����ã�� �г� 
 * @author So Young Park
 * @version 0.8
 */
public class ThreeCupGamePanel extends JPanel implements ActionListener	
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

	/**
	 * ����ã�� GUI �г� �ʱ�ȭ 
	 */
	public ThreeCupGamePanel() 
	{
		// �⺻ ��, ������ �ִ� ��, ����ã�⿡ ������ ���� 3���� ����� �̹����� �غ�  
		img = new ImageIcon[3];
		final String imgPath = "./Common/ThreeCupGame/image/";
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
		this.add( cup[0] );
		this.add( cup[1] );
		this.add( cup[2] );

		button = new JButton[3];
		button[0] = new JButton( "                          1                           " );
		button[0].addActionListener( this ); 

		button[1] = new JButton( "                          2                           " );
		button[1].addActionListener( this ); 

		button[2] = new JButton( "                          3                           " );
		button[2].addActionListener( this ); 

		label = new JLabel( "������ ���� ���� �����ϼ���" );

		this.add( button[0] );
		this.add( button[1] );
		this.add( button[2] );
		this.add( label );

		this.setBackground(Color.cyan);
		this.setPreferredSize(new Dimension(630, 320));	

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
	} 
	
	public int getRandomCup()
	{
		return (int)( Math.random() * 3 );
	}
	
	public void disableSelection()
	{
		button[0].setEnabled( false );
		button[1].setEnabled( false );
		button[2].setEnabled( false );
	}

	public void enableSelection()
	{
		cup[0].setIcon( img[ BASE ] ); 
		cup[1].setIcon( img[ BASE ] ); 
		cup[2].setIcon( img[ BASE ] ); 	
		button[0].setEnabled( true );
		button[1].setEnabled( true );
		button[2].setEnabled( true );
	}
	
	/**
	 * ����ã�� ���� �����ϱ� 
	 * @param event : �������� ����ã�� ���� ��� 
	 */
	public void actionPerformed( ActionEvent event )  
	{
		// �� 3�� �� �ϳ��� ���Ƿ� ������ ����� 
		this.ball = getRandomCup();
		// �����ڴ� ������ ���� ���� ���߱� 
		this.player = this.selectCup( event );
		// ���� ����� GUI ȭ�鿡 ������Ʈ 
		showGameResult( this.player, this.ball );
		
		// ���� ���� ��� ��� 
		timer.start();		
		disableSelection();
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
			enableSelection();
		}
	}
}
