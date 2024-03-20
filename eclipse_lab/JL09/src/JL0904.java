import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import remoteControl.RemoteControlNetwork;


public class JL0904
{
	public static void main(String[] args) 
	{
		String serverIP = "localhost";			
		RemoteControlNetwork panel = new RemoteControlNetwork( serverIP );

		JFrame frame = new JFrame( "리모컨(클라이언트)" );
		frame.getContentPane().add( panel );
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

