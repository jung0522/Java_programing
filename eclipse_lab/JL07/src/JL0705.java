import java.util.Scanner;
import java.util.Vector;
import java.util.Collections;
public class JL0705 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
		Vector<Integer> scores = new Vector<Integer>(); 

		while( true ) {
			System.out.print( "0�� ~ 100�� ������ ������ �Է��ϼ���: " );
			int score = scan.nextInt(); 
			if ( ( score < 0 ) || ( 100 < score ) )
				break;
			scores.add( score );
		}

		Collections.sort( scores );

		for( Integer score : scores )
			System.out.print( score + " " );

	}
}
