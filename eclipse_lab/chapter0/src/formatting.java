
public class formatting
{
	
	public static void main(String[] args)
	{
		int a = 2;
		int b = 3;
		char j = 'j';
		String myName = "frhyme";
	    System.out.println(myName+a*b);// 곱셉이 먼저 //
	    System.out.println(myName+a+b);// 순서대로 //
	    //System.out.printf(a); System.out.printf(j); 오류 기본타입은 x //    
	    System.out.printf(myName+a*j+"\n");// String은 기본타입이 아니기 때문 문자열 + 숫자도 //
	    System.out.println(j+b);  // 자바에서 println은 문자 + 수 == 수 + 수로 됨//
	    // System.out.printf(j+b);  자바에선 수 계산 변수(문자+ 숫자)끼리도 프린트f로 불가능 //	    
	    //System.out.printf(2*3);   자바에선 수 계산 프린트f로는 불가능 //
	    System.out.println(j);
	    System.out.println("");
	    
	    double c = 53234.52450434; // double c = 53234.52450434d or float는 끝에 f랑 동일 //
	    System.out.printf("%f\n", c); 
	    System.out.printf("%10.2f\n", c); // a.b a는 전체 자릿수, b는 소수점 자릿수 //
	    System.out.printf("%010.2f\n", c); // 빈자리 0 붙이기 //
	    System.out.printf("%+10.2f\n", c); // %양수면 오른쪽부터 정렬 %음수면 반대 //
	    System.out.println("");
	    
	    char u = 'A';
	    char uni = '\u0041';
	    int sum1 = 0;
	    sum1 = u + uni;
	    System.out.printf("%c\n", u); 
	    System.out.printf("%c\n", uni); 
 	    System.out.printf("%s\n", u); // %s 문자열 서식지정문자이므로 문자도 당연히 가능 //
 	  //  System.out.printf("%d\n", u);  C언어와 달리 안 됨 //	    
 	    System.out.printf("%d\n", (u+uni)); // 수+문자 인식하면 유니코드로 인식//
 	    System.out.printf("%c\n", 65);
 	    System.out.println(((Object)sum1).getClass().getSimpleName()); 
 	    System.out.println("");
 	    
 	    
 	    int num1 = 15;
 	    System.out.printf("%b\n", num1); // boolen 값//
 	    System.out.printf("%o\n", num1); // 8진수 //
 	    System.out.printf("%d\n", 017); // 8진수 //
 	    System.out.printf("%h\n", num1); // 16진수 //
 	    System.out.printf("%d\n", 0xf); // 16진수 //
 	    System.out.println("");
 	    
 	    double f1 = 213123.342342; //0x7fff_fff 가능// 	    
 	    double f2 = 3.143E-4; // -4승과 동일 	    
        System.out.printf("%f %e %g\n", f1, f1, f1); 	//f는 floating point e는 지수    
        System.out.printf("%f %E %g\n", f2, f2, f2); 	//E대문자도 가능//    
        
        

	}
}