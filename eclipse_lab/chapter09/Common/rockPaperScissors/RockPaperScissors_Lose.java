package rockPaperScissors;
/**
 * RockPaperScissors_Lose Ŭ������ RockPaperScissors�� ��ӹ޾� ���� ������������ �𵨸� 
 * @author �ڼҿ�
 */
public class RockPaperScissors_Lose extends RockPaperScissors 
{
		/**
	 * ���������� ������ �ʱ�ȭ�ϴ� ������
	 */
	public RockPaperScissors_Lose()		 
	{	
		super();					 
	}
	/**
	 * �÷��̾�A�� �÷��̾�B�� ���� ���������� ���� ����
	 * @param playerA : �÷��̾�A�� ���������� ���� ���
	 * @param playerB : �÷��̾�A�� ���������� ���� ���
	 * @return ���� ���������� ���� ���� ���
	 */
	// ���� ���������� ���� ���� 
	protected String judge( String playerA, String playerB )	
	{
		// ������������ ���� ����� �ݴ�� ���� 
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
