package rockPaperScissors;
import java.util.Scanner;

public class RockPaperScissors	 
{
	public final int ROCK = 0; 
	public final int PAPER = 1;		 
	public final int SCISSORS = 2;	 

	private String playerA;		 
	private String playerB; 

	public RockPaperScissors()	 
	{	
		this.playerA = "����";	 
		this.playerB = "����";	 
	}
	
	public String play( Scanner scan )	 
	{	
		this.playerA = getRockPaperScissors( scan );
		
		this.playerB = getRockPaperScissors();

		String result = getResult( this.playerA, this.playerB );

		return result;
	}
	
	public String play( String playerA )	 
	{
		this.playerA = playerA;		 
		
		this.playerB = getRockPaperScissors();

		String result = getResult( this.playerA, this.playerB );

		return result;
	}
	
	private String getResult( String playerA, String playerB )	 
	{
		String result = "";
		result += "�÷��̾� A�� " + playerA +"�� �½��ϴ�.\n";
		result += "�÷��̾� B�� " + playerB +"�� �½��ϴ�.\n";
		
		result += "��������� " 
		                  + judge( playerA, playerB ) + "\n";  
		
		return result;
	}

	private String getResult() 
	{
		return
		       getResult( this.playerA, this.playerB );		 
	}

	private String getRockPaperScissors( Scanner scan ) 
	{
		String result = "";
		
		do
		{
			System.out.print( "����, ����, �� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
			
		} while( !result.equals( "����" ) && !result.equals( "����" ) && !result.equals( "��" ) );
			
		return result;
	}

	private String getRockPaperScissors()			 
	{
		int num = (int)(Math.random()*3);
		String result = "";
		
		if ( num == SCISSORS )
		{
			result = "����";
		}
		else if ( num == ROCK )
		{
			result = "����";
		}
		else
		{
			result = "��"; 
		}
		
		return result; 
	}
			
	protected String judge( String playerA, String playerB )	 
	{
		String result = "";
		if ( playerA.equals( playerB ) )
		{
			result = "�÷��̾� A�� �÷��̾� B�� �����ϴ�";
		}
		else if ( ( playerA.equals( "����" ) && playerB.equals( "��" ) ) 
				|| ( playerA.equals( "����" ) && playerB.equals( "����" ) )
				|| ( playerA.equals( "��" ) && playerB.equals( "����" ) ) )
		{
			result = "�÷��̾� A�� �̰���ϴ�";
		}
		else
		{
			result = "�÷��̾� B�� �̰���ϴ�";
		}	
		
		return result;
	}
}
