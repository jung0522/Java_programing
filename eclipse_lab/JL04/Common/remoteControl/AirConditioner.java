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
			return "전원을 켭니다";
		}
		else 
		{
			this.power = OFF;					
			return "전원을 끕니다";
		}
	}
	
	public String clickUp()						
	{
		return "현재 온도는 " + ( ++this.temperature ) + "도입니다";		
	}
	
	public String clickDown()					
	{
		return "현재 온도는 " + ( --this.temperature ) + "도입니다";		
	}
	
	public String clickLeft()					
	{
		return "현재 풍량은 " + ( --this.windStrength ) + "입니다";		
	}
	
	public String clickRight()					
	{
		return "현재 풍량은 " + ( ++this.windStrength ) + "입니다";		
	}
}
