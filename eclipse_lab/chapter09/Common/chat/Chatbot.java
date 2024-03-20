package chat;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

/**
 * ê�� Ŭ����
 * @author So Young Park
 * @version 0.8
 */
public class Chatbot 
{
	ArrayList<String[]> pairs = new ArrayList<String[]>();
	public Chatbot()
	{
		String[][] pairsOfDialogue = { { "�̸��� ��", "�� �缮�̾�. ����MC ���缮�� �̸��� ����. ������ �� �� ���̴�?" },
					  { "�� ��", "�� 20���̾�. ������ �� �η����ϴ� ������. �� ��� ���?" },
					  { "��� ��", "�� ȫ���� ���. ���ѻ� �Ʒ� �־ ���Ⱑ ���� ����.������ ��̰� ����?" },
					  { "������ �ݰ�", "���� �ݰ��� ģ�ϰ� ������" } };
		
		for( String[] pair : pairsOfDialogue )
			pairs.add( pair );
	}

	public String getResponse( String userUtterance )
	{
		// �ý��� �亯 ���  
		if ( userUtterance == null )
		{
			return "[ê��] �ȳ�? �� �̸��� ���?";
		}		
		else if ( userUtterance.contains( "����" ) == true )
		{
			return null;
		}

		// �غ��� ��ȭ�ֿ��� 
		for ( String[] pair : pairs )
		{
			// ������ �亯�� ã���� �ý��� �亯�� ���  
			if ( userUtterance.contains( pair[0] ) == true ) 	
			{
				return "[ê��] " + pair[1]; 
			}
		}

		// ������ �亯�� �� ã���� '�� ���� ��մ°� ������?' ��� 
		return userUtterance + "[ê��] �� ���� ��մ°� ������?";
	}

	public String getFinalResponse()
	{
		return "[ê��] �׷� �ȳ�! �㿡 �� ��";
	}
}
