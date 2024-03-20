import java.util.*; //InputMismatch ����

public class NumberException
{  
	// ���α׷� ���� 
	public static void main(String args[]) 
	{ 

		try 											
		{
			Scanner scan = new Scanner( System.in );
			// ��Ģ������ ���� ���� �Է� 
			System.out.print( "��Ģ������ ���� ù��° ���ڸ� �Է��ϼ���: " );
			int num1 = Integer.parseInt(scan.nextLine()); // Integer.parseInt(scan.nextLine());
			System.out.print( "��Ģ������ ���� �ι�° ���ڸ� �Է��ϼ���: " );
			int num2 = scan.nextInt();
			
			// ��Ģ���� ���� �� ��� ��� 
			System.out.println( num1 + " + " + num2 + " = " + ( num1 + num2 ) );
			System.out.println( num1 + " - " + num2 + " = " + ( num1 - num2 ) ); //()������ ���ڿ��� �ν�
			System.out.println( num1 + " * " + num2 + " = " + ( num1 * num2 ) );
			System.out.println( num1 + " / " + num2 + " = " + ( num1 / num2 ) );
		}	
		// ���� ó�� 
		catch ( NumberFormatException e )	// if x			
		{
			System.out.println("���� ���� ����ġ");
		}
		catch ( InputMismatchException e ) 				
		{
	 		System.out.println( "�Է� �ڷ��� ����ġ" );
		}
		catch ( ArithmeticException e ) 				
		{
			System.out.println( "��� ���� ����" );
		} 
		finally 										
		{
			System.out.println( "���� �ǽ� �Ϸ�" );
		} 
		
		
		// ���α׷� ���� 
		return;
	} 
}
