import java.util.Scanner;
import remoteControl.RoboticVacuumCleaner;
public class VacuumCleaner_Main 								
{
	// ���α׷����� 
	public static void main( String[] args ) 	
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String result = "";
		
		// �κ�û�ұ� ������ ��ü ���� 	 
		RoboticVacuumCleaner cleaner = new RoboticVacuumCleaner();

		// �������� �Է¿� ���� �κ�û�ұ⸦ �����ϰ� �� ����� ���	 
		do
		{
			System.out.print( "�κ�û�ұ� �������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
			
			// ������ �Է��ϸ� ������ �Ѱų� ����	 
			if ( result.equals( "����" ) )
			{
				System.out.println( cleaner.clickPower() );
			}
			// ���� �Է��ϸ� ���� �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickUp() );
			}
			// �ϸ� �Է��ϸ� ���� �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickDown() );
			}
			// �¸� �Է��ϸ� ��ȸ�� �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickLeft() );
			}
			// �츦 �Է��ϸ� ��ȸ�� �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickRight() );
			}				

		} while( !result.equals( "����" ) );
						
		// ���α׷� ���� 
		return;		
	}
}
