import java.lang.System;
import java.util.Scanner;

public class Elevator 
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		int currentFloor = 1;									
		int destinationFloor= 0;

		// ����ڿ��� ���������Ϳ��� ���� ���� �Է¹ޱ� 
		System.out.print( "1��~5�� �� �� ������ �ö󰡽ó��� : " );
		destinationFloor= scan.nextInt(); 

		// ���������� ���� �����鼭 �ȳ� �޽��� ��� 
		System.out.println( destinationFloor+ "������ �ö󰩴ϴ�. ���� �����ϴ�." );

		// ����ڰ� ���� �������� ���������Ͱ� �� ���� �̵��ϱ� 
		while( currentFloor <= destinationFloor )						
		{
			// ���� ���� ����ϱ� 
			System.out.println( currentFloor + "��" );
			// ���� �������� �� ���� �������� 
			currentFloor++;								
		}

		// ���������� ���� �����鼭 ���� �޽��� ��� 
		System.out.println( "��~��~��~��~~ ��~��~��~~ " + destinationFloor+ "���Դϴ�. ���� �����ϴ�" );

		// ���α׷� ���� 
		return;
	}
}
