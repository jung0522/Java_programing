package remoteControl;
import java.util.Scanner;

/**
 * TV Ŭ������ TV �������� �𵨸�(������ ����� �����ϹǷ� �θ�Ŭ���� RemoteControl�� ���)
 * @author �ڼҿ�
 *
 */
public class TV implements RemoteControl 
{				
	// TV ����, ä��, ���� ���� 
	private boolean power;	 
	private int channel; 
	private int volume;		 
	
	/**
	 * TV �����ڷ� TV ���� �ʱ�ȭ
	 * @return �������̹Ƿ� �ش���� ����
	 */
	public TV()					 
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
		return "���� ä���� " + ( ++this.channel ) + "���Դϴ�";		 
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
