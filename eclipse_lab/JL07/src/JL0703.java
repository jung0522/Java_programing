import java.util.*;
import java.io.*;


class Chatbot							 
{
	ArrayList<String[]> pairs = new ArrayList<String[]>();	
		
	public Chatbot() 
	{
		 String[][] dialogue = { { "이름이 뭐", "난 재석이야. 국민MC 유재석과 이름이 같아. ㅎㅎㅎ 넌 몇 살이니?" },
				  { "만나서 반가", "나도 반가워 친하게 지내자" } };
			for( String[] pair : dialogue )
				pairs.add( pair );																
	}
				
	public String getResponse( String userUtterance )  
	{  					
		if ( userUtterance == null )
		{
			return "(시스템) 안녕? 넌 이름이 모야?";							 
		}		
		else if ( userUtterance.contains( "바이" ) == true )  
		{
			return null;																 	 
		}

		for ( String[] pair : pairs )
		{
			if ( userUtterance.contains( pair[0] ) == true )  
			{
				return "(시스템) " + pair[1]; 									 
			}
		}
		
		return userUtterance + "(시스템) 뭐 딴거 재밌는거 없을까?";		 					
	}

	public String getFinalResponse()
	{
		return "(시스템) 그래 안녕! 담에 또 봐!";										 
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
			System.out.println( "[오류] 파일을 열 수 없습니다!" );
			e.printStackTrace();
		}
	}
}


public class JL0703							 
{
	 
	public static void main(String[] args) 	 
	{
		Scanner scan = new Scanner( System.in );  
		final String filename = "C:\\Users\\User\\Desktop\\2학년 2학기\\JAVA프로그래밍\\JL07\\src\\dialogue.txt";
		
		ChatbotFromFile chatbot = new ChatbotFromFile( filename );

		for ( String input = null, output = null;		                                          ( output = chatbot.getResponse( input ) ) != null; ) {
			System.out.print( output + "\n 사용자: " );
			input = scan.nextLine();
		}

		System.out.print( 
		                  chatbot.getFinalResponse() + "\n" );
		scan.close();
		return;	 
	}
}
