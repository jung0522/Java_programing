import javax.swing.JFrame;
import threeCupGame.ThreeCupGamePanel;

/**************
 * ����ã�� ������ GUI ����
 * @author So Young Park
 * @version 0.8
 */	
public class ThreeCupGameGUI
{
	public static void main(String[] args) 
	{
		ThreeCupGamePanel panel = new ThreeCupGamePanel();

		JFrame frame = new JFrame( "����ã��" );
		frame.getContentPane().add( panel );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.pack();
		frame.setVisible( true );
	}
}

