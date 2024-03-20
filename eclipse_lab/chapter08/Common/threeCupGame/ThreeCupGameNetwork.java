package threeCupGame;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import network.Network;

/**
 * ����ã�� ���α׷��� ��Ʈ��ũ ��� Ŭ����
 * @author So Young Park
 * @version 0.8
 * @see     net.Network()
 */	
public class ThreeCupGameNetwork extends ThreeCupGamePanel implements Runnable
{	
	/** 
	 * ��Ʈ��ũ
	 */	
	private Network network;
	/** 
	 * ����ã�� ������ ���̵�
	 */	
	private String  id;
	/** 
	 * ����ã�� �޽��� ���
	 */	
	private final String headerMessage = "[TCGN] ";
	/** 
	 * ��Ʈ��ũ ���� ���� �޽���
	 */	
	private final String disconnectMessage = " -1";
	
	/**
	 * ����ã�� ���α׷��� ��Ʈ��ũ �ʱ�ȭ
	 */
	public ThreeCupGameNetwork() 
	{
		super();
		id = "[" + JOptionPane.showInputDialog( this, "���̵� �Է����ּ���.", "���̵�" ) + "]";
		super.label.setText( id +"��, ������� �غ����Դϴ� ��ٷ��ּ���" );					
		super.disableSelection();
		network = new Network();
	}
	
	/**
	 * ����ã�� ���α׷��� ��Ʈ��ũ �ʱ�ȭ
	 * @param serverIP ���� IP �ּ�
	 */
	public ThreeCupGameNetwork( String serverIP )
	{
		this();
		connectAsClient( serverIP );
	}

	/**
	 * ����ã�� ���α׷��� ��Ʈ��ũ Ŭ���̾�Ʈ ���� �ʱ�ȭ  
	 * @param serverIP ���� IP �ּ�
	 */
	public void connectAsClient( String serverIP )
	{
		network.connectAsClient( serverIP, this );
		network.write( headerMessage + id + " " + getRandomCup() );
	}
	
	/**
	 * ����ã�� ���α׷��� ��Ʈ��ũ ���� ���� �ʱ�ȭ 
	 */
	public void connectAsServer()
	{
		network.connectAsServer( this );
	}

	/**
	 * �� ��ȣ ���ý� ����ã�� ���� ������Ʈ 
	 * @param event ����ã�� ���� ��� 
	 */
	@Override
	public void actionPerformed( ActionEvent event )
	{
		// �� ��ȣ �Է°� Ȯ�� 
		player = selectCup( event );
		// �� ��ȣ �Է°��� �������� ����ã�� ���� ��� ������Ʈ 
		showGameResult( super.player, super.ball );
		label.setText( id +"��, ������� �غ����Դϴ� ��ٷ��ּ���" );
		disableSelection();
		network.write( headerMessage + id + " " + super.player );
	}

	/**
	 * �� ��ȣ ������ ����ã�� ���� ������Ʈ 
	 */
	@Override
	public void run() 
	{		
		// ������� ��Ʈ��ũ�� ���� �� ��ȣ �б� 
		for ( String message = null; ( message = network.read() ) != null; )
		{
			// ����ã�� ���α׷��� �޽����� �ƴϸ� ���� 
			if ( !message.contains( headerMessage ) )
				continue;
			// ������� ��Ʈ��ũ ���������� �ȳ�  
			else if ( message.contains( disconnectMessage ) )
			{
				label.setText( "������� �����Ͽ����ϴ�" );
				disableSelection();
				network.write( headerMessage + id + disconnectMessage );
			}
			else
			{
				// �ش� ��ȣ�� �ſ� ���� ����� ����ã�� ���� �غ�  
				String[] tmp = message.substring( headerMessage.length() ).split( "] " );
				String counterpartID = tmp[0].trim() + "]";
				ball = Integer.parseInt( tmp[1].trim() );
				enableSelection();
				label.setText( id + "��, " + counterpartID + "���� ������ ���� ���� �����ϼ���" );
			} 
		}
	}
	
	/**
	 * ����ã�� ���α׷��� ��Ʈ��ũ ���� ���� 
	 */
	public void close()  
   	{
		// ������� ��Ʈ��ũ�� ���α׷� ���� �˸� 
		network.write( headerMessage + id + disconnectMessage );
		// ��Ʈ��ũ ���� ���� 	
		network.disconnect();
	}
}
