import java.lang.System;
import java.util.Scanner;

public class Score
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		int score = 0;

		// ����ڿ��� ���� �Է¹ޱ� 
		System.out.println( "0�� ~ 100�� ������ ������ �Է��ϼ���: ");
		score = scan.nextInt(); 

		switch ( score / 10 )							
		{
			// 90���̻��̸� ��! �����ְ� �� �ߴٸ� ��� 
			case 10: case 9: 							
				System.out.println( "��! ");
			// 80���̻��̸� �����ְ� �� �ߴٸ� ��� 
			case 8: 									
				System.out.println( "�����ְ� ");
			// 70���̻��̸� �� �ߴٸ� ��� 
			case 7:										
				System.out.println( "�� ");
			// �������� �ߴٸ� ��� 
			default:									
				System.out.println( "�ߴ�");
		}

		// ���α׷� ���� 
		return;
	}
}