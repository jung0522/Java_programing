import java.util.Scanner;
import remoteControl.AirConditioner;
public class AirConditioner_Main 								
{
	// ���α׷����� 
	public static void main( String[] args ) 	
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String result = "";
		
		// ������ ������ ��ü ���� 	 
		AirConditioner aircon = new AirConditioner();

		// ������ �������� �Է¿� ���� �������� �����ϰ� �� ����� ���	 
		do
		{
			System.out.print( "������ �������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
			
			// ������ �Է��ϸ� ������ �Ѱų� ����	 
			if ( result.equals( "����" ) )
			{
				System.out.println( aircon.clickPower() );
			}
			// ���� �Է��ϸ� �µ��� +1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickUp() );
			}
			// �ϸ� �Է��ϸ� �µ��� -1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickDown() );
			}
			// �¸� �Է��ϸ� ǳ���� -1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickLeft() );
			}
			// �츦 �Է��ϸ� ǳ���� +1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickRight() );
			}				

		} while( !result.equals( "����" ) );
						
		// ���α׷� ���� 
		return;		
	}
}
