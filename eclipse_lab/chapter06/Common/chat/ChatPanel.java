package chat;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * ä�� GUI ȭ�� ���� Ŭ����
 * @author So Young Park
 * @version 0.8
 */
public class ChatPanel extends JPanel implements ActionListener 
{
	/**
	 * ä��â
	 */
	protected JTextArea  chatWindow;
	/**
	 * ��ȭ �Է�â
	 */
	protected JTextField inputField;

	/**
	 * ä�� GUI ȭ�� �ʱ�ȭ 
	 */
	public ChatPanel() 
	{
		// ä��â �ʱ�ȭ 
		chatWindow = new JTextArea();
		chatWindow.setBackground( Color.lightGray );
		chatWindow.setEditable( false ); 		
		chatWindow.setLineWrap( true );
		// ä��â�� ������� ��ũ�� Ȱ��ȭ 
		JScrollPane scroll = new JScrollPane( chatWindow );
		scroll.setPreferredSize( new Dimension( 290, 360 ) );	
		add( scroll );
		// �Է�â �ʱ�ȭ 
		inputField = new JTextField();
		inputField.setPreferredSize( new Dimension( 290, 30 ) );		
		inputField.addActionListener( this );	
		inputField.requestFocus(); 
		add( inputField );
		
		setVisible( true );
	} 

	/**
	 * ����ڰ� ��ȭ�� �Է½� ä�� ��Ȳ ������Ʈ 
	 * @param ActionEvent e : �̺�Ʈ
	 * @return ����
	 */ 
	@Override
	public void actionPerformed( ActionEvent e )
	{
		// �Է�â���� ��ȭ �Է� ������ �������� 
		String userUtterance = inputField.getText();
		inputField.setText( "" );
		// ��ȭ �Է� ������ ä��â�� ��� 
		chatWindow.append( "[�����] " + userUtterance + "\n" );
		chatWindow.setCaretPosition( chatWindow.getText().length() );
	}
}
