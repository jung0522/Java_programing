import javax.swing.JOptionPane;
public class EvenOdd_Main
{
	// ���α׷����� 
	public static void main (String[] args)
	{
		String numStr, result;
		int num, again;

		// �ݺ����� 
		do 
		{
			// ���� �Է� 
			numStr = JOptionPane.showInputDialog ("Enter an integer: ");	
			num = Integer.parseInt(numStr); 	
			// Ȧ������ ¦������ ��� 
			result = "That number is " + ((num%2 == 0) ? "even" : "odd");
			JOptionPane.showMessageDialog (null, result);	
			// ��� �ݺ����� Ȯ�� 
			again = JOptionPane.showConfirmDialog (null, "Do Another?");	
		} while( again == JOptionPane.YES_OPTION );	
		// ���α׷� ���� 
		return;
	}
}
