import java.util.ArrayList;
import java.util.Scanner;

/**
 * ê�� Ŭ����
 * @author So Young Park
 * @version 0.8
 */
class Chatbot								
{
	private String[][] pairs = { { "�̸��� ��", "�� �缮�̾�. ����MC ���缮�� �̸��� ����. ������ �� �� ���̴�?" },
			  { "�� ��", "�� 20���̾�. ������ �� �η����ϴ� ������. �� ��� ���?" },
			  { "��� ��", "�� ȫ���� ���. ���ѻ� �Ʒ� �־ ���Ⱑ ���� ����.������ ��̰� ����?" },
			  { "������ �ݰ�", "���� �ݰ��� ģ�ϰ� ������" } };

public Chatbot()					
{
}

// ê�� �亯�� �����ϴ� �޼��� 					
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
	return "(�ý���) �� ���� ��մ°� ������?";		
}

public String getFinalResponse()
{
	return "(�ý���) �׷� �ȳ�! �㿡 �� ��!";											
}
}

/**************
* ê�� ���α׷��� Main Ŭ����
* @author So Young Park
* @version 0.8
*/	
public class Chatbot_Main								
{
// ���α׷� ���� 	
public static void main(String[] args) 	
{
	Scanner scan = new Scanner( System.in ); 
	
	Chatbot chatbot = new Chatbot();

	// ����ڿ� ê���� ��ȭ �ݺ� 
	for ( String input = null, output = null;( output = chatbot.getResponse( input ) ) != null; ) {
		// ����� �Է¿� ������ ê�� �亯 ��� 	
		System.out.print( output + "\n �����: " );
		input = scan.nextLine();
	}

	// ����ڰ� '����'�� �Է��ϸ� '�׷� �ȳ�! �㿡 �� ��!'�� ��� �� ��ȭ�� ����			
	System.out.print( 
	                  chatbot.getFinalResponse() + "\n" );
	scan.close();
	// ���α׷� ���� 	
	return;	
 }
}