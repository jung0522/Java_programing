import java.util.Scanner;

public class commonDivisor 
{

	public static void main(String[] args) 
	{
	  int gcm = 1; 
	  int lcm = 1;
      Scanner scan = new Scanner(System.in);
      System.out.print("두 수를 입력하시오: ");
      
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      scan.close();
      if (num1 >= num2)
      {
    	  for (int i=2;i<=num2;i++) // 최대 공약수 //
    	  {   
    		  if ((num1 % i == 0) && (num2 % i == 0))
    		  {
    			  gcm = i;
    			  System.out.print(gcm+" ");
    		  }
    	  }
    	  System.out.println("최대 공약수는 "+gcm+"입니다.");
    	  //1번 for문 방법//
    	  for (int k=1;k!=lcm;k++) 
    	  {   
    		  if ((k % num1 == 0) && (k % num2 == 0))
    		  {
    			  lcm = k;
    			  System.out.println("최소 공배수는 "+lcm+"입니다.");
    			  break;  // break문을 여기다 안 쓰면 k+1이 되서 k!=lcm이라 또 실행 //
    		  }
    		 
    	  }
  
      }
      else 
      {   for (int i=2;i<=num1;i++) 
    	  {   
    	    if ((num1 % i == 0) && (num2 % i == 0)) 
    	    {
    	    	gcm = i;
    	    	System.out.print(gcm+" ");
    	    }
          }
          System.out.println("최대 공약수는 "+gcm+"입니다.");
          //2번 while문 방법// 
          while (true)
    	  {  
        	 
    		  if ((lcm % num1 == 0) && (lcm % num2 == 0))
    		  {
    			  System.out.println("최소 공배수는 "+lcm+"입니다.");
    			  break;
    		  }
    		 lcm++; 
    	  }
	  }
      

    }
}
