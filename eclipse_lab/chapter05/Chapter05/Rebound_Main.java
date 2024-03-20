//Ÿ�̸� �ι� ȣ�� �� X��ư�� ���� �����ϴ� ���� ����
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
class ReboundPanel extends JPanel	
{
	private final int WIDTH = 300, HEIGHT = 100;
	private final int DELAY = 20, IMAGE_SIZE = 35;
	private ImageIcon image;
	private Timer timer;
	private int x, y, moveX, moveY;
	
	// �г� �غ� 
	public ReboundPanel()
	{
		// Ÿ�̸� �� ������ �̹��� �غ� 
		timer = new Timer(DELAY, new ReboundListener());
		image = new ImageIcon ("./Chapter05/image/happyFace.gif");
		// �̹��� �ʱ� ��ġ, �̵� ����, �̵� ���� ���� ���� 
		x = 0;
		y = 40;
		moveX = moveY = 3;
		setPreferredSize (new Dimension(WIDTH, HEIGHT));
		setBackground (Color.black);
		timer.start();
		// �г� �غ� �Ϸ� 
	}
	public void paintComponent (Graphics page)
	{
		super.paintComponent (page);
		image.paintIcon (this, page, x, y);
	}
	private class ReboundListener implements ActionListener	
	{
		// Ÿ�̸� Ȱ��ȭ�� �۵� ���� 
		public void actionPerformed (ActionEvent event)	
		{
			// �̵� ���� ���������� �̹��� ��ġ �̵�  
			x += moveX;
			y += moveY;
			if (x <= 0 || x >= WIDTH-IMAGE_SIZE)
				moveX = moveX * -1;
			
			if (y <= 0 || y >= HEIGHT-IMAGE_SIZE)
				moveY = moveY * -1;
			
			// �г� ȭ�� ������Ʈ 
			repaint();	
		// Ÿ�̸� Ȱ��ȭ�� �۵� �Ϸ� 
		}
	}
}
// ù��° Ÿ�̸� ȣ��
// �ι�° Ÿ�̸� ȣ��
// ������ ������� X��ư Ŭ���ϱ�(����)	
public class Rebound_Main
{
	//���α׷����� 
	public static void main (String[] args)
	{
		JFrame frame = new JFrame ("Rebound");
		frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		//�г� ���� �� �߰� 
		frame.getContentPane().add(
								new ReboundPanel());
		//�����ӿ� ������ �� ȭ�鿡 ��� 
		frame.pack();
		frame.setVisible(true);
		//���α׷� ���� 
		return;
	}
}
