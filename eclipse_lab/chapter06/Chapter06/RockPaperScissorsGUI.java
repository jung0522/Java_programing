import javax.swing.JFrame;
import rockPaperScissors.RockPaperScissorsPanel;

/**************
 * ���������� ������ GUI ����
 * @author So Young Park
 * @version 0.8
 */	
public class RockPaperScissorsGUI
{
	public static void main(String[] args) 
	{
		RockPaperScissorsPanel panel = new RockPaperScissorsPanel();

		JFrame frame = new JFrame( "����������" );
		frame.getContentPane().add( panel );
		frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
		frame.pack();
		frame.setVisible( true );
	}
}

