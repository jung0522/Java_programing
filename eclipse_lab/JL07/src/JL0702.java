import java.util.*;
import java.io.*;

public class JL0702 
{
	public static void main( String[] args ) 
	{
		Scanner scan = new Scanner( System.in );	
		String word = "";
		String meaning = "";

		System.out.print( "영어단어를 입력하세요 : " );
		word = scan.nextLine(); 
		try
		{
			BufferedReader dictionary = new BufferedReader( new FileReader( new File( "C:\\Users\\User\\Desktop\\2학년 2학기\\JAVA프로그래밍\\JL07\\src\\dictionary.txt" ) ) ); 	

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
			System.out.println( "[오류] 파일을 열 수 없습니다!" );
			e.printStackTrace();
		}

		return;
	}
}
