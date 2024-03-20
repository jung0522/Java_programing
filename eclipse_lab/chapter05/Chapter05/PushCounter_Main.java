import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PushCounterPanel extends JPanel	
{
	private int count;
	private JButton push;
	private JLabel label;
	
	// �г� �غ� 
	public PushCounterPanel () 		
	{
		count = 0;
		// Push Me! ��ư �غ� 
		
		push = new JButton ("Push Me!");
		push.addActionListener (new ButtonListener());	
		
		// Pushes Ƚ�� ��� �غ� 
		label = new JLabel ("Pushes: " + count);

		add (push);
		add (label);

		setBackground (Color.cyan);
		setPreferredSize (new Dimension(300, 40));
		
		// �г� �غ� �Ϸ� 
	}

	private class ButtonListener implements ActionListener 	
	{
		// ��ư Ŭ���� �۵� ���� 
		public void actionPerformed (ActionEvent event) 	
		{
			// Ŭ�� Ƚ�� ���� �� ��� 
			count++;
			label.setText("Pushes: " + count);	
			
			// ��ư Ŭ���� �۵� �Ϸ� 
			return;
		}
	}
}

// Push Me! ��ư ù��° Ŭ���ϱ�
// Push Me! ��ư �ι�° Ŭ���ϱ�
// ������ ������� X��ư Ŭ���ϱ�(����)	
public class PushCounter_Main
{
	// ���α׷����� 
	public static void main (String[] args)
	{
		// Ʋ �غ� 
		JFrame frame = new JFrame ("Push Counter");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // â ������ ���μ��� �ݱ� //

		// �г� �غ� 
		PushCounterPanel panel = new PushCounterPanel();
		frame.getContentPane().add(panel);

		// Ʋ�� �г� ����� ���� �غ� �Ϸ� 
		frame.pack();  // ��ġ 
		frame.setVisible(true);
		
		// ���α׷� ���� 
		return;
	}
}
