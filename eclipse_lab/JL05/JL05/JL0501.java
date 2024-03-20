import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class PushCounterPanel extends JPanel	
{
	private int count;
	private JButton push;
	private JLabel label;
	public PushCounterPanel () 		
	{
		count = 0;

		push = new JButton ("Push Me!");
		push.addActionListener (new ButtonListener());	

		label = new JLabel ("Pushes: " + count);

		add (push);
		add (label);

		setBackground (Color.cyan);
		setPreferredSize (new Dimension(300, 40));
		
	}

	private class ButtonListener implements ActionListener 	
	{
		public void actionPerformed (ActionEvent event) 	
		{ 
			count++;
			label.setText("Pushes: " + count);	
			return;
		}
	}
}

public class JL0501
{
	public static void main (String[] args)
	{ 
		JFrame frame = new JFrame ("Push Counter");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);

		PushCounterPanel panel = new PushCounterPanel();
		frame.getContentPane().add(panel);

		frame.pack();
		frame.setVisible(true);
		
		return;
	}
}
