import java.lang.System;
import java.util.Scanner;

public class TrainSeat 
{
	// ���α׷� ���� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String[][] seat = { {"","","","",""},	//seat			
		                    {"","","","",""}, 
		                    {"","","","",""}, 
		                    {"","","","",""} };
		String reservedSeat = "A1"; //String

		do
		{
	 	   // ���� �¼��� (����)���� ����ϸ鼭 
		  seat[ (int)( reservedSeat.charAt(0) - 'A' ) ][ (int)( reservedSeat.charAt(1) - '1' ) ] = "(����)";	// int	

		  // ��ü �¼��� ���� ���� ���� ���� ��� 
		  System.out.printf( "#   %d %6d %6d %6d %6d\n", 1, 2, 3, 4, 5 );  // %d %6d
		  System.out.printf( "A %6s %6s %6s %6s %6s\n", seat[0][0], seat[0][1], seat[0][2], seat[0][3], seat[0][4] );
		  System.out.printf( "B %6s %6s %6s %6s %6s\n", seat[1][0], seat[1][1], seat[1][2], seat[1][3], seat[1][4] );
		  System.out.printf( "C %6s %6s %6s %6s %6s\n", seat[2][0], seat[2][1], seat[2][2], seat[2][3], seat[2][4] );
		  System.out.printf( "D %6s %6s %6s %6s %6s\n", seat[3][0], seat[3][1], seat[3][2], seat[3][3], seat[3][4] );
		
		  // ����ڿ��� ���� �¼� �Է� �ޱ� 
		  System.out.print( "A2, B4, 0(����)�� ����, ���� ��� �¼��� �Է��ϼ��� : " );
		  reservedSeat = scan.nextLine().trim(); //next().trim();

		// �Է� �¼��� ��ȿ�ϸ� �¼� ���� �� ����� �ݺ� 
		} while( ( 'A' <= reservedSeat.charAt(0) ) && ( reservedSeat.charAt(0) <= 'D' ) 
		    && ( '1' <= reservedSeat.charAt(1) ) && ( reservedSeat.charAt(1) <= '5' ) );
	
		// ���α׷� ���� 
		return;
	}
}
