import java.lang.System;
import java.util.Scanner;

public class Summation 
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		int num=0, sum=0;

		// ���� n �Է¹ޱ� 
		System.out.print( "���ڸ� �Է��ϼ���: ");
		num = scan.nextInt(); 
	    
		// 0���� n������ �հ� ����ϱ� 
		System.out.print( "�� " + num + " = " );
		for( ; num > 0; num-- )
		{
			System.out.print( num + " + " );	
			sum += num;				
		}
	
		// �հ� ����ϱ� 
		System.out.println( num + " = " + sum ); 

		//���α׷� ���� 
		return;
	}
}
