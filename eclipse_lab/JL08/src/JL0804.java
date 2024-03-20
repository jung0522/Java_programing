import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import threeCupGame.ThreeCupGameNetwork;

public class JL0804
{
	public static void main(String[] args) 
	{
		String serverIP = "localhost";
		ThreeCupGameNetwork panel = new ThreeCupGameNetwork( serverIP );

		JFrame frame = new JFrame( "����ã��(Ŭ���̾�Ʈ)" );
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
