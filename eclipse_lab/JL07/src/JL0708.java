class MyList<T> {
	private Object[] array;
	private int index; 
	private int size; 
	
	public MyList( int size ) {
		index = 0; 
		this.size = size; 
		array = new Object[size];
	}
	
	public MyList() {
		this(10);
	}
	
	public void add( T item ) {
		if( index == size ) {
			Object[] newArray = new Object[ size * 2 ];
			for( int i = 0; i < size; i++ )
				newArray[i] = array[i];
			array = newArray;
			size = size*2;
		}
		array[index++] = item;
	}
	
	public T remove() {
		if( index == 0 )
			return null;
		return (T)array[--index]; 
	}
	
	public T get( int index ) {
		return (T)array[index];
	}
	
	public int size() {
		return index;
	}
}

public class JL0708 {
	public static void main(String[] args) {
		MyList<String> strList = new MyList<String>(2);

		strList.add( "carrot" );
		strList.add( "banana" );
		strList.remove();
		System.out.print( "(strList) " );
		for( int i=0; i < strList.size(); i++ )
			System.out.print( 
			                  strList.get(i) + " " );

		MyList<Integer> intList = new MyList<Integer>(2); 
		intList.add( 10 );
		intList.add( 20 );
		intList.add( 30 );
		intList.remove();

		System.out.print( "\n(intList) " );
		for( int i=0; i < intList.size(); i++ )
			System.out.print( intList.get(i) + " " );
	}
}
