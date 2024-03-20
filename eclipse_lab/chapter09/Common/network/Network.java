package network;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * ��Ʈ��ũ ���� �� ����� ���� Ŭ����
 * @author So Young Park
 * @version 0.8
 */
public class Network 
{
	/** 
	 * ���� ��Ʈ ��ȣ 
	 */	
	protected int serverPort;
	/** 
	 * ������ ��Ʈ��ũ�� �����ϱ� ���� ����
	 */	
	protected ServerSocket serverSocket; 
	/** 
	 * ����-Ŭ���̾�Ʈ�� 1:1�� �����ϱ� ���� ��Ʈ��ũ ���� 
	 */	
	protected Socket socket; 
	
	/** 
	 * ��Ʈ��ũ���� �����͸� �б� ���� ��ü
	 */	
	private BufferedReader in;
	/** 
	 * ��Ʈ��ũ�� �����͸� ���� ���� ��ü
	 */	
	private PrintWriter out; 
	/** 
	 * ��Ʈ��ũ�� ������� �����Ͱ� ������ ������ ��� ����ϰ� �ִٰ� �����Ͱ� �����ϸ� Ȱ��ȭ�Ǵ� �������̸�, ���� ������� ������ �۵�  
	 */	
	private Thread waitForCounterpart; 

	/**
	 * ��Ʈ��ũ Ŭ���� �ʱ�ȭ
	 */
	public Network()
	{	
		serverPort = 7700;
		serverSocket = null;
		socket = null;
		in = null;
		out = null;
		waitForCounterpart = null;
	}
	
	/**
	 * ��Ʈ��ũ ���� ���� �ʱ�ȭ 
	 * @param obj ��Ʈ��ũ�� ������ ������ ������ ó�� ��� ��ü
	 */
	public void connectAsServer( Runnable obj )  
	{
		try 
		{
			// ���� ���� ���� 
			serverSocket = new ServerSocket( serverPort ); 
			// Ŭ���̾�Ʈ���� ������ ���� ��û�� ���� Ȱ��ȭ 
			socket = serverSocket.accept();
			// ��Ʈ��ũ ����� ���� �ʱ�ȭ 
			in = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
			out = new PrintWriter( socket.getOutputStream(), true );
			// ��Ʈ��ũ�� �����Ͱ� ������ ������ ��� ���� 
			waitForCounterpart = new Thread( obj ); 
			waitForCounterpart.start();  
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	} 

	/**
	 * ��Ʈ��ũ Ŭ���̾�Ʈ ���� �ʱ�ȭ   
	 * @param serverIP ���� IP �ּ� 
	 * @param obj ��Ʈ��ũ�� ������ ������ ������ ó�� ��� ��ü
	 */
	public void connectAsClient( String serverIP, Runnable obj )  
	{
		try 
		{
			// Ŭ���̾�Ʈ���� ������ ���� ��û  
			socket = new Socket( serverIP, serverPort );
			// ��Ʈ��ũ ����� ���� �ʱ�ȭ 
			in = new BufferedReader( new InputStreamReader( socket.getInputStream() ));
			out = new PrintWriter( socket.getOutputStream(), true );
			// ��Ʈ��ũ�� �����Ͱ� ������ ������ ��� ����  
			waitForCounterpart = new Thread( obj ); 
			waitForCounterpart.start();	
		} 
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
	
	/**
	 * ������� ��Ʈ��ũ�� ���� ������ �б�
	 * @return ��Ʈ��ũ�� ������ ������
	 */
	public String read() 
	{
		try 
		{
			if ( this.isConnecting() == true )
				return 
				       in.readLine(); // ��Ʈ��ũ�� ����� �����Ͱ� ������ ������ ��� ���
		} 
		catch ( Exception e )
		{
			e.printStackTrace();
		}
		
		return null;
	}
	
	/**
	 * ������� ��Ʈ��ũ�� ������ ���� 
	 * @param data ��Ʈ��ũ�� ���� ������ 
	 */
	public void write( String data ) 
	{
		try 
		{
			if ( this.isConnecting() == true )
				out.println( data );
		} 
		catch ( Exception e )
		{
			e.printStackTrace();
		}	
	}
	
	/**
	 * ��Ʈ��ũ ���� ���� 
	 */
	public void disconnect() 
	{
		try 
		{
			if( waitForCounterpart != null )
			{
				waitForCounterpart.interrupt();	  
				waitForCounterpart = null;
			}
			if( in != null )
			{
				in.close();
				in=null;
			}			
			if( out != null )
			{
				out.flush();
				out.close();
				out = null;
			}
			if( socket != null )
			{
				socket.close();
				socket = null;
			}
			if( serverSocket != null )
			{
				serverSocket.close();
				serverSocket = null;
			}
		} 
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}

	/**
	 * ��Ʈ��ũ ���� ���� Ȯ��
	 * @return ��Ʈ��ũ �������̸� true �ƴϸ� false 
	 */
	public boolean isConnecting() 
	{
		if ( ( socket != null ) 
				&& ( in != null ) 
				&& ( out != null ) 
				&& ( waitForCounterpart != null ) 
				&& ( waitForCounterpart.getState() != Thread.State.TERMINATED ) )   
			return true;
		else
			return false;
	}
}
