import java.util.*;
import java.io.*;

public class JL0701
{
	public static void main( String[] args ) 
{	
		try
		{
			BufferedReader inFile = new BufferedReader( new FileReader( new File( "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\JL07\\src\\����.txt" ) ) ); 	
			BufferedWriter outFile = new BufferedWriter( new FileWriter( new File( "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\JL07\\src\\���纻.txt" ) ) ); 	
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
			System.out.println( "[����] ������ �� �� �����ϴ�!" );
			e.printStackTrace();
		}

		return;
	}
}
