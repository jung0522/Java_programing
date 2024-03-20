
import java.util.*;

public class WhileSample
{

	public static void main(String[] args) 
	{
		int sum = 0;
		int count = 0;
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n != -1)
		{
			
            sum += n;
            count++;
            n = scan.nextInt();
		}
		System.out.println(sum/count);
		
		
		scan.close();

	}

}
