package remoteControl;

/**
 * ����, ��, ��, ��, �� ��ư�� �ִ� ������ 
 * @author So Young Park
 * @version 0.8
 */	
public interface RemoteControl
{
	/**
	 * ���� ��ư ����(ON) ���� ���� ���
	 */
	public final boolean ON = true;
	/**
	 * ���� ��ư ����(OFF) ���� ���� ���
	 */
	public final boolean OFF = false;	
	/**
	 * ���������� ������ư ������ �� �۵�
	 * @return ������ ���� �� ������ǰ ����  
	 */
	public String clickPower();
	/**
	 * ���������� ��(��) ��ư�� ������ �� �۵�
	 * @return ������ ���� �� ������ǰ ����  
	 */
	public String clickUp();
	/**
	 * ���������� ��(��) ��ư�� ������ �� �۵�
	 * @return ������ ���� �� ������ǰ ����  
	 */
	public String clickDown();
	/**
	 * ���������� ��(��) ��ư�� ������ �� �۵�
	 * @return ������ ���� �� ������ǰ ����  
	 */
	public String clickLeft();
	/**
	 * ���������� ��(��) ��ư�� ������ �� �۵�
	 * @return ������ ���� �� ������ǰ ����  
	 */
	public String clickRight();
}
