import java.util.Scanner;

public class _Scanner_ {

	public static void main (String[] args)
	{
		
		System.out.print("이름, 도시, 나이, 체중, 독신 여부를 빈칸으로 분리하여 입력하세요: ");
		Scanner scan = new Scanner(System.in);
		{
			 String name = scan.next();
			 String city = scan.next();
			 int age = scan.nextInt();
			 double weight = scan.nextDouble();
			 boolean single = scan.nextBoolean();
			 
			 System.out.println("이름은 "+ name +" 도시는 "+ city +" 나이는 "+
			 age +" 체중은 "+ weight +" 독신은 "+ single);
			 
			 scan.close();
		}
		 		
	}
}
