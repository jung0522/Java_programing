package remoteControl;


public class AirConditioner implements RemoteControl 

{				
	private boolean power;						
	private int temperature;						
	private int windStrength;							
	
	public AirConditioner()									
	{
		this.power = OFF;						
		this.temperature = 18;						
		this.windStrength = 10;						
	}
	
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
	
	public String clickUp()						
	{
		return "���� �µ��� " + ( ++this.temperature ) + "���Դϴ�";		
	}
	
	public String clickDown()					
	{
		return "���� �µ��� " + ( --this.temperature ) + "���Դϴ�";		
	}
	
	public String clickLeft()					
	{
		return "���� ǳ���� " + ( --this.windStrength ) + "�Դϴ�";		
	}
	
	public String clickRight()					
	{
		return "���� ǳ���� " + ( ++this.windStrength ) + "�Դϴ�";		
	}
}
