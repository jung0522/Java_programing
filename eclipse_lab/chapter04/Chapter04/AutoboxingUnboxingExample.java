public class AutoboxingUnboxingExample 
{
	// ���α׷����� 
	public static void main( String[] args ) 
	{
		int num1 = 10;

		// Autoboxing ����	
		Integer num2 = num1;
		// Wrapper Ŭ���� Ȱ�� ����
		num2 = Integer.parseInt( "20" );

		// Unboxing ����	
		num1 = num2;
		System.out.println( "num1 = " + num1 + ", num2 = " + num2);
		// ���α׷� ���� 
	}
}
