package remoteControl;
import java.util.Scanner;

public class TV implements RemoteControl 
{				
	private boolean power;	 
	private int channel; 
	private int volume;		 
	
	public TV()					 
	{
		this.power = OFF;		 
		this.channel = 100; 
		this.volume = 10;		 
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
		return "현재 채널은 " + ( ++this.channel ) + "번입니다";		 
	}
	
	public String clickDown()				 
	{
		return "현재 채널은 " + ( --this.channel ) + "번입니다";		 
	}
	
	public String clickLeft()			 
	{
		return "현재 음량은 " + ( --this.volume ) + "입니다";		 
	}
	
	public String clickRight()		 
	{
		return "현재 음량은 " + ( ++this.volume ) + "입니다";		 
	}
}
