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
			System.out.print( "로봇청소기 리모컨의 상, 하, 좌, 우, 전원, 종료 중 하나를 입력하세요 : ");
			result = scan.next();
			
			if ( result.equals( "전원" ) )
			{
				System.out.println( cleaner.clickPower() );
			}
			else if ( result.equals( "상" ) )
			{
				System.out.println( cleaner.clickUp() );
			}
			else if ( result.equals( "하" ) )
			{
				System.out.println( cleaner.clickDown() );
			}
			else if ( result.equals( "좌" ) )
			{
				System.out.println( cleaner.clickLeft() );
			}
			else if ( result.equals( "우" ) )
			{
				System.out.println( cleaner.clickRight() );
			}				

		} while( !result.equals( "종료" ) );
						
		return;		
	}
}