import java.util.*;
import java.io.*;

public class DictionaryMain 
{
	// ���α׷����� 
	public static void main( String[] args ) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );	
		String word = "";
		String meaning = "";

		// ���� �ܾ �Է� 
		System.out.print( "����ܾ �Է��ϼ��� : " );
		word = scan.nextLine(); 
		try
		{
			// ���� ������ ���� 
			BufferedReader dictionary = new BufferedReader( new FileReader( new File( "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\eclipse_lab\\chapter07\\Chapter07\\dictionary.txt" ) ) ); 	
			// ���� �������� �� �پ� �а� 
			while ( ( meaning = dictionary.readLine() ) != null ) 
			{
				// �ش� ����ܾ ã���� ���� ��� 
				if ( meaning.indexOf( word ) == 0 ) 
				{
					System.out.println( meaning );
					break;
				}
			}
		
			// ���� ���� �ݱ� 
			dictionary.close();	 
		}
		catch ( IOException e ) 
		{
			System.out.println( "[����] ������ �� �� �����ϴ�!" );
			e.printStackTrace();
		}

		// ���α׷� ���� 
		return;
	}
}
