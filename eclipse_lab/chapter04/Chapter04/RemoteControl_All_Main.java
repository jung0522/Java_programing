import java.util.Scanner;
import remoteControl.*;

public class RemoteControl_All_Main 
{
	// ���α׷����� 
	public static void main (String[] args) 
	{
		// ���� �ʱ�ȭ
		Scanner scan = new Scanner( System.in );
		String result = "";

		// ������ ��ü ���� 	 
		RemoteControl rc[] = { new TV(), new AirConditioner(), new RoboticVacuumCleaner() };											
		
			// �������� �Է¿� ���� TV, ������, �κ�û�ұ⸦ �����ϰ� ��� ���	 
			do
			{
				System.out.print( "�������� ��, ��, ��, ��, ����, ���� �� �ϳ��� �Է��ϼ��� : ");
				result = scan.next();

				// ������ �Է��ϸ� TV, ������, �κ�û�ұ��� ������ �Ѱų� ����	 
				if ( result.equals( "����" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickPower() );	 
					}
				}
				// �� ��ư �Է½� TV, ������, �κ�û�ұ��� ��� �۵�	 
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickUp() );	 
					}
				}
				// �� ��ư �Է½� TV, ������, �κ�û�ұ��� ��� �۵�	 
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickDown() );	 
					}
				}
				// �� ��ư �Է½� TV, ������, �κ�û�ұ��� ��� �۵�	 
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickLeft() );	 
					}
				}
				// �� ��ư �Է½� TV, ������, �κ�û�ұ��� ��� �۵�	 
				else if ( result.equals( "��" ) )
				{
					for ( int i = 0; i < rc.length; i++ )
					{
						System.out.println( rc[i].clickRight() );	 
					}
				}				

			} while( !result.equals( "����" ) );

		// ���α׷� ���� 
		return;		
	}
}
