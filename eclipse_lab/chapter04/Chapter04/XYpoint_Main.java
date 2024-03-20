import java.util.Scanner;
import java.lang.Math; 

/**
 * XYpoint Ŭ������ ���� �𵨸� 
 * @author �ڼҿ�
 *
 */
class XYpoint 
{
	/**
	 * ���� x��ǥ ��
	 */
	private int x;
	/**
	 * ���� y��ǥ ��
	 */
	private int y;
	
	/**
	 * XYpoint �����ڷ� �� ��ǥ �ʱ�ȭ
	 */
	public XYpoint( int x, int y ) //	int x, int y //								
	{
		this.x = x;						
		this.y = y;						
	}
	
	/**
	 * XYpoint �����ڷ� ���� �ʱ�ȭ
	 */
	public XYpoint()									
	{
		this( 0, 0 );						
	}

	/**
	 * ���� �ٸ� ���� ��ǥ���� ��
	 * @return �� ���� ��ǥ�� ��ġ�ϸ� true, �ƴϸ� false 
	 */
	public boolean equals( XYpoint that )		// XYpoint that //	
	{
		return ( this.x == that.x) && ( this.y == that.y );
	}

	/**
	 * �� ��ǥ�� ���ڿ��� ǥ��
	 * @return ���ڿ� (x,y) 
	 */
	public String toString()					
	{
		return "(" + this.x + "," + this.y + ")";
	}

	/**
	 * ���� �ٸ� ���� �Ÿ��� ���
	 * @return �� �� ������ �Ÿ�
	 */
	public double distanceTo( XYpoint that )					
	{
		return Math.sqrt(Math.pow((this.x - that.x), 2) + Math.pow((this.y - that.y), 2));
	}
}
	
public class XYpoint_Main 
{
	// ���α׷����� 
	public static void main( String[] args ) 
	{
		// ���� ��ǥ�� �Է�	
		int x = 0, y = 0;
		Scanner scan = new Scanner( System.in );
		System.out.print( "���� x��ǥ ���� �Է��ϼ��� : " );
		x = scan.nextInt();
		System.out.print( "���� y��ǥ ���� �Է��ϼ��� : " );
		y = scan.nextInt();

		// ������ �Է��� �� �ʱ�ȭ		
		XYpoint origin = new XYpoint();
		XYpoint point = new XYpoint( x,  y );

		// ������ �Է��� ���� ������ �Ÿ� ���	
		if ( origin.equals( point ) )
		{
			System.out.println( "�� ���� �����Դϴ�" );
		}
		else
		{
			System.out.println( origin + "��" + point + "������ �Ÿ��� " + point.distanceTo( origin ) + "�Դϴ�" );
		}

	// ���α׷� ���� 
	}
}
