import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;
import java.awt.event.*;

class CoordinatesPanel extends JPanel	
{
	private final int SIZE = 6;
	private int x = 50, y = 50; 

	public CoordinatesPanel()
	{
		addMouseListener( new CoordinatesListener() );	
		setBackground( Color.black );
		setPreferredSize( new Dimension(300, 200) );
	}
	public void paintComponent (Graphics page)
	{
		super.paintComponent(page);
		page.setColor (Color.green);
		page.fillOval (x, y, SIZE, SIZE);
		page.drawString ("Coordinates: (" + x + ", " + y + ")", 5, 15);
	}
	private class CoordinatesListener implements MouseListener	
	{
		public void mousePressed (MouseEvent event)	
		{
			x = event.getX();
			y = event.getY();
			repaint();
		}
		public void mouseClicked (MouseEvent event) {}
		public void mouseReleased (MouseEvent event) {}
		public void mouseEntered (MouseEvent event) {}
		public void mouseExited (MouseEvent event) {}
	}
}

public class Coordinates_Main
{
	public static void main (String[] args)
	{
		// 프레임 준비 
		JFrame frame = new JFrame ("Coordinates");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		// 패널 생성하고 후 프레임에 추가 
		frame.getContentPane().add (
				new CoordinatesPanel());
		// 프레임에 묶어준 뒤 화면에 출력 
		frame.pack();
		frame.setVisible(true);
		// 프로그램 종료 
		return;
	}
}
