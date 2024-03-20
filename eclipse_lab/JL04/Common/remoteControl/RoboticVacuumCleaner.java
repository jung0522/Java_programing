package remoteControl;

public class RoboticVacuumCleaner implements RemoteControl 
{				
	private boolean power;						
	
	public RoboticVacuumCleaner()									
	{
		this.power = OFF;						
	}
	
	public String clickPower()					
	{
		if( this.power == OFF )					
		{
			this.power = ON;					
			return "로봇청소기 전원을 켭니다";
		}
		else 
		{
			this.power = OFF;					
			return "로봇청소기 전원을 끕니다";
		}
	}
	
	public String clickUp()						
	{
		return "직진합니다";	 
	}
	
	public String clickDown()					
	{
		return "후진합니다";	 
	}
	
	public String clickLeft()					
	{
		return "좌회전합니다";
	}
	
	public String clickRight()					
	{
		return "우회전합니다";
	}
}

