import java.util.Scanner;
import threeCupGame.BombDodgeGame;
/**************
 * ���� ã�� ���α׷����� GUI �κ� Main Ŭ����
 * @author So Young Park
 * @version 0.8
 */	
public class BombDodgeGame_Main					 
{
	// ���α׷����� 
	public static void main(String[] args) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		// ��ź ���ϱ� ��ü ���� 	 
		BombDodgeGame game = new BombDodgeGame();
			
		// ��ź ���ϱ� ���� ���� 	 
		for( String result = null; ( result = game.play( scan ) ) != null; )
		{
			// ��ź ���ϱ� ���� ��� ��� 	 
			System.out.println( result ); 
		}
		
		System.out.println( "\n������ �����մϴ�. ������ �� ������!" ); 
	// ���α׷� ���� 
	}
}
