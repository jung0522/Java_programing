import java.util.Vector;
public class JL0704
{
	public static void main(String[] args) 
	{
		Vector list = new Vector( 3 ); 
		list.add( "Vector" ); 
		list.add( 1 ); 
		list.add( 2.5 ); 
		list.add( 0, "Collection" ); 
		list.add( 2, null ); 
		list.remove( 0 ); 
		list.remove( 1 ); 
		
		for( int i=0; i < list.size(); i++ ) {
			System.out.println( i + ") " + list.get(i) );
		}
		
		System.out.println( "총객체수 = " + list.size() );
		System.out.println( "공간크기 = " + list.capacity() ); 

		if( list.contains( "Collection" ) )
			System.out.println( "Collection 포함" );
		else 
			System.out.println( "Collection 미포함" );

		if( list.contains( 2.5 ) )
			System.out.println( "2.5 포함" );
		else 
			System.out.println( "2.5 미포함" );
		
		list.clear();
		if( list.isEmpty() )
			System.out.println( "빈 리스트" );
	
	}
}
