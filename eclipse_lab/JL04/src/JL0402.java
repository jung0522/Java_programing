public class JL0402
{
	public static void main( String[] args ) 
	{
		int num1 = 10;
	
		Integer num2 = num1;
		num2 = Integer.parseInt( "20" );
		num1 = num2;
		System.out.println("num1 = " + num1 + ", num2 = " + num2);
	}
}
