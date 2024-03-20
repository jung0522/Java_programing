import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/**************
 * ä�� ���α׷��� ��Ʈ��ũ ���� �ʱ� ����
 * @author So Young Park
 * @version 0.8
 */	
public class NaiveChatServer
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println( "[Client]�� ��ȭ�� ������ ������ ��ø� ��ٷ� �ּ���" );

			 
			ServerSocket serverSocket = new ServerSocket( 7700 );
			Socket socket = serverSocket.accept();
			BufferedReader networkIn = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
			PrintWriter networkOut = new PrintWriter( socket.getOutputStream(), true );
			Scanner scan = new Scanner( System.in ); 


			while( true )
			{

				String clientMessage = networkIn.readLine();
				System.out.println( "[Client] " + clientMessage );
 
				if( clientMessage.equals( "bye" ) )
				{
					System.out.println( "[Client]�� ��ȭ�� �����Ͽ����ϴ�" );
					break;					
				}
				
				System.out.print( "[Server] " );
				String serverMessage = scan.nextLine(); 
				networkOut.println( serverMessage );
			}

			networkIn.close();
			networkOut.close();
			socket.close();
			serverSocket.close();
			scan.close();
		}
		catch ( Exception e )
		{
			e.printStackTrace();
		}
}
	}

