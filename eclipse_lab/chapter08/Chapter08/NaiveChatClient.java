import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**************
 * ä�� ���α׷��� ��Ʈ��ũ Ŭ���̾�Ʈ �ʱ� ����
 * @author So Young Park
 * @version 0.8
 */	
public class NaiveChatClient
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println( "[Server]�� �Բ� ��� �ؿ� �ٷ� ������ �ּ��� bye�� �Է��ϸ� ����˴ϴ�" );

			// ��Ʈ��ũ Ŭ���̾�Ʈ ���� �ʱ�ȭ 
			// Ŭ���̾�Ʈ���� ������ ���� ��û 
			Socket socket = new Socket( "localhost", 7700 );

			// ��Ʈ��ũ ����� ���� �ʱ�ȭ  
			BufferedReader networkIn = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
			PrintWriter networkOut = new PrintWriter( socket.getOutputStream(), true );
			Scanner scan = new Scanner( System.in ); 
			
			// Ŭ���̾�Ʈ���� Ŭ���̾�Ʈ-���� ������� ��ȭ �ݺ� 
			while( true )
			{
				// Ŭ���̾�Ʈ�� �Է� �����͸� ��Ʈ��ũ�� ����  
				System.out.print( "[Client] " );
				String clientMessage = scan.nextLine(); 
				networkOut.println( clientMessage );

				// Ŭ���̾�Ʈ�� ��ȭ ���� 
				if( clientMessage.equals( "bye" ) )
				{
					System.out.println( "[Client]�� ��ȭ�� �����Ͽ����ϴ�" );
					break;					
				}

				// ������ ��Ʈ��ũ�� ���� ������ �о ��� 
				String serverMessage = networkIn.readLine();
				System.out.println( "[Server] " + serverMessage );
			}

			// ��Ʈ��ũ ���� ����   
			networkIn.close();
			networkOut.close();
			socket.close();
			scan.close();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
	}
}
