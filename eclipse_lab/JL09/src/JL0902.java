import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import chat.ChatNetwork;

public class JL0902
{
	public static void main(String[] args) 
	{
		String serverIP = "localhost";
		ChatNetwork panel = new ChatNetwork( serverIP );

		JFrame frame = new JFrame( "채팅(클라이언트)" );
		frame.getContentPane().add( panel );
		frame.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) { 
				panel.close();
			}
		} );
		frame.setPreferredSize( new Dimension( 320, 445 ) );	
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.pack();
		frame.setVisible(true);
	}
}

