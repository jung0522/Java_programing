import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class WordArrayListMain {
	// ���α׷� ���� 	
	public static void main(String[] args) {
		Scanner scan = new Scanner( System.in );
		ArrayList<String> words = new ArrayList<String>(); 

		// �ܾ� �Է�   
		while( true ) {
			System.out.print( "�ܾ �Է��ϼ���(�����quit): " );
			String word = scan.nextLine(); 
			if ( word.equals("quit") )
				break;
			words.add( word );
		}

		// �ܾ� ����  
		Collections.sort( words );

		// �ܾ� ���  
		for( String word : words )
			System.out.print( word + " " );

	// ���α׷� ���� 	
	}
}
