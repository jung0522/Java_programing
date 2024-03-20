import java.util.Scanner;
import remoteControl.*;

public class JL0408
{ 
	public static void main (String[] args) 
	{
		Scanner scan = new Scanner( System.in );
		String result = "";
	 
		RemoteControl rc[] = { new TV(), new AirConditioner(), new RoboticVacuumCleaner() };											
		
			do
			{
				System.out.print( "�������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
				result = scan.next();
				if ( result.equals( "����" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickPower() );	 
					}
				}	 
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickUp() );	 
					}
				} 
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickDown() );	 
					}
				}	 
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickLeft() );	 
					}
				}
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickRight() );	 
					}
				}				
			} while( !result.equals( "����" ) );

		return;		
	}
}
