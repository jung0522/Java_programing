
public class formatting
{
	
	public static void main(String[] args)
	{
		int a = 2;
		int b = 3;
		char j = 'j';
		String myName = "frhyme";
	    System.out.println(myName+a*b);// ������ ���� //
	    System.out.println(myName+a+b);// ������� //
	    //System.out.printf(a); System.out.printf(j); ���� �⺻Ÿ���� x //    
	    System.out.printf(myName+a*j+"\n");// String�� �⺻Ÿ���� �ƴϱ� ���� ���ڿ� + ���ڵ� //
	    System.out.println(j+b);  // �ڹٿ��� println�� ���� + �� == �� + ���� ��//
	    // System.out.printf(j+b);  �ڹٿ��� �� ��� ����(����+ ����)������ ����Ʈf�� �Ұ��� //	    
	    //System.out.printf(2*3);   �ڹٿ��� �� ��� ����Ʈf�δ� �Ұ��� //
	    System.out.println(j);
	    System.out.println("");
	    
	    double c = 53234.52450434; // double c = 53234.52450434d or float�� ���� f�� ���� //
	    System.out.printf("%f\n", c); 
	    System.out.printf("%10.2f\n", c); // a.b a�� ��ü �ڸ���, b�� �Ҽ��� �ڸ��� //
	    System.out.printf("%010.2f\n", c); // ���ڸ� 0 ���̱� //
	    System.out.printf("%+10.2f\n", c); // %����� �����ʺ��� ���� %������ �ݴ� //
	    System.out.println("");
	    
	    char u = 'A';
	    char uni = '\u0041';
	    int sum1 = 0;
	    sum1 = u + uni;
	    System.out.printf("%c\n", u); 
	    System.out.printf("%c\n", uni); 
 	    System.out.printf("%s\n", u); // %s ���ڿ� �������������̹Ƿ� ���ڵ� �翬�� ���� //
 	  //  System.out.printf("%d\n", u);  C���� �޸� �� �� //	    
 	    System.out.printf("%d\n", (u+uni)); // ��+���� �ν��ϸ� �����ڵ�� �ν�//
 	    System.out.printf("%c\n", 65);
 	    System.out.println(((Object)sum1).getClass().getSimpleName()); 
 	    System.out.println("");
 	    
 	    
 	    int num1 = 15;
 	    System.out.printf("%b\n", num1); // boolen ��//
 	    System.out.printf("%o\n", num1); // 8���� //
 	    System.out.printf("%d\n", 017); // 8���� //
 	    System.out.printf("%h\n", num1); // 16���� //
 	    System.out.printf("%d\n", 0xf); // 16���� //
 	    System.out.println("");
 	    
 	    double f1 = 213123.342342; //0x7fff_fff ����// 	    
 	    double f2 = 3.143E-4; // -4�°� ���� 	    
        System.out.printf("%f %e %g\n", f1, f1, f1); 	//f�� floating point e�� ����    
        System.out.printf("%f %E %g\n", f2, f2, f2); 	//E�빮�ڵ� ����//    
        
        

	}
}