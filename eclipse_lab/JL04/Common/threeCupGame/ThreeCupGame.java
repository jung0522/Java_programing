package threeCupGame;
import java.util.Scanner;

class ThreeCupGame							
{
	public final int GAME_OVER = -1;	

	private String strCups;						
	
	private String strBall;						
	
	private String strBlanks;				
	
	protected String strMeet;				
	
	protected String strDodge;			

	protected String message;		

	public ThreeCupGame() 	
	{		
		this.strCups   = "  ___    ___    ___  \n"		
				           + " |   |  |   |  |   | \n"
				           + " |   |  |   |  |   | \n";
		this.strBall   = "   ●   ";										
		this.strBlanks = "       ";										
		this.strMeet   = " 찾았다! ";										
		this.strDodge  = " 놓쳤다! ";										
		
		this.message = " 1, 2, 3 중에서 구슬[●]을 숨긴 컵을 찾으세요 : ";	
	} 
 
	public String play( Scanner scan )			 
	{	 
		int ball = getRandomCup();  
		int player = selectCup( scan );
		return  
		       getResult( player, ball );
	}

	private int selectCup( Scanner scan )
	{
		int player = 0;
		try
		{
			System.out.print( message );
			player = scan.nextInt();
			if ( isPossibleValue( player - 1 ) == true )
				player = player - 1;
			else
				player = GAME_OVER;
		}
		catch( Exception e )
		{
			e.printStackTrace();
		}

		return player;
	}

	public int getRandomCup() 
	{ 
		return (int)( Math.random() * 3 );
	}
	
	public boolean isPossibleValue( int selection )
	{
		return ( 0 <= selection ) && ( selection <= 2 );		
	}

	private String getResult( int player, int ball ) 
	{ 
		if ( player == GAME_OVER )
			return null;
		
		String str = strCups;
		for ( int i = 0; i < 3; i++ )
		{
			if ( ball == i ) 
				str += strBall;
			else
				str += strBlanks;
		}
		
		str += "\n";
		for ( int i = 0; i < 3; i++ )
		{
			if ( ( player == i ) && ( player == ball ) )
				str += strMeet;
			else if ( player == i )
				str += strDodge;
			else
				str += strBlanks;
		}
		
		return str;
	}
}
