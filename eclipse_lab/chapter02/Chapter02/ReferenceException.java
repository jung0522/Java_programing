import java.util.*;

public class ReferenceException
{  
	// ���α׷� ���� 
	public static void main(String args[]) 
	{ 
		// ���� �ʱ�ȭ
		String[] word = { "apple", "banana", "carrot" }; //����������

		try 											
		{
			for( int index = 0; index <= word.length; index++ )
			{
				System.out.println( ( index + 1 ) + ") " + word[ index ] + " " );
			}
		}	
		// ���� ó�� 
	 	catch ( ArrayIndexOutOfBoundsException e )		
		{
			System.out.println( "\n�迭 ��� ���� �ʰ�" );
		}
			
		try 											
		{
			// null ������ ���� �߻� 
			word = null; //
			System.out.println( word[0] ); //
		}	
		catch ( NullPointerException e ) 				
		{
			System.out.println( "�� ��ü ���� ����" );
		}
		
		// ���α׷� ���� 
		return;
	} 
}
