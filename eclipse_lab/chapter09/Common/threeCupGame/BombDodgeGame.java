package threeCupGame;

public class BombDodgeGame extends ThreeCupGame 
{
			// ��ź ���ϱ� ���� ����  
	public BombDodgeGame() 
	{
		super(); 
			// ���� ã�� ���ӿ� �޽����� ��ź ���ϱ� ���ӿ� �޽����� ������ ���� ���� 
			// ������ ã�Ҵ�, ���ƴٴ� �޽����� ��ź�� ã���� ��!!, ��ġ�� �޿�!�ϴ� �޽����� ���� 
		super.message = " 1, 2, 3 �߿��� ��ź[��]�� �ִ� ���ڸ� ���ϼ��� : ";		
		super.strMeet   = "  ��!!  ";		
		super.strDodge  = "  �޿�! ";		
	}
}
