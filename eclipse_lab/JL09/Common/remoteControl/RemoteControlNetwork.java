package remoteControl;
import java.awt.event.ActionEvent;
import network.Network;

/**
 * ������ ���α׷��� ��Ʈ��ũ ��� Ŭ����
 * @author So Young Park
 * @version 0.8
 * @see     net.Network()
 */	
public class RemoteControlNetwork extends RemoteControllerPanel implements Runnable
{	
	/** 
	 * ��Ʈ��ũ
	 */	
	private Network network;
	/** 
	 * �������̳� ������ǰ ���̵�
	 */	
	private String  id;
	/** 
	 * ������ ���α׷��� �޽��� ��� 
	 */	
	private final String header = "[RMTC] ";

	/**
	 * ������ ���α׷��� ��Ʈ��ũ ���� �ʱ�ȭ 
	 * @param serverIP ���� IP �ּ�
	 */
	public RemoteControlNetwork( String serverIP )
	{
		super();
		connectAsClient( serverIP, this.getClass().getSimpleName() );
	}

	/**
	 * ������ǰ�� �����ϴ� ������ ���α׷��� ��Ʈ��ũ ���� �ʱ�ȭ 
	 * @param appliance ������ǰ : TV, ������, �κ�û�ұ� 
	 * @param serverIP ���� IP �ּ�
	 */
	public RemoteControlNetwork( RemoteControl appliance, String serverIP )
	{
		super( appliance );
		connectAsClient( serverIP, appliance.getClass().getSimpleName() );
	}


	/**
	 * ������ ���α׷��� ��Ʈ��ũ Ŭ���̾�Ʈ ���� �ʱ�ȭ 
	 * @param serverIP ���� IP �ּ�
	 * @param applianceName ������ǰ�� Ŭ���� �̸� : TV, ������, �κ�û�ұ�, ������ Ŭ���̾�Ʈ
	 */
	public void connectAsClient( String serverIP, String applianceName )
	{
		id = "[" + applianceName +"]";
		network = new Network();
		network.connectAsClient( serverIP, this );
	}

	/**
	 * ������ ��ư�� Ŭ���� ������ǰ���� �� ����� ���� 
	 * @param event ��ȭ �Է� ��� 
	 */
	@Override
	public void actionPerformed( ActionEvent event )
	{
		String message = "";			                 
		// ������ ��ư Ŭ�� ��� Ȯ�� 
		if ( event.getSource() == button[POWER] )  
			message = header + "POWER";
		else if ( event.getSource() == button[UP] ) 
			message = header + "UP";
		else if ( event.getSource() == button[DOWN] ) 
			message = header + "DOWN";
		else if ( event.getSource() == button[LEFT] ) 
			message = header + "LEFT";
		else if ( event.getSource() == button[RIGHT] ) 
			message = header + "RIGHT";

		// ������� ��Ʈ��ũ�� ������ ��ư Ŭ�� ��� ����
		network.write( message );
	}

	/**
	 * ������ ��ư Ŭ�� ��� ������ ������ǰ ���� ������Ʈ 
	 */
	@Override
	public void run()  
	{	
		// ������� ��Ʈ��ũ�� ���� ������ ��ư Ŭ�� ��� �б� 
		for ( String message = null; ( message = network.read()
		                                                             ) != null; ) 
		{
			// ������ ���α׷� �޽����� �ƴϸ� ����
			if ( !message.contains( header ) )
				continue;
			// ������ ��ư Ŭ�� ����� �������� ������ǰ ���� ������Ʈ 
			else if ( message.contains( "POWER" ) && ( appliance != null ) )
				appliance.clickPower();
			else if ( message.contains( "UP" ) && ( appliance != null ) )		
				appliance.clickUp();
			else if ( message.contains( "DOWN" ) && ( appliance != null ) )
				appliance.clickDown();
			else if ( message.contains( "LEFT" ) && ( appliance != null ) )
				appliance.clickLeft();
			else if ( message.contains( "RIGHT" ) && ( appliance != null ) )
				appliance.clickRight();
		}  
	}
	
	/**
	 * ������ ���α׷��� ��Ʈ��ũ ���� ���� 
	 */
	public void close()  
   	{
		// ������� ��Ʈ��ũ�� ���α׷� ���� �˸� 
		network.write( header + id + " ��Ʈ��ũ ���� ����" );
		// ��Ʈ��ũ ���� ���� 	
		network.disconnect();
	}
}
