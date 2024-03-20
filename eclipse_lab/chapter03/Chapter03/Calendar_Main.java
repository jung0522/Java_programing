import java.util.Scanner;
	
class Calendar  
{
	// ���� ���� 		
	final int lastDayPerMonth[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };  
	
	// �ش�⵵�� �������� ������� �����ϴ� �޼��� 
	private boolean IsLeapYear( int year )										
	{
		// 400���� ������ �������� �ش� �������� ���� 
		if ( ( year % 400 ) == 0 )
		{
			return true;										
		}
		// 100���� ������ �������� �ش� ������� ���� 
		else if ( ( year % 100 ) == 0 )
		{
			return false;										
		}
		// 4�� ������ �������� �ش� �������� ���� 
		else if ( ( year % 4 ) == 0 )
		{
			return true;										
		}
		// �������� ������� ���� 
		else 
		{
			return false;										
		}
	}
	
	// �ش���� ������ ���ϴ� �޼��� 
	public int getLastDay( int month, int year )									
	{
		// �ش���� 2���̰� �����̸�, 29��  
		if ( ( month == 2 ) && 
		                         IsLeapYear( year ) )
		{
			return lastDayPerMonth[ month ] + 1;							
		}
		// �ƴϸ� ���� ����(31, 28, 31, 30, ... ) �� ����  
		else
		{
			return lastDayPerMonth[ month ]; 							
		}
	}
			
	// �ش�⵵ 1��1�Ϻ��� ������ ���ϱ��� ��¥�� ����ϴ� �޼��� 
	private int getTotalDaysBetweenNewYearsDayAnd( int previousMonth, int thisYear )				
	{
		int totalDays = 0; 
		int month = 0;
		
		// 1������ �����ޱ��� ���� ����(31, 28, 31, 30, ... ) ���ؼ� ��ü ��¥ ����ϱ� 
		for ( month = 1; month <= previousMonth; month++ )
		{
			totalDays += lastDayPerMonth[ month ];
		}
		// �� ��, ���� 2���� ��� 2�� 29���� �ݿ� 
		if ( ( month >= 2 ) && IsLeapYear( thisYear ) )
		{
			totalDays++;
		}

		return totalDays;										
	}
	
	// �ش���� ���ۿ����� ����ϴ� �޼��� 
	public int getFirstDay( int month, int year )							
	{
		// 1��1��1�Ϻ��� �����⵵ 12��31�ϱ��� ��ü ��¥�� ���  
		int totalDays = (year-1)*365 + (year-1)/4 - (year-1)/100 + (year-1)/400;
		// �ش�⵵ 1��1�Ϻ��� ������ ���ϱ��� ��¥ ���  
		totalDays += getTotalDaysBetweenNewYearsDayAnd( month-1, year );
		// �ش�� 1���� �Ͽ��Ϻ��� ������ ���̿� ��� �������� ���  
		return ( (totalDays+1) % 7 );									
	}
	
	// �޷��� ����ϴ� �޼��� 
	public void print( int year, int month, int firstDay, int lastDay )				
	{
		// ��¥ �� ���� �ʱ�ȭ
		int day = 0;
		int dayOfWeek = 0;
		final int sunday = 0;		
		final int saturday = 6;		
	
		// �ش�⵵�� �ش���� ���  
		System.out.println( "\n              " + year + "�� " + month + "��\n" );
	
		// 1�� ������ ���� ���  
		for( dayOfWeek = sunday; dayOfWeek < firstDay; dayOfWeek ++ )
		{
			System.out.print( "     " );
		}
	
		// 1�Ϻ��� ���ϱ���  
		for( day = 1; day <= lastDay; dayOfWeek++, day++ )
		{
			// �������� ���ٿ� ���  
			System.out.printf( "%5d", day );
			
			// ��, ����� �� �Ͽ����� �� �ٿ��� 
			if ( dayOfWeek == saturday )
			{
				System.out.println();
				dayOfWeek = sunday - 1;
			}
		}
	}
}

public class Calendar_Main 
{  
	// ���α׷� ���� 
	public static void main(String args[]) 
	{ 
		Scanner scan = new Scanner( System.in );
		Calendar calendar = new Calendar();
		
		// ��, ��, ����, ���ۿ��� �ʱ�ȭ
		int year  = 0;
		int month  = 0;
		int lastDay= 0;
		int firstDay = 0;
	
		// �⵵�� ���� �Է� 
		System.out.print( "�⵵�� �Է��ϼ���: " );
		year = scan.nextInt();
		System.out.print( "���� �Է��ϼ���: " );
		month = scan.nextInt();
		// �ش���� ���ۿ��ϰ� ������ ����ϱ� 
		firstDay = calendar.getFirstDay( month, year );
		lastDay = calendar.getLastDay( month, year );
	
		// �޷��� ��� 
		calendar.print( year, month, firstDay, lastDay );
	
	// ���α׷� ���� 
	}
}
