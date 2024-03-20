import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.*;

public class JL0801_1
{
	public static void main(String[] args) 
	{
		try 
		{
			System.out.println( "[Server]와 함께 얘기 해요 바로 시작해 주세요 bye를 입력하면 종료됩니다" );

			Socket socket = new Socket( "localhost", 7700 );
			BufferedReader networkIn = new BufferedReader( new InputStreamReader( socket.getInputStream() ) );
			PrintWriter networkOut = new PrintWriter( socket.getOutputStream(), true );
			Scanner scan = new Scanner( System.in ); 
			
			while( true )
			{

				System.out.print( "[Client] " );
				String clientMessage = scan.nextLine(); 
				networkOut.println( clientMessage );

				if( clientMessage.equals( "bye" ) )
				{
					System.out.println( "[Client]가 대화를 종료하였습니다" );
					break;					
				}

				String serverMessage = networkIn.readLine();
				System.out.println( "[Server] " + serverMessage );
			}
 
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
