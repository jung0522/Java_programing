
import java.util.*;
public class BJ9086 
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
	    int n = scan.nextInt();
	    String[] str;
		for (int i = 0; i < n; i++)
		{
		  str = scan.next().split("");
		  System.out.println(str[0]+str[str.length-1]);
		}
	}

}
/*
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt(); 

        for (int i = 0; i < num; i++) {
            String str = sc.next();
            System.out.println(str.charAt(0) + "" + str.charAt(str.length()-1));

        }

        sc.close();
    }
}
*/
