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
		
		if ( result.equals( "�÷��̾� A�� �̰���ϴ�" ) )
		{
			return "�÷��̾� B�� �̰���ϴ�";
		}
		else if ( result.equals( "�÷��̾� B�� �̰���ϴ�" ) )
		{
			return "�÷��̾� A�� �̰���ϴ�";
		}
		else
		{
			return result;
		}	
	}
}
