import java.lang.System;
import java.util.Scanner;

public class Triangle
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		int size=0;

		// ����ڿ��� �ﰢ���� ũ�⸦ �Է� �ޱ� 
		System.out.print("�ﰢ�� ũ�⸦ �Է��ϼ��� : ");
		size=scan.nextInt(); 


		// �ﰢ�� ũ�⸸ŭ �� �پ� ��� 
				for ( int line = 1; line <= size; line++ ) // line
				{
					// n��° ���� '�ﰢ��ũ��-�ٹ�ȣ'��ŭ ���� ' '�� ��� 
					for ( int blank = size - line; blank > 0; blank-- ) //blank
					{
						System.out.print(" ");
					}
					// n��° ���� '2*�ٹ�ȣ-1'��ŭ ����� '*'�� ��� 
					for ( int star = 2*line-1; star > 0; star-- )
					{
						System.out.print("*");
					}
					// ���� ������ ��� 
					System.out.print("\n");
					// n-1��° ��
				}
				for (int line = size + 1; line <= size*2- 1; line++ ) // line
				{
					
					for ( int blank = line - size; blank > 0; blank-- ) //blank
					{
						System.out.print(" ");
					}
					// n��° ���� '2*�ٹ�ȣ-1'��ŭ ����� '*'�� ��� 
					for ( int star = 2*(size-(line-size))-1; star > 0; star-- )
					{
						System.out.print("*");
					}
					// ���� ������ ��� 
					System.out.print("\n");
					// n-1��° ��
				}

		return;
		
	}	
}
