package rockPaperScissors;
public class RockPaperScissors_Lose extends RockPaperScissors 
{
	public RockPaperScissors_Lose()		 
	{	
		super();					 
	}
	protected String judge( String playerA, String playerB )	
	{
		String result = super.judge( playerA, playerB );
		
		if ( result.equals( "플레이어 A가 이겼습니다" ) )
		{
			return "플레이어 B가 이겼습니다";
		}
		else if ( result.equals( "플레이어 B가 이겼습니다" ) )
		{
			return "플레이어 A가 이겼습니다";
		}
		else
		{
			return result;
		}	
	}
}
