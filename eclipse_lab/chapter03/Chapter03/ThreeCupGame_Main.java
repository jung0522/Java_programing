import java.util.Scanner;

/**
 * ����ã�� ���� Ŭ���� 
 * @author So Young Park
 * @version 0.8
 */
class ThreeCupGame										
{
	/**
	 * �������Ḧ ��Ÿ���� ��� 
	 */
	public final int GAME_OVER = -1;		

	/**
	 * �� 3�� ǥ��  
	 */
	private String strCups;							
	/**
	 * ������ ���� �� ǥ�� 
	 */
	private String strBall;							
	/**
	 * ������ ���� �� ǥ��  
	 */
	private String strBlanks;						
	
	/**
	 * ���� ã�� ������ �޽��� 
	 */
	protected String strMeet;						
	/**
	 * ���� ã�� ���н� �޽��� 
	 */
	protected String strDodge;					
	/**
	 * ���� �ȳ� �޽���
	 */
	protected String message;						

	/**
	 * ���� ã�� �ʱ�ȭ  
	 */
	public ThreeCupGame() 						
	{		
		this.strCups   = "  ___    ___    ___  \n"		
				           + " |   |  |   |  |   | \n"
				           + " |   |  |   |  |   | \n";
		this.strBall   = "   ��   ";										
		this.strBlanks = "       ";										
		this.strMeet   = " ã�Ҵ�! ";										
		this.strDodge  = " ���ƴ�! ";										
		
		this.message = " 1, 2, 3 �߿��� ����[��]�� ���� ���� ã������ : ";	
	} 

	/**
	 * �� 3�� �� �ϳ��� ���Ƿ� ������ �����, �����ڿ��� �� ��ȣ�� �Է¹޾� ����ã�� ������ ���и� ����
	 * @param scan Ű���� �Է��� ���� Scanner ��ü
	 * @return ����ã�� ������ ������ ���
	 */
	// ���� ã�� ���� �����ϴ� �޼��� 
	public String play( Scanner scan )				
	{	
		// �� 3�� �� �ϳ��� ���Ƿ� ������ ����� 
		int ball = selectCup();
		//�����ڴ� �� ��ȣ�� Ű���忡�� �Է�  
		int player = selectCup( scan );
		// ����ã�� ������ ���и� ���� 
		String result = getResult( player, ball );
		return result;	
	}

	/**
	 * ����ã�� �����ڰ� ������ �� ��ȣ ���� 
	 * @param scan Ű���� �Է��� ���� Scanner ��ü
	 * @return ����ã�� �������� ���� ���
	 */
	private int selectCup( Scanner scan )
	{
		int player = 0;
		try
		{
			System.out.print( message );
			player = scan.nextInt();
			// �� ��ȣ 1, 2, 3�� 0, 1, 2�� �����Ͽ� ��ȯ 
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

	/**
	 * �� ���� �� �߿��� ���Ƿ� ������ �ִ� �� ��ȣ ����
	 * @return 0, 1, 2 �� ������ ��
	 */
	public int selectCup() 
	{ 
		return (int)( Math.random() * 3 );
	}
	
	/**
	 * �ùٸ� �� ��ȣ���� Ȯ�� 
	 * @param selection ���� ���
	 * @return 0, 1, 2�̸� true, �ƴϸ� false
	 */
	public boolean isPossibleValue( int selection )
	{
		return ( 0 <= selection ) && ( selection <= 2 );		
	}


	/**
	 * �����ڰ� ������ �Ű� ������ ���� ���� ���Ͽ� ���� ���� ����� ����
	 * @param player �����ڰ� ������ ��
	 * @param ball ������ ���� ��
	 * @return ����ã�� ������ ������ ���
	 */
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

	// [������]�� ��2��(1)�� ����
	// [������]�� ��1��(0)�� ����
	// [������]�� ��0��(GAME_OVER)�� ����
		
/**************
 * ���� ã�� ���α׷����� GUI �κ� Main Ŭ����
 * @author So Young Park
 * @version 0.8
 */	
public class ThreeCupGame_Main										
{
	// ���α׷����� 
	public static void main(String[] args) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		// ���� ã�� ��ü ���� 	 
		ThreeCupGame game = new ThreeCupGame();
			
		// ���� ã�� ���� ���� 	 
		for( String result = null;( result = game.play( scan ) ) != null; )
		{
			// ���� ã�� ���� ��� ��� 	 
			System.out.println( result ); 
		}
		
		System.out.println( "\n������ �����մϴ�. ������ �� ������!" ); 
		// ���α׷� ���� 
	}
}
