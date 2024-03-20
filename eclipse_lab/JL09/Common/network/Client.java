package network;	
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 * ��ƼŬ���̾�Ʈ �������� ����-Ŭ���̾�Ʈ�� 1:1�� ����� �����ϱ� ���� ������ Ŭ�����̸�, ���� ������� ������ �۵�
 * @author So Young Park
 * @version 0.8
 */
public class Client extends Thread  
{
	/**
	 * ��ƼŬ���̾�Ʈ ��Ʈ��ũ ����
	 */
	private MultiClientServer server;
	/** 
	 * ��Ʈ��ũ���� �����͸� �б� ���� ��ü
	 */	
	private BufferedReader in;
	/** 
	 * ��Ʈ��ũ�� �����͸� ���� ���� ��ü
	 */	
	private PrintWriter out;

	/**
	 * �� Ŭ���̾�Ʈ�� ��Ʈ��ũ ����� ���� �ʱ�ȭ 
	 * @param server ��Ƽ Ŭ�󸮾�Ʈ�� ��Ʈ��ũ ���� ��ü
	 */
	public Client( MultiClientServer server )
	{
		try 
		{
			// ������ �� Ŭ���̾�Ʈ�� �����͸� �ְ� ���� �� �ֵ��� 1:1�� ��Ʈ��ũ ����� ���� �ʱ�ȭ 
			this.server = server;
			this.in = new BufferedReader( new InputStreamReader( server.socket.getInputStream() ) );
			this.out = new PrintWriter( server.socket.getOutputStream(), true );
		} 
		catch ( Exception e )
		{ 
			e.printStackTrace();
		} 
	}

	/**
	 * ��ƼŬ���̾�Ʈ ������ ������ ������ ��� Ŭ���̾�Ʈ�� ���� 
	 */
	@Override
	public void run() 
	{
		try 
		{
			// Ư�� Ŭ���̾�Ʈ���� ���� �����͸� �б� 
			for( String data = null; ( data = in.readLine() ) != null; )
			{
				// ���� �����͸� �������� �����ϴ� ��� Ŭ���̾�Ʈ�� ���� 
				System.out.println("[Server] ������ ���� : " + this + " " + data );
				server.broadcast( data );  
			}
		} 
		catch ( Exception e )
		{ 
			e.printStackTrace();
		} 
	}

	/**
	 * �� Ŭ���̾�Ʈ�� ��Ʈ��ũ ���� ���� 
	 */
	public void disconnect() 
	{
		try 
		{
			if( in != null )
			{
				in.close();
				in = null;
			}
			if( out != null )
			{
				out.close();
				out = null;
			}
		} 
		catch ( Exception e )
		{ 
			e.printStackTrace();
		}
	}
	
	/**
	 * ��Ʈ��ũ�� ���� ������ ���� 
	 * @param data ��Ʈ��ũ�� ���� ������ 
	 */
	public void write( String data ) 
	{
		try 
		{
			// ��� Ŭ���̾�Ʈ�� ��Ʈ��ũ ���� ����� ������ ���� �Ұ� 
			if ( this.getState() == Thread.State.TERMINATED )	 
			{
				System.out.println( "[Server] Ŭ���̾�Ʈ ���� ���� : " + this );
			}		
			// ��� Ŭ���̾�Ʈ�� ��Ʈ��ũ ���� ��ȿ�� ������ ���� 
			else if ( out != null )
			{
				System.out.println("[Server] ������ ���� : " + this + " " + data );
				out.println( data );
			}
		} 
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
}
