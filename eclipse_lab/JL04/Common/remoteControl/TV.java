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
		return "���� ä���� " + ( ++this.channel ) + "���Դϴ�";		 
	}
	
	public String clickDown()				 
	{
		return "���� ä���� " + ( --this.channel ) + "���Դϴ�";		 
	}
	
	public String clickLeft()			 
	{
		return "���� ������ " + ( --this.volume ) + "�Դϴ�";		 
	}
	
	public String clickRight()		 
	{
		return "���� ������ " + ( ++this.volume ) + "�Դϴ�";		 
	}
}
