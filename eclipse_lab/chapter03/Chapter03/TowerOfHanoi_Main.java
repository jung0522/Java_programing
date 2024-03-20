class TowerOfHanoi
{
	// ���� �̵� �޼��� 
	public void moveTower( int numDisks, int start, int temp, int end ) 
	{
		
		
		if (numDisks == 1)
			moveOneDisk (start, end);	
		else
		{
	  		// N-1�� ������ ��߱�տ��� �ӽñ������ ��� �̵� 
			moveTower( numDisks-1, start, end, temp );	
	  		// ���� ū ������ ��߱�տ��� ����������� �̵� 
			moveOneDisk (start, end);			
			
	  		// N-1�� ������ �ӽñ�տ��� ����������� ��� �̵� 
			moveTower( numDisks-1, temp, start, end );	
		}
	}
   private void moveOneDisk (int start, int end ) 
   {
      System.out.println ("Move one disk from " + start + " to " + end);
   }
}

public class TowerOfHanoi_Main
{
   //���α׷� ���� 
   public static void main (String[] args)
   {
      //�ϳ��� Ÿ�� ���� 
      TowerOfHanoi towers = new TowerOfHanoi();
      // 3���� ������ 1(���), 2(�ӽ�), 3(����) ����� �̿��� �̵� 
      towers.moveTower( 3, 1, 2, 3 );
      //���α׷� ���� 
	  return;
   }
}
