import java.lang.System;
import java.util.Scanner;

public class Calendar
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		// ��¥ �� ���� �ʱ�ȭ
		int day = 0;
		int firstDay = 0;
		int lastDay = 0;
		int dayOfWeek = 0;
		final int sunday = 0;		
		final int saturday = 6;	

		// ���ۿ����� �Է� �ޱ� 
		System.out.print( "��(0),��(1),ȭ(2),��(3),��(4),��(5),��(6) �߿��� \n�̹��� 1���� ���������ΰ��� : " );
		firstDay = scan.nextInt(); 
	
		// ���� �Է� �ޱ� 
		System.out.print( "�̹��� ������ �����ΰ��� : " );
		lastDay = scan.nextInt(); 
        
		// �޷� ��� 
				// 1�� ������ ���� ��� 
				for( dayOfWeek = sunday; dayOfWeek < firstDay; dayOfWeek++ ) //dayOfweek < firstDay; dayOFweek++
				{
					System.out.print( "     " ); //5ĭ
				}
			
				// 1�Ϻ��� ���ϱ��� 
				for ( day = 1; day <= lastDay; day++, dayOfWeek++ )
				{
					// �������� ���ٿ� ��� 
					System.out.printf( "%5d", day );			
					// ��, ����� �� �Ͽ����� �� �ٿ��� ���� 
					if ( dayOfWeek == saturday )		 
					{
						System.out.println();
						dayOfWeek = sunday - 1; // -1
					}
				}


		// ���α׷� ���� 
		return;
	}
}
