import java.util.*;
import java.lang.*; 
public class BJ2908 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String strnum1 = scan.next();
		String strnum2 = scan.next();
		int len1 = strnum1.length();
		int len2 = strnum2.length();
		String re_strnum1 = "";
		String re_strnum2 = "";
       for(int i = 0; i < len1; i++)
       {
    	   re_strnum1 += strnum1.charAt(len1-(i+1));
       }
       for(int i = 0; i < len2; i++)
       {
    	   re_strnum2 += strnum2.charAt(len2-(i+1));
       }
       int num1 = Integer.parseInt(re_strnum1); 
       int num2 = Integer.parseInt(re_strnum2); 
       int result = (num1 > num2)?num1:num2;
       System.out.println(result);
	}

}
