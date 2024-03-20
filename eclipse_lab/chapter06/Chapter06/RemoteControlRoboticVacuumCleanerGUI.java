import java.awt.*;
import javax.swing.JFrame;
import remoteControl.RemoteControllerPanel;
import remoteControl.RoboticVacuumCleanerPanel;

/**************
 * ���������� �����ϴ� �κ�û�ұ� ���α׷��� GUI ����
 * @author So Young Park
 * @version 0.8
 */	
public class RemoteControlRoboticVacuumCleanerGUI
{
	public static void main(String[] args) 
	{
		RoboticVacuumCleanerPanel appliance = new RoboticVacuumCleanerPanel();
		RemoteControllerPanel remoteController = new RemoteControllerPanel( appliance );

		JFrame frame = new JFrame( "�κ�û�ұ�" );
		frame.setLayout( new BorderLayout() );     
		frame.add( appliance, BorderLayout.EAST );
		frame.add( remoteController, BorderLayout.WEST );
		frame.setPreferredSize( new Dimension( 600,170 ) );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.pack();
		frame.setVisible( true );
	}
}

