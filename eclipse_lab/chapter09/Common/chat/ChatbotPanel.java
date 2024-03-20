package chat;
import java.awt.event.ActionEvent;

/**
 * ê�� GUI ȭ�� ���� Ŭ����
 * @author So Young Park
 * @version 0.8
 */

public class ChatbotPanel extends ChatPanel
{
	/**
	 * ê��
	 */
	protected Chatbot	 chatbot;
			
	/**
	 * ê�� GUI ȭ�� �ʱ�ȭ 
	 */
	public ChatbotPanel() 
	{
		// ê�� �ʱ�ȭ 
		super();
		chatbot = new Chatbot();
		// ä�� GUI ȭ�� �ʱ�ȭ 
		showChatBotResponse( null );	
	}
	
	/**
	 * ����ڰ� ��ȭ�� �Է½� ê�� �亯 ����Ͽ� ä�� ��Ȳ ������Ʈ 
	 * @param ActionEvent e : �̺�Ʈ
	 * @return ����
	 */
	@Override
	public void actionPerformed( ActionEvent e )	
	{
		// ê�� ������� �Է� ������ �������� 
		String userUtterance = inputField.getText();
		// ê�� ������� �Է� ������ ä��â�� ��� 
		super.actionPerformed( e );	
		// ê�� �亯�� ä��â�� ��� 
		showChatBotResponse( userUtterance );	
	}

	/**
	 * ê�� �亯�� ä��â�� ����ϴ� �޼��� 
	 * @param String userUtterance : ����� ��ȭ
	 */
	public void showChatBotResponse( String userUtterance )
	{
		// ����� ��ȭ�� ������ ê�� �亯�� ã�� 
		String botResponse = chatbot.getResponse( userUtterance );
		if ( botResponse == null ) 
			botResponse = chatbot.getFinalResponse();
		
		// ê�� �亯 ��� 
		chatWindow.append( botResponse + "\n" );
		chatWindow.setCaretPosition( chatWindow.getText().length() );
	}	
}
