package remoteControl;
import java.awt.*;
import javax.swing.*;

/**
 * ���������� �����ϴ� TV Ŭ����
 * @author So Young Park
 * @version 0.8
 */
public class TVPanel extends JPanel implements RemoteControl 
{
	/** 
	 * TV ���� 
	 */	
	private boolean power;
	/** 
	 * ä�� ��ȣ 
	 */	
	private int channel;

	/** 
	 * ä�κ� �̹��� ���� : EBS, SBS, KBS, MBC
	 */	
	private ImageIcon[] imgChannel;
	/** 
	 * ä�� ���� ����� �̹����� ǥ��  
	 */	
	private JLabel lblChannel;
	/** 
	 * ����
	 */	
	private int volume;
	/** 
	 * ������ �̹��� ���� : ����0, ����1, ����2, ����3
	 */	
	private ImageIcon[] imgVolume;		
	/** 
	 * ���� ���� ����� �̹����� ǥ��  
	 */	
	private JLabel lblVolume;
	
	/**
	 * TV ȭ�� �ʱ�ȭ 
	 */
	public TVPanel() 
	{
		// ä�� �̹��� �غ� 
		final String imgPath = "./Common/remoteControl/image/";
		final String[] channelFile = { "EBS.gif", "SBS.gif", "KBS.gif", "MBC.gif", "blank.gif" };	
		imgChannel = new ImageIcon[channelFile.length];
		for ( int i = 0; i < channelFile.length; i++ )
		{
			imgChannel[i] = new ImageIcon( new ImageIcon( imgPath + channelFile[i] ).getImage().getScaledInstance( 250, 120, Image.SCALE_SMOOTH ) );
		}
		
		// ���� �̹��� �غ� 
		final String[] volumeFile = { "volume0.gif", "volume1.gif", "volume2.gif", "volume3.gif" };	
		imgVolume = new ImageIcon[volumeFile.length];
		for ( int i = 0; i < volumeFile.length; i++ )
		{
			imgVolume[i] = new ImageIcon( new ImageIcon( imgPath + volumeFile[i] ).getImage().getScaledInstance( 80, 120, Image.SCALE_SMOOTH ) );
		}
		// �غ��� �̹����� �������� ä�� �� ���� �ʱ�ȭ			
		power = OFF;
		channel = imgChannel.length - 1;
		volume = 0;			
		lblChannel = new JLabel( imgChannel[channel] );
		lblVolume =  new JLabel( imgVolume[volume] );
		add( lblChannel );
		add( lblVolume );
	}
	
	/**
	 * TV ���������� ���� ��ư�� ������ ���� ���� ���� 
	 */
	public String clickPower()
	{
		if( power == OFF )
		{
			power = ON;
			channel = 0;
			volume = 1;
			lblChannel.setIcon( imgChannel[channel] );
			lblVolume.setIcon( imgVolume[volume] );
			return "������ �մϴ�";
		}
		else 
		{
			power = OFF;
			channel = imgChannel.length - 1;
			volume = 0;
			lblChannel.setIcon( imgChannel[channel] );
			lblVolume.setIcon( imgVolume[volume] );
			return "������ ���ϴ�";
		}
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ ä�� ��ȣ ���� 
	 */
	public String clickUp()
	{
		if( power == ON )
		{
			channel = ( channel + 1 ) % ( imgChannel.length - 1 );
			lblChannel.setIcon( imgChannel[channel] );
		}
		
		return "���� ä���� " + ( channel ) + "���Դϴ�";
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ ä�� ��ȣ ���� 
	 */
	public String clickDown()
	{
		if( power == ON )
		{
			channel = ( channel + ( imgChannel.length - 2 ) ) % ( imgChannel.length - 1 );
			lblChannel.setIcon( imgChannel[channel] );
		}
		
		return "���� ä���� " + ( channel ) + "���Դϴ�";
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ ���� ���� 
	 */
	public String clickLeft()
	{
		if( power == ON )
		{
			volume = ( volume + ( imgVolume.length - 1 ) ) % imgVolume.length;
			lblVolume.setIcon( imgVolume[volume] );
		}
		
		return "���� ������ " + ( volume ) + "�Դϴ�";
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ ���� ���� 
	 */
	public String clickRight()
	{
		if( power == ON )
		{
			volume = ( volume + 1 ) % imgVolume.length;
			lblVolume.setIcon( imgVolume[volume] );
		}
		
		return "���� ������ " + ( volume ) + "�Դϴ�";
	}
}
