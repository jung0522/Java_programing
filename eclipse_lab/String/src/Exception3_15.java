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
     System.out.print("�������� �Է��Ͻÿ�:"); 
     dividend = scanner.nextInt(); // ������ �Է�
     System.out.print("�������� �Է��Ͻÿ�:"); 
     divisor = scanner.nextInt(); // ������ �Է�
     
     try 
     {
    	 System.out.println(dividend+"�� "+ divisor + "�� ������ ���� " + 
    		     dividend/divisor + "�Դϴ�.");
    	 break;
     }
     catch (ArithmeticException e)
     {
    	 System.out.println("�Ұ�");
    	 break;
     }
   }
   scanner.close();
    
  }
}
