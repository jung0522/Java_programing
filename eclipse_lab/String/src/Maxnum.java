import java.util.*;
public class Maxnum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int nums[] = new int [5];
		int max = 0;
		System.out.print("수를 입력하시오: ");
		for(int i=0; i < 5; i++) {
			nums[i]  = scan.nextInt();
			
			if (nums[i] > max) {
				max = nums[i];
			}
			
		}
		System.out.println(max);

	}

}
