import java.util.Scanner;
import rockPaperScissors.RockPaperScissors_Lose;
public class JL0403							 
{
	public static void main(String[] args) 	 
	{
		Scanner scan = new Scanner( System.in );	
			 
		RockPaperScissors_Lose game = new RockPaperScissors_Lose();	 
		String result = game.play( scan );
		        	 
		System.out.println( result );

		return;
	}
}
