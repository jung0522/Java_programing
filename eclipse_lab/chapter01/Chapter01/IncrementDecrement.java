import java.lang.System;
import java.util.Scanner;

public class IncrementDecrement 
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� ���� �� �ʱ�ȭ
		int a = 3, b = 3, c = 0, d = 0;

		// ����������(++)�� ���������ڿ� ���������� �ǽ�  
		c = ++a;
		d = b++;

		// ������������ �ǽ���� ��� 
		System.out.println( "a = 3�� �� c = ++a ���� �� ��� a = " + a + ", c = " + c );			
		System.out.println( "b = 3�� �� d = b++ ���� �� ��� b = " + b + ", d = " + d );			

		// ���ҿ�����(--)�� ���������ڿ� ���������� �ǽ� 
		c = --a;
		d = b--;

		// ���ҿ������� �ǽ���� ��� 
		System.out.println( "a = 4�� �� c = --a ���� �� ��� a = " + a + ", c = " + c );			
		System.out.println( "b = 4�� �� d = b-- ���� �� ��� b = " + b + ", d = " + d );			

		// ���α׷� ���� 
		return;
	} 
}
