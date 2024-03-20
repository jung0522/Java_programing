
import java.util.*;

public class Dowhile {

	public static void main(String[] args) {
	   char ch = 'a';  // char + 1 가능 //
		do {
			System.out.print(ch);
			ch+=1;
		}
		while(ch <= 'z');	
	}

}
// do while은 순서는 do > 조건이지만 변수 인식을 do 전에 해줘야 알아먹음 // 
