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
			System.out.print( "TV �������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
	 
			if ( result.equals( "����" ) )
			{
				System.out.println( tv.clickPower() );
			}
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickUp() );
			} 
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickDown() );
			} 
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickLeft() );
			}	 
			else if ( result.equals( "��" ) )
			{
				System.out.println( tv.clickRight() );
			}				

		} while( !result.equals( "����" ) );				
		return;		
	}
}
