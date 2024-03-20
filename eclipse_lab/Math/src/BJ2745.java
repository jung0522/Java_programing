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
			int answer = 0;	// 10�������� ����� ��
			int index = 0;	// ������ ����
			String[] sArr = scan.nextLine().split(" ");	// ��N�� B������ �Է¹޾Ƽ� �߶� ���ڿ� �迭�� �ֱ�.
			int B = Integer.parseInt(sArr[1]);	// ���� B(int ����ȯ)
			String str = sArr[0];				// ���� N
			for(int i=str.length()-1; i>=0; i--) {
				// �� N�� 10������ �Ѿ�� ���϶�
				int num = 0;
				char ch = str.charAt(i);	
				
				// �ƽ�Ű�ڵ�: A(65) ~ Z(90) ==> 10 ~ 35 ... ���� 55�� ���ش�.
				if(ch >= 'A' && ch <= 'Z') 
					num = sArr[0].charAt(i) - 55;
				// 0 ~ 9�� ���ڴ� 0�� ���� ���ڷ� ������ش�.
				else 
					num = sArr[0].charAt(i) - '0';
				
				// N = ZZZZZ, B = 36�϶�
				// �� �ڸ����� (Z*36^0) + (Z*36^1) + (Z*36^2) + (Z*36^3) + (Z*36^4) �� �ȴ�.
				// ���� 
				answer += num * numSqrt(B, index);
				index ++;
			}
			System.out.println(answer);
			
			scan.close();
		}

      
	}


