import java.util.Scanner;
import rockPaperScissors.RockPaperScissors_Lose;
public class RockPaperScissors_Lose_Main							 
{
	// ���α׷����� 
	public static void main(String[] args) 	 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );	
		
		// ���� ���������� ��ü ���� 	 
		RockPaperScissors_Lose game = new RockPaperScissors_Lose();
		// ���� ���������� ���� ���� 	 
		String result = game.play( scan );
		        
		// ���� ���������� ���� ��� ��� 	 
		System.out.println( result );
		
		// ���α׷� ���� 
		return;
	}
}

