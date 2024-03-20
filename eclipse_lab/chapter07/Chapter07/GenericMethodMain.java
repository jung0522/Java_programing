
public class GenericMethodMain {
	// ���� �޼��� 
	public static <T extends Comparable<T>> void sort( T[] list ) {
		// ������ ������ ĭ�� ���� ū ���� �����ϸ鼭, ������ �� ĭ�� ������ �������� 
		for ( int max = list.length - 1; max >= 0; max-- )				
		{
			// ������ ù��° ĭ���� ������ �� ���� ���ϸ鼭  
			for ( int index = 0; index < max; index++ )				
			{
				// ù ��° ĭ �ܾ�� ���ĺ������� �� �տ� �ִ� �ܾ ������ �� �ܾ �¹ٲٱ�  
				if ( list[ index ].compareTo( list[ index + 1 ] ) > 0 )				
				{
					T temp = list[ index ];						
					list[ index ] = list[ index + 1 ]; 
					list[ index + 1 ] = temp; 
				}
			}
		}
	}
	
	public static <T> void print( T[] list ) 
	{	
		for ( int index = 0; index < list.length; index ++ )  					 
		{
			System.out.print( ( index + 1 ) + ") " + list[ index ] + " " );
		} 
		System.out.println();
	}		
	
	// ���α׷� ����  
	public static void main(String[] args) {

		// ���� ����  
		Integer[] scores = new Integer[]{ 90, 89, 86 };
		// ���� ����  
		sort( scores );
		// ���� ���  
		print( scores );

		// �ܾ� �Է�  
		String[] words = new String[]{ "carrot", "banana", "apple" };
		// �ܾ� ����  
		sort( words );
		// �ܾ� ���  
		print( words );

		// ���α׷� ����   
	}
}
