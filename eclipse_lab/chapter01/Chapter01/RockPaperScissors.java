import java.lang.System;
import java.util.Scanner;

public class RockPaperScissors 
{
	// ���α׷����� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String playerA = null;									
		String playerB = null;									

		// A���� ������������ �ϳ��� ���� 
		System.out.print("A��, ����, ����, �� �� �ϳ��� �����ϼ���: " );
		playerA = scan.nextLine().trim(); 						
		// A���� ������ ����� ��� 
		System.out.println( playerA + "�� �½��ϴ�." ); 

		// B���� ������������ �ϳ��� ���� 
		System.out.print("B��, ����, ����, �� �� �ϳ��� �����ϼ���: " );
		playerB = scan.nextLine().trim();					
		// B���� ������ ����� ��� 
		System.out.println( playerB + "�� �½��ϴ�." ); 

		// A��� B���� ���������� ���� ��� 
		// A��� B���� ������ ���  
		if ( playerA.equals( playerB ) )								
		{
			System.out.println( "\nA��� B���� �����ϴ�." ); 
		}
		// A���� �����̰� B���� ���� �� ��� A�� �¸� 
		else if ( playerA.equals( "����" ) && playerB.equals( "��" ) )	
		{	
			System.out.println( "A���� �̰���ϴ�." ); 
		}
		// A���� �����̰� B���� ������ �� ��� A�� �¸� 
		else if ( playerA.equals("����") && playerB.equals( "����" ) )	
		{
			System.out.println( "A���� �̰���ϴ�." ); 
		}
		// A���� ���̰� B���� ������ �� ��� A�� �¸� 
		else if ( playerA.equals( "��" ) && playerB.equals( "����" ) )	
		{
			System.out.println( "A���� �̰���ϴ�." ); 
		}
		// ������ ���� B���� �¸�  
		else
		{
			System.out.println( "B���� �̰���ϴ�." ); 
		}

		// ���α׷� ���� 
		return;
	}
}
