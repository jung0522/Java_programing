import java.util.*;
import java.io.*;

public class JL0701
{
	public static void main( String[] args ) 
{	
		try
		{
			BufferedReader inFile = new BufferedReader( new FileReader( new File( "C:\\Users\\User\\Desktop\\2학년 2학기\\JAVA프로그래밍\\JL07\\src\\원본.txt" ) ) ); 	
			BufferedWriter outFile = new BufferedWriter( new FileWriter( new File( "C:\\Users\\User\\Desktop\\2학년 2학기\\JAVA프로그래밍\\JL07\\src\\복사본.txt" ) ) ); 	
			for( String line = ""; ( line = inFile.readLine() ) != null; ) 
			{
				outFile.write( line + "\n" ); 		
			}

			outFile.flush();						

			inFile.close();							
			outFile.close();						
		}
		catch ( IOException e ) 					
		{
			System.out.println( "[오류] 파일을 열 수 없습니다!" );
			e.printStackTrace();
		}

		return;
	}
}
