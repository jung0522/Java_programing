import java.util.Scanner;
public class Exception3_15
{
 public static void main(String[] args) 
  {
   Scanner scanner = new Scanner(System.in);
   int dividend; 
   int divisor; 
   boolean j = true;
    while(j) 
    {
     System.out.print("나뉨수를 입력하시오:"); 
     dividend = scanner.nextInt(); // 나뉨수 입력
     System.out.print("나눗수를 입력하시오:"); 
     divisor = scanner.nextInt(); // 나눗수 입력
     
     try 
     {
    	 System.out.println(dividend+"를 "+ divisor + "로 나누면 몫은 " + 
    		     dividend/divisor + "입니다.");
    	 break;
     }
     catch (ArithmeticException e)
     {
    	 System.out.println("불가");
    	 break;
     }
   }
   scanner.close();
    
  }
}
