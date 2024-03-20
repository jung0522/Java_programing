import java.util.*;
import java.io.*;

/**
 * ê�� Ŭ����
 * @author So Young Park
 * @version 0.8
 */
class Chatbot							 
{
	ArrayList pairs = new ArrayList();	
		
	public Chatbot() 
	{
		 String[][] dialogue = { { "�̸��� ��", "�� �缮�̾�. ����MC ���缮�� �̸��� ����. ������ �� �� ���̴�?" },
				  { "������ �ݰ�", "���� �ݰ��� ģ�ϰ� ������" } };
			for( String[] pair : dialogue )
				pairs.add( pair );																
	}

		// ê�� �亯�� �����ϴ� �޼��� ����					
	public String getResponse( String userUtterance )  
	{
		// ê�� ���۽� ����ڿ��� �� �ɱ�  					
		if ( userUtterance == null )
		{
			return "(�ý���) �ȳ�? �� �̸��� ���?";							 
		}		
		else if ( userUtterance.contains( "����" ) == true )  
		{
			return null;																 	 
		}

		// �غ��� ��ȭ�ֿ���  
		for ( String[] pair : pairs )
		{
			// ������ �亯�� ã���� ê�� �亯�� ���  
			if ( userUtterance.contains( pair[0] ) == true )  
			{
				return "(�ý���) " + pair[1]; 									 
			}
		}

		// ������ �亯�� �� ã���� '�� ���� ��մ°� ������?' ��� 
		return userUtterance + "(�ý���) �� ���� ��մ°� ������?";		 
		// ê�� �亯�� �����ϴ� �޼��� ���� 					
	}

	public String getFinalResponse()
	{
		return "(�ý���) �׷� �ȳ�! �㿡 �� ��!";										 
	}
}

/**************
 * ê�� ���α׷��� ChatbotFromFile Ŭ����
 * @author So Young Park
 * @version 0.8
 */	
class ChatbotFromFile extends Chatbot
{
	public ChatbotFromFile( String dialoguePairFilename  )
	{
		super();
		this.pairs.clear();	
		
		try
		{
			// ���� �غ� 	
			BufferedReader inFile = new BufferedReader( new FileReader( new File( dialoguePairFilename ) ) ); 

			// �غ��� ��ȭ�� ���Ͽ��� �о���� 
			for( String line = ""; ( line = inFile.readLine() ) != null; ) 
			{
				// ���Ͽ��� ���� ��ȭ���� ��ȭ�� �迭�� �߰��ϱ� 
				StringTokenizer tokenizer = new StringTokenizer( line, "\t\n" ); 
				String[] pair = new String[2];
				pair[0] = tokenizer.nextToken();	
				pair[1] = tokenizer.nextToken();	
				pairs.add( pair );								
			}
			
			// ���� �ݱ� 
			inFile.close();	
		}
		catch ( IOException e ) 				 
		{
			System.out.println( "[����] ������ �� �� �����ϴ�!" );
			e.printStackTrace();
		}
	}
}

/**************
 * ê�� ���α׷��� Main Ŭ����
 * @author So Young Park
 * @version 0.8
 */	
public class ChatbotFromFileMain							 
{
	 
	public static void main(String[] args) 	 
	{
		Scanner scan = new Scanner( System.in );  
		final String filename = "C:\\Users\\User\\Desktop\\2�г� 2�б�\\JAVA���α׷���\\eclipse_lab\\chapter07\\Chapter07\\dialogue.txt";
		ChatbotFromFile chatbot = new ChatbotFromFile( filename );

		// ����ڿ� ê���� ��ȭ �ݺ� 
		for ( String input = null, output = null; ( output = chatbot.getResponse( input ) ) != null; ) {
			System.out.print( output + "\n �����: " );
			input = scan.nextLine();
		}

		System.out.print( chatbot.getFinalResponse() + "\n" );
		scan.close();
		return;	 
	}
}
