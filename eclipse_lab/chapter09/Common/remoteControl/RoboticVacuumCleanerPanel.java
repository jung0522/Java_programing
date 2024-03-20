package remoteControl;
import java.awt.*;
import javax.swing.*;

/**
 * Robotic Vacuum Cleaner Ŭ������ Robotic Vacuum Cleaner �������� �𵨸�(������ ����� �����ϹǷ� �θ�Ŭ���� RemoteControl�� ���)
 * @author So Young Park
 * @version 0.8
 */
public class RoboticVacuumCleanerPanel extends JPanel implements RemoteControl 
{
	private final int WIDTH = 340, HEIGHT = 120;
	private final int IMAGE_SIZE = 30;
	private ImageIcon imgRobot;
	private ImageIcon imageBackground;
	private int robotX, robotY;
	/**
	 * ���� ����
	 */
	private boolean power;
	/** 
	 *û�ұ����� �̹����� ǥ��  
	 */	
	private JLabel cleaningArea;
	
	/**
	 * Robotic Vacuum Cleaner GUI ȭ�� �ʱ�ȭ 
	 */
	public RoboticVacuumCleanerPanel()
	{
		// Robotic Vacuum Cleaner �� �̵� ���� ���� �ʱ�ȭ 
		power = OFF;
		robotX = robotY = 0;
		final String imgPath = "./Common/remoteControl/image/";
		imgRobot = new ImageIcon( new ImageIcon( imgPath + "robot.gif" ).getImage().getScaledInstance( IMAGE_SIZE, IMAGE_SIZE, Image.SCALE_SMOOTH ) );
		imageBackground = new ImageIcon( new ImageIcon( imgPath + "blank.gif" ).getImage().getScaledInstance( WIDTH, HEIGHT, Image.SCALE_SMOOTH ) );
		cleaningArea = new JLabel( imageBackground );
		add( cleaningArea );
		setPreferredSize( new Dimension( WIDTH, HEIGHT ) );
	}
	/**
	 * Robotic Vacuum Cleaner ���������� ���� ��ư�� ������ ���� ���� ����  
	 */
	public String clickPower()
	{
		if( power == OFF )
		{
			cleaningArea.setIcon( null );
			power = ON;
			return "������ �մϴ�";
		}
		else 
		{
			cleaningArea.setIcon( imageBackground );
			power = OFF;
			return "������ ���ϴ�";
		}
	}
	
	/**
	 * Robotic Vacuum Cleaner ���������� ��(��) ��ư�� ������ �������� �̵� 
	 */
	public String clickUp()
	{
		move( 0, -10, power );	
		return "�����մϴ�";
	}
	
	/**
	 * Robotic Vacuum Cleaner ���������� ��(��) ��ư�� ������ �Ʒ������� �̵�  
	 */
	public String clickDown()
	{
		move( 0, 10, power );	
		return "�����մϴ�";
	}
	
	/**
	 * Robotic Vacuum Cleaner ���������� ��(��) ��ư�� ������ �������� �̵�  
	 */
	public String clickLeft()
	{
		move( -10, 0, power );	
		return "��ȸ���մϴ�";
	}
	
	/**
	 * Robotic Vacuum Cleaner ���������� ��(��) ��ư�� ������ ���������� �̵�  
	 */
	public String clickRight()
	{
		move( 10, 0, power );	
		return "��ȸ���մϴ�";
	}

	/**
	 * Robotic Vacuum Cleaner �̵� 
	 */
	public void move( int x, int y, boolean power )
	{
		if ( power == RemoteControl.OFF )
			return;
			
		robotX += x;
		robotY += y;

		if ( robotX <= 0 )
			robotX = 0;
		else if ( robotX >= ( WIDTH - IMAGE_SIZE ) )
			robotX = WIDTH - IMAGE_SIZE;

		if ( robotY <= 0 )
			robotY = 0;
		else if ( robotY >= ( HEIGHT - IMAGE_SIZE ) )
			robotY = ( HEIGHT - IMAGE_SIZE );
   
		repaint();
	}

	/**
	 * Robotic Vacuum Cleaner ȭ�� ������Ʈ
	 */
	public void paintComponent( Graphics page )
	{
		super.paintComponent( page );
		imgRobot.paintIcon( this, page, robotX, robotY );
	}
}
