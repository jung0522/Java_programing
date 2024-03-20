package chat;
import java.awt.event.*;
import javax.swing.JOptionPane;
import network.Network;

/**
 * ä�� ���α׷��� ��Ʈ��ũ ��� Ŭ����
 * @author So Young Park
 * @version 0.8
 * @see     net.Network()
 */	
public class ChatNetwork extends ChatPanel implements Runnable
{	
	/** 
	 * ��Ʈ��ũ
	 */	
	private Network network;
	/** 
	 * ä�� ������ ���̵�
	 */	
	private String  id;
	/** 
	 * ä�� ���α׷��� �޽��� ��� 
	 */	
	private final String header = "[CHAT] ";
		
	/**
	 * ä�� ���α׷��� ��Ʈ��ũ ���� �ʱ�ȭ  
	 * @param serverIP ���� IP �ּ�
	 */
	public ChatNetwork( String serverIP )
	{
		super();
		id = "[" + JOptionPane.showInputDialog( this, "���̵� �Է����ּ���.", "���̵�" ) + "]";

		network = new Network();
		network.connectAsClient( serverIP, this );
		network.write( header + id + "���� �����̽��ϴ�" );
	}
		
	/**
	 * ��ȭ ���� �Է½� ������� ��ȭ ���� ���� 
	 * @param event ��ȭ �Է� ��� 
	 */
	@Override
	public void actionPerformed( ActionEvent event )
	{
		// �����ڰ� �Է��� ��ȭ ���� �б� 
		String message = inputField.getText();			                 
		// ������� ��Ʈ��ũ�� ��ȭ ���� ���� 
		network.write( header + id + message );  
		inputField.setText( "" );
	}

	/**
	 * ��ȭ ���� ������ ä�� ȭ�� ������Ʈ 
	 */
	@Override
	public void run() 
	{	
		// ������� ��Ʈ��ũ�� ���� ��ȭ ���� �б� 
		for ( String message = null; ( message = network.read() ) != null; )
		{
			// ä�� ���α׷� ��ȭ ������ �ƴϸ� �޽��� ����
			if ( !message.contains( header ) )
				continue;

			// ä�� ȭ�鿡 �ش� ��ȭ ���� ���� 
			chatWindow.append( message.substring( header.length() ) + "\n" );
			chatWindow.setCaretPosition( chatWindow.getText().length() );				
		}  
	}

	/**
	 * ä�� ���α׷��� ��Ʈ��ũ ���� ���� 
	 */
	public void close() 
   	{
		// ������� ��Ʈ��ũ�� ���α׷� ���� �˸� 
		network.write( header + " " + id + "���� �����̽��ϴ�" );
		// ��Ʈ��ũ ���� ����
		network.disconnect();
	}
}
