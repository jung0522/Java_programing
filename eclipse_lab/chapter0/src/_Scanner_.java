import java.util.Scanner;

public class _Scanner_ {

	public static void main (String[] args)
	{
		
		System.out.print("�̸�, ����, ����, ü��, ���� ���θ� ��ĭ���� �и��Ͽ� �Է��ϼ���: ");
		Scanner scan = new Scanner(System.in);
		{
			 String name = scan.next();
			 String city = scan.next();
			 int age = scan.nextInt();
			 double weight = scan.nextDouble();
			 boolean single = scan.nextBoolean();
			 
			 System.out.println("�̸��� "+ name +" ���ô� "+ city +" ���̴� "+
			 age +" ü���� "+ weight +" ������ "+ single);
			 
			 scan.close();
		}
		 		
	}
}
