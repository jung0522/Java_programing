
public class AssignmentIncDecOperator {

	public static void main(String[] args) 
	{
		int a=3, b=3, c=3;
		
		//대입 연산자 차례
		a += 3; // a=a+3 = 6; //
		b *= 3; // b=b*3 = 9; //
		c %= 2; // c=c%2 = 1; //
        System.out.println("a=" + a + ", b=" + b + ", c=" + c);
        
        int d=3, e=3;
        // 증감 연산자 사례
        a = d++; // 
        System.out.println("a=" + a + ", d=" + d);
        a = ++e; // 
        System.out.println("a=" + a + ", e=" + e);
        d=3; e=3;
        a = d--; 
        System.out.println("a=" + a + ", d=" + d);
	    a = --e;
        System.out.println("a=" + a + ", e=" + e);

	}


}
