
public class promotion {

	public static void main(String[] args)
	{
		// 작 > 큰 자동 변환 //
		long n = 25L; // 4byte > 8 byte
		double d = 3.14 * 10; // 정수가 실수로 자동 변환 //

		// 큰 > 작 컴파일 에러 강제 타입 변환(casting)//
		double f1 = 2.4;
		
		System.out.println((float)f1);
		System.out.println((char)0x12340041);
		System.out.println(10/4);
		System.out.println((byte)227);
		
	}

}
