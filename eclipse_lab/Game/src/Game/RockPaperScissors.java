package Game;
import java.util.Scanner;

/**
 * ���������� ���� Ŭ���� 

 */
public class RockPaperScissors
{
	/**
	 * ������ ��Ÿ���� ��� 
	 */
	public final int SCISSORS = 0;
	/**
	 * ������ ��Ÿ���� ��� 
	 */
	public final int ROCK = 1;
	/**
	 * ���� ��Ÿ���� ��� 
	 */
	public final int PAPER = 2;

	/**
	 * ���������� �����ڴ� Ű���忡�� �Է¹ް� ������� ���Ƿ� �Է¹޾� ���������� ������ ���и� ����
	 * @param scan Ű���� �Է��� ���� Scanner ��ü
	 * @return ���������� ������ ������ ���
	 */
	public String play( Scanner scan )
	{	
		int playerA = selectRockPaperScissors( scan );
		int playerB = selectRockPaperScissors();
		
		String result = "";
		result += "�����ڴ� " + getString( playerA ) +"�� �½��ϴ�.\n";
		result += "������� " + getString( playerB ) +"�� �½��ϴ�.\n";
		result += "��������� " + judge( playerA, playerB ) + "\n";
		return result;
	}
	
	/**
	 * ���������� ���� ���ڿ��� ǥ��
	 * @param player ����������(int��)
	 * @return ����������(String��) 
	 */
	public String getString( int player )
	{
		if ( player == SCISSORS )
			return "����";
		else if ( player == ROCK )
			return "����";
		else
			return "��"; 
	}
	
	/**
	 * ���������� ���� ���ڷ� ǥ�� 
	 * @param player ����������(String��) 
	 * @return ����������(int��)
	 */
	public int getInteger( String player )
	{
		if ( player.equals( "����" ) )
			return SCISSORS;
		else if ( player.equals( "����" ) )
			return ROCK;
		else
			return PAPER; 
	}
	
	/**
	 * ���������� �����ڰ� �Է��� ���� ��� ���� 
	 * @param scan Ű���� �Է��� ���� Scanner ��ü
	 * @return ���������� �������� ���� ���
	 */
	protected int selectRockPaperScissors( Scanner scan )
	{
		String player;
		
		do
		{
			System.out.print( "����, ����, �� �� �ϳ��� �Է��ϼ��� : ");
			player = scan.next();
			
		} while( !player.equals( "����" ) && !player.equals( "����" ) && !player.equals( "��" ) );
			
		return getInteger( player );
	}

	/**
	 * ���Ƿ� ���������� �߿��� �ϳ��� ����
	 * @return ����(0), ����(1), ��(2) �� ������ ��
	 */
	protected int selectRockPaperScissors()
	{
		return (int)(Math.random()*3);		
	}
	
	/**
	 * ���������� �����ڿ� ������� ���� ����� �������� ���� ����
	 * @param playerA ���������� �������� ���� ���
	 * @param playerB ���������� ������� ���� ���
	 * @return ���������� ���� ���� ���
	 */
	protected String judge( int playerA, int playerB )
	{
		if ( playerA == playerB )
		{
			return "������ �����ڰ� �����ϴ�";
		}
		else if ( ( ( playerA == SCISSORS ) && ( playerB == PAPER ) )
				|| ( ( playerA == ROCK ) && ( playerB == SCISSORS ) )
				|| ( ( playerA == PAPER ) && ( playerB == ROCK ) ) )
		{
			return "�����ڰ� �̰���ϴ�";
		}
		else
		{
			return "������� �̰���ϴ�";
		}	
	}
}
