import java.util.Scanner;
import remoteControl.TV;
public class JL0405							 
{ 
	public static void main( String[] args ) 	 
	{
		Scanner scan = new Scanner( System.in );
		String result = "";
		 	 
		TV tv = new TV();

		do
		{
			System.out.print( "TV 리모컨의 상, 하, 좌, 우, 전원, 종료 중 하나를 입력하세요 : ");
			result = scan.next();
	 
			if ( result.equals( "전원" ) )
			{
				System.out.println( tv.clickPower() );
			}
			else if ( result.equals( "상" ) )
			{
				System.out.println( tv.clickUp() );
			} 
			else if ( result.equals( "하" ) )
			{
				System.out.println( tv.clickDown() );
			} 
			else if ( result.equals( "좌" ) )
			{
				System.out.println( tv.clickLeft() );
			}	 
			else if ( result.equals( "우" ) )
			{
				System.out.println( tv.clickRight() );
			}				

		} while( !result.equals( "종료" ) );				
		return;		
	}
}
