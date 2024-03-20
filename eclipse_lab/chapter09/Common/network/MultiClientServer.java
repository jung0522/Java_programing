package network;
import java.net.ServerSocket;
import java.util.ArrayList;

/**
 * ��ƼŬ���̾�Ʈ ������ ��Ʈ��ũ ���� �� ����� ��� Ŭ����
 * @author So Young Park
 * @version 0.8
 * @see     net.Network()
 */	
public class MultiClientServer extends Network
{
	/** 
	 * Ŭ���̾�Ʈ ���
	 */	
	private ArrayList<Client> clients;

	/**
	 * ��ƼŬ���̾�Ʈ ���� ���� �ʱ�ȭ 
	 */
	public MultiClientServer()
	{ 
		// ��Ʈ��ũ ���� �ʱ�ȭ 
		super();
		// Ŭ���̾�Ʈ ��� �ʱ�ȭ  
		clients = new ArrayList<Client>();
	}

	/**
	 * ��ƼŬ���̾�Ʈ ���� ���� �ʱ�ȭ 
	 */
	public void connectAsMultiClientServer()
	{
		try 
		{
			// ���� ���� ���� 
			serverSocket = new ServerSocket( serverPort ); 
			System.out.println( "[Server] ���� �����" );

			// �� Ŭ���̾�Ʈ���� �ݺ� 
			while ( true )
			{
				// Ŭ���̾�Ʈ���� ������ ���� ��û�� ���� Ȱ��ȭ 
				socket = serverSocket.accept();
				// ����-Ŭ���̾�Ʈ�� 1:1�� ������ ��Ʈ��ũ ����� �ʱ�ȭ 
				Client client = new Client( this );
				System.out.println( "[Server] Ŭ���̾�Ʈ ���� : " + client );
				clients.add( client ); 
				// Ŭ���̾�Ʈ���� ���� �����Ͱ� ������ ������ ������ ��� ���� 
				client.start();  
			} // while �ݺ� 
		}
		catch ( Exception e )
		{ 
			e.printStackTrace();
		} 
	}
	
	/**************
	 * Ŭ���̾�Ʈ ���� ��Ͽ� �ִ� ��� Ŭ���̾�Ʈ���� ������ ����
	 * @param data ������ ������ 
	 */
	public void broadcast( String data ) 
	{
		for( Client client : clients )
		{
			client.write( data );	
		} 
	}

	/**
	 * ��ƼŬ���̾�Ʈ ���� ���� ����  
	 */
	public void disconnect() 
	{
		// �� Ŭ���̾�Ʈ ���� ����  
		for( Client client : clients )
		{
			client.interrupt(); 
			client.disconnect(); 
			clients.remove( client );
		}
		
		// ��Ʈ��ũ ���� ���� ����  
		super.disconnect();
	}
} 
