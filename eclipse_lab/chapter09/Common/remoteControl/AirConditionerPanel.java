package remoteControl;
import java.awt.*;
import javax.swing.*;

/**
 * ������ Ŭ������ ������ �������� �𵨸�(������ ����� �����ϹǷ� �θ�Ŭ���� RemoteControl�� ���)
 * @author �ڼҿ�
 *
 */
public class AirConditionerPanel extends JPanel implements RemoteControl 
{
	/** 
	 * ������ ����
	 */	
	private boolean power;
	/** 
	 * �ù� �µ� 
	 */	
	private int temperature;
	/** 
	 * �ٶ� ����
	 */	
	private int windStrength;
	/** 
	 * �ٶ� ���⸦ ���ڿ��� ǥ��
	 */	
	private final String strWindStrength[] = { "��ǳ", "��ǳ", "��ǳ" };
	/** 
	 * ���� ����� �ؽ�Ʈ ���̺�� ǥ��  
	 */	
	private JLabel label;
	
	
	/**
	 * ������ GUI ȭ�� �ʱ�ȭ 
	 */
	public AirConditionerPanel()
	{
		// ����, ����µ�, ǳ�� ���� �ʱ�ȭ 
		power = OFF;
		temperature = 18;
		windStrength = 1;
			
		label = new JLabel( "" );
		label.setPreferredSize( new Dimension( 290, 120 ) );		
		label.setFont( new Font( "Serif", Font.BOLD, 40 ) );
		label.setForeground( Color.BLUE );
		label.setText( "<html>������ �Ѽ���</html>" );

		add( label );
	}

	/**
	 * ������ ���������� ���� ��ư�� ������ ���� ���� ���� 
	 */
	public String clickPower()
	{
		if( power == OFF )
		{
			power = ON;
			label.setText( "<html> ����µ�: " + temperature + "�� <br> �ٶ�����: " + strWindStrength[ windStrength ] +" </html>" );
			return "������ �մϴ�";
		}
		else 
		{
			power = OFF;
			label.setText( "<html>������ �Ѽ���</html>" );
			return "������ ���ϴ�";
		}
	}
	
	/**
	 * ������ ���������� ��(��) ��ư�� ������ ��� �µ� ���� 
	 */
	public String clickUp()
	{
		if( power == ON )
		{
			++temperature;
			label.setText( "<html> ����µ�: " + temperature + "�� <br> �ٶ�����: " + strWindStrength[ windStrength ] +" </html>" );
		}
		return "���� �µ��� " + temperature + "���Դϴ�";
	}
	
	/**
	 * ������ ���������� ��(��) ��ư�� ������ ��� �µ� ����  
	 */
	public String clickDown()
	{
		if( power == ON )
		{
			--temperature;
			label.setText( "<html> ����µ�: " + temperature + "�� <br> �ٶ�����: " + strWindStrength[ windStrength ] +" </html>" );
		}
		return "���� �µ��� " + temperature + "���Դϴ�";
	}
	
	/**
	 * ������ ���������� ��(��) ��ư�� ������ �ٶ� ���� ���� 
	 */
	public String clickLeft()
	{
		if( power == ON )
		{
			windStrength = ( windStrength + (strWindStrength.length - 1 ) ) % strWindStrength.length;
			label.setText( "<html> ����µ�: " + temperature + "�� <br> �ٶ�����: " + strWindStrength[ windStrength ] +" </html>" );
		}
		return "���� ǳ���� " + windStrength + "�Դϴ�";
	}
	
	/**
	 * ������ ���������� ��(��) ��ư�� ������ �ٶ� ���� ���� 
	 */
	public String clickRight()
	{
		if( power == ON )
		{
			windStrength = ( windStrength + 1 ) % strWindStrength.length;
			label.setText( "<html> ����µ�: " + temperature + "�� <br> �ٶ�����: " + strWindStrength[ windStrength ] +" </html>" );
		}
		return "���� ǳ���� " + windStrength + "�Դϴ�";
	}
}
