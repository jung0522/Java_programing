import java.lang.System;
import java.util.Scanner;

public class BusFare 
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		int age = 0;

		// ������� ���̸� �Է� 
		System.out.print( "���̸� �Է��ϼ���: " );
		age = scan.nextInt(); 

		// ���̿� �´� ��������� ��� 
		// ������(��5�� ����)�� ���� 
		if ( age <= 5 )												
		{
			System.out.println( "��������� �����Դϴ�." );
		}
		// �ʵ��л�(��6��-��12��)�� ���ݱ��� 450�� 
		else if ( ( 6 <= age ) && ( age <= 12 ) )					
		{
			System.out.println( "��������� 450���Դϴ�." );
		}
		// û�ҳ�(��13��-��18��)�� ���ݱ��� 1,000��  
		else if ( ( 13 <= age ) && ( age <= 18 ) )					
		{
			System.out.println( "��������� 1,000���Դϴ�." );
		}
		// ����(��19�� �̻�)�� ���ݱ��� 1,300�� 
		else 														
		{
			System.out.println( "��������� 1,300���Դϴ�." );
		}

		// ���α׷� ���� 
		return;
	}
}
