import java.lang.System;							
import java.util.Scanner;							

public class FoodOrder 
{
	// ���α׷����� 
	public static void main( String[] args )  						
	{
		// ���� ���� �� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );			
		String mainDish = null;						
		String sauce = null;						
		String drink = null;						

		// �մԿ��� �ֹ� �ޱ� 
		System.out.println( "�ֹ� ���͵帮�ڽ��ϴ�, �մ�." );			

		// ���ο丮 �ֹ� �ޱ� 
		System.out.print( "���ο丮�� ���̽��ϱ� : " );				
		mainDish = scan.nextLine();								

		// �ҽ� �ֹ� �ޱ� 
		System.out.print( "�ҽ��� ��� �ұ�� : " );				
		sauce = scan.nextLine();								

		// ���� �ֹ� �ޱ� 
		System.out.print( "����� �������� �غ��ұ�� : " );			
		drink = scan.nextLine();								

		// �ֹ� ���� Ȯ�� 
		System.out.println( "���ο丮�� " + mainDish + ", �ҽ��� " + sauce + ", ����� " + drink + "�� �����ϼ̽��ϴ�. " );
		System.out.println( "�غ��ϰڽ��ϴ�, ��ø� ��ٷ� �ֽʽÿ�." );	

		// ���α׷� ���� 
		return;
	}
}
