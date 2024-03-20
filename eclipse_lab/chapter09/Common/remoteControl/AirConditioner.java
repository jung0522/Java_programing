package remoteControl;

/**
 * AirConditioner Ŭ������ ������ �������� �𵨸� 
 * @author �ڼҿ�
 *
 */
public class AirConditioner implements RemoteControl 

{				
	// ������ ����, �µ�, ǳ�� ���� 
	private boolean power;						
	private int temperature;						
	private int windStrength;							
	
	/**
	 * AirConditioner �����ڷ� ������ ���� �ʱ�ȭ
	 * @return �������̹Ƿ� �ش���� ����
	 */
	public AirConditioner()									
	{
		this.power = OFF;						
		this.temperature = 18;						
		this.windStrength = 10;						
	}
	
	/**
	 * ������ ���������� ������ư ������ �� ������ �Ѱų� ����
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
	 * ������ ���������� ��(��) ��ư�� ������ �� �µ��� +1 �̵�	
	 * @return �µ� ���� 
	 */
	public String clickUp()						
	{
		return "���� �µ��� " + ( ++this.temperature ) + "���Դϴ�";		
	}
	
	/**
	 * ������ ���������� ��(��) ��ư�� ������ �� �µ��� -1 �̵�
	 * @return �µ� ���� 
	 */
	public String clickDown()					
	{
		return "���� �µ��� " + ( --this.temperature ) + "���Դϴ�";		
	}
	
	/**
	 * ������ ���������� ��(��) ��ư�� ������ �� ǳ���� -1 �̵�	
	 * @return ǳ�� ���� 
	 */
	public String clickLeft()					
	{
		return "���� ǳ���� " + ( --this.windStrength ) + "�Դϴ�";		
	}
	
	/**
	 * ������ ���������� ��(��) ��ư�� ������ �� ǳ���� +1 �̵�
	 * @return ǳ�� ���� 
	 */
	public String clickRight()					
	{
		return "���� ǳ���� " + ( ++this.windStrength ) + "�Դϴ�";		
	}
}
