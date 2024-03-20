import java.util.*;
public class BJ27866 {

	public static void main(String[] args) 
	{
        System.out.print("단어를 입력하시오: ");
        Scanner scan = new Scanner(System.in);
        String S[] = scan.next().split("");
        System.out.print("몇 번째?: ");
        int i = scan.nextInt();
        
        System.out.println(S[i-1]);
        
        scan.close();
	}

}
