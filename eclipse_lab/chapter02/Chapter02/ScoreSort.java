import java.lang.System;
import java.util.Scanner;

public class ScoreSort
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		int[] score = new int[ 3 ];
	
		for( int index = 0; index < score.length; index ++ )							
		{
			System.out.print( "0�� ~ 100�� ������ ������ �Է��ϼ���: " );
			score[ index ] = scan.nextInt(); 
		} 
		// ���� ���� 
		// ������ ������ ĭ�� ���� ū ���� �����ϸ鼭, ������ �� ĭ�� ������ �������� 
		for ( int max = score.length - 1; max >= 0; max-- )				
		{
			// ������ ù��° ĭ���� ������ �� ���� ���ϸ鼭  
			for ( int index = 0; index < max; index++ )				
			{
				// ���� �ں��� ũ�� �� ���� �¹ٲٱ��ϸ鼭 ���ʿ� ū ���� ���� 
				if ( score[ index ] > score[ index + 1 ] )
				{
					int temp = score[ index ];
					score[ index ] = score[ index + 1 ];							
					score[ index + 1 ] = temp;								
				}
			}	
		}

		// ���ĵ� ���� ��� 
		for ( int index = 0; index < score.length; index++ )							
		{
			System.out.print( ( index + 1 ) + ") " + score[ index ] + " " );
		} 
		// ���α׷� ���� 
		return;
	}
}
