import java.util.Scanner;
import remoteControl.AirConditioner;
public class JL0406								
{
	public static void main( String[] args ) 	
	{
		Scanner scan = new Scanner( System.in );
		String result = "";
			 
		AirConditioner aircon = new AirConditioner();

		do
		{
			System.out.print( "������ �������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
				 
			if ( result.equals( "����" ) )
			{
				System.out.println( aircon.clickPower() );
			}	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickUp() );
			} 
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickDown() );
			}
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickLeft() );
			} 
			else if ( result.equals( "��" ) )
			{
				System.out.println( aircon.clickRight() );
			}				

		} while( !result.equals( "����" ) );
						
		return;		
	}
}
