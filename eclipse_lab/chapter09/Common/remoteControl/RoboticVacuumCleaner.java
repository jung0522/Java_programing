package remoteControl;

/**
 * RoboticVacuumCleaner Ŭ������ �κ�û�ұ� �������� �𵨸� 
 * @author �ڼҿ�
 *
 */
public class RoboticVacuumCleaner implements RemoteControl 
{				
	// �κ�û�ұ� ���� 
	private boolean power;						
	
	/**
	 * RoboticVacuumCleaner �����ڷ� �κ�û�ұ� ���� �ʱ�ȭ
	 * @return �������̹Ƿ� �ش���� ����
	 */
	public RoboticVacuumCleaner()									
	{
		this.power = OFF;						
	}
	
	/**
	 * �κ�û�ұ� ���������� ������ư ������ �� ������ �Ѱų� ����
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
	 * �κ�û�ұ� ���������� ��(��) ��ư�� ������ �� ����
	 * @return ���� ���� 
	 */
	public String clickUp()						
	{
		return "�����մϴ�";	 
	}
	
	/**
	 * �κ�û�ұ� ���������� ��(��) ��ư�� ������ �� ����
	 * @return ���� ���� 
	 */
	public String clickDown()					
	{
		return "�����մϴ�";	 
	}
	
	/**
	 * �κ�û�ұ� ���������� ��(��) ��ư�� ������ �� ��ȸ��
	 * @return ���� ���� 
	 */
	public String clickLeft()					
	{
		return "��ȸ���մϴ�";
	}
	
	/**
	 * �κ�û�ұ� ���������� ��(��) ��ư�� ������ �� ��ȸ��
	 * @return ���� ���� 
	 */
	public String clickRight()					
	{
		return "��ȸ���մϴ�";
	}
}

