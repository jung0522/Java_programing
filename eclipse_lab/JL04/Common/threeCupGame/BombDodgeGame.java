package threeCupGame;

public class BombDodgeGame extends ThreeCupGame 
{
	public BombDodgeGame() 
	{
		super(); 
		super.message = " 1, 2, 3 중에서 폭탄[●]이 있는 상자를 피하세요 : ";		
		super.strMeet   = "  펑!!  ";		
		super.strDodge  = "  휴우! ";		
	}
}
