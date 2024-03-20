
public class JL0706{
	public static <T extends Comparable<T>> void sort( T[] list ) {
		for ( int max = list.length - 1; max >= 0; max-- )				
		{
			for ( int index = 0; index < max; index++ )				
			{
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
	
	public static void main(String[] args) {

		Integer[] scores = new Integer[]{ 90, 89, 86 };
		sort( scores );
		print( scores );

		String[] words = new String[]{ "carrot", "banana", "apple" };
		sort( words );
		print( words );

	}
}
