import java.util.Scanner;
import threeCupGame.BombDodgeGame;

public class JL0404					 
{
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );	 
		BombDodgeGame game = new BombDodgeGame();
			 	 
		for( String result = null; ( result = game.play( scan ) ) != null; )
		{	 
			System.out.println( result ); 
		}
		
		System.out.println( "\n������ �����մϴ�. ������ �� ������!" ); 
	}
}