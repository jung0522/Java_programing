import java.util.*;
import java.io.*;

public class FileCopyMain 
{
	// ���α׷����� 
	public static void main( String[] args ) 
{	
		try
		{
			BufferedReader inFile = new BufferedReader( new FileReader( new File( "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\chapter07\\Chapter07\\����.txt" ) ) ); 	
			BufferedWriter outFile = new BufferedWriter( new FileWriter( new File( "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\chapter07\\Chapter07\\���纻.txt" ) ) ); 	
			// ���� ���� ������ �� �پ� �б� 
			for( String line = ""; ( line = inFile.readLine() ) != null; ) 
			{
				// ���纻 ���Ͽ� �� �پ� ���� 
				outFile.write( line + "\n" ); 		
			}

			// ���ۿ� �����ִ� �����͸� ���Ͽ� ���� ���  			
			outFile.flush();						

			// ���� �ݱ� 
			inFile.close();							
			outFile.close();						
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
