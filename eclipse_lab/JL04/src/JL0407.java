import java.util.Scanner;
import remoteControl.RoboticVacuumCleaner;
public class JL0407								
{
	public static void main( String[] args ) 	
	{
		Scanner scan = new Scanner(System.in);
		String result = "";
		 
		RoboticVacuumCleaner cleaner = new RoboticVacuumCleaner();
 
		do
		{
			System.out.print( "�κ�û�ұ� �������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
			
			if ( result.equals( "����" ) )
			{
				System.out.println( cleaner.clickPower() );
			}
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickUp() );
			}
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickDown() );
			}
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickLeft() );
			}
			else if ( result.equals( "��" ) )
			{
				System.out.println( cleaner.clickRight() );
			}				

		} while( !result.equals( "����" ) );
						
		return;		
	}
}