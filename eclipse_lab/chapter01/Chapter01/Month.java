import java.lang.System;
import java.util.Scanner;

public class Month 
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		int month = 0;

		// ����ڿ��� ���� �Է¹ޱ� 
		System.out.print( "1�� ~ 12�� ������ ���� �Է��ϼ��� : ");
		month = scan.nextInt(); 

		// �Է¹��� ���� �����̸��� ��� 
		switch ( month )								
		{
			// 1���̸� January�� ��� 
			case 1: 									
				System.out.println( "1���� �����̸��� January �Դϴ�" );
				break;									
			// 2���̸� February�� ��� 
			case 2: 									
				System.out.println( "2���� �����̸��� February �Դϴ�" );
				break;									
			// 3���̸� March�� ��� 
			case 3:										
				System.out.println( "3���� �����̸��� March �Դϴ�" );
				break;									
			// 4���̸� April�� ��� 
			case 4: 									
				System.out.println( "4���� �����̸��� April �Դϴ�" );
				break;									
			// 5���̸� May�� ��� 
			case 5: 									
				System.out.println( "5���� �����̸��� May �Դϴ�" );
				break;									
			// 6���̸� June�� ��� 
			case 6:										
				System.out.println( "6���� �����̸��� June �Դϴ�" );
				break;									
			// 7���̸� July�� ��� 
			case 7: 									
				System.out.println( "7���� �����̸��� July �Դϴ�" );
				break;									
			// 8���̸� August�� ��� 
			case 8: 									
				System.out.println( "8���� �����̸��� August �Դϴ�" );
				break;									
			// 9���̸� September�� ��� 
			case 9:										
				System.out.println( "9���� �����̸��� September �Դϴ�" );
				break;									
			// 10���̸� October�� ��� 
			case 10: 									
				System.out.println( "10���� �����̸��� October �Դϴ�" );
				break;									
			// 11���̸� November�� ��� 
			case 11: 									
				System.out.println( "11���� �����̸��� November �Դϴ�" );
				break;									
			// 12���̸� December�� ��� 
			default:									
				System.out.println( "12���� �����̸��� December �Դϴ�" );
		}

		// ���α׷� ���� 
		return;
	}
}
