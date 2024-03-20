
public class LogicalOperater {

	public static void main(String[] args) 
	{
		// 문자(char c)가 대문자인 경우
		char c = 'A';
		int n = 0;
		System.out.println((c >= 'A') && (c <= 'Z'));
		System.out.println('a' > 'b');
		System.out.println(3 != 2);
		System.out.println(!(3 != 2));
		System.out.println();
		
		int x = 5;
		int y = 3;
		int s;  // int s = (x>y)?1:-1; //
		if(x>y)
		s = 1;
		else
		s = -1;
		System.out.println((3 != 2) || (-1 > 0));
		System.out.println((3 != 2) ^ (-1 > 0));  // a ^ b a와 b가 다를 때 true //
		
		int a = 3, b = 5;
		System.out.println("두 수의 차는 " + ((a>b)?(a-b):(b-a))); 
		// condition이 true이면, 연산식의 결과는 opr1, false이면 opr2 //

		int n1, n2, val1, val2, val3, val4, val5;
	    n1 = 5;
	    n2 = 3;

	    val1 = n1 & n2;
	    val2 = n1 | n2;
	    val3 = n1 ^ n2;
	    val4 = ~val3;
	    val5 = ~val4;
	    System.out.printf ("n1 = 5, n2 = 3일 때\n");
	    System.out.printf("1. n1 & n2 : %d\n", val1);
	    System.out.printf("2. n1 | n2 : %d\n", val2);
	    System.out.printf("3. n1 ^ n2 : %d\n", val3);
	    System.out.printf("4. (3)번 값 ~val3 : %d\n", val4);
	    System.out.printf("5. (4)번 값 ~val4 : %d\n", val5);
	    System.out.println((n1 != n2) ^ (n1 > n2));
		    
	}

}
