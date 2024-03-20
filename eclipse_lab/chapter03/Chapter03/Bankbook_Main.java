class Bankbook
{
	private String id;									
	private int money;									
	private static int totalMoney  = 0;	
	
	// ���� �ʱ�ȭ 
	public Bankbook( String id )
	{
		this.id = id;
		this.money = 0;
	}

	// ���� �Ա�
	public int deposit( int money )	 
	{
		this.money += money;
		this.totalMoney += money;
		return this.money;
	}

	// ���� ���� ���ڿ� ��ȯ
	public String toString()	
	{
		return this.id + " : " + this.money + "��\n�� ���ݾ� : " + totalMoney + "��";
	}
	
	// ��ü ������ �� ���ݾ�
	public static int getTotalMoney()	
	{
		return totalMoney;
	}
}

public class Bankbook_Main
{
	// ���α׷� ���� 
	public static void main (String[] args)	
	{
		

		// �������� ���� ����� 1000�� �Ա� �� ��� 
		Bankbook bankbook = new Bankbook ( "�������� ����" );
		bankbook.deposit( 1000 );
		System.out.println(
		                    bankbook ); 

		// �츮���� ���� ����� 2000�� �Ա� �� ��� 
		bankbook = new Bankbook ( "�츮���� ����" );
		bankbook.deposit( 2000 );
		System.out.println(
		                    bankbook );	 

		// �ϳ����� ���� ����� 3000�� �Ա� �� ��� 
		bankbook = new Bankbook ( "�ϳ����� ����" );
		bankbook.deposit( 3000 );
		System.out.println(
		                    bankbook ); 

		// ��ü ��ü �� ���ݾ� ��� 
		System.out.println( "(��ü �� ���ݾ�) " 
					+ Bankbook.getTotalMoney() + "��" ); 
		
		// ���α׷� ���� 
		return;
	}
}
