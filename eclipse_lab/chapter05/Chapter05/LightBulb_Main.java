import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LightBulbControls extends JPanel	
{
	private LightBulbPanel bulb;
	private JButton onButton, offButton;
	// ���� ���� �г� �غ� 
	public LightBulbControls (LightBulbPanel bulbPanel)
	{
		// ���� �̹����� ������ �� �ֵ��� �غ� 
		bulb = bulbPanel;
		// on ��ư �غ� 
		onButton = new JButton ("On");
		onButton.setEnabled (false);
		onButton.setMnemonic ('n');
		onButton.setToolTipText ("Turn it on!");
		// on ��ư Ŭ���� �۵��ϴ� ������ ��� 
		onButton.addActionListener (new OnListener());	
		// off ��ư �غ� 
		offButton = new JButton ("Off");
		offButton.setEnabled (true);
		offButton.setMnemonic ('f');
		offButton.setToolTipText ("Turn it off!");
		// off ��ư Ŭ���� �۵��ϴ� ������ ��� 
		offButton.addActionListener (new OffListener());	
		setBackground (Color.black);
		add (onButton);
		add (offButton);
	// ���� ���� �г� �غ� �Ϸ� 
	}
	private class OnListener implements ActionListener	
	{
		// on ��ư Ŭ���� �۵� ���� 
		public void actionPerformed (ActionEvent event)	
		{
			// ������ �Ѱ� on ��ư ��Ȱ��ȭ 
			bulb.setOn (true);
			onButton.setEnabled (false);
			// ���߿� ������ �� �� �ֵ��� off ��ư Ȱ��ȭ 
			offButton.setEnabled (true);
			// ���� �̹��� �г� ȭ�� ������Ʈ 
			bulb.repaint();
		// on ��ư Ŭ���� �۵� �Ϸ� 
		}
	}
	private class OffListener implements ActionListener	
	{
		// off ��ư Ŭ���� �۵� ���� 
		public void actionPerformed (ActionEvent event)	
		{
			// ������ ���� off ��ư ��Ȱ��ȭ 
			bulb.setOn (false);
			// ���߿� ������ �� �� �ֵ��� on ��ư Ȱ��ȭ 
			onButton.setEnabled (true);
			offButton.setEnabled (false);
			// ���� �̹��� �г� ȭ�� ������Ʈ 
			bulb.repaint();
		// off ��ư Ŭ���� �۵� �Ϸ� 
		}
	}
}
class LightBulbPanel extends JPanel	
{
	private boolean on;
	private ImageIcon lightOn, lightOff;
	private JLabel imageLabel;
	// ���� �̹��� �г� �غ� 
	public LightBulbPanel()
	{
		// ������ ���� �̹����� ������ ���� �̹��� �غ�  
		lightOn = new ImageIcon ("./Chapter05/image/lightBulbOn.gif");
		lightOff = new ImageIcon ("./Chapter05/image/lightBulbOff.gif");
		setBackground (Color.black);
		// ������ ���� �̹����� �ʱ�ȭ�Ͽ� ��� 
		on = true;
		imageLabel = new JLabel (lightOff);
		add (imageLabel);
	// ���� �̹��� �г� �غ� �Ϸ�
	}
	public void paintComponent (Graphics page)
	{
		super.paintComponent(page);
		if (on)
			imageLabel.setIcon (lightOn);
		else
			imageLabel.setIcon (lightOff);
	}
	public void setOn (boolean lightBulbOn)
	{
		on = lightBulbOn;
	}
}
// off ��ư�� Ŭ��
// ������ ������� X��ư Ŭ���ϱ�(����)	
public class LightBulb_Main
{
	// ���α׷� ���� 
	public static void main (String[] args)
	{
		// ������ ���� 
		JFrame frame = new JFrame ("Light Bulb");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		// ���� �̹��� �гΰ� ���� ���� �г� ���� 
		LightBulbPanel bulb = new LightBulbPanel();
		LightBulbControls controls = new LightBulbControls (bulb);
		// ū �гο� ���� �̹��� �гΰ� ���� ���� �г� �� ���� �߰� 
		JPanel panel = new JPanel();
		panel.setBackground (Color.black);
		panel.setLayout (new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add (Box.createRigidArea (new Dimension (0, 20)));
		panel.add (bulb);
		panel.add (Box.createRigidArea (new Dimension (0, 10)));
		panel.add (controls);
		panel.add (Box.createRigidArea (new Dimension (0, 10)));
		// �����ӿ� ū �г��� �߰��ϰ� ȭ�鿡 ��� 
		frame.getContentPane().add( panel );		
		frame.pack();
		frame.setVisible(true);
		// ���α׷� ���� 
		return;
	}
}
