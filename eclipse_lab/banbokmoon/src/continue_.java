import java.util.*;

public class continue_ {

	public static void main(String[] args) {
		int sum = 0;
		for (int i = 0; i < 5; i++) 
		{
			System.out.print("���� �Է��Ͻÿ�: ");
			Scanner scan = new Scanner(System.in);
			int n = scan.nextInt();
			
			if (n >= 0) {
				sum += n;
			}
			else {
				continue;
			}
		}
		System.out.println(sum);
		
	}

}
