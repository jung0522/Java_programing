package rockPaperScissors;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;
import network.Network;

/**
 * ���������� ���α׷��� ��Ʈ��ũ ��� Ŭ����
 * @author So Young Park
 * @version 0.8
 * @see     net.Network()
 */	
public class RockPaperScissorsNetwork extends RockPaperScissorsPanel implements Runnable
{	
	/** 
	 * ��Ʈ��ũ
	 */	
	private Network network;
	/** 
	 * ���������� ������ ���̵�
	 */	
	private String id;
	/** 
	 * ����� ���������� ���� ��� 
	 */	
	private int counterpart;
	/** 
	 * ���������� �޽��� ��� 
	 */	
	private final String headerMessage = "[RPSN] ";
	/** 
	 * ��Ʈ��ũ ���� ���� �޽���
	 */	
	private final String disconnectMessage = " -1";

	/**
	 * ���������� ���α׷��� ��Ʈ��ũ �ʱ�ȭ
	 */
	public RockPaperScissorsNetwork() 
	{
		super();
		id = "[" + JOptionPane.showInputDialog( this, "���̵� �Է����ּ���.", "���̵�" ) + "]";
		super.strPlayers.setText( "<html><body style='text-align:center;'>������� �غ����Դϴ� ��ٷ��ּ���<br>"+ id +"</body></html>" );			
		super.disableSelection();
		network = new Network();
	}
	
	/**
	 * ���������� ���α׷��� ��Ʈ��ũ �ʱ�ȭ
	 * @param serverIP ���� IP �ּ�
	 */
	public RockPaperScissorsNetwork( String serverIP )
	{
		this();
		connectAsClient( serverIP );
	}

	/**
	 * ���������� ���α׷��� ��Ʈ��ũ Ŭ���̾�Ʈ ���� �ʱ�ȭ  
	 * @param serverIP ���� IP �ּ�
	 */
	public void connectAsClient( String serverIP )
	{
		network.connectAsClient( serverIP, this );
		network.write( headerMessage + id + " " + game.selectRockPaperScissors() );
	}
	
	/**
	 * ���������� ���α׷��� ��Ʈ��ũ ���� ���� �ʱ�ȭ 
	 */
	public void connectAsServer()
	{
		network.connectAsServer( this );
	}

	/**
	 * ���������� �Է½� ���� ������Ʈ 
	 * @param event ���������� ���� ��� 
	 */
	@Override
	public void actionPerformed( ActionEvent event )
	{
		// ���� ���������� ���� Ȯ�� �� ���� ������Ʈ 
		int player = super.selectRockPaperScissors( event );
		super.showGameResult( player, counterpart );
		super.disableSelection();
		network.write( headerMessage + id + " " + player );
	}

	/**
	 * ���������� ������ ���� ������Ʈ 
	 */
	@Override
	public void run()  
	{		
		// ������� ��Ʈ��ũ�� ���� ���������� ���� �б� 
		for ( String message = null; ( message = network.read() ) != null; )
		{	
			// ���������� ���α׷��� �޽����� �ƴϸ� ���� 
			if ( !message.contains( headerMessage ) )
				continue;
			// ������� ��Ʈ��ũ ���������� �ȳ�  
			else if ( message.contains( disconnectMessage ) )
			{
				super.strPlayers.setText( "<html><body style='text-align:center;'>������� �����Ͽ����ϴ�<br>"+ id +"</body></html>" );
				super.imgPlayerB.setIcon( image[QUESTIONMARK][BASE] );
				super.disableSelection();
				network.write( headerMessage + id + disconnectMessage );
			}					
			else
			{
				// ���������� ���� �������� ���� ������Ʈ 
				String[] tmp = message.substring(7).split( "] " );
				String counterpartID = tmp[0].trim() + "]";
				counterpart = Integer.parseInt( tmp[1].trim() );
				super.strPlayers.setText( "<html><body style='text-align:center;'>"+ counterpartID + "<br>"+ id +"</body></html>" );
				super.enableSelection();
			}
		} 
	}
	
	/**
	 * ���������� ���α׷��� ��Ʈ��ũ ���� ���� 
	 */
	public void close()  
   	{
		// ������� ��Ʈ��ũ�� ���α׷� ���� �˸� 
		network.write( headerMessage + id + disconnectMessage );
		// ��Ʈ��ũ ���� ���� 	
		network.disconnect();
	}
}
