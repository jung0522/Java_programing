import java.lang.System;
import java.util.Scanner;
import java.lang.Math;										

public class FlipCoin 
{

	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		Scanner scan = new Scanner( System.in );
		String str = null;
		int headsOrTails = 0;
		int user = 0;

		// ����ڴ� ������ �ո�� �޸� �� �ϳ��� ����	 
		System.out.println( "���� ������ ������ �����մϴ�.\n" );
		System.out.print( "�ո�(0), �޸�(1) �� �ϳ��� �����ϼ���: " );
		user = scan.nextInt(); 
	
		// ����ڰ� ������ ���� ���� ���		 
		str = ( user == 0 ) ? "���� �ո��� �����߽��ϴ�." : "���� �޸��� �����߽��ϴ�.";
		System.out.println( str );

		// ������ ���Ƿ� ������ �ޱ�		 
		headsOrTails = (int)( Math.random() * 2 );	 //		

		// ���� ������ ���� ���  ���		 
		str = ( headsOrTails == 0 ) ? "����� ���� �ո��Դϴ�. " : "����� ���� �޸��Դϴ�. ";
		System.out.println( str );

		// ����ڰ� ������ ���¸� ���߾����� ��� ���	 
		str = ( headsOrTails == user ) ? "������ϴ�.\n" : "Ʋ�Ƚ��ϴ�.\n";
		System.out.println( str );

		// ���α׷� ���� 
		return;   // ��ġ //
	} 
}