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
			System.out.print( "에어컨 리모컨의 상, 하, 좌, 우, 전원, 종료 중 하나를 입력하세요 : ");
			result = scan.next();
				 
			if ( result.equals( "전원" ) )
			{
				System.out.println( aircon.clickPower() );
			}	 
			else if ( result.equals( "상" ) )
			{
				System.out.println( aircon.clickUp() );
			} 
			else if ( result.equals( "하" ) )
			{
				System.out.println( aircon.clickDown() );
			}
			else if ( result.equals( "좌" ) )
			{
				System.out.println( aircon.clickLeft() );
			} 
			else if ( result.equals( "우" ) )
			{
				System.out.println( aircon.clickRight() );
			}				

		} while( !result.equals( "종료" ) );
						
		return;		
	}
}
