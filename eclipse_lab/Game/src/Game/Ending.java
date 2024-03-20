package Game;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;






class Ending extends JPanel 
{
	public Ending () 
	{
		 
		        setLayout(null);
		        
				setBackground (Color.black);
				JLabel label1 = new JLabel("The end");
				label1.setForeground(Color.white);
				label1.setFont(new Font("모리스9",Font.BOLD,180));
				label1.setBounds(320, -130, 1200, 700);
				add(label1);
				
				JLabel label2 = new JLabel("prod by 만능이조");
				label2.setForeground(Color.white);
				label2.setFont(new Font("모리스9",Font.BOLD,50));
				label2.setBounds(460, 30, 1200, 700);
				add(label2);			
	}
	
}
     
	
	

 
	
  
