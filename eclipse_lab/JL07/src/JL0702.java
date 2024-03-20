import java.util.*;
import java.io.*;

public class JL0702 
{
	public static void main( String[] args ) 
	{
		Scanner scan = new Scanner( System.in );	
		String word = "";
		String meaning = "";

		System.out.print( "����ܾ �Է��ϼ��� : " );
		word = scan.nextLine(); 
		try
		{
			BufferedReader dictionary = new BufferedReader( new FileReader( new File( "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\JL07\\src\\dictionary.txt" ) ) ); 	

			while ( ( meaning = dictionary.readLine() ) != null ) 
			{
				if ( meaning.indexOf( word ) == 0 ) 
				{
					System.out.println( meaning );
					break;
				}
			}
		
			dictionary.close();	 
		}
		catch ( IOException e ) 
		{
			System.out.println( "[����] ������ �� �� �����ϴ�!" );
			e.printStackTrace();
		}

		return;
	}
}
