import java.util.Scanner;

public class commonDivisor 
{

	public static void main(String[] args) 
	{
	  int gcm = 1; 
	  int lcm = 1;
      Scanner scan = new Scanner(System.in);
      System.out.print("�� ���� �Է��Ͻÿ�: ");
      
      int num1 = scan.nextInt();
      int num2 = scan.nextInt();
      scan.close();
      if (num1 >= num2)
      {
    	  for (int i=2;i<=num2;i++) // �ִ� ����� //
    	  {   
    		  if ((num1 % i == 0) && (num2 % i == 0))
    		  {
    			  gcm = i;
    			  System.out.print(gcm+" ");
    		  }
    	  }
    	  System.out.println("�ִ� ������� "+gcm+"�Դϴ�.");
    	  //1�� for�� ���//
    	  for (int k=1;k!=lcm;k++) 
    	  {   
    		  if ((k % num1 == 0) && (k % num2 == 0))
    		  {
    			  lcm = k;
    			  System.out.println("�ּ� ������� "+lcm+"�Դϴ�.");
    			  break;  // break���� ����� �� ���� k+1�� �Ǽ� k!=lcm�̶� �� ���� //
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
          System.out.println("�ִ� ������� "+gcm+"�Դϴ�.");
          //2�� while�� ���// 
          while (true)
    	  {  
        	 
    		  if ((lcm % num1 == 0) && (lcm % num2 == 0))
    		  {
    			  System.out.println("�ּ� ������� "+lcm+"�Դϴ�.");
    			  break;
    		  }
    		 lcm++; 
    	  }
	  }
      

    }
}
