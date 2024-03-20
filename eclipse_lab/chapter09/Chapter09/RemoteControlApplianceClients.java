import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import remoteControl.RemoteControl;
import remoteControl.RemoteControlNetwork;
import remoteControl.TVPanel;
import remoteControl.AirConditionerPanel;
import remoteControl.RoboticVacuumCleanerPanel;

/**************
 * ���������� �����ϴ� ������ǰ ���α׷��� ��Ʈ��ũ Ŭ���̾�Ʈ ����
 * @author So Young Park
 * @version 0.8
 */	
public class RemoteControlApplianceClients
{
	public static void main(String[] args) 
	{
		String serverIP = "localhost";
		String[] applianceName = { "TV(Ŭ���̾�Ʈ)", "������(Ŭ���̾�Ʈ)", "�κ�û�ұ�(Ŭ���̾�Ʈ)" };
		RemoteControl[] appliance = { new TVPanel(), new AirConditionerPanel(), new RoboticVacuumCleanerPanel() };
		for ( int i = 0; i < appliance.length; i++  )
		{
			RemoteControlNetwork panel = new RemoteControlNetwork( appliance[i], serverIP );
		
			JFrame frame = new JFrame( applianceName[i] );
			frame.getContentPane().add( (JPanel)appliance[i] );
			frame.addWindowListener( new WindowAdapter() {
				public void windowClosing( WindowEvent e ) { 
					panel.close();
				}
			} );
			frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
			frame.pack();
			frame.setVisible( true );
		}
	}
}
