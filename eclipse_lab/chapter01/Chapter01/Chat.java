import java.lang.System;										
import java.util.Scanner;										

public class Chat 
{
	// ���α׷����� 
	public static void main( String[] args )  						
	{
		// ���� ���� �� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );				
		String name = null;										
		String job = null;										
		String hobby = null;									
		String color = null;									

		// ģ����! ��ȭ�ϱ� 
		// �̸� ����� ���ϱ� 
		System.out.print( "�ȳ�? �� �̸��� ����: " ); 
		name = scan.nextLine();									
		System.out.println( "������ �ݰ���, " + name + ". " );	

		// ���� ����� ���ϱ� 
		System.out.print( "�� �ַ� ���ϰ� ���: " );	
		job = scan.nextLine();									
		System.out.println( job + "? ���� ���������� ���� " );	

		// ��� ����� ���ϱ� 
		System.out.print( "�׷� �ɽ��� �� ���ϴ�: " );
		hobby = scan.nextLine();								
		System.out.println( hobby + "? ���� �Ȱ���. " );

		// �����ϴ� �� ����� ���ϱ� 
		System.out.print( "Ȥ�� �����ϴ� ���� ���� : " );	
		color = scan.nextLine();								
		System.out.println( color + "�̶�? ��! �̰͵� ���� �Ȱ���. �ű��ϴ�." );

		// ģ�ϰ� �����ڰ� �λ��ϱ� 
		System.out.println( "������ �츮 ģ�ϰ� ������." );

		// ���α׷� ���� 
		return;
	}
}
