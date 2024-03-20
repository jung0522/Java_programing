import java.util.*;
import java.io.*;


class Chatbot							 
{
	ArrayList<String[]> pairs = new ArrayList<String[]>();	
		
	public Chatbot() 
	{
		 String[][] dialogue = { { "�̸��� ��", "�� �缮�̾�. ����MC ���缮�� �̸��� ����. ������ �� �� ���̴�?" },
				  { "������ �ݰ�", "���� �ݰ��� ģ�ϰ� ������" } };
			for( String[] pair : dialogue )
				pairs.add( pair );																
	}
				
	public String getResponse( String userUtterance )  
	{  					
		if ( userUtterance == null )
		{
			return "(�ý���) �ȳ�? �� �̸��� ���?";							 
		}		
		else if ( userUtterance.contains( "����" ) == true )  
		{
			return null;																 	 
		}

		for ( String[] pair : pairs )
		{
			if ( userUtterance.contains( pair[0] ) == true )  
			{
				return "(�ý���) " + pair[1]; 									 
			}
		}
		
		return userUtterance + "(�ý���) �� ���� ��մ°� ������?";		 					
	}

	public String getFinalResponse()
	{
		return "(�ý���) �׷� �ȳ�! �㿡 �� ��!";										 
	}
}


class ChatbotFromFile extends Chatbot
{
	public ChatbotFromFile( String dialoguePairFilename  )
	{
		super();
		this.pairs.clear();	
		
		try
		{
			BufferedReader inFile = new BufferedReader( new FileReader( new File( dialoguePairFilename ) ) ); 

			for( String line = ""; ( line = inFile.readLine() ) != null; ) 
			{
				StringTokenizer tokenizer = new StringTokenizer( line, "\t\n" ); 
				String[] pair = new String[2];
				pair[0] = tokenizer.nextToken();	
				pair[1] = tokenizer.nextToken();	
				pairs.add( pair );								
			}
			
			inFile.close();	
		}
		catch ( IOException e ) 				 
		{
			System.out.println( "[����] ������ �� �� �����ϴ�!" );
			e.printStackTrace();
		}
	}
}


public class JL0703							 
{
	 
	public static void main(String[] args) 	 
	{
		Scanner scan = new Scanner( System.in );  
		final String filename = "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\JL07\\src\\dialogue.txt";
		
		ChatbotFromFile chatbot = new ChatbotFromFile( filename );

		for ( String input = null, output = null;		                                          ( output = chatbot.getResponse( input ) ) != null; ) {
			System.out.print( output + "\n �����: " );
			input = scan.nextLine();
		}

		System.out.print( 
		                  chatbot.getFinalResponse() + "\n" );
		scan.close();
		return;	 
	}
}
