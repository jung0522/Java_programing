import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import rockPaperScissors.RockPaperScissorsNetwork;

public class JL0803
{
	public static void main(String[] args) 
	{
		RockPaperScissorsNetwork panel = new RockPaperScissorsNetwork();

		JFrame frame = new JFrame( "가위바위보(서버)" );
		frame.getContentPane().add( panel );
		frame.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) { 
				panel.close();
			}
		} );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.pack();
		frame.setVisible( true );
		
		panel.connectAsServer();
	}
}

