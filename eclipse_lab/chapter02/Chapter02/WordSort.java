import java.lang.System;
import java.util.Scanner;

public class WordSort
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String[] word = new String[ 3 ]; //  new
	
		// �ܾ�� �Է�  
		for( int index = 0; index < word.length; index++ ) 									
		{
			System.out.print( "�ܾ �Է��ϼ���: " );
			word[ index ] = scan.nextLine().trim(); //
		} 

		// �ܾ� ���� 
		// ������ ������ ĭ�� ���� ū ���� �����ϸ鼭, ������ �� ĭ�� ������ �������� 
		for ( int max = word.length - 1; max >= 0; max-- )	//	max		
		{
			// ������ ù��° ĭ���� ������ �� ���� ���ϸ鼭  
			for ( int index = 0; index < max; index++ )				
			{
				// ù ��° ĭ �ܾ�� ���ĺ������� �� �տ� �ִ� �ܾ ������ �� �ܾ �¹ٲٱ�  
				if ( word[ index ].compareTo( word[ index + 1 ] ) > 0 )		// >		
				{
					String temp = word[ index ];						
					word[ index ] = word[ index + 1 ]; 
					word[ index + 1 ] = temp; 
				}
			}
		}

		// ���ĵ� �ܾ� ��� 
		for ( int index = 0; index < word.length; index ++ )  								
		{
			System.out.println( ( index + 1 ) + ") " + word[ index ] + " " );
		} 

		// ���α׷� ���� 
		return;
	}
}
