import java.util.Scanner;
		
class RecursiveFactorial 
{
	// 1���� n������ ���� ����ϴ� �޼��� 
	int factorial( int num )	
	{
		// n�� 1 �����̸� !(factorial) ���� ���� 
		if ( num <= 1 )							
		{
			System.out.print( num + " = " ); 			
			return num;						
		}
		// n! = n * ( n - 1 )! 
		else
		{
			System.out.print ( num + " * " );
			return num *= factorial( num - 1 );
		}
	}
	
	int getNum( Scanner scan )
	{
		int num = 0;	
	
		System.out.print( "���ڸ� �Է��ϼ���: ");
		num = scan.nextInt();		
		return num;	
	}
}
	
public class RecursiveFactorial_Main 
{
	// ���α׷� ���� 
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );
		RecursiveFactorial calculation = new RecursiveFactorial();
		int result = 0, num = 0;
	
		// ���� n �Է¹ޱ� 
		num = calculation.getNum( scan );
	
		// 1���� n������ ���� ����ϱ� 
		System.out.print( num + "! = " ); //
		result = calculation.factorial( num );
		
		// ��� ����ϱ� 
		System.out.print( result ); 
	
		//���α׷� ���� 
		return;
	}
}
