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
				System.out.print( "리모컨의 상, 하, 좌, 우, 전원, 종료 중 하나를 입력하세요 : ");
				result = scan.next();
				if ( result.equals( "전원" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickPower() );	 
					}
				}	 
				else if ( result.equals( "상" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickUp() );	 
					}
				} 
				else if ( result.equals( "하" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickDown() );	 
					}
				}	 
				else if ( result.equals( "좌" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickLeft() );	 
					}
				}
				else if ( result.equals( "우" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickRight() );	 
					}
				}				
			} while( !result.equals( "종료" ) );

		return;		
	}
}
