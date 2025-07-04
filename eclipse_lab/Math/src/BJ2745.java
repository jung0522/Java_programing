import java.util.*;
public class BJ2745 {

		static int numSqrt(int num1, int num2) {
			int result = 1;
			for(int i=1; i<=num2; i++) 
				result *= num1;
			return result;
		}
		
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int answer = 0;	// 10진법으로 출력할 수
			int index = 0;	// 제곱의 지수
			String[] sArr = scan.nextLine().split(" ");	// 수N과 B진법을 입력받아서 잘라서 문자열 배열에 넣기.
			int B = Integer.parseInt(sArr[1]);	// 진법 B(int 형변환)
			String str = sArr[0];				// 숫자 N
			for(int i=str.length()-1; i>=0; i--) {
				// 수 N이 10진법을 넘어가는 수일때
				int num = 0;
				char ch = str.charAt(i);	
				
				// 아스키코드: A(65) ~ Z(90) ==> 10 ~ 35 ... 따라서 55를 빼준다.
				if(ch >= 'A' && ch <= 'Z') 
					num = sArr[0].charAt(i) - 55;
				// 0 ~ 9의 문자는 0을 빼서 숫자로 만들어준다.
				else 
					num = sArr[0].charAt(i) - '0';
				
				// N = ZZZZZ, B = 36일때
				// 각 자릿수는 (Z*36^0) + (Z*36^1) + (Z*36^2) + (Z*36^3) + (Z*36^4) 가 된다.
				// 따라서 
				answer += num * numSqrt(B, index);
				index ++;
			}
			System.out.println(answer);
			
			scan.close();
		}

      
	}


