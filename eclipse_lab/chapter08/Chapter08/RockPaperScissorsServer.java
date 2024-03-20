import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import rockPaperScissors.RockPaperScissorsNetwork;

/**
 * ���������� ���α׷��� ��Ʈ��ũ ���� ����
 * @author So Young Park
 * @version 0.8
 */	
public class RockPaperScissorsServer
{
	public static void main(String[] args) 
	{
		RockPaperScissorsNetwork panel = new RockPaperScissorsNetwork();

		JFrame frame = new JFrame( "����������(����)" );
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

