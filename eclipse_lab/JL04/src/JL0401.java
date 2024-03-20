import java.util.Scanner;
import java.lang.Math; 

class XYpoint 
{
	private int x;

	private int y;
	
	public XYpoint( int x, int y )									
	{
		this.x = x;						
		this.y = y;						
	}
	
	public XYpoint()									
	{
		this( 0, 0 );						
	}

	public boolean equals( XYpoint that )					
	{
		return ( this.x == that.x) && ( this.y == that.y );
	}

	public String toString()					
	{
		return "(" + this.x + "," + this.y + ")";
	}

	public double distanceTo( XYpoint that )					
	{
		return Math.sqrt( Math.pow( ( this.x - that.x ), 2 ) + Math.pow( ( this.y - that.y ), 2 ) );
	}
}
	
public class JL0401 
{
	public static void main( String[] args ) 
	{	
		int x = 0, y = 0;
		Scanner scan = new Scanner( System.in );
		System.out.print( "���� x��ǥ ���� �Է��ϼ��� : " );
		x = scan.nextInt();
		System.out.print( "���� y��ǥ ���� �Է��ϼ��� : " );
		y = scan.nextInt();
	
		XYpoint origin = new XYpoint();
		XYpoint point = new XYpoint( x, y );
	
		if ( origin.equals( point ) )
		{
			System.out.println( "�� ���� �����Դϴ�." );
		}
		else
		{
			System.out.println( origin + "��" + point + "������ �Ÿ��� " + point.distanceTo( origin ) + "�Դϴ�." );
		}

	}
}
