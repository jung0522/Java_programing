import javax.swing.JFrame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import rockPaperScissors.RockPaperScissorsNetwork;

/**************
 * ���������� ���α׷��� ��Ʈ��ũ Ŭ���̾�Ʈ ����
 * @author So Young Park
 * @version 0.8
 */	
public class RockPaperScissorsClient
{
	public static void main(String[] args) 
	{
		String serverIP = "localhost";
		RockPaperScissorsNetwork panel = new RockPaperScissorsNetwork( serverIP );

		JFrame frame = new JFrame( "����������(Ŭ���̾�Ʈ)" );
		frame.getContentPane().add( panel );
		frame.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) { 
				panel.close();
			}
		} );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.pack();
		frame.setVisible(true);
	}
}
