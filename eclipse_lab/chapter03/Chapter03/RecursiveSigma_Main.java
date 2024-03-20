import java.util.Scanner;
	
class RecursiveSigma 
{
	// 0���� n������ �հ� ����ϴ� �޼��� 
	int sigma( int num )					
	{
		// n�� 0 �����̸� �� ���� ���� 
		if ( num <= 0 )							
		{
			System.out.print( num + " = " ); 			
			return num;						
		}
		// �� n = n + �� ( n - 1 ) 
		else
		{
			System.out.print ( num + " + " );
			return num += sigma( num - 1 );
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
	
public class RecursiveSigma_Main 
{
	// ���α׷� ���� 
	public static void main(String[] args) 
	{
		Scanner scan = new Scanner( System.in );
		RecursiveSigma calculation = new RecursiveSigma();
		int sum = 0, num = 0;
				
		// ���� n �Է¹ޱ� 
		num = calculation.getNum( scan );
	
		// 0���� n������ �հ� ����ϱ� 
		System.out.print( "�� " + num + " = " );
		sum = calculation.sigma( num );
		
		// �հ� ����ϱ� 
		System.out.print( sum ); 
	
		//���α׷� ���� 
		return;
	}
}
