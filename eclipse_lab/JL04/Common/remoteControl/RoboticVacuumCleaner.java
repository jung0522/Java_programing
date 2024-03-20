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
			return "�κ�û�ұ� ������ �մϴ�";
		}
		else 
		{
			this.power = OFF;					
			return "�κ�û�ұ� ������ ���ϴ�";
		}
	}
	
	public String clickUp()						
	{
		return "�����մϴ�";	 
	}
	
	public String clickDown()					
	{
		return "�����մϴ�";	 
	}
	
	public String clickLeft()					
	{
		return "��ȸ���մϴ�";
	}
	
	public String clickRight()					
	{
		return "��ȸ���մϴ�";
	}
}

