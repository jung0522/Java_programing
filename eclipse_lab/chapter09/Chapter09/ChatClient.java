import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import chat.ChatNetwork;

/**************
 * ä�� ���α׷��� ��Ʈ��ũ Ŭ���̾�Ʈ ���� 
 * @author So Young Park
 * @version 0.8
 */	
public class ChatClient
{
	public static void main(String[] args) 
	{
		String serverIP = "localhost";
		ChatNetwork panel = new ChatNetwork( serverIP );

		JFrame frame = new JFrame( "ä��(Ŭ���̾�Ʈ)" );
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

