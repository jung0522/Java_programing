import java.util.Scanner;
import remoteControl.TV;
public class TV_Main 							 
{
	// ���α׷����� 
	public static void main( String[] args ) 	 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String result = "";
		
		// TV ������ ��ü ���� 	 
		TV tv = new TV();

		// TV �������� �Է¿� ���� TV�� �����ϰ� �� ����� ���	 
		do
		{
			System.out.print( "TV �������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
			
			// ������ �Է��ϸ� ������ �Ѱų� ����	 
			if ( result.equals( "����" ) )
			{
				System.out.println( tv.clickPower() );
			}
			// ���� �Է��ϸ� ä���� +1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickUp() );
			}
			// �ϸ� �Է��ϸ� ä���� -1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickDown() );
			}
			// �¸� �Է��ϸ� ������ -1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickLeft() );
			}
			// �츦 �Է��ϸ� ������ +1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickRight() );
			}				

		} while( !result.equals( "����" ) );
						
		// ���α׷� ���� 
		return;		
	}
}
