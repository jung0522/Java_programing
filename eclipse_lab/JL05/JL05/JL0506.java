import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class LightBulbControls extends JPanel	
{
	private LightBulbPanel bulb;
	private JButton onButton, offButton;
	public LightBulbControls (LightBulbPanel bulbPanel)
	{
		bulb = bulbPanel;
		onButton = new JButton ("On");
		onButton.setEnabled (false);
		onButton.setMnemonic ('n');
		onButton.setToolTipText ("Turn it on!");
		onButton.addActionListener (new OnListener());	
		offButton = new JButton ("Off");
		offButton.setEnabled (true);
		offButton.setMnemonic ('f');
		offButton.setToolTipText ("Turn it off!");
		offButton.addActionListener (new OffListener());	
		setBackground (Color.black);
		add (onButton);
		add (offButton);
	}
	private class OnListener implements ActionListener	
	{
		public void actionPerformed (ActionEvent event)	
		{
			bulb.setOn (true);
			onButton.setEnabled (false);
			offButton.setEnabled (true);
			bulb.repaint();
		}
	}
	private class OffListener implements ActionListener	
	{
		public void actionPerformed (ActionEvent event)	
		{
			bulb.setOn (false);
			onButton.setEnabled (true);
			offButton.setEnabled (false);
			bulb.repaint();
		}
	}
}
class LightBulbPanel extends JPanel	
{
	private boolean on;
	private ImageIcon lightOn, lightOff;
	private JLabel imageLabel;
	public LightBulbPanel()
	{
		lightOn = new ImageIcon ("./JL05/image/lightBulbOn.gif");
		lightOff = new ImageIcon ("./JL05/image/lightBulbOff.gif");
		setBackground (Color.black);
		on = true;
		imageLabel = new JLabel (lightOff);
		add (imageLabel);
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
public class JL0506
{
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Light Bulb");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		LightBulbPanel bulb = new LightBulbPanel();
		LightBulbControls controls = new LightBulbControls (bulb);
		JPanel panel = new JPanel();
		panel.setBackground (Color.black);
		panel.setLayout (new BoxLayout(panel, BoxLayout.Y_AXIS));
		panel.add (Box.createRigidArea (new Dimension (0, 20)));
		panel.add (bulb);
		panel.add (Box.createRigidArea (new Dimension (0, 10)));
		panel.add (controls);
		panel.add (Box.createRigidArea (new Dimension (0, 10)));
		frame.getContentPane().add( panel );		
		frame.pack();
		frame.setVisible(true);
		return;
	}
}
