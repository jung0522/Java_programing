import java.util.Scanner;

public class int_string
{
	public static void main(String[] args) 
	  {
	  String str1 = "happy";
	  String str2 = "happy";
	
	  if (str1 == str2)
		  System.out.println("문자열 같아요");
	  
	
	  String str3 = "happy"+"a";
	  String str4 = "happy"+"a";
	
	  if (str3 == str4)
		  System.out.println("문자열 같아요");
	  
	
      Scanner scan = new Scanner(System.in);	
	  String str5 = scan.next();
	  String str6 = scan.next();
	
	  if (str5 == str6)
		  System.out.println("문자열 같아요");
	  else
		  System.out.println("문자열 달라요");
	  }
}
