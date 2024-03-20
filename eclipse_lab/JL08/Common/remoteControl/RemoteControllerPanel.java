package remoteControl;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


/**
 * ������ GUI Ŭ����
 * @author So Young Park
 * @version 0.8
 */

public class RemoteControllerPanel extends JPanel implements ActionListener 
{
	/**
	 * ������ǰ : TV, ������, �κ�û�ұ� 
	 */
	protected RemoteControl appliance;
	/**
	 * ������ ��ư : ���� �� �����¿� ��ư 
	 */
	protected JButton[] button;	
	/**
	 * ���� ��ư
	 */
	public final static int POWER = 0;
	/**
	 * ��(��) ��ư
	 */
	public final static int UP = 1;
	/**
	 * ��(��) ��ư
	 */
	public final static int DOWN = 2;
	/**
	 * ��(��) ��ư
	 */
	public final static int LEFT = 3;
	/**
	 * ��(��) ��ư
	 */
	public final static int RIGHT = 4;

	/**
	 * ������ǰ�� �����ϴ� ������ GUI �ʱ�ȭ
	 * @param appliance ������ǰ : TV, ������, �κ�û�ұ� 
	 */
	public RemoteControllerPanel( RemoteControl appliance )
	{
		this();
		this.appliance = appliance;
	}

	/**
	 * ������ GUI �ʱ�ȭ 
	 */
	public RemoteControllerPanel()					  
	{
		this.appliance = null;

		// ����, ��, ��, ��, �� ��ư�� �̹��� �� ������ �ʱ�ȭ 
		final String imgPath = "./Common/remoteControl/image/";
		final String[] strButton = { "power", "up", "down", "left", "right" };
		button = new JButton[strButton.length];
		for ( int i = 0; i < strButton.length; i++ )
		{
			button[i] = new JButton( new ImageIcon( new ImageIcon( imgPath + strButton[i] + ".gif" ).getImage().getScaledInstance( 30, 30, Image.SCALE_SMOOTH ) ) );
			button[i].addActionListener( this ); 
		}

		this.setPreferredSize( new Dimension( 240, 120 ) );		
		this.setLayout( new BorderLayout() );
		this.add( button[POWER], BorderLayout.CENTER );
		this.add( button[UP   ], BorderLayout.NORTH );
		this.add( button[DOWN ], BorderLayout.SOUTH );
		this.add( button[LEFT ], BorderLayout.WEST );
		this.add( button[RIGHT], BorderLayout.EAST );   
	} 					

	/**
	 * ������ ��ư�� Ŭ���� ������ǰ ���� ������Ʈ	
	 * @param ActionEvent e : �̺�Ʈ
	 * @return ����
	 */
	@Override
	public void actionPerformed( ActionEvent event )
	{
		if ( ( event.getSource() == button[POWER] ) && ( appliance != null ) )
			appliance.clickPower();
		else if ( ( event.getSource() == button[UP] ) && ( appliance != null ) )
			appliance.clickUp();
		else if ( ( event.getSource() == button[DOWN] ) && ( appliance != null ) )
			appliance.clickDown();
		else if ( ( event.getSource() == button[LEFT] ) && ( appliance != null ) )
			appliance.clickLeft();
		else if ( ( event.getSource() == button[RIGHT] ) && ( appliance != null ) )
			appliance.clickRight();
	}	
}
