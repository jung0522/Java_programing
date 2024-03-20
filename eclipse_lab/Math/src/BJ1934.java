import java.util.Scanner;
 
public class BJ1934 {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int N = scan.nextInt();
        
		StringBuilder sb = new StringBuilder();
 
		
		for(int i = 0; i < N; i++) {
			
			int a = scan.nextInt();
			int b = scan.nextInt();
			
			int d = gcd(a, b);	
			
			sb.append(a * b / d).append('\n');
		}
		System.out.println(sb);
		
	}
    
    
	public static int gcd(int a, int b) {
 
		while (b != 0) {
			int r = a % b; 
 
			a = b;
			b = r;
		}
		return a;
	}
}