import java.lang.System;
import java.util.Scanner;

public class Chat
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String[][] dialogue = { { "�̸��� ��", "�� �缮�̾�. ����MC ���缮�� �̸��� ����. ������ �� �� ���̴�?" },
			  { "�� ��", "�� 20���̾�. ������ �� �η����ϴ� ������. �� ��� ���?" },
			  { "��� ��", "�� ȫ���� ���. ���ѻ� �Ʒ� �־ ���Ⱑ ���� ����.������ ��̰� ����?" },
			  { "������ �ݰ�", "���� �ݰ��� ģ�ϰ� ������" } };
		// ����ڿ� �ý����� ��ȭ �ݺ� 
		System.out.print( "[�ý���] �ȳ�? �� �̸��� ���?\n �����: " ); //
		


		while( true )										
		{
			// ����� �Է� 	
			String input = scan.nextLine(); 				

			// �ý��� �亯 ��� 			
			// ����ڰ� '����'�� �Է��ϸ� '�׷� �ȳ�! �㿡 �� ��!'�� ��� �� ��ȭ�� ����		
			if ( input.contains( "����" ) == true ) 			
			{
				System.out.println( "[�ý���] �׷� �ȳ�! �㿡 �� ��!\n" );
				break;
			}
			// �غ��� ��ȭ�ֿ��� 
			int index = 0;
			for ( index = 0; index < 4; index++ )
			{
				// ������ �亯�� ã���� �ý��� �亯�� ��� 
				if ( input.contains( dialogue[index][0] ) == true ) 			
				{
					System.out.print( "[�ý���] " + dialogue[index][1] + "\n �����: " ); //[1]	
					break; 	//							
				}
			}
		
			// ������ �亯�� �� ã���� '�� ���� ��մ°� ������?' ��� 
			if ( index == 4 )
			{
				System.out.print( "[�ý���] �� ���� ��մ°� ������?\n �����: " );
			}
		}

		return;
	}
}
