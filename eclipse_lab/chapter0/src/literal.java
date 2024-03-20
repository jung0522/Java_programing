
public class literal {
	
	public static void main (String []args) {
		boolean a = true;
		boolean b = 10 > 0; // 10>0가 참이므로 b 값은 true
		// boolean c = 1;  타입 불일치 오류. C/C++와 달리 자바에서 1,0을 참, 거짓으로 사용 불가
		// while(true)  무한 루프. while(1)로 사용하면 안 됨 //
		
		// int n = null; 기본 타입에(ex int float...) 사용 불가 //
		String str = null; // 클래스 혹은 다른 것을 이용한 레퍼런스 타입에 사용 //
		
		var price = 200; // price는 int 타입으로 결정
		var name = "kitae"; // name은 String 타입으로 결정
		var pi = 3.14; // pi는 double 타입으로 결정
		// var point = new Point();  point는 Point 타입으로 결정(4장 참조)
		// var v = new Vector<Integer>(); // v는 Vector<integer> 타입으로 결정(7장 참조)
		//var name;  컴파일 오류. 변수 name의 타입을 추론할 수 없음//
		

		

	}

}
