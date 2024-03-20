import javax.swing.JFrame;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class StyleOptionsPanel extends JPanel  
{
	private JLabel saying;
	private JCheckBox bold, italic;

	// �г� �غ� 
	public StyleOptionsPanel()
	{
		// Say it with style! �ؽ�Ʈ ���̺� �غ� 
		saying = new JLabel( "Say it with style!" );
		saying.setFont( new Font("Helvetica", Font.PLAIN, 36 ) );

		// ���ϰ� �� ���Ÿ� �Ӽ� �غ� 
		bold = new JCheckBox ("Bold");
		bold.setBackground (Color.cyan);
		
		italic = new JCheckBox ("Italic");
		italic.setBackground (Color.cyan);

		// ���ϰ� �� ���Ÿ� �Ӽ� ����� �۵��ϵ��� listener�� ��� 
		StyleListener listener = new StyleListener();
		bold.addItemListener(listener);	
		italic.addItemListener(listener);	

		// Say it with style!, ���ϰ� �Ӽ�, ���Ÿ� �Ӽ��� �гο� ��� 
		add (saying);
		add (bold);
		add (italic);

		// �г� ������ ũ�� ����
		setBackground (Color.cyan);
		setPreferredSize (new Dimension(300, 100));
		// �г� �غ� �Ϸ� 
	}
	private class StyleListener implements ItemListener	
	{
		// �Ӽ��� ����� �۵� ���� 
		public void itemStateChanged(ItemEvent event)	
		{
			int style = Font.PLAIN;

			// ���ϰ� �Ӽ��� ���������� ���ڸ� ���ϰ� ���� 
			if (bold.isSelected())
				style = Font.BOLD;

			// ���Ÿ� �Ӽ��� ���������� ���ڸ� ���Ÿ�ü�� ���� 
			if (italic.isSelected())
				style += Font.ITALIC;

			// ���ڸ� Helvetica ��Ʈ, 36ũ��� ������ �Ӽ��� ���� ��� 
			saying.setFont (new Font ("Helvetica", style, 36));	
			// �Ӽ��� ���� �Ϸ� 
			return;
		}
	}
}

// ���ϰ� �Ӽ� Ŭ���ϱ�(����)
// ���Ÿ�ü �Ӽ� Ŭ���ϱ�(����)
// ���ϰ� �Ӽ� Ŭ���ϱ�(����)
// ������ ������� X��ư Ŭ���ϱ�(����)	
public class StyleOptions_Main
{
	// ���α׷����� 
	public static void main (String[] args)
	{
		// Ʋ �غ� 
		JFrame frame = new JFrame ("Style Options");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		// �г� �غ� 
		frame.getContentPane().add (
						new StyleOptionsPanel());

		// Ʋ�� �г� ����� ���� �غ� �Ϸ� 
		frame.pack();
		frame.setVisible(true);
		
		// ���α׷� ���� 
		return;
	}
}
