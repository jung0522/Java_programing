package rockPaperScissors;
import java.util.Scanner;

/**
 * RockPaperScissors Ŭ������ ���������� ������ �𵨸�
 * @author �ڼҿ�
 */
public class RockPaperScissors	 
{
	// ����, ����, ���� �ش��ϴ� ������
	public final int ROCK = 0; 
	public final int PAPER = 1;		 
	public final int SCISSORS = 2;	 

	// �÷��̾� A, �÷��̾� B�� ���������� �� �ϳ��� ������ ����
	private String playerA;		 
	private String playerB; 

	/**
	 * ���������� ������ �ʱ�ȭ�ϴ� ������
	 */
	public RockPaperScissors()	 
	{	
		this.playerA = "����";	 
		this.playerB = "����";	 
	}
	
	/**
	 * �÷��̾� A ���� Ű���忡�� �Է¹ް� �÷��̾� B ���� ���Ƿ� �Է¹޾� ���������� ������ ���и� ����
	 * @param scan : Ű���� �Է��� ���� Scanner ���� ����
	 * @return ���������� ������ ������ ���
	 */
	// ���������� ���� �����ϴ� �޼��� 
	public String play( Scanner scan )	 
	{	
		// �÷��̾� A�� Ű���忡�� �Է¹޾� ���������� ����  
		this.playerA = getRockPaperScissors( scan );
		
		// �÷��̾� B�� ���Ƿ� ���������� ���� 
		this.playerB = getRockPaperScissors();

		// ���������� ������ ������ ����� ��ȯ 
		String result = getResult( this.playerA, this.playerB );

		return result;
	}
	
	/**
	 * �÷��̾� A ���� ���޹ް� �÷��̾� B ���� ���Ƿ� �Է¹޾� ���������� ������ ���и� ����
	 * @param playerA : �÷��̾� A�� ���������� �� �ϳ�
	 * @return ���������� ������ ������ ���
	 */
	public String play( String playerA )	 
	{
		// �÷��̾� A�� ���޹޾� ���������� ����
		this.playerA = playerA;		 
		
		// �÷��̾� B�� ���Ƿ� ���������� ���� 
		this.playerB = getRockPaperScissors();

		// ���������� ������ ������ ����� ��ȯ
		String result = getResult( this.playerA, this.playerB );

		return result;
	}
	
	/**
	 * ���������� ������ ������ ���
	 * @param playerA : �÷��̾� A�� ���������� �� �ϳ�
	 * @return ���������� ������ ������ ���
	 */
	private String getResult( String playerA, String playerB )	 
	{
		// �÷��̾� A�� �÷��̾� B�� ���� ���� 
		String result = "";
		result += "�÷��̾� A�� " + playerA +"�� �½��ϴ�.\n";
		result += "�÷��̾� B�� " + playerB +"�� �½��ϴ�.\n";
		
		// �÷��̾� A�� �÷��̾� B�� ���������� ���� ���� 
		result += "��������� " 
		                  + judge( playerA, playerB ) + "\n";  
		
		return result;
	}

	/**
	 * ���������� ������ ������ ���
	 * @return ���������� ������ ������ ���
	 */
	private String getResult() 
	{
		return
		       getResult( this.playerA, this.playerB );		 
	}

	/**
	 * Ű���忡�� �Է¹޾� ���������� ����
	 * @param scan : Ű���� �Է��� ���� Scanner ���� ����
	 * @return ���������� �� �ϳ�
	 */
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

	/**
	 * ���Ƿ� ���������� ����
	 * @return ���������� �� �ϳ�
	 */
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
			
	/**
	 * �÷��̾� A�� �÷��̾� B�� ���������� ���� ����
	 * @param playerA : �÷��̾� A�� ���������� ���� ���
	 * @param playerB : �÷��̾� A�� ���������� ���� ���
	 * @return ���������� ���� ���� ���
	 */
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
