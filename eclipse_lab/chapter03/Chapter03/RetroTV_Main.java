import java.util.Scanner;

/**
 * TV Ŭ������ TV �������� �𵨸� 
 * @author �ڼҿ�
 *
 */
class RetroTV 										
{
	// ������ư ����(ON) �� ����(OFF) ���� ���� ���
	public final boolean ON = true;	//			
	public final boolean OFF = false;			
			
	// TV ����, ä��, ���� ���� 
	private boolean power;						
	private int channel;						
	private int volume;							
	
	/**
	 * TV �����ڷ� TV ���� �ʱ�ȭ
	 * @return �������̹Ƿ� �ش���� ����
	 */
	public RetroTV()									
	{
		this.power = OFF;						
		this.channel = 100;						
		this.volume = 10;						
	}
	
	/**
	 * TV ���������� ������ư ������ �� ������ �Ѱų� ����
	 * @return ���� ����   
	 */
	public String clickPower()					
	{
		if( this.power == OFF )					
		{
			this.power = ON;					
			return "������ �մϴ�";
		}
		else 
		{
			this.power = OFF;					
			return "������ ���ϴ�";
		}
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ �� ä���� +1 �̵�	
	 * @return ä�� ���� 
	 */
	public String clickUp()						
	{
		return "���� ä���� " +  ++this.channel  + "���Դϴ�";		
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ �� ä���� -1 �̵�
	 * @return ä�� ���� 
	 */
	public String clickDown()					
	{
		return "���� ä���� " + ( --this.channel ) + "���Դϴ�";		
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ �� ������ -1 �̵�	
	 * @return ���� ���� 
	 */
	public String clickLeft()					
	{
		return "���� ������ " + ( --this.volume ) + "�Դϴ�";		
	}
	
	/**
	 * TV ���������� ��(��) ��ư�� ������ �� ������ +1 �̵�
	 * @return ���� ���� 
	 */
	public String clickRight()					
	{
		return "���� ������ " + ( ++this.volume ) + "�Դϴ�";		
	}
}

public class RetroTV_Main 								
{
	// ���α׷� ���� 
	public static void main( String[] args ) 	
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String result = "";  //
		
		// TV ������ ��ü ���� 	 
		RetroTV tv = new RetroTV();  //

		// TV �������� �Է¿� ���� TV�� �����ϰ� �� ����� ���	 
		do   //
		{
			System.out.print( "TV �������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
			result = scan.next();
			
			// ������ �Է��ϸ� ������ �Ѱų� ����	 
			if ( result.equals( "����" ) )
			{
				System.out.println(
				                    tv.clickPower() );
			}
			// ���� �Է��ϸ� ä���� +1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println(
				                    tv.clickUp() );
			}
			// �ϸ� �Է��ϸ� ä���� -1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println(
				                    tv.clickDown() );
			}
			// �¸� �Է��ϸ� ������ -1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println(
				                    tv.clickLeft() );
			}
			// �츦 �Է��ϸ� ������ +1 �̵�	 
			else if ( result.equals( "��" ) )
			{
				System.out.println(
				                    tv.clickRight() );
			}				

		} while( !result.equals( "����" ) ); //
						
		// ���α׷� ���� 
		return;		
	}
}
			